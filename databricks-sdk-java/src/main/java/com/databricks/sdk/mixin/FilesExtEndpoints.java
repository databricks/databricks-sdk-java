package com.databricks.sdk.mixin;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.UserAgent;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.core.utils.ClockSupplier;
import com.databricks.sdk.core.utils.UtcClockSupplier;
import com.databricks.sdk.mixin.FilesExtEndpoint.Kind;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

/**
 * The ordered endpoints a file transfer walks, as the workspace's endpoints API returns them.
 *
 * <p>The server's answer, including a failure, is kept until its TTL passes; anything short of a
 * usable list gives the built-in order, so discovery never fails a transfer.
 *
 * <p>The request goes through the configured {@link HttpClient}, which keeps the user's proxy, TLS
 * and test clients. Because that client's pool may be held by transfers, the request runs on a
 * daemon thread that the caller waits for at most {@link #RESOLVE_TIMEOUT}. A timeout counts as a
 * transient failure.
 */
final class FilesExtEndpoints {
  private static final Logger LOG = LoggerFactory.getLogger(FilesExtEndpoints.class);
  private static final ObjectMapper MAPPER = new ObjectMapper();

  static final String ENDPOINTS_API_PATH = "/api/2.0/fs/endpoints";

  /** The name of the daemon thread each refresh asks the server on. */
  static final String DISCOVERY_THREAD_NAME = "databricks-files-ext-discovery";

  /**
   * How long a caller waits for the server's answer, including any wait for a connection. Discovery
   * precedes a transfer, so it is one attempt that fails fast to the built-in order.
   */
  static final Duration RESOLVE_TIMEOUT = Duration.ofSeconds(10);

  /** How long a usable list is kept before asking again, so that server changes reach clients. */
  static final Duration CACHE_TTL = Duration.ofMinutes(30);

  /** How long a failed answer is kept before asking again. */
  static final Duration FAILURE_CACHE_TTL = Duration.ofMinutes(30);

  /**
   * How long after the server's last answer a list is kept through refreshes that fail transiently.
   * Past it, discovery that keeps failing moves the client to the built-in order.
   */
  static final Duration MAX_STALE = Duration.ofHours(2);

  /** Statuses that may succeed on a later ask; any other non-200 answer is definitive. */
  private static final Set<Integer> RETRYABLE_STATUS_CODES =
      new HashSet<>(Arrays.asList(408, 429, 502, 503, 504));

  /**
   * The protocols this SDK speaks, by the server's {@code api} and {@code api_version}. Other pairs
   * are skipped, so the server can list newer protocols without breaking this SDK. IO_OFFLOAD is
   * unversioned during the preview, so a versioned IO_OFFLOAD is newer than this SDK.
   */
  private static final Map<String, Kind> RECOGNIZED_ENDPOINTS = new HashMap<>();

  static {
    RECOGNIZED_ENDPOINTS.put(recognizedKey("IO_OFFLOAD", null), Kind.IO_OFFLOAD);
    RECOGNIZED_ENDPOINTS.put(recognizedKey("FILES_API", "2.0"), Kind.FILES_API_V2);
    RECOGNIZED_ENDPOINTS.put(recognizedKey("FILES_API", "3.0"), Kind.FILES_API_V3);
  }

  private final DatabricksConfig config;
  private final boolean enabled;
  private final ClockSupplier clock;
  private final Duration resolveTimeout;

  /** Guards {@link #cached}; held only to read or replace it. */
  private final Object cacheLock = new Object();

  private Cached cached;

  /** Held by the one caller that asks the server, so that concurrent transfers do not each ask. */
  private final ReentrantLock refreshLock = new ReentrantLock();

  /** The thread of the last request to the server; guarded by {@link #refreshLock}. */
  private Thread worker;

  FilesExtEndpoints(DatabricksConfig config, boolean enabled) {
    this(config, enabled, new UtcClockSupplier(), RESOLVE_TIMEOUT);
  }

  FilesExtEndpoints(
      DatabricksConfig config, boolean enabled, ClockSupplier clock, Duration resolveTimeout) {
    this.config = config;
    this.enabled = enabled;
    this.clock = clock;
    this.resolveTimeout = resolveTimeout;
  }

