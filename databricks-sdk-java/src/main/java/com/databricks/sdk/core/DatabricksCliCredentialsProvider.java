package com.databricks.sdk.core;

import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.core.oauth.CachedTokenSource;
import com.databricks.sdk.core.oauth.OAuthHeaderFactory;
import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.oauth.TokenSource;
import com.databricks.sdk.core.utils.Environment;
import com.databricks.sdk.core.utils.OSUtils;
import com.databricks.sdk.support.InternalApi;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.IOUtils;

@InternalApi
public class DatabricksCliCredentialsProvider implements CredentialsProvider {

  private static final Logger LOG = LoggerFactory.getLogger(DatabricksCliCredentialsProvider.class);

  public static final String DATABRICKS_CLI = "databricks-cli";

  private static final ObjectMapper MAPPER = new ObjectMapper();

  // ---- Version detection ----

  // --profile support added in CLI v0.207.1: https://github.com/databricks/cli/pull/855
  static final DatabricksCliVersion CLI_VERSION_FOR_PROFILE = new DatabricksCliVersion(0, 207, 1);

  // --force-refresh support added in CLI v0.296.0: https://github.com/databricks/cli/pull/4767
  static final DatabricksCliVersion CLI_VERSION_FOR_FORCE_REFRESH =
      new DatabricksCliVersion(0, 296, 0);

  // 5-second cap on `databricks version` so a hung CLI (slow first-run scan, antivirus, blocked
  // stdin) does not wedge SDK init indefinitely.
  private static final long VERSION_PROBE_TIMEOUT_SECONDS = 5;

  // Successful version probes keyed by cliPath. Subprocess failures (timeouts, non-zero exit,
  // IO errors) and probes that returned UNKNOWN due to unparseable output are deliberately not
  // cached, so a transient error does not pin every later token source to the conservative
  // fallback for the rest of the process lifetime.
  private static final Map<String, DatabricksCliVersion> VERSION_CACHE = new ConcurrentHashMap<>();

  /** Test-only hook to clear the cross-test version cache. Package-private. */
  static void clearVersionCache() {
    VERSION_CACHE.clear();
  }

  // ---- Scope validation ----

  /** Thrown when the cached CLI token's scopes don't match the SDK's configured scopes. */
  static class ScopeMismatchException extends DatabricksException {
    ScopeMismatchException(String message) {
      super(message);
    }
  }

  /**
   * offline_access controls whether the IdP issues a refresh token. It does not grant any API
   * permissions, so its presence or absence should not cause a scope mismatch error.
   */
  private static final Set<String> SCOPES_IGNORED_FOR_COMPARISON =
      Collections.singleton("offline_access");

  // ---- Public API ----

  @Override
  public String authType() {
    return DATABRICKS_CLI;
  }

  @Override
  public OAuthHeaderFactory configure(DatabricksConfig config) {
    String host = config.getHost();
    if (host == null) {
      return null;
    }

    try {
      CliTokenSource tokenSource = getDatabricksCliTokenSource(config);
      if (tokenSource == null) {
        return null;
      }

      // Wrap the token source with scope validation so that every token — both the
      // initial fetch and subsequent refreshes — is checked against the configured scopes.
      TokenSource effectiveSource;
      if (config.isScopesExplicitlySet()) {
        List<String> scopes = config.getScopes();
        effectiveSource =
            new TokenSource() {
              @Override
              public Token getToken() {
                Token t = tokenSource.getToken();
                validateTokenScopes(t, scopes);
                return t;
              }
            };
      } else {
        effectiveSource = tokenSource;
      }

      CachedTokenSource cachedTokenSource =
          new CachedTokenSource.Builder(effectiveSource)
              .setAsyncDisabled(config.getDisableAsyncTokenRefresh())
              .build();
      cachedTokenSource.getToken(); // We need this for checking if databricks CLI is installed.

      return OAuthHeaderFactory.fromTokenSource(cachedTokenSource);
    } catch (ScopeMismatchException e) {
      // Scope validation failed. When the user explicitly selected databricks-cli auth,
      // surface the mismatch immediately so they get an actionable error. When we're being
      // tried as part of the default credential chain, step aside so other providers get
      // a chance.
      if (DATABRICKS_CLI.equals(config.getAuthType())) {
        throw e;
      }
      LOG.warn("Databricks CLI token scope mismatch, skipping: {}", e.getMessage());
      return null;
    } catch (DatabricksException e) {
      String stderr = e.getMessage();
      if (stderr.contains("not found")) {
        LOG.warn("Most likely databricks CLI is not installed");
        return null;
      }
      if (stderr.contains("databricks OAuth is not")) {
        LOG.info("OAuth not configured or not available");
        return null;
      }
      throw e;
    }
  }

