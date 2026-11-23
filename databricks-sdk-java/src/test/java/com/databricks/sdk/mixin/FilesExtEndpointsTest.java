package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DummyCredentialsProvider;
import com.databricks.sdk.core.HeaderFactory;
import com.databricks.sdk.core.UserAgent;
import com.databricks.sdk.core.commons.CommonsHttpClient;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.utils.TestClockSupplier;
import com.databricks.sdk.mixin.FilesExtEndpoint.Kind;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Endpoint discovery: what the server's list gives, the fallback to the built-in order, and when
 * the list is asked for again.
 */
public class FilesExtEndpointsTest {
  private static final ObjectMapper MAPPER = new ObjectMapper();
  private static final String HOST = "http://localhost";
  private static final Duration SHORT_TIMEOUT = Duration.ofMillis(200);

  private static final Map<String, Object> IO_OFFLOAD_WS =
      entry("IO_OFFLOAD", null, "https", "ws.example.com", true);
  private static final Map<String, Object> FILES_V2_WORKSPACE =
      entry("FILES_API", "2.0", "https", "ws.example.com", false);
  private static final Map<String, Object> FILES_V2_STORAGE_PROXY =
      entry("FILES_API", "2.0", "http", "storage-proxy.example.com", true);
  private static final Map<String, Object> FILES_V3 =
      entry("FILES_API", "3.0", "https", "123.storage.us-west-2.example.com", true);

  private static final FilesExtEndpoint PARSED_IO_OFFLOAD_WS =
      new FilesExtEndpoint(Kind.IO_OFFLOAD, "https://ws.example.com", true);
  private static final FilesExtEndpoint PARSED_FILES_V2_WORKSPACE =
      new FilesExtEndpoint(Kind.FILES_API_V2, "https://ws.example.com", false);
  private static final FilesExtEndpoint PARSED_FILES_V2_STORAGE_PROXY =
      new FilesExtEndpoint(Kind.FILES_API_V2, "http://storage-proxy.example.com", true);
  private static final FilesExtEndpoint PARSED_FILES_V3 =
      new FilesExtEndpoint(Kind.FILES_API_V3, "https://123.storage.us-west-2.example.com", true);

  private static final List<FilesExtEndpoint> DEFAULT_ENDPOINTS =
      Arrays.asList(
          new FilesExtEndpoint(Kind.IO_OFFLOAD, HOST, true),
          new FilesExtEndpoint(Kind.FILES_API_V2, HOST, false));

  private final FakeServer server = new FakeServer();
  private final TestClockSupplier clock =
      new TestClockSupplier(Instant.parse("2026-11-11T00:00:00Z"));

  @AfterEach
  void releaseBlockedRequests() {
    server.release.countDown();
  }

  // ======================== the server's list ========================

  @Test
  void disabled_usesTheBuiltInOrderWithoutAskingTheServer() {
    server.plan(FILES_V2_WORKSPACE);

    assertEquals(DEFAULT_ENDPOINTS, resolver(false).resolve());
    assertEquals(0, server.calls.get());
  }