  /** Returns the endpoints to try for a transfer, best first. The caller may modify the list. */
  List<FilesExtEndpoint> resolve() {
    if (!enabled) {
      return defaultEndpoints();
    }
    Cached current = cached();
    if (current != null && !current.isExpired(now())) {
      return new ArrayList<>(current.endpoints);
    }
    if (current == null) {
      // Nothing to serve yet: wait for whichever caller is asking.
      refreshLock.lock();
    } else if (!refreshLock.tryLock()) {
      // Another caller is asking: keep transferring on the expired list rather than wait for it,
      // unless the list is past the stale limit, which must hold however long that caller takes.
      if (isPastStaleLimit(current, now())) {
        return defaultEndpoints();
      }
      return new ArrayList<>(current.endpoints);
    }
    try {
      current = cached();
      if (current != null && !current.isExpired(now())) {
        // Refreshed by another caller while this one waited.
        return new ArrayList<>(current.endpoints);
      }
      List<FilesExtEndpoint> fetched;
      try {
        fetched = fetchWithTimeout();
      } catch (InterruptedException e) {
        // The caller gave up, which says nothing about the server: leave the cache for the next
        // caller to refresh, and serve this one as a caller that did not ask would be served.
        Thread.currentThread().interrupt();
        if (current != null && !isPastStaleLimit(current, now())) {
          return new ArrayList<>(current.endpoints);
        }
        return defaultEndpoints();
      }
      Instant now = now();
      Cached next;
      if (fetched == null
          && current != null
          && current.fromServer
          && !isPastStaleLimit(current, now)) {
        // A blip in discovery must not move a working client off the server's endpoints. A
        // definitive answer, such as discovery being turned off, still does, and so does a failure
        // that outlasts the stale limit.
        Instant staleLimit = current.fetchedAt.plus(MAX_STALE);
        Instant failureExpiry = now.plus(FAILURE_CACHE_TTL);
        next =
            new Cached(
                current.endpoints,
                failureExpiry.isBefore(staleLimit) ? failureExpiry : staleLimit,
                true,
                current.fetchedAt);
      } else if (fetched != null && !fetched.isEmpty()) {
        next = new Cached(fetched, now.plus(CACHE_TTL), true, now);
      } else {
        next = new Cached(defaultEndpoints(), now.plus(FAILURE_CACHE_TTL), false, now);
      }
      synchronized (cacheLock) {
        cached = next;
      }
      return new ArrayList<>(next.endpoints);
    } finally {
      refreshLock.unlock();
    }
  }

  /**
   * The built-in order: presigned URLs, then the Files API on the workspace host, which takes
   * uploads only in a single shot.
   */
  List<FilesExtEndpoint> defaultEndpoints() {
    String host = workspaceHost(config);
    List<FilesExtEndpoint> endpoints = new ArrayList<>();
    endpoints.add(new FilesExtEndpoint(Kind.IO_OFFLOAD, host, true));
    endpoints.add(new FilesExtEndpoint(Kind.FILES_API_V2, host, false));
    return endpoints;
  }

  /**
   * The workspace host. A credentials provider may set it only when it is first configured, which
   * authenticating does, so it is read after that. A failure to authenticate is the caller's: the
   * transfer could not reach the workspace either.
   */
  static String workspaceHost(DatabricksConfig config) {
    if (config.getHost() == null) {
      config.authenticate();
    }
    return config.getHost();
  }

  private Cached cached() {
    synchronized (cacheLock) {
      return cached;
    }
  }

  private Instant now() {
    return clock.getClock().instant();
  }

  private static boolean isPastStaleLimit(Cached cached, Instant now) {
    return cached.fromServer && !now.isBefore(cached.fetchedAt.plus(MAX_STALE));
  }

  /**
   * Asks the server on a daemon thread and waits at most {@link #resolveTimeout}. Returns null if
   * the failure may be transient, including a timeout, and an empty list if the answer leaves
   * nothing to use.
   *
   * @throws InterruptedException if the caller is interrupted while it waits
   */
  private List<FilesExtEndpoint> fetchWithTimeout() throws InterruptedException {
    long deadline = System.nanoTime() + resolveTimeout.toNanos();
    if (worker != null) {
      // A request that outlived its caller, in a client that ignores interrupts or after the
      // caller was interrupted, still holds its connection: wait for it within the same bound, so
      // that at most one request is in flight.
      TimeUnit.NANOSECONDS.timedJoin(worker, resolveTimeout.toNanos());
      if (worker.isAlive()) {
        LOG.warn(
            "The last request for file endpoints is still running after {}s, using the default"
                + " endpoints.",
            resolveTimeout.getSeconds());
        return null;
      }
    }
    FutureTask<List<FilesExtEndpoint>> task = new FutureTask<>(this::fetch);
    Thread thread = new Thread(task, DISCOVERY_THREAD_NAME);
    thread.setDaemon(true);
    try {
      thread.start();
    } catch (OutOfMemoryError | RuntimeException e) {
      // No thread to ask on, as when the process has run out of them: a transient failure, so that
      // discovery does not fail the transfer.
      LOG.warn("Failed to start resolving file endpoints, using the default endpoints: {}", e);
      return null;
    }
    worker = thread;
    try {
      return task.get(Math.max(0, deadline - System.nanoTime()), TimeUnit.NANOSECONDS);
    } catch (TimeoutException e) {
      // Interrupting frees a request waiting for a pooled connection. A user's HttpClient may not
      // stop, and the next refresh waits for it.
      task.cancel(true);
      LOG.warn(
          "Timed out after {}s resolving file endpoints, using the default endpoints.",
          resolveTimeout.getSeconds());
      return null;
    } catch (InterruptedException e) {
      task.cancel(true);
      throw e;
    } catch (ExecutionException e) {
      LOG.warn("Failed to resolve file endpoints, using the default endpoints: {}", e.getCause());
      return null;
    }
  }