  // ---- Token source construction ----

  private CliTokenSource getDatabricksCliTokenSource(DatabricksConfig config) {
    String cliPath = config.getDatabricksCliPath();
    if (cliPath == null) {
      cliPath = OSUtils.get(config.getEnv()).getDatabricksCliPath();
    }
    if (cliPath == null) {
      LOG.debug("Databricks CLI could not be found");
      return null;
    }

    List<String> cmd = resolveCliCommand(cliPath, config);
    return new CliTokenSource(cmd, "token_type", "access_token", "expiry", config.getEnv());
  }

  /**
   * Detects the installed CLI version and builds the {@code auth token} command. Falls back to the
   * most conservative command when version detection fails.
   */
  List<String> resolveCliCommand(String cliPath, DatabricksConfig config) {
    DatabricksCliVersion version = getCliVersion(cliPath, config.getEnv());
    return buildCliCommand(cliPath, config, version);
  }

  /**
   * Builds the full {@code auth token} command, including capability-gated flags.
   *
   * <p>Delegates the profile/host decision to {@link #buildCoreCliCommand} and appends {@code
   * --force-refresh} when the installed CLI supports it.
   */
  List<String> buildCliCommand(
      String cliPath, DatabricksConfig config, DatabricksCliVersion version) {
    List<String> cmd = buildCoreCliCommand(cliPath, config, version);
    if (version.atLeast(CLI_VERSION_FOR_FORCE_REFRESH)) {
      cmd.add("--force-refresh");
    } else if (version.isDefaultDevBuild()) {
      // Dev build — getCliVersion already emitted the dev-build INFO at the probe site.
    } else if (version.equals(DatabricksCliVersion.UNKNOWN)) {
      // We didn't actually prove the CLI lacks --force-refresh; we just failed to confirm it.
      LOG.warn(
          "Could not confirm --force-refresh support for Databricks CLI {} (requires >= {}). "
              + "The CLI's token cache may provide stale tokens.",
          version,
          CLI_VERSION_FOR_FORCE_REFRESH);
    } else {
      LOG.warn(
          "Databricks CLI {} does not support --force-refresh (requires >= {}). "
              + "The CLI's token cache may provide stale tokens.",
          version,
          CLI_VERSION_FOR_FORCE_REFRESH);
    }
    return cmd;
  }

  /**
   * Builds the base {@code auth token} command without capability-gated flags. Falls back to {@code
   * --host} when {@code --profile} is either not configured or not supported by the installed CLI.
   */
  List<String> buildCoreCliCommand(
      String cliPath, DatabricksConfig config, DatabricksCliVersion version) {
    if (config.getProfile() == null) {
      return buildHostArgs(cliPath, config);
    }

    // Flag --profile is a global CLI flag and is recognized for all commands even the ones that
    // do not support it. Only use --profile in CLI versions known to support it in `auth token`.
    if (!version.atLeast(CLI_VERSION_FOR_PROFILE)) {
      if (version.isDefaultDevBuild()) {
        // Dev build — getCliVersion already emitted the dev-build INFO at the probe site.
      } else if (version.equals(DatabricksCliVersion.UNKNOWN)) {
        LOG.warn(
            "Could not confirm --profile support for Databricks CLI {} (requires >= {}). "
                + "Falling back to --host.",
            version,
            CLI_VERSION_FOR_PROFILE);
      } else {
        LOG.warn(
            "Databricks CLI {} does not support --profile (requires >= {}). "
                + "Falling back to --host.",
            version,
            CLI_VERSION_FOR_PROFILE);
      }
      return buildHostArgs(cliPath, config);
    }

    return new ArrayList<>(
        Arrays.asList(cliPath, "auth", "token", "--profile", config.getProfile()));
  }

