package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.core.utils.Environment;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Parametrized auth tests that exercise each auth type against multiple host profiles (LW, NW, LA,
 * NA, SPOGW, SPOGA) across AWS, Azure and GCP.
 *
 * <p>{@link DatabricksConfig} has no seam for injecting a fake host metadata resolver, so each test
 * mocks the {@code GET /.well-known/databricks-config} HTTP endpoint instead. Calling {@link
 * DatabricksConfig#resolve} then runs the full production path: HTTP call, JSON parsing, and field
 * population of {@code discoveryUrl}, {@code accountId}, and {@code workspaceId}.
 *
 * <p>Host profiles:
 *
 * <ul>
 *   <li>LW = Legacy Workspace: host=workspace_url
 *   <li>NW = New Workspace: host=workspace_url + account_id + workspace_id
 *   <li>LA = Legacy Account: host=accounts_url + account_id
 *   <li>NA = New Account: host=accounts_url + account_id (structurally same as LA)
 *   <li>SPOGW = SPOG workspace: host=unified_url + account_id + workspace_id
 *   <li>SPOGA = SPOG account: host=unified_url + account_id
 * </ul>
 */
public class AuthProfilesTest {
  private static final String TEST_ACCOUNT_ID = "00000000-0000-0000-0000-000000000001";
  private static final String TEST_WORKSPACE_ID = "1234567890";

  private static final String AWS_WORKSPACE_HOST = "https://test-workspace.cloud.databricks.com";
  private static final String AWS_ACCOUNTS_HOST = "https://accounts.cloud.databricks.com";
  private static final String AWS_UNIFIED_HOST = "https://test-unified.cloud.databricks.com";

  private static final String AZ_WORKSPACE_HOST = "https://adb-1234567890.12.azuredatabricks.net";
  private static final String AZ_ACCOUNTS_HOST = "https://accounts.azuredatabricks.net";
  private static final String AZ_UNIFIED_HOST = "https://db-test.azuredatabricks.net";

  private static final String GCP_WORKSPACE_HOST = "https://1234567890.1.gcp.databricks.com";
  private static final String GCP_ACCOUNTS_HOST = "https://accounts.gcp.databricks.com";
  private static final String GCP_UNIFIED_HOST = "https://db-test.gcp.databricks.com";

  /** Shape of the host profile, used to derive OIDC discovery URL and token endpoint. */
  private enum ProfileKind {
    WORKSPACE,
    ACCOUNT,
    UNIFIED
  }

  /**
   * Describes a single host profile. {@code configAccountId} / {@code configWorkspaceId} are what
   * the user would set on {@link DatabricksConfig} up front; the metadata endpoint advertises the
   * full set regardless so that {@code resolveHostMetadata} populates the missing ones.
   */
  private static class HostProfile {
    final String name;
    final String host;
    final String configAccountId;
    final String configWorkspaceId;
    final ProfileKind kind;
    final String cloud;

    HostProfile(
        String name,
        String host,
        String configAccountId,
        String configWorkspaceId,
        ProfileKind kind,
        String cloud) {
      this.name = name;
      this.host = host;
      this.configAccountId = configAccountId;
      this.configWorkspaceId = configWorkspaceId;
      this.kind = kind;
      this.cloud = cloud;
    }

    /**
     * Value of {@code oidc_endpoint} in the host metadata response. Workspace hosts expose a plain
     * {@code /oidc} root; account and unified hosts expose an account-scoped root with the {@code
     * {account_id}} placeholder that {@code resolveHostMetadata} substitutes.
     */
    String metadataOidcEndpoint() {
      if (kind == ProfileKind.WORKSPACE) {
        return host + "/oidc";
      }
      return host + "/oidc/accounts/{account_id}";
    }

    /** Metadata JSON body served by the {@code /.well-known/databricks-config} endpoint. */
    String metadataJson() {
      StringBuilder sb = new StringBuilder();
      sb.append("{");
      sb.append("\"oidc_endpoint\":\"").append(metadataOidcEndpoint()).append("\"");
      sb.append(",\"account_id\":\"").append(TEST_ACCOUNT_ID).append("\"");
      // Workspace profiles always advertise a workspace_id; unified profiles only when the
      // caller configured one (matches SPOGA vs SPOGW).
      if (kind == ProfileKind.WORKSPACE
          || (kind == ProfileKind.UNIFIED && configWorkspaceId != null)) {
        sb.append(",\"workspace_id\":\"").append(TEST_WORKSPACE_ID).append("\"");
      }
      sb.append(",\"cloud\":\"").append(cloud).append("\"");
      sb.append("}");
      return sb.toString();
    }

    /** Effective discovery URL after {@code resolveHostMetadata} substitutes the placeholder. */
    String discoveryPath() {
      if (kind == ProfileKind.WORKSPACE) {
        return "/oidc/.well-known/oauth-authorization-server";
      }
      return "/oidc/accounts/" + TEST_ACCOUNT_ID + "/.well-known/oauth-authorization-server";
    }

    String tokenEndpoint() {
      if (kind == ProfileKind.WORKSPACE) {
        return host + "/oidc/v1/token";
      }
      return host + "/oidc/accounts/" + TEST_ACCOUNT_ID + "/v1/token";
    }

    String tokenPath() {
      if (kind == ProfileKind.WORKSPACE) {
        return "/oidc/v1/token";
      }
      return "/oidc/accounts/" + TEST_ACCOUNT_ID + "/v1/token";
    }

    String authorizationEndpoint() {
      if (kind == ProfileKind.WORKSPACE) {
        return host + "/oidc/v1/authorize";
      }
      return host + "/oidc/accounts/" + TEST_ACCOUNT_ID + "/v1/authorize";
    }

    @Override
    public String toString() {
      return name;
    }
  }

  private static List<HostProfile> profilesFor(
      String prefix, String workspaceHost, String accountsHost, String unifiedHost, String cloud) {
    List<HostProfile> out = new ArrayList<>();
    out.add(
        new HostProfile(prefix + "LW", workspaceHost, null, null, ProfileKind.WORKSPACE, cloud));
    out.add(
        new HostProfile(
            prefix + "NW",
            workspaceHost,
            TEST_ACCOUNT_ID,
            TEST_WORKSPACE_ID,
            ProfileKind.WORKSPACE,
            cloud));
    out.add(
        new HostProfile(
            prefix + "LA", accountsHost, TEST_ACCOUNT_ID, null, ProfileKind.ACCOUNT, cloud));
    out.add(
        new HostProfile(
            prefix + "NA", accountsHost, TEST_ACCOUNT_ID, null, ProfileKind.ACCOUNT, cloud));
    out.add(
        new HostProfile(
            prefix + "SPOGW",
            unifiedHost,
            TEST_ACCOUNT_ID,
            TEST_WORKSPACE_ID,
            ProfileKind.UNIFIED,
            cloud));
    out.add(
        new HostProfile(
            prefix + "SPOGA", unifiedHost, TEST_ACCOUNT_ID, null, ProfileKind.UNIFIED, cloud));
    return out;
  }

  private static List<HostProfile> awsProfiles() {
    return profilesFor("", AWS_WORKSPACE_HOST, AWS_ACCOUNTS_HOST, AWS_UNIFIED_HOST, "aws");
  }

  private static List<HostProfile> azureProfiles() {
    return profilesFor("AZ_", AZ_WORKSPACE_HOST, AZ_ACCOUNTS_HOST, AZ_UNIFIED_HOST, "azure");
  }

  private static List<HostProfile> gcpProfiles() {
    return profilesFor("GCP_", GCP_WORKSPACE_HOST, GCP_ACCOUNTS_HOST, GCP_UNIFIED_HOST, "gcp");
  }

  // ---- @MethodSource feeders -------------------------------------------------

  static Stream<Arguments> allProfiles() {
    List<HostProfile> all = new ArrayList<>();
    all.addAll(awsProfiles());
    all.addAll(azureProfiles());
    all.addAll(gcpProfiles());
    return all.stream().map(Arguments::of);
  }

  static Stream<Arguments> azureOnlyProfiles() {
    return azureProfiles().stream().map(Arguments::of);
  }

  // ---- Helpers ---------------------------------------------------------------

  /**
   * Returns a {@link DatabricksConfig} populated with the profile's host, account_id, and
   * workspace_id (as the user would set them). Notably {@code discoveryUrl} is left unset — every
   * caller goes through {@link DatabricksConfig#resolve} below, which invokes {@link
   * DatabricksConfig#resolveHostMetadata()} against the mocked {@code
   * /.well-known/databricks-config} fixture; that is what populates {@code discoveryUrl} (mirroring
   * Go's {@code HostMetadataResolver}).
   */
  private static DatabricksConfig profileConfig(HostProfile p) {
    return new DatabricksConfig()
        .setHost(p.host)
        .setAccountId(p.configAccountId)
        .setWorkspaceId(p.configWorkspaceId);
  }

  /**
   * Builds an {@link HttpClient} pre-populated with the profile's host-metadata fixture. Callers
   * add auth-specific fixtures (discovery URL, token endpoints, Azure AD, etc.) before attaching it
   * to the config.
   */
  private static MappingHttpClient httpClientFor(HostProfile p) {
    return new MappingHttpClient().put("GET /.well-known/databricks-config", p.metadataJson());
  }

  /** Adds OIDC discovery + token-exchange fixtures for the profile. */
  private static MappingHttpClient withOidc(MappingHttpClient client, HostProfile p) {
    String discoveryResponse =
        "{\"token_endpoint\":\""
            + p.tokenEndpoint()
            + "\",\"authorization_endpoint\":\""
            + p.authorizationEndpoint()
            + "\"}";
    String tokenResponse =
        "{\"token_type\":\"Bearer\",\"access_token\":\"test-token\",\"expires_in\":3600}";
    return client
        .put("GET " + p.discoveryPath(), discoveryResponse)
        .put("POST " + p.tokenPath(), tokenResponse);
  }

  /**
   * Resolves {@code config} against a controlled {@link Environment} and returns the resulting
   * Authorization header. Drives the full {@code resolve → resolveHostMetadata → authenticate}
   * pipeline that Go exercises via {@code HostMetadataResolver} injection.
   */
  private static String resolveAndAuthenticate(DatabricksConfig config, Environment env) {
    config.resolve(env);
    return config.authenticate().get("Authorization");
  }

  private static Environment emptyEnvironment() {
    return new Environment(new HashMap<>(), new String[0], System.getProperty("os.name"));
  }

  private static Environment environmentWith(String key, String value) {
    Map<String, String> m = new HashMap<>();
    m.put(key, value);
    return new Environment(m, new String[0], System.getProperty("os.name"));
  }

  // ---- PAT -------------------------------------------------------------------

  @ParameterizedTest(name = "{0}")
  @MethodSource("allProfiles")
  void pat(HostProfile p) {
    DatabricksConfig config = profileConfig(p).setToken("dapi1234567890abcdef").setAuthType("pat");
    config.setHttpClient(httpClientFor(p));

    assertEquals("Bearer dapi1234567890abcdef", resolveAndAuthenticate(config, emptyEnvironment()));
    assertEquals("pat", config.getAuthType());
  }

  // ---- Basic -----------------------------------------------------------------

  @ParameterizedTest(name = "{0}")
  @MethodSource("allProfiles")
  void basic(HostProfile p) {
    DatabricksConfig config =
        profileConfig(p).setUsername("user").setPassword("pass").setAuthType("basic");
    config.setHttpClient(httpClientFor(p));

    assertEquals("Basic dXNlcjpwYXNz", resolveAndAuthenticate(config, emptyEnvironment()));
    assertEquals("basic", config.getAuthType());
  }

  // ---- OAuth M2M -------------------------------------------------------------

  @ParameterizedTest(name = "{0}")
  @MethodSource("allProfiles")
  void oauthM2M(HostProfile p) {
    DatabricksConfig config =
        profileConfig(p)
            .setClientId("test-client")
            .setClientSecret("test-secret")
            .setAuthType("oauth-m2m");
    config.setHttpClient(withOidc(httpClientFor(p), p));

    assertEquals("Bearer test-token", resolveAndAuthenticate(config, emptyEnvironment()));
    assertEquals("oauth-m2m", config.getAuthType());
  }

  // ---- GitHub OIDC -----------------------------------------------------------

  @ParameterizedTest(name = "{0}")
  @MethodSource("allProfiles")
  void githubOIDC(HostProfile p) {
    DatabricksConfig config =
        profileConfig(p)
            .setClientId("test-client")
            .setAuthType("github-oidc")
            .setActionsIdTokenRequestUrl("http://github-actions.test/token?version=1")
            .setActionsIdTokenRequestToken("github-request-token")
            .setTokenAudience("databricks-test-audience");
    MappingHttpClient client = withOidc(httpClientFor(p), p);
    client.put("GET /token", "{\"value\":\"github-id-token\"}");
    config.setHttpClient(client);

    assertEquals("Bearer test-token", resolveAndAuthenticate(config, emptyEnvironment()));
    assertEquals("github-oidc", config.getAuthType());
  }

  // ---- Env OIDC --------------------------------------------------------------

  @ParameterizedTest(name = "{0}")
  @MethodSource("allProfiles")
  void envOIDC(HostProfile p) {
    DatabricksConfig config = profileConfig(p).setClientId("test-client").setAuthType("env-oidc");
    config.setHttpClient(withOidc(httpClientFor(p), p));

    assertEquals(
        "Bearer test-token",
        resolveAndAuthenticate(
            config, environmentWith("DATABRICKS_OIDC_TOKEN", "test-oidc-token")));
    assertEquals("env-oidc", config.getAuthType());
  }

  // ---- File OIDC -------------------------------------------------------------

  @ParameterizedTest(name = "{0}")
  @MethodSource("allProfiles")
  void fileOIDC(HostProfile p, @TempDir Path tempDir) throws IOException {
    Path tokenFile = tempDir.resolve("oidc_token");
    Files.write(tokenFile, "test-oidc-token".getBytes(StandardCharsets.UTF_8));

    DatabricksConfig config =
        profileConfig(p)
            .setClientId("test-client")
            .setAuthType("file-oidc")
            .setOidcTokenFilepath(tokenFile.toString());
    config.setHttpClient(withOidc(httpClientFor(p), p));

    assertEquals("Bearer test-token", resolveAndAuthenticate(config, emptyEnvironment()));
    assertEquals("file-oidc", config.getAuthType());
  }

  // ---- Azure Client Secret ---------------------------------------------------

  @ParameterizedTest(name = "{0}")
  @MethodSource("azureOnlyProfiles")
  void azureClientSecret(HostProfile p) {
    DatabricksConfig config =
        profileConfig(p)
            .setAzureClientId("test-azure-client")
            .setAzureClientSecret("test-azure-secret")
            .setAzureTenantId("test-tenant-id")
            .setAuthType("azure-client-secret");

    String aadResponse =
        "{\"token_type\":\"Bearer\",\"access_token\":\"workspace-token\",\"expires_in\":3600}";
    MappingHttpClient client =
        httpClientFor(p).put("POST /test-tenant-id/oauth2/token", aadResponse);
    config.setHttpClient(client);

    assertEquals("Bearer workspace-token", resolveAndAuthenticate(config, emptyEnvironment()));
    assertEquals("azure-client-secret", config.getAuthType());
  }

  // ---- Azure GitHub OIDC -----------------------------------------------------

  @ParameterizedTest(name = "{0}")
  @MethodSource("azureOnlyProfiles")
  void azureGithubOIDC(HostProfile p) {
    DatabricksConfig config =
        profileConfig(p)
            .setAzureClientId("test-azure-client")
            .setAzureTenantId("test-tenant-id")
            .setActionsIdTokenRequestUrl("http://github-actions.test/token?version=1")
            .setActionsIdTokenRequestToken("github-request-token")
            .setAuthType("github-oidc-azure");

    MappingHttpClient client =
        httpClientFor(p)
            .put("GET /token", "{\"value\":\"github-id-token\"}")
            .put(
                "POST /test-tenant-id/oauth2/token",
                "{\"token_type\":\"Bearer\",\"access_token\":\"azure-token\",\"refresh_token\":\"refresh\",\"expires_in\":3600}");
    config.setHttpClient(client);

    assertEquals("Bearer azure-token", resolveAndAuthenticate(config, emptyEnvironment()));
    assertEquals("github-oidc-azure", config.getAuthType());
  }

  // ---- HostMetadata derivation spot-check ------------------------------------

  /**
   * Sanity-checks that every profile's mocked {@code /.well-known/databricks-config} response
   * actually drives {@link DatabricksConfig#resolveHostMetadata()} to populate the fields the OAuth
   * flows depend on: {@code discoveryUrl}, and for bare-host (LW) profiles {@code accountId} /
   * {@code workspaceId}. Prevents a regression where metadata resolution silently no-ops and the
   * rest of the suite still passes by luck.
   */
  @ParameterizedTest(name = "{0}")
  @MethodSource("allProfiles")
  void hostMetadataResolutionPopulatesDiscoveryUrl(HostProfile p) {
    DatabricksConfig config = profileConfig(p).setToken("dapi1234567890abcdef").setAuthType("pat");
    config.setHttpClient(httpClientFor(p));
    config.resolve(emptyEnvironment());

    assertEquals(p.host + p.discoveryPath(), config.getDiscoveryUrl());
    assertEquals(TEST_ACCOUNT_ID, config.getAccountId());
    if (p.kind != ProfileKind.ACCOUNT && p.kind != ProfileKind.UNIFIED) {
      assertEquals(TEST_WORKSPACE_ID, config.getWorkspaceId());
    }
  }

  // ---- Minimal HttpClient fixture -------------------------------------------

  /**
   * Matches requests on {@code "METHOD path"} and returns a stubbed JSON body with HTTP 200. Every
   * test must register a mapping for {@code GET /.well-known/databricks-config} (see {@link
   * #httpClientFor(HostProfile)}); unmapped requests fail loudly with {@link IOException} so a
   * missing fixture cannot silently fall through.
   */
  private static class MappingHttpClient implements HttpClient {
    private final Map<String, String> mappings = new HashMap<>();

    MappingHttpClient put(String key, String jsonBody) {
      mappings.put(key, jsonBody);
      return this;
    }

    @Override
    public Response execute(Request in) throws IOException {
      String rawUrl = in.getUrl();
      URL url = new URL(rawUrl);
      String key = in.getMethod() + " " + url.getPath();
      String body = mappings.get(key);
      if (body == null) {
        throw new IOException("No mock for " + key + " (url=" + rawUrl + ")");
      }
      return new Response(body, 200, "OK", url);
    }
  }
}