  /**
   * Fetches the endpoint list, keeping only entries this SDK can speak. Returns null if the failure
   * may be transient (no response, a retryable status, or a body that does not parse), and an empty
   * list if the server's answer leaves nothing to use.
   */
  private List<FilesExtEndpoint> fetch() {
    HttpClient httpClient = config.getHttpClient();
    Response response;
    try {
      // Authenticating first: it may set the host.
      Map<String, String> headers = config.authenticate();
      Request request =
          new Request("GET", config.getHost() + ENDPOINTS_API_PATH)
              .withHeaders(headers)
              .withHeader("Accept", "application/json")
              .withHeader("User-Agent", UserAgent.asString());
      // The workspace this config names, as every workspace call sends it, so that a host serving
      // several workspaces answers for this one.
      if (config.getWorkspaceId() != null) {
        request.withHeader("X-Databricks-Workspace-Id", config.getWorkspaceId());
      }
      // A redirect would carry the workspace's credentials to wherever it points: it is not
      // followed, and the transfer uses the built-in order.
      request.setRedirectionBehavior(false);
      response = httpClient.execute(request);
    } catch (Exception e) {
      // Broad on purpose: network and auth failures must all fail safe to the default order.
      LOG.warn("Failed to resolve file endpoints, using the default endpoints: {}", e);
      return null;
    }

    // Lets a failure below be traced to the server's request log.
    String requestId = response.getFirstHeader("x-request-id");
    JsonNode body;
    try (InputStream in = response.getBody()) {
      int status = response.getStatusCode();
      if (status == 404) {
        // Not a warning: until the server-side rollout completes, some workspaces do not serve it.
        LOG.info(
            "Endpoints API is not served for this workspace (request ID {}), using the default"
                + " endpoints.",
            requestId);
        return Collections.emptyList();
      }
      if (status != 200) {
        LOG.warn(
            "Unexpected status resolving file endpoints ({}, request ID {}), using the default"
                + " endpoints.",
            status,
            requestId);
        boolean transient_ = status >= 500 || RETRYABLE_STATUS_CODES.contains(status);
        return transient_ ? null : Collections.<FilesExtEndpoint>emptyList();
      }
      if (in == null) {
        throw new IllegalStateException("empty response body");
      }
      body = MAPPER.readTree(in);
      if (body == null || body.isMissingNode()) {
        throw new IllegalStateException("empty response body");
      }
    } catch (Exception e) {
      LOG.warn(
          "Failed to parse endpoints response (request ID {}), using the default endpoints: {}",
          requestId,
          e);
      return null;
    }

    // Proto3 JSON leaves out an empty repeated field.
    JsonNode entries = body.isObject() ? body.path("endpoints") : null;
    if (entries != null && entries.isMissingNode()) {
      entries = MAPPER.createArrayNode();
    }
    if (entries == null || !entries.isArray()) {
      LOG.warn(
          "Unexpected endpoints response (request ID {}), using the default endpoints: {}",
          requestId,
          body);
      return Collections.emptyList();
    }
    List<FilesExtEndpoint> endpoints = new ArrayList<>();
    for (JsonNode entry : entries) {
      Kind kind = endpointKind(entry);
      if (kind == null) {
        // Not a warning: an older SDK is expected to skip entries for APIs added after it shipped.
        LOG.info("Skipping endpoint this SDK cannot use (request ID {}): {}", requestId, entry);
        continue;
      }
      FilesExtEndpoint endpoint = parseEndpoint(entry, kind);
      if (endpoint == null) {
        LOG.warn(
            "Skipping {} endpoint with an unusable address (request ID {}): {}",
            kind,
            requestId,
            entry);
        continue;
      }
      endpoints.add(endpoint);
    }
    if (endpoints.isEmpty()) {
      LOG.warn(
          "No usable endpoints in the response (request ID {}), using the default endpoints.",
          requestId);
    }
    return endpoints;
  }