  /**
   * Builds the CLI command arguments using --host (legacy path).
   *
   * @param cliPath Path to the databricks CLI executable
   * @param config Configuration containing host, account ID, workspace ID, etc.
   * @return List of command arguments
   */
  List<String> buildHostArgs(String cliPath, DatabricksConfig config) {
    if (config.getHost() == null) {
      // Without this guard a null host would silently produce ["--host", null] and surface as
      // an obscure NPE deep inside ProcessBuilder.start(). The production path is gated by
      // configure()'s early return, but a future caller (or a direct unit test) could bypass it.
      throw new DatabricksException(
          "Cannot build Databricks CLI auth command: config.host is required");
    }
    List<String> cmd =
        new ArrayList<>(Arrays.asList(cliPath, "auth", "token", "--host", config.getHost()));
    if (config.getClientType() == ClientType.ACCOUNT) {
      cmd.add("--account-id");
      cmd.add(config.getAccountId());
    }
    return cmd;
  }

  // ---- Version detection ----

  /**
   * Returns the CLI version, catching subprocess failures so the caller can proceed with the
   * conservative fallback. Successful results are cached for the process lifetime; failures (both
   * subprocess errors and parse-UNKNOWN results) are not cached and will be retried on the next
   * call. Concurrent cold-cache calls for the same CLI path are single-flight: only one probe runs,
   * the rest wait for its result.
   */
  DatabricksCliVersion getCliVersion(String cliPath, Environment env) {
    // Normalize the cache key so different textual paths to the same binary (relative vs.
    // absolute, redundant separators, ./ or ../ segments) share a single cache entry.
    String key = Paths.get(cliPath).toAbsolutePath().normalize().toString();
    // computeIfAbsent gives us single-flight semantics per key: ConcurrentHashMap holds a
    // per-bucket lock during the lambda, so a second concurrent caller for the same key blocks
    // until the first probe completes and then sees the cached value.
    DatabricksCliVersion version =
        VERSION_CACHE.computeIfAbsent(
            key,
            k -> {
              try {
                return probeCliVersion(cliPath, env);
              } catch (IOException e) {
                LOG.warn(
                    "Failed to detect Databricks CLI version: {}. "
                        + "Falling back to conservative flag set.",
                    e.getMessage());
                LOG.debug("CLI version probe failure stack:", e);
                return DatabricksCliVersion.UNKNOWN;
              }
            });
    if (version.isDefaultDevBuild()) {
      // A default-marker dev build has no injected version, so every feature gate falls back to
      // the conservative path. Emit once at the probe site so callers see the explanation even
      // on the host-only code path that never consults a per-flag gate.
      LOG.info(
          "Databricks CLI {} is a development build; feature detection will use conservative "
              + "fallbacks. Rebuild the CLI with an explicit version to enable capability-based "
              + "flag selection.",
          version);
    }
    // Don't cache UNKNOWN: a transient probe failure or a parseable-but-malformed payload
    // would otherwise pin every later token source to the conservative fallback for the rest
    // of the process lifetime. Strip it after computeIfAbsent so the next call re-probes.
    if (version.equals(DatabricksCliVersion.UNKNOWN)) {
      VERSION_CACHE.remove(key, DatabricksCliVersion.UNKNOWN);
    }
    return version;
  }