  static Stream<Arguments> serverResponses() {
    return Stream.of(
        Arguments.of(
            "the server's order is preserved",
            body(Arrays.asList(FILES_V2_STORAGE_PROXY, IO_OFFLOAD_WS, FILES_V2_WORKSPACE)),
            Arrays.asList(
                PARSED_FILES_V2_STORAGE_PROXY, PARSED_IO_OFFLOAD_WS, PARSED_FILES_V2_WORKSPACE)),
        Arguments.of(
            "Files API 3.0 is recognized",
            body(Arrays.asList(IO_OFFLOAD_WS, FILES_V3, FILES_V2_WORKSPACE)),
            Arrays.asList(PARSED_IO_OFFLOAD_WS, PARSED_FILES_V3, PARSED_FILES_V2_WORKSPACE)),
        Arguments.of(
            // Presigned URLs are coordinated by the workspace; plain HTTP to another host would
            // expose credentials.
            "IO_OFFLOAD over plain HTTP to another host is skipped",
            body(Arrays.asList(with(IO_OFFLOAD_WS, "scheme", "http"), FILES_V2_WORKSPACE)),
            Collections.singletonList(PARSED_FILES_V2_WORKSPACE)),
        Arguments.of(
            // The SDK reaches this workspace over plain HTTP, so its own host may use it too.
            "IO_OFFLOAD over plain HTTP to a plain-HTTP workspace's host is kept",
            body(
                Arrays.asList(
                    entry("IO_OFFLOAD", null, "http", "localhost", true),
                    entry("IO_OFFLOAD", null, "http", "LOCALHOST", true))),
            Arrays.asList(
                new FilesExtEndpoint(Kind.IO_OFFLOAD, HOST, true),
                new FilesExtEndpoint(Kind.IO_OFFLOAD, "http://LOCALHOST", true))),
        Arguments.of(
            // Workspace credentials go to a Files API 3.0 host, so it must use TLS.
            "Files API 3.0 over plain HTTP is skipped",
            body(Arrays.asList(with(FILES_V3, "scheme", "http"), FILES_V2_WORKSPACE)),
            Collections.singletonList(PARSED_FILES_V2_WORKSPACE)),
        Arguments.of(
            "unknown and unspecified api values are skipped",
            body(
                Arrays.asList(
                    with(IO_OFFLOAD_WS, "api", "SOMETHING_NEW"),
                    with(IO_OFFLOAD_WS, "api", "API_UNSPECIFIED"),
                    without(IO_OFFLOAD_WS, "api"),
                    FILES_V2_WORKSPACE)),
            Collections.singletonList(PARSED_FILES_V2_WORKSPACE)),
        Arguments.of(
            "Files API without a known version is skipped",
            body(
                Arrays.asList(
                    without(FILES_V2_STORAGE_PROXY, "api_version"),
                    with(FILES_V2_STORAGE_PROXY, "api_version", "2.1"),
                    FILES_V2_WORKSPACE)),
            Collections.singletonList(PARSED_FILES_V2_WORKSPACE)),
        Arguments.of(
            // The SDK only speaks the unversioned offload protocol; a versioned one is newer.
            "versioned IO_OFFLOAD is skipped",
            body(
                Arrays.asList(
                    with(IO_OFFLOAD_WS, "api_version", "3.0"),
                    with(IO_OFFLOAD_WS, "api_version", ""),
                    FILES_V2_WORKSPACE)),
            Collections.singletonList(PARSED_FILES_V2_WORKSPACE)),
        Arguments.of(
            "entries without a usable scheme or hostname are skipped",
            body(
                Arrays.asList(
                    with(FILES_V2_STORAGE_PROXY, "scheme", "ftp"),
                    without(FILES_V2_STORAGE_PROXY, "scheme"),
                    with(FILES_V2_STORAGE_PROXY, "hostname", ""),
                    without(FILES_V2_STORAGE_PROXY, "hostname"),
                    FILES_V2_WORKSPACE)),
            Collections.singletonList(PARSED_FILES_V2_WORKSPACE)),
        Arguments.of(
            // Mirrors the proto getter: an unset optional bool reads as false.
            "missing multipart_upload_supported reads as false",
            body(
                Collections.singletonList(
                    without(FILES_V2_STORAGE_PROXY, "multipart_upload_supported"))),
            Collections.singletonList(
                new FilesExtEndpoint(
                    Kind.FILES_API_V2, "http://storage-proxy.example.com", false))),
        Arguments.of(
            "unknown fields are ignored",
            json(
                map(
                    "endpoints",
                    Collections.singletonList(with(FILES_V2_WORKSPACE, "future_field", 1)),
                    "next_page_token",
                    "x")),
            Collections.singletonList(PARSED_FILES_V2_WORKSPACE)),
        Arguments.of(
            "empty list falls back to the default",
            body(Collections.emptyList()),
            DEFAULT_ENDPOINTS),
        Arguments.of("missing endpoints field falls back to the default", "{}", DEFAULT_ENDPOINTS),
        Arguments.of(
            "only unrecognized entries falls back to the default",
            body(
                Arrays.asList(
                    with(FILES_V2_WORKSPACE, "api_version", "9.9"),
                    with(IO_OFFLOAD_WS, "api", "SOMETHING_NEW"))),
            DEFAULT_ENDPOINTS),
        Arguments.of(
            "malformed endpoints field falls back to the default",
            "{\"endpoints\": \"not-a-list\"}",
            DEFAULT_ENDPOINTS),
        Arguments.of(
            "malformed entry is skipped",
            body(Arrays.asList("not-an-object", FILES_V2_WORKSPACE)),
            Collections.singletonList(PARSED_FILES_V2_WORKSPACE)));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("serverResponses")
  void resolve_parsesTheServerResponse(
      String name, String responseBody, List<FilesExtEndpoint> expected) {
    server.body = responseBody;

    assertEquals(expected, resolver().resolve());
    assertEquals(1, server.calls.get());
  }

  static Stream<Fault> failures() {
    return Stream.of(
        Fault.status(404),
        Fault.status(403),
        Fault.status(500),
        // A single attempt, no retries: a 503 falls back immediately rather than stall a transfer.
        Fault.status(503),
        Fault.connectionError(),
        Fault.text("not json"),
        Fault.text("{\"endpoints\": \"not-a-list\"}"),
        Fault.text(String.join("", Collections.nCopies(100_000, "["))));
  }

  @ParameterizedTest
  @MethodSource("failures")
  void failure_fallsBackToTheBuiltInOrder(Fault failure) {
    server.plan(FILES_V2_WORKSPACE);
    server.always = failure;

    assertEquals(DEFAULT_ENDPOINTS, resolver().resolve());
  }

  static Stream<Arguments> hostSetOnlyWhenAuthenticating() {
    return Stream.of(
        Arguments.of(
            "the server's list", true, null, Collections.singletonList(PARSED_FILES_V2_WORKSPACE)),
        Arguments.of("a failure: the built-in order", true, Fault.status(500), DEFAULT_ENDPOINTS),
        Arguments.of("discovery off: the built-in order", false, null, DEFAULT_ENDPOINTS));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("hostSetOnlyWhenAuthenticating")
  void aHostSetOnlyWhenAuthenticating_isTheWorkspaceHost(
      String name, boolean enabled, Fault faultOrNull, List<FilesExtEndpoint> want) {
    // A credentials provider that supplies the host only when it is configured, as one that reads
    // the host from its runtime does.
    DatabricksConfig config =
        new DatabricksConfig()
            .setCredentialsProvider(
                new DummyCredentialsProvider() {
                  @Override
                  public HeaderFactory configure(DatabricksConfig c) {
                    c.setHost(HOST);
                    return super.configure(c);
                  }
                })
            .setHttpClient(server);
    server.plan(FILES_V2_WORKSPACE);
    server.always = faultOrNull;

    List<FilesExtEndpoint> got =
        new FilesExtEndpoints(config, enabled, clock, FilesExtEndpoints.RESOLVE_TIMEOUT).resolve();

    assertEquals(want, got);
    List<String> urls = new ArrayList<>();
    for (Request r : server.requests) {
      urls.add(r.getUrl());
    }
    assertEquals(
        enabled
            ? Collections.singletonList(HOST + FilesExtEndpoints.ENDPOINTS_API_PATH)
            : Collections.<String>emptyList(),
        urls);
  }

  static Stream<Arguments> cachedResolutions() {
    return Stream.of(
        Arguments.of(
            "a list",
            FILES_V2_WORKSPACE,
            null,
            Collections.singletonList(PARSED_FILES_V2_WORKSPACE)),
        // A failed resolution is not retried on every transfer; the client keeps the default order.
        Arguments.of("a failure", null, Fault.status(500), DEFAULT_ENDPOINTS));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("cachedResolutions")
  void resolution_isCached(
      String name,
      Map<String, Object> entryOrNull,
      Fault faultOrNull,
      List<FilesExtEndpoint> want) {
    if (entryOrNull != null) {
      server.plan(entryOrNull);
    }
    server.always = faultOrNull;
    FilesExtEndpoints endpoints = resolver();

    assertEquals(want, endpoints.resolve());
    assertEquals(want, endpoints.resolve());
    assertEquals(1, server.calls.get());
  }

  @Test
  void concurrentCallers_shareOneRequest() throws Exception {
    // Parallel transfer workers resolve concurrently; only one request may reach the server.
    server.plan(FILES_V2_WORKSPACE);
    server.faultOnCall(1, Fault.block());
    FilesExtEndpoints endpoints = resolver(true, FilesExtEndpoints.RESOLVE_TIMEOUT);
    List<List<FilesExtEndpoint>> results = new CopyOnWriteArrayList<>();
    List<Thread> threads = new ArrayList<>();
    for (int i = 0; i < 8; i++) {
      threads.add(new Thread(() -> results.add(endpoints.resolve())));
    }
    threads.forEach(Thread::start);
    assertTrue(server.blocked.await(10, TimeUnit.SECONDS), "the server was never asked");
    server.release.countDown();
    for (Thread t : threads) {
      t.join(10_000);
    }

    assertEquals(
        Collections.nCopies(8, Collections.singletonList(PARSED_FILES_V2_WORKSPACE)), results);
    assertEquals(1, server.calls.get());
  }

  @Test
  void resolve_returnsACopyCallersCannotCorrupt() {
    server.plan(FILES_V2_STORAGE_PROXY, FILES_V2_WORKSPACE);
    FilesExtEndpoints endpoints = resolver();

    endpoints.resolve().remove(0);

    assertEquals(
        Arrays.asList(PARSED_FILES_V2_STORAGE_PROXY, PARSED_FILES_V2_WORKSPACE),
        endpoints.resolve());
  }

  @Test
  void request_sendsCredentialsAndTheSdkUserAgent() {
    server.plan();

    resolver().resolve();

    Request request = server.requests.get(0);
    assertEquals("GET", request.getMethod());
    assertEquals(HOST + "/api/2.0/fs/endpoints", request.getUrl());
    assertEquals("Basic test", request.getHeaders().get("Authorization"));
    assertEquals("application/json", request.getHeaders().get("Accept"));
    assertEquals(UserAgent.asString(), request.getHeaders().get("User-Agent"));
    assertTrue(request.getHeaders().get("User-Agent").contains("databricks-sdk-java/"));
  }

  @ParameterizedTest(name = "workspace id {0}")
  @NullSource
  @ValueSource(strings = {"1234567890"})
  void request_sendsTheConfiguredWorkspaceId(String workspaceIdOrNull) {
    server.plan();

    new FilesExtEndpoints(
            config(HOST).setWorkspaceId(workspaceIdOrNull),
            true,
            clock,
            FilesExtEndpoints.RESOLVE_TIMEOUT)
        .resolve();

    assertEquals(
        workspaceIdOrNull, server.requests.get(0).getHeaders().get("X-Databricks-Workspace-Id"));
  }

  @Test
  void redirect_isNotFollowed() throws IOException {
    HttpServer workspace =
        HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
    AtomicInteger redirected = new AtomicInteger();
    String origin = "http://127.0.0.1:" + workspace.getAddress().getPort();
    workspace.createContext(
        "/api/2.0/fs/endpoints",
        exchange -> {
          exchange.getResponseHeaders().add("Location", origin + "/elsewhere");
          exchange.sendResponseHeaders(302, -1);
          exchange.close();
        });
    workspace.createContext(
        "/elsewhere",
        exchange -> {
          redirected.incrementAndGet();
          byte[] answer =
              body(Collections.singletonList(FILES_V3)).getBytes(StandardCharsets.UTF_8);
          exchange.getResponseHeaders().add("Content-Type", "application/json");
          exchange.sendResponseHeaders(200, answer.length);
          exchange.getResponseBody().write(answer);
          exchange.close();
        });
    workspace.start();
    try {
      DatabricksConfig config =
          new DatabricksConfig()
              .setHost(origin)
              .setCredentialsProvider(new DummyCredentialsProvider())
              .setHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(5).build());

      List<FilesExtEndpoint> endpoints =
          new FilesExtEndpoints(config, true, clock, FilesExtEndpoints.RESOLVE_TIMEOUT).resolve();

      assertEquals(0, redirected.get());
      assertEquals(
          Arrays.asList(
              new FilesExtEndpoint(Kind.IO_OFFLOAD, origin, true),
              new FilesExtEndpoint(Kind.FILES_API_V2, origin, false)),
          endpoints);
    } finally {
      workspace.stop(0);
    }
  }

  @Test
  void defaultEndpoints_areOffloadThenTheWorkspace() {
    assertEquals(DEFAULT_ENDPOINTS, resolver().defaultEndpoints());
  }

  @Test
  void plainHttpToATlsWorkspace_isSkipped() {
    // Workspace credentials must not leave over plain HTTP when the SDK reaches the workspace
    // over TLS.
    server.plan(
        with(FILES_V2_WORKSPACE, "scheme", "http"),
        with(IO_OFFLOAD_WS, "scheme", "http"),
        FILES_V2_WORKSPACE);
    FilesExtEndpoints endpoints =
        new FilesExtEndpoints(
            config("https://ws.example.com"), true, clock, FilesExtEndpoints.RESOLVE_TIMEOUT);

    assertEquals(Collections.singletonList(PARSED_FILES_V2_WORKSPACE), endpoints.resolve());
  }

  static Stream<Arguments> malformedAddresses() {
    List<String> hostnames =
        Arrays.asList(
            "storage-proxy.example.com:abc",
            "storage-proxy.example.com:70000",
            "[::1",
            "*.example.com",
            ".example.com",
            "localhost?x",
            "localhost#x",
            "localhost/x",
            "storage-proxy.example.com@localhost",
            "%6cocalhost",
            "localhost\\",
            // Non-ASCII: an HTTP client sends an encoded form of these, not the name as written.
            "b\u00fccher.example.com",
            "\uff45\uff58\uff41\uff4d\uff50\uff4c\uff45.com",
            "exa mple.com",
            "exa\u00a0mple.com",
            // java.net.URI cannot parse these as a server host, which is what the HTTP stack sends
            // to, so they are skipped rather than fail the transfer on them.
            "foo.1bar",
            "a_b.example.com",
            "-a.example.com",
            "a..b");
    return Stream.of("http", "https")
        .flatMap(scheme -> hostnames.stream().map(hostname -> Arguments.of(scheme, hostname)));
  }

  @ParameterizedTest
  @MethodSource("malformedAddresses")
  void malformedAddress_isSkipped(String scheme, String hostname) {
    // Transfers route by each endpoint's parsed host, so an address that does not parse, or that
    // names more than a host and port, must not reach them.
    server.plan(
        with(with(FILES_V2_STORAGE_PROXY, "scheme", scheme), "hostname", hostname),
        FILES_V2_WORKSPACE);

    assertEquals(Collections.singletonList(PARSED_FILES_V2_WORKSPACE), resolver().resolve());
  }

  @ParameterizedTest
  @ValueSource(
      strings = {
        "storage-proxy.example.com:8443",
        "[::1]",
        "[::1]:8443",
        "[::1]:65535",
        "10.0.0.1",
        "xn--bcher-kva.example.com",
        "example.com."
      })
  void hostWithPort_isAccepted(String hostname) {
    server.plan(with(with(FILES_V2_STORAGE_PROXY, "scheme", "https"), "hostname", hostname));

    assertEquals(
        Collections.singletonList(
            new FilesExtEndpoint(Kind.FILES_API_V2, "https://" + hostname, true)),
        resolver().resolve());
  }

  /**
   * The address shapes the server lists: the storage proxy, a Files API 3.0 host and workspace
   * hostnames. Pinned so that tightening the address check cannot drop a real endpoint.
   */
  static Stream<Arguments> realEndpointShapes() {
    return Stream.of(
        Arguments.of(
            HOST,
            entry("FILES_API", "2.0", "http", "storage-proxy.databricks.com", true),
            new FilesExtEndpoint(Kind.FILES_API_V2, "http://storage-proxy.databricks.com", true)),
        Arguments.of(
            HOST,
            entry(
                "FILES_API",
                "3.0",
                "https",
                "1234567890123456.storage.us-east-1.cloud.databricks.com",
                true),
            new FilesExtEndpoint(
                Kind.FILES_API_V3,
                "https://1234567890123456.storage.us-east-1.cloud.databricks.com",
                true)),
        Arguments.of(
            "https://adb-1234567890123456.7.azuredatabricks.net",
            entry("IO_OFFLOAD", null, "https", "adb-1234567890123456.7.azuredatabricks.net", true),
            new FilesExtEndpoint(
                Kind.IO_OFFLOAD, "https://adb-1234567890123456.7.azuredatabricks.net", true)),
        Arguments.of(
            "https://adb-1234567890123456.7.azuredatabricks.net",
            entry("FILES_API", "2.0", "https", "adb-1234567890123456.7.azuredatabricks.net", false),
            new FilesExtEndpoint(
                Kind.FILES_API_V2, "https://adb-1234567890123456.7.azuredatabricks.net", false)),
        Arguments.of(
            "https://1234567890123456.7.gcp.databricks.com",
            entry("IO_OFFLOAD", null, "https", "1234567890123456.7.gcp.databricks.com", true),
            new FilesExtEndpoint(
                Kind.IO_OFFLOAD, "https://1234567890123456.7.gcp.databricks.com", true)),
        Arguments.of(
            "https://1234567890123456.7.gcp.databricks.com",
            entry("FILES_API", "2.0", "https", "1234567890123456.7.gcp.databricks.com", false),
            new FilesExtEndpoint(
                Kind.FILES_API_V2, "https://1234567890123456.7.gcp.databricks.com", false)));
  }

  @ParameterizedTest
  @MethodSource("realEndpointShapes")
  void realEndpointShape_isAccepted(
      String workspaceHost, Map<String, Object> listed, FilesExtEndpoint expected) {
    server.plan(listed);
    FilesExtEndpoints endpoints =
        new FilesExtEndpoints(
            config(workspaceHost), true, clock, FilesExtEndpoints.RESOLVE_TIMEOUT);

    assertEquals(Collections.singletonList(expected), endpoints.resolve());
  }

  @Test
  void randomHostnames_giveOnlyBareOriginsAndNeverPlainHttpToAnotherHost() {
    // A property test over random addresses. The seed is fixed so a failure reproduces.
    Random random = new Random(20261112);
    String alphabet = "abcz019.-:[]@/?#%\\_* \u00fc\uff45\u00a0";
    String[] kinds = {"IO_OFFLOAD", "FILES_API 2.0", "FILES_API 3.0"};
    Pattern bareOrigin =
        Pattern.compile("^https?://(\\[[0-9a-fA-F:.%]+\\]|[A-Za-z0-9.-]+)(:[0-9]{0,5})?$");
    int checked = 0;
    for (int batch = 0; batch < 100; batch++) {
      List<Object> entries = new ArrayList<>();
      for (int i = 0; i < 200; i++) {
        StringBuilder hostname = new StringBuilder();
        int length = 1 + random.nextInt(20);
        for (int j = 0; j < length; j++) {
          hostname.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        String[] kind = kinds[random.nextInt(kinds.length)].split(" ");
        entries.add(
            entry(
                kind[0],
                kind.length > 1 ? kind[1] : null,
                random.nextBoolean() ? "http" : "https",
                hostname.toString(),
                true));
      }
      server.body = body(entries);

      List<FilesExtEndpoint> resolved = resolver().resolve();

      if (resolved.equals(DEFAULT_ENDPOINTS)) {
        continue;
      }
      for (FilesExtEndpoint endpoint : resolved) {
        checked++;
        String url = endpoint.baseUrl();
        assertTrue(bareOrigin.matcher(url).matches(), "not a bare origin: " + url);
        Matcher port = Pattern.compile(":([0-9]+)$").matcher(url);
        if (port.find() && !url.endsWith("]")) {
          assertTrue(Integer.parseInt(port.group(1)) <= 65535, "port out of range: " + url);
        }
        if (url.startsWith("http://")) {
          boolean workspace =
              url.equals(HOST) || url.toLowerCase(Locale.ROOT).startsWith(HOST + ":");
          assertTrue(
              workspace || endpoint.kind() == Kind.FILES_API_V2,
              "plain http to a non-workspace host for " + endpoint);
        }
        if (endpoint.kind() == Kind.FILES_API_V3) {
          assertTrue(url.startsWith("https://"), "Files API 3.0 without TLS: " + endpoint);
        }
      }
    }
    // Otherwise the properties above were never checked.
    assertTrue(checked > 200, "only " + checked + " random addresses were accepted");
    System.out.println("random addresses accepted and checked: " + checked);
  }

  // ======================== the TTL and refreshes ========================

  @Test
  void endpoints_areAskedAgainOnceTheTtlPasses() {
    server.plan(FILES_V2_STORAGE_PROXY);
    FilesExtEndpoints endpoints = resolver();

    endpoints.resolve();
    server.plan(FILES_V3);
    clock.advanceTime(FilesExtEndpoints.CACHE_TTL.minusSeconds(1));
    assertEquals(Collections.singletonList(PARSED_FILES_V2_STORAGE_PROXY), endpoints.resolve());
    assertEquals(1, server.calls.get());

    clock.advanceTime(Duration.ofSeconds(1));

    assertEquals(Collections.singletonList(PARSED_FILES_V3), endpoints.resolve());
    assertEquals(2, server.calls.get());
  }

  @Test
  void failedAnswer_isKeptForTheFailureTtl() {
    // The workspace does not serve the endpoints API yet, so the client uses the built-in order.
    server.always = Fault.status(404);
    FilesExtEndpoints endpoints = resolver();

    assertEquals(DEFAULT_ENDPOINTS, endpoints.resolve());
    server.always = null;
    server.plan(FILES_V3);
    clock.advanceTime(FilesExtEndpoints.FAILURE_CACHE_TTL.minusSeconds(1));
    assertEquals(DEFAULT_ENDPOINTS, endpoints.resolve());
    assertEquals(1, server.calls.get());

    clock.advanceTime(Duration.ofSeconds(1));

    assertEquals(Collections.singletonList(PARSED_FILES_V3), endpoints.resolve());
    assertEquals(2, server.calls.get());
  }

  static Stream<Fault> transientFailures() {
    return Stream.of(
        Fault.status(503),
        Fault.status(429),
        Fault.connectionError(),
        // Java only: the caller stops waiting after the resolve timeout.
        Fault.block());
  }

  @ParameterizedTest
  @MethodSource("transientFailures")
  void transientRefreshFailure_keepsTheServersList(Fault failure) {
    server.plan(FILES_V3);
    FilesExtEndpoints endpoints = resolver(true, SHORT_TIMEOUT);

    endpoints.resolve();
    server.faultOnCall(2, failure);
    clock.advanceTime(FilesExtEndpoints.CACHE_TTL);
    // The blip did not move the client off Files API 3.0.
    assertEquals(Collections.singletonList(PARSED_FILES_V3), endpoints.resolve());
    assertEquals(2, server.calls.get());

    // It asks again after the failure TTL, not the full TTL.
    server.plan(FILES_V2_STORAGE_PROXY);
    clock.advanceTime(FilesExtEndpoints.FAILURE_CACHE_TTL);

    assertEquals(Collections.singletonList(PARSED_FILES_V2_STORAGE_PROXY), endpoints.resolve());
    assertEquals(3, server.calls.get());
  }

  @Test
  void listKeptThroughFailingRefreshes_expiresAtTheStaleLimit() {
    server.plan(FILES_V3);
    FilesExtEndpoints endpoints = resolver();
    Instant start = clock.getClock().instant();

    endpoints.resolve();
    // Discovery breaks for good with an error that looks transient.
    server.always = Fault.status(503);
    clock.advanceTime(FilesExtEndpoints.CACHE_TTL);
    while (clock
        .getClock()
        .instant()
        .plus(FilesExtEndpoints.FAILURE_CACHE_TTL)
        .isBefore(start.plus(FilesExtEndpoints.MAX_STALE))) {
      assertEquals(Collections.singletonList(PARSED_FILES_V3), endpoints.resolve());
      clock.advanceTime(FilesExtEndpoints.FAILURE_CACHE_TTL);
    }
    clock.advanceTime(FilesExtEndpoints.FAILURE_CACHE_TTL);

    assertEquals(DEFAULT_ENDPOINTS, endpoints.resolve());
  }

  @Test
  void failingRefreshJustBeforeTheStaleLimit_keepsTheListOnlyUntilTheLimit() {
    server.plan(FILES_V3);
    FilesExtEndpoints endpoints = resolver();

    endpoints.resolve();
    server.always = Fault.status(503);
    // A refresh one minute before the limit fails and keeps the list, but only until the limit.
    clock.advanceTime(FilesExtEndpoints.MAX_STALE.minusSeconds(60));
    assertEquals(Collections.singletonList(PARSED_FILES_V3), endpoints.resolve());
    clock.advanceTime(Duration.ofSeconds(60));

    assertEquals(DEFAULT_ENDPOINTS, endpoints.resolve());
  }

  @Test
  void callers_dropAListPastTheStaleLimitWhileAnotherCallerAsks() throws Exception {
    server.plan(FILES_V3);
    FilesExtEndpoints endpoints = resolver(true, FilesExtEndpoints.RESOLVE_TIMEOUT);
    endpoints.resolve();
    clock.advanceTime(FilesExtEndpoints.MAX_STALE);
    // Holds the second ask, standing in for a refresh stuck in authentication.
    server.faultOnCall(2, Fault.block());
    List<List<FilesExtEndpoint>> asked = new CopyOnWriteArrayList<>();
    Thread asker = new Thread(() -> asked.add(endpoints.resolve()));
    asker.start();
    assertTrue(server.blocked.await(10, TimeUnit.SECONDS), "the expired list was not asked again");

    // The list is past the stale limit, so this caller gets the built-in order, not the stale one.
    List<FilesExtEndpoint> during = endpoints.resolve();

    server.release.countDown();
    asker.join(10_000);
    assertEquals(DEFAULT_ENDPOINTS, during);
    assertEquals(Collections.singletonList(Collections.singletonList(PARSED_FILES_V3)), asked);
  }

  @Test
  void callers_keepTheExpiredListWhileAnotherCallerAsks() throws Exception {
    server.plan(FILES_V2_STORAGE_PROXY);
    FilesExtEndpoints endpoints = resolver(true, FilesExtEndpoints.RESOLVE_TIMEOUT);
    endpoints.resolve();
    clock.advanceTime(FilesExtEndpoints.CACHE_TTL);
    server.plan(FILES_V3);
    server.faultOnCall(2, Fault.block());
    List<List<FilesExtEndpoint>> asked = new CopyOnWriteArrayList<>();
    Thread asker = new Thread(() -> asked.add(endpoints.resolve()));
    asker.start();
    assertTrue(server.blocked.await(10, TimeUnit.SECONDS), "the expired list was not asked again");

    // The asking caller holds the refresh, so this one neither asks nor waits for it.
    List<FilesExtEndpoint> during = endpoints.resolve();

    server.release.countDown();
    asker.join(10_000);
    assertEquals(Collections.singletonList(PARSED_FILES_V2_STORAGE_PROXY), during);
    assertEquals(Collections.singletonList(Collections.singletonList(PARSED_FILES_V3)), asked);
    assertEquals(2, server.calls.get());
  }

  @ParameterizedTest
  @ValueSource(ints = {403, 404})
  void discoveryTurnedOff_movesTheClientToTheBuiltInOrder(int status) {
    // How the server rolls discovery back: the endpoints API answers 403 (or 404 where not served).
    server.plan(FILES_V3);
    FilesExtEndpoints endpoints = resolver();

    endpoints.resolve();
    server.always = Fault.status(status);
    clock.advanceTime(FilesExtEndpoints.CACHE_TTL);

    assertEquals(DEFAULT_ENDPOINTS, endpoints.resolve());
  }

  // ======================== Java only: the caller's wait ========================

  @Test
  void constants_haveTheirSpecifiedValues() {
    assertEquals(Duration.ofSeconds(10), FilesExtEndpoints.RESOLVE_TIMEOUT);
    assertEquals(Duration.ofMinutes(30), FilesExtEndpoints.CACHE_TTL);
    assertEquals(Duration.ofMinutes(30), FilesExtEndpoints.FAILURE_CACHE_TTL);
    assertEquals(Duration.ofHours(2), FilesExtEndpoints.MAX_STALE);
  }

  @Test
  void clientThatNeverAnswers_givesTheBuiltInOrderWithinTheTimeout() {
    // Stands in for a request queued forever behind transfers holding every pooled connection.
    // Uses the real 10 s constant on purpose: it caps the caller's total wait for discovery.
    server.always = Fault.block();
    FilesExtEndpoints endpoints = new FilesExtEndpoints(config(HOST), true);
    long start = System.nanoTime();

    List<FilesExtEndpoint> resolved = endpoints.resolve();

    long elapsedMillis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start);
    assertEquals(DEFAULT_ENDPOINTS, resolved);
    // Wide, so that a loaded runner does not fail it: no wait, or a second one, falls outside.
    assertTrue(
        elapsedMillis >= 5_000 && elapsedMillis <= 15_000, "waited " + elapsedMillis + " ms");
  }

  @Test
  void callerWithNoList_waitsOnlyForTheFirstCallersAsk() throws Exception {
    // A client with no list yet waits for the first answer, so its wait is bounded by the first
    // caller's timeout and it does not ask again.
    server.always = Fault.block();
    FilesExtEndpoints endpoints = resolver(true, FilesExtEndpoints.RESOLVE_TIMEOUT);
    Thread first = new Thread(endpoints::resolve);
    first.start();
    assertTrue(server.blocked.await(10, TimeUnit.SECONDS), "the server was never asked");
    long start = System.nanoTime();

    List<FilesExtEndpoint> resolved = endpoints.resolve();

    long elapsedMillis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start);
    first.join(15_000);
    assertEquals(DEFAULT_ENDPOINTS, resolved);
    // Waiting for an ask of its own would take another 10 s.
    assertTrue(
        elapsedMillis >= 5_000 && elapsedMillis <= 15_000, "waited " + elapsedMillis + " ms");
    assertEquals(1, server.calls.get());
  }

  @Test
  void discovery_leavesNoNonDaemonThreadBehind() throws Exception {
    Set<Thread> nonDaemonBefore = nonDaemonThreads();
    server.plan(FILES_V3);
    // The second refresh times out in an HttpClient that stops when interrupted, like Apache's
    // pool; the third in one that ignores interrupts, like an opaque user client may.
    server.faultOnCall(2, Fault.block());
    server.faultOnCall(3, Fault.blockIgnoringInterrupts());
    FilesExtEndpoints endpoints = resolver(true, SHORT_TIMEOUT);
    endpoints.resolve();
    assertTrue(waitForNoDiscoveryThreads(), "the answered refresh left a thread behind");
    clock.advanceTime(FilesExtEndpoints.CACHE_TTL);
    endpoints.resolve();
    assertTrue(
        waitForNoDiscoveryThreads(), "cancelling the timed-out refresh left a thread behind");
    clock.advanceTime(FilesExtEndpoints.FAILURE_CACHE_TTL);

    endpoints.resolve();

    Set<Thread> created = new HashSet<>(nonDaemonThreads());
    created.removeAll(nonDaemonBefore);
    assertEquals(Collections.emptySet(), created);
    List<Thread> lingering = discoveryThreads();
    // Only the refresh whose client ignores interrupts is still running, and it is a daemon thread.
    assertEquals(1, lingering.size(), "discovery threads: " + lingering);
    assertTrue(lingering.get(0).isDaemon(), lingering.get(0).getName() + " is not a daemon thread");
  }

  @Test
  void aRefreshThatOutlivesItsTimeout_isTheOnlyRequestInFlight() throws Exception {
    server.plan(FILES_V3);
    server.faultOnCall(1, Fault.blockIgnoringInterrupts());
    FilesExtEndpoints endpoints = resolver(true, SHORT_TIMEOUT);
    assertEquals(DEFAULT_ENDPOINTS, endpoints.resolve());
    clock.advanceTime(FilesExtEndpoints.FAILURE_CACHE_TTL);

    // The first request is still running: the refresh waits for it and does not send another.
    assertEquals(DEFAULT_ENDPOINTS, endpoints.resolve());
    assertEquals(1, server.calls.get());

    server.release.countDown();
    assertTrue(waitForNoDiscoveryThreads(), "the released request did not end");
    clock.advanceTime(FilesExtEndpoints.FAILURE_CACHE_TTL);

    assertEquals(Collections.singletonList(PARSED_FILES_V3), endpoints.resolve());
    assertEquals(2, server.calls.get());
  }

  @Test
  void aRefreshAfterAnInterruptedCaller_waitsForItsRequest() throws Exception {
    server.plan(FILES_V3);
    server.faultOnCall(1, Fault.blockIgnoringInterrupts());
    FilesExtEndpoints endpoints = resolver(true, Duration.ofSeconds(5));
    // Interrupts this caller once its request is running.
    Thread caller = Thread.currentThread();
    Thread interrupter =
        new Thread(
            () -> {
              try {
                if (server.blocked.await(10, TimeUnit.SECONDS)) {
                  caller.interrupt();
                }
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
            });
    interrupter.start();
    assertEquals(DEFAULT_ENDPOINTS, endpoints.resolve());
    // Read, and so cleared, before joining: a join on an interrupted thread throws.
    assertTrue(Thread.interrupted(), "the caller was not interrupted, or its status was cleared");
    interrupter.join(10_000);

    // Ends the first request while the next caller waits for it, noting whether it asked again.
    AtomicInteger callsBeforeTheRelease = new AtomicInteger();
    Thread releaser =
        new Thread(
            () -> {
              try {
                Thread.sleep(200);
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
              callsBeforeTheRelease.set(server.calls.get());
              server.release.countDown();
            });
    releaser.start();
    List<FilesExtEndpoint> resolved = endpoints.resolve();
    releaser.join(10_000);

    assertEquals(1, callsBeforeTheRelease.get(), "a second request was sent while one was running");
    assertEquals(Collections.singletonList(PARSED_FILES_V3), resolved);
    assertEquals(2, server.calls.get());
  }

  private static List<Thread> discoveryThreads() {
    List<Thread> threads = new ArrayList<>();
    for (Thread t : Thread.getAllStackTraces().keySet()) {
      if (t.isAlive() && t.getName().equals(FilesExtEndpoints.DISCOVERY_THREAD_NAME)) {
        threads.add(t);
      }
    }
    return threads;
  }

  /** Waits up to 5 s for every discovery thread to end; the test fails if one does not. */
  private static boolean waitForNoDiscoveryThreads() throws InterruptedException {
    for (Thread t : discoveryThreads()) {
      t.join(5_000);
    }
    return discoveryThreads().isEmpty();
  }

  private static Set<Thread> nonDaemonThreads() {
    Set<Thread> threads = new HashSet<>();
    for (Thread t : Thread.getAllStackTraces().keySet()) {
      if (!t.isDaemon() && t.isAlive()) {
        threads.add(t);
      }
    }
    return threads;
  }

  @Test
  void blockedRefresh_doesNotStallCallersThatHaveAList() throws Exception {
    server.plan(FILES_V3);
    // A caller that waited for the refresh would wait 30 s, well past the 15 s bound below.
    FilesExtEndpoints endpoints = resolver(true, Duration.ofSeconds(30));
    endpoints.resolve();
    clock.advanceTime(FilesExtEndpoints.CACHE_TTL);
    server.always = Fault.block();
    List<List<FilesExtEndpoint>> asked = new CopyOnWriteArrayList<>();
    Thread asker = new Thread(() -> asked.add(endpoints.resolve()));
    asker.start();
    assertTrue(server.blocked.await(10, TimeUnit.SECONDS), "the expired list was not asked again");
    long start = System.nanoTime();

    List<FilesExtEndpoint> during = endpoints.resolve();

    long elapsedMillis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start);
    server.release.countDown();
    asker.join(15_000);
    assertEquals(Collections.singletonList(PARSED_FILES_V3), during);
    assertTrue(elapsedMillis < 15_000, "waited " + elapsedMillis + " ms");
    // Released, the asker gets the server's answer.
    assertEquals(Collections.singletonList(Collections.singletonList(PARSED_FILES_V3)), asked);
  }

  @Test
  void interruptedCaller_getsTheBuiltInOrderAndKeepsItsInterruptStatus() {
    server.always = Fault.block();
    FilesExtEndpoints endpoints = resolver(true, FilesExtEndpoints.RESOLVE_TIMEOUT);
    Thread.currentThread().interrupt();

    List<FilesExtEndpoint> resolved = endpoints.resolve();

    assertTrue(Thread.interrupted(), "the interrupt status was cleared");
    assertEquals(DEFAULT_ENDPOINTS, resolved);
  }

  @Test
  void interruptedCallerWithNoList_doesNotCacheTheBuiltInOrder() {
    // An interrupt says nothing about the server, so the next caller asks again.
    server.plan(FILES_V3);
    server.always = Fault.block();
    FilesExtEndpoints endpoints = resolver(true, FilesExtEndpoints.RESOLVE_TIMEOUT);
    Thread.currentThread().interrupt();
    assertEquals(DEFAULT_ENDPOINTS, endpoints.resolve());
    assertTrue(Thread.interrupted(), "the interrupt status was cleared");
    server.always = null;

    assertEquals(Collections.singletonList(PARSED_FILES_V3), endpoints.resolve());
  }

  @Test
  void interruptedCallerWithAnExpiredList_getsItAndLeavesTheCacheExpired() {
    server.plan(FILES_V3);
    FilesExtEndpoints endpoints = resolver(true, FilesExtEndpoints.RESOLVE_TIMEOUT);
    endpoints.resolve();
    clock.advanceTime(FilesExtEndpoints.CACHE_TTL);
    server.always = Fault.block();
    Thread.currentThread().interrupt();
    assertEquals(Collections.singletonList(PARSED_FILES_V3), endpoints.resolve());
    assertTrue(Thread.interrupted(), "the interrupt status was cleared");
    server.always = null;
    server.plan(FILES_V2_STORAGE_PROXY);

    // Still expired, so this caller asks and gets the new list.
    assertEquals(Collections.singletonList(PARSED_FILES_V2_STORAGE_PROXY), endpoints.resolve());
  }

  // ======================== helpers ========================

  // The real timeout, so that a test expecting an answer does not time out on a loaded machine.
  // Tests of the timeout pass their own.
  private FilesExtEndpoints resolver() {
    return resolver(true, FilesExtEndpoints.RESOLVE_TIMEOUT);
  }

  private FilesExtEndpoints resolver(boolean enabled) {
    return resolver(enabled, FilesExtEndpoints.RESOLVE_TIMEOUT);
  }

  private FilesExtEndpoints resolver(boolean enabled, Duration timeout) {
    return new FilesExtEndpoints(config(HOST), enabled, clock, timeout);
  }

  private DatabricksConfig config(String host) {
    return new DatabricksConfig()
        .setHost(host)
        .setCredentialsProvider(new DummyCredentialsProvider())
        .setHttpClient(server);
  }

  private static Map<String, Object> entry(
      String api, String apiVersion, String scheme, String hostname, boolean multipart) {
    Map<String, Object> e = new LinkedHashMap<>();
    e.put("api", api);
    if (apiVersion != null) {
      e.put("api_version", apiVersion);
    }
    e.put("scheme", scheme);
    e.put("hostname", hostname);
    e.put("multipart_upload_supported", multipart);
    return Collections.unmodifiableMap(e);
  }

  private static Map<String, Object> with(Map<String, Object> base, String key, Object value) {
    Map<String, Object> e = new LinkedHashMap<>(base);
    e.put(key, value);
    return e;
  }

  private static Map<String, Object> without(Map<String, Object> base, String key) {
    Map<String, Object> e = new LinkedHashMap<>(base);
    e.remove(key);
    return e;
  }

  private static Map<String, Object> map(Object... keysAndValues) {
    Map<String, Object> m = new LinkedHashMap<>();
    for (int i = 0; i < keysAndValues.length; i += 2) {
      m.put((String) keysAndValues[i], keysAndValues[i + 1]);
    }
    return m;
  }

  private static String body(List<?> entries) {
    return json(map("endpoints", entries));
  }

  private static String json(Object value) {
    try {
      return MAPPER.writeValueAsString(value);
    } catch (JsonProcessingException e) {
      throw new IllegalStateException(e);
    }
  }

  /** How one request to the fake endpoints API fails. */
  static final class Fault {
    final int status;
    final boolean connectionError;
    final boolean block;
    final boolean ignoreInterrupts;
    final String text;

    private Fault(
        int status, boolean connectionError, boolean block, boolean ignoreInterrupts, String text) {
      this.status = status;
      this.connectionError = connectionError;
      this.block = block;
      this.ignoreInterrupts = ignoreInterrupts;
      this.text = text;
    }

    static Fault status(int status) {
      return new Fault(status, false, false, false, null);
    }

    static Fault connectionError() {
      return new Fault(0, true, false, false, null);
    }

    /** Holds the request until the test releases it, then answers normally. */
    static Fault block() {
      return new Fault(0, false, true, false, null);
    }

    /** Like {@link #block()}, for a user's HttpClient that does not stop when interrupted. */
    static Fault blockIgnoringInterrupts() {
      return new Fault(0, false, true, true, null);
    }

    /** Answers 200 with this body. */
    static Fault text(String text) {
      return new Fault(0, false, false, false, text);
    }

    @Override
    public String toString() {
      if (connectionError) {
        return "connection error";
      }
      if (block) {
        return "no answer";
      }
      if (text != null) {
        return "body " + (text.length() > 30 ? text.substring(0, 30) + "..." : text);
      }
      return "status " + status;
    }
  }

  /** A fake of the workspace's endpoints API. */
  static final class FakeServer implements HttpClient {
    /** The 200 answer. */
    volatile String body = body(Collections.emptyList());

    /** The fault of every call that has none of its own. */
    volatile Fault always;

    final Map<Integer, Fault> faultsByCall = new ConcurrentHashMap<>();
    final AtomicInteger calls = new AtomicInteger();
    final List<Request> requests = new CopyOnWriteArrayList<>();

    /** Counted down when a request starts to wait for {@link #release}. */
    final CountDownLatch blocked = new CountDownLatch(1);

    final CountDownLatch release = new CountDownLatch(1);

    void plan(Map<?, ?>... entries) {
      body = body(Arrays.asList(entries));
    }

    void faultOnCall(int call, Fault fault) {
      faultsByCall.put(call, fault);
    }

    @Override
    public Response execute(Request in) throws IOException {
      int call = calls.incrementAndGet();
      requests.add(in);
      Fault fault = faultsByCall.getOrDefault(call, always);
      if (fault != null && fault.block) {
        blocked.countDown();
        boolean interrupted = false;
        while (true) {
          try {
            release.await();
            break;
          } catch (InterruptedException e) {
            if (!fault.ignoreInterrupts) {
              Thread.currentThread().interrupt();
              throw new InterruptedIOException("interrupted waiting for the test to release");
            }
            interrupted = true;
          }
        }
        if (interrupted) {
          Thread.currentThread().interrupt();
        }
        fault = null;
      }
      if (fault != null && fault.connectionError) {
        throw new IOException("simulated connection error");
      }
      if (fault != null && fault.status != 0) {
        return new Response(
            in,
            fault.status,
            "error",
            Collections.<String, List<String>>emptyMap(),
            "{\"error_code\": \"ERROR\", \"message\": \"no\"}");
      }
      String answer = fault != null && fault.text != null ? fault.text : body;
      return new Response(in, 200, "OK", Collections.<String, List<String>>emptyMap(), answer);
    }
  }
}