  /** Returns the protocol of a listed endpoint, or null if this SDK does not speak it. */
  private static Kind endpointKind(JsonNode entry) {
    if (!entry.isObject()) {
      return null;
    }
    JsonNode api = entry.path("api");
    JsonNode apiVersion = entry.path("api_version");
    // IO_OFFLOAD entries have no api_version, so a missing or null version is allowed.
    boolean versionAbsent = apiVersion.isMissingNode() || apiVersion.isNull();
    if (!api.isTextual() || !(versionAbsent || apiVersion.isTextual())) {
      return null;
    }
    return RECOGNIZED_ENDPOINTS.get(
        recognizedKey(api.textValue(), versionAbsent ? null : apiVersion.textValue()));
  }

  private FilesExtEndpoint parseEndpoint(JsonNode entry, Kind kind) {
    JsonNode schemeNode = entry.path("scheme");
    JsonNode hostnameNode = entry.path("hostname");
    if (!schemeNode.isTextual() || !hostnameNode.isTextual()) {
      return null;
    }
    String scheme = schemeNode.textValue();
    String hostname = hostnameNode.textValue();
    if (!(scheme.equals("http") || scheme.equals("https")) || hostname.isEmpty()) {
      return null;
    }
    // A Files API 3.0 host is reached over the internet with workspace credentials: it needs TLS.
    if (kind == Kind.FILES_API_V3 && !scheme.equals("https")) {
      return null;
    }
    String baseUrl = scheme + "://" + hostname;
    // Only a bare host and port. Transfers route by the host parsed here, so it must be the host
    // the request reaches, and an address that fails to parse mid-transfer must not get that far.
    String host = bareHost(baseUrl, hostname);
    if (host == null) {
      return null;
    }
    // Plain HTTP carries workspace credentials in the clear. The workspace host may use it only if
    // the SDK is configured to reach the workspace that way; another host only for Files API 2.0,
    // i.e. the in-cluster storage proxy.
    if (scheme.equals("http")) {
      URI workspace = URI.create(workspaceHost(config));
      String workspaceHost =
          workspace.getHost() == null ? "" : workspace.getHost().toLowerCase(Locale.ROOT);
      if (host.equals(workspaceHost)) {
        if (!"http".equalsIgnoreCase(workspace.getScheme())) {
          return null;
        }
      } else if (kind != Kind.FILES_API_V2) {
        return null;
      }
    }
    // Mirrors the proto getter: an unset optional bool reads as false.
    JsonNode multipart = entry.path("multipart_upload_supported");
    return new FilesExtEndpoint(kind, baseUrl, multipart.isBoolean() && multipart.booleanValue());
  }

  /**
   * The lowercased host of {@code baseUrl}, or null unless {@code hostname} is exactly a host and
   * an optional port: no user info, path, query or fragment, and a port in range.
   */
  private static String bareHost(String baseUrl, String hostname) {
    URI uri;
    try {
      uri = new URI(baseUrl).parseServerAuthority();
    } catch (URISyntaxException e) {
      return null;
    }
    if (uri.getHost() == null
        || uri.getRawUserInfo() != null
        || !hostname.equals(uri.getRawAuthority())
        || !uri.getRawPath().isEmpty()
        || uri.getRawQuery() != null
        || uri.getRawFragment() != null
        || uri.getPort() > 65535) {
      return null;
    }
    return uri.getHost().toLowerCase(Locale.ROOT);
  }

  /** A key that keeps an absent version apart from every version string, including "". */
  private static String recognizedKey(String api, String apiVersion) {
    return apiVersion == null ? api : api + "\u0000" + apiVersion;
  }

  /** The endpoint list a client resolved, and when to ask the server again. */
  private static final class Cached {
    final List<FilesExtEndpoint> endpoints;
    final Instant expiresAt;

    /** The endpoints are the server's list, not the built-in order. */
    final boolean fromServer;

    /** When the server gave the list. Meaningless unless {@link #fromServer}. */
    final Instant fetchedAt;

    Cached(
        List<FilesExtEndpoint> endpoints,
        Instant expiresAt,
        boolean fromServer,
        Instant fetchedAt) {
      this.endpoints = Collections.unmodifiableList(new ArrayList<>(endpoints));
      this.expiresAt = expiresAt;
      this.fromServer = fromServer;
      this.fetchedAt = fetchedAt;
    }

    boolean isExpired(Instant now) {
      return !now.isBefore(expiresAt);
    }
  }
}