  /**
   * Runs {@code databricks version --output json} and returns the parsed {@link
   * DatabricksCliVersion}.
   *
   * <p>Reads stdout after {@code waitFor} returns. This is safe only because the {@code version}
   * subcommand emits a fixed-shape JSON blob (~200 bytes) that fits well within any platform's pipe
   * buffer (>= 4 KB on Windows, ~64 KB on Linux/macOS). Do not reuse this method for
   * unbounded-output subcommands — the pattern would deadlock if the child ever filled the pipe.
   */
  DatabricksCliVersion probeCliVersion(String cliPath, Environment env) throws IOException {
    List<String> versionArgs = Arrays.asList(cliPath, "version", "--output", "json");
    List<String> cmd = OSUtils.get(env).getCliExecutableCommand(versionArgs);

    ProcessBuilder pb = new ProcessBuilder(cmd);
    pb.environment().putAll(env.getEnv());
    // Merge stderr into stdout so we drain a single stream and surface any stderr diagnostics
    // in the same message on non-zero exit.
    pb.redirectErrorStream(true);
    Process process = pb.start();

    boolean exited;
    try {
      exited = process.waitFor(VERSION_PROBE_TIMEOUT_SECONDS, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      destroyAndAwait(process);
      throw new IOException("interrupted waiting for `databricks version`", e);
    }

    if (!exited) {
      destroyAndAwait(process);
      throw new IOException(
          "timed out after "
              + VERSION_PROBE_TIMEOUT_SECONDS
              + "s waiting for `databricks version`");
    }

    // Process exited cleanly. Read stdout BEFORE any destroyForcibly call: on Linux/OpenJDK 11+
    // calling destroyForcibly on an already-exited process closes the parent-side end of the
    // stdout pipe, which would make readStream throw "Stream closed".
    String output = readStream(process.getInputStream());
    if (process.exitValue() != 0) {
      throw new IOException(
          "`databricks version` exited with code " + process.exitValue() + ": " + output.trim());
    }
    return parseCliVersion(output);
  }

  /**
   * Best-effort cleanup for the timeout / interrupted paths. {@code destroyForcibly()} is
   * asynchronous on some platforms; await briefly so the OS releases the process handle and FDs
   * before we return.
   */
  private static void destroyAndAwait(Process process) {
    try {
      process.destroyForcibly().waitFor(1, TimeUnit.SECONDS);
    } catch (InterruptedException ignored) {
      Thread.currentThread().interrupt();
    }
  }

  /**
   * Parses the JSON output of {@code databricks version --output json}.
   *
   * <p>Takes Major/Minor/Patch from the JSON's pre-parsed numeric fields. The Prerelease field and
   * the Version string are intentionally ignored: for our feature-gate purposes the base triple is
   * sufficient, and the (0, 0, 0) case already identifies the default dev build (a CLI built
   * without version metadata leaves these fields at their zero defaults).
   *
   * <p>Returns {@link DatabricksCliVersion#UNKNOWN} on failure so that an unparseable version
   * disables every feature gate.
   */
  DatabricksCliVersion parseCliVersion(String output) {
    try {
      JsonNode node = MAPPER.readTree(output);
      JsonNode major = node.get("Major");
      JsonNode minor = node.get("Minor");
      JsonNode patch = node.get("Patch");
      if (major == null || minor == null || patch == null) {
        LOG.debug(
            "Failed to parse Databricks CLI version: missing Major/Minor/Patch in {}", output);
        return DatabricksCliVersion.UNKNOWN;
      }
      // JsonNode.asInt() silently coerces strings, JSON null, arrays, and objects to 0, which
      // would collide with the dev-build sentinel (0,0,0). Only accept genuine integers so a
      // garbage payload returns UNKNOWN instead of "valid dev build".
      if (!major.isIntegralNumber() || !minor.isIntegralNumber() || !patch.isIntegralNumber()) {
        LOG.debug(
            "Failed to parse Databricks CLI version: non-integer Major/Minor/Patch in {}", output);
        return DatabricksCliVersion.UNKNOWN;
      }
      return new DatabricksCliVersion(major.asInt(), minor.asInt(), patch.asInt());
    } catch (JsonProcessingException e) {
      LOG.debug(
          "Failed to parse Databricks CLI version from output: {} ({})", output, e.getMessage());
      return DatabricksCliVersion.UNKNOWN;
    }
  }

  private static String readStream(InputStream stream) throws IOException {
    try {
      return new String(IOUtils.toByteArray(stream), StandardCharsets.UTF_8);
    } finally {
      stream.close();
    }
  }

  // ---- Scope validation ----

  /**
   * Validate that the token's scopes match the requested scopes from the config.
   *
   * <p>The {@code databricks auth token} command does not accept scopes yet. It returns whatever
   * token was cached from the last {@code databricks auth login}. If a user configures specific
   * scopes in the SDK config but their cached CLI token was issued with different scopes, requests
   * will silently use the wrong scopes. This check surfaces that mismatch early with an actionable
   * error telling the user how to re-authenticate with the correct scopes.
   */
  static void validateTokenScopes(Token token, List<String> requestedScopes) {
    Map<String, Object> claims = getJwtClaims(token.getAccessToken());
    if (claims == null) {
      LOG.debug("Could not decode token as JWT to validate scopes");
      return;
    }

    Object tokenScopesRaw = claims.get("scope");
    if (tokenScopesRaw == null) {
      LOG.debug("Token does not contain 'scope' claim, skipping scope validation");
      return;
    }

    Set<String> tokenScopes = parseScopeClaim(tokenScopesRaw);
    if (tokenScopes == null) {
      LOG.debug("Unexpected 'scope' claim type: {}", tokenScopesRaw.getClass());
      return;
    }

    tokenScopes.removeAll(SCOPES_IGNORED_FOR_COMPARISON);
    Set<String> requested = new HashSet<>(requestedScopes);
    requested.removeAll(SCOPES_IGNORED_FOR_COMPARISON);

    if (!tokenScopes.equals(requested)) {
      List<String> sortedTokenScopes = new ArrayList<>(tokenScopes);
      Collections.sort(sortedTokenScopes);
      List<String> sortedRequested = new ArrayList<>(requested);
      Collections.sort(sortedRequested);

      throw new ScopeMismatchException(
          String.format(
              "Token issued by Databricks CLI has scopes %s which do not match "
                  + "the configured scopes %s. Please re-authenticate "
                  + "with the desired scopes by running `databricks auth login` with the --scopes flag. "
                  + "Scopes default to all-apis.",
              sortedTokenScopes, sortedRequested));
    }
  }

  /**
   * Decode a JWT access token and return its payload claims. Returns null if the token is not a
   * valid JWT. No signature verification is performed — the token was already authenticated by the
   * CLI, and we only need to read the scope claim for comparison.
   */
  private static Map<String, Object> getJwtClaims(String accessToken) {
    String[] parts = accessToken.split("\\.");
    if (parts.length != 3) {
      LOG.debug("Tried to decode access token as JWT, but failed: {} components", parts.length);
      return null;
    }
    try {
      byte[] payloadBytes = Base64.getUrlDecoder().decode(parts[1]);
      String payloadJson = new String(payloadBytes, StandardCharsets.UTF_8);
      @SuppressWarnings("unchecked")
      Map<String, Object> claims = MAPPER.readValue(payloadJson, Map.class);
      return claims;
    } catch (IllegalArgumentException | JsonProcessingException e) {
      LOG.debug("Failed to decode JWT claims: {}", e.getMessage());
      return null;
    }
  }

  /**
   * Parse the JWT "scope" claim. Per RFC 9068, this is a space-delimited string. Returns null if
   * the type is unexpected.
   */
  private static Set<String> parseScopeClaim(Object scopeClaim) {
    if (scopeClaim instanceof String) {
      return new HashSet<>(Arrays.asList(((String) scopeClaim).split("\\s+")));
    }
    return null;
  }
}
