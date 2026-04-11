package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.commons.CommonsHttpClient;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.oauth.ErrorTokenSource;
import com.databricks.sdk.core.oauth.HostMetadata;
import com.databricks.sdk.core.oauth.OAuthHeaderFactory;
import com.databricks.sdk.core.oauth.OpenIDConnectEndpoints;
import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.oauth.TokenSource;
import com.databricks.sdk.core.utils.Environment;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DatabricksConfigTest {
  @Test
  public void testIsAccountHost() {
    assertTrue(
        new DatabricksConfig().setHost("https://accounts.azuredatabricks.net").isAccountClient());
  }

  @Test
  public void testIsAccountHostDod() {
    assertTrue(
        new DatabricksConfig()
            .setHost("https://accounts-dod.cloud.databricks.us")
            .isAccountClient());
  }

  @Test
  public void testIsAccountHostWorkspace() {
    assertFalse(
        new DatabricksConfig().setHost("https://westeurope.azuredatabricks.net").isAccountClient());
  }

  @Test
  public void testIsAzureForAwsHost() {
    assertFalse(
        new DatabricksConfig().setHost("https://my-workspace.cloud.databricks.com/").isAzure());
  }

  @Test
  public void testIsAzurePublic() {
    assertTrue(
        new DatabricksConfig().setHost("https://adb-1234567890.0.azuredatabricks.net/").isAzure());
  }

  @Test
  public void testIsAzureMooncake() {
    assertTrue(
        new DatabricksConfig().setHost("https://adb-1234567890.0.databricks.azure.cn/").isAzure());
  }

  @Test
  public void testIsAzureUsGov() {
    assertTrue(
        new DatabricksConfig().setHost("https://adb-1234567890.0.databricks.azure.us/").isAzure());
  }

  @Test
  public void testToStringEmpty() {
    DatabricksConfig config = new DatabricksConfig();
    assertEquals("Config: <empty>. Env: <none>", config.toString());
  }

  @Test
  public void testToStringWithSetter() {
    DatabricksConfig config = new DatabricksConfig();
    config.setHost("http://my.host");
    assertEquals("Config: host=http://my.host. Env: <none>", config.toString());
  }

  @Test
  public void testToStringWithEnv() {
    Map<String, String> map = new HashMap<>();
    map.put("DATABRICKS_HOST", "http://my.host");
    List<String> path = new ArrayList<>();
    String systemName = System.getProperty("os.name");

    DatabricksConfig config = new DatabricksConfig();
    config.resolve(new Environment(map, path, systemName));
    assertEquals("Config: host=http://my.host. Env: DATABRICKS_HOST", config.toString());
  }

  @Test
  public void testWorkspaceLevelOidcEndpointsWithAccountId() throws IOException {
    try (FixtureServer server =
        new FixtureServer()
            .with(
                "GET",
                "/oidc/.well-known/oauth-authorization-server",
                "{\"authorization_endpoint\":\"https://test-workspace.cloud.databricks.com/oidc/v1/authorize\"}",
                200)) {
      DatabricksConfig c =
          new DatabricksConfig().setHost(server.getUrl()).setAccountId("1234567890");
      c.resolve(
          new Environment(new HashMap<>(), new ArrayList<String>(), System.getProperty("os.name")));
      assertEquals(
          c.getDatabricksOidcEndpoints().getAuthorizationEndpoint(),
          "https://test-workspace.cloud.databricks.com/oidc/v1/authorize");
    }
  }

  @Test
  public void testWorkspaceLevelOidcEndpointsRetries() throws IOException {
    try (FixtureServer server =
        new FixtureServer()
            .with("GET", "/oidc/.well-known/oauth-authorization-server", "", 429)
            .with(
                "GET",
                "/oidc/.well-known/oauth-authorization-server",
                "{\"authorization_endpoint\":\"https://test-workspace.cloud.databricks.com/oidc/v1/authorize\"}",
                200)) {
      DatabricksConfig c =
          new DatabricksConfig().setHost(server.getUrl()).setAccountId("1234567890");
      c.resolve(
          new Environment(new HashMap<>(), new ArrayList<String>(), System.getProperty("os.name")));
      assertEquals(
          c.getDatabricksOidcEndpoints().getAuthorizationEndpoint(),
          "https://test-workspace.cloud.databricks.com/oidc/v1/authorize");
    }
  }

  @Test
  public void testAccountLevelOidcEndpoints() throws IOException {
    assertEquals(
        new DatabricksConfig()
            .setHost("https://accounts.cloud.databricks.com")
            .setAccountId("1234567890")
            .getDatabricksOidcEndpoints()
            .getAuthorizationEndpoint(),
        "https://accounts.cloud.databricks.com/oidc/accounts/1234567890/v1/authorize");
  }

  @Test
  public void testDiscoveryEndpoint() throws IOException {
    String discoveryUrlSuffix = "/test.discovery.url";
    String discoveryUrlResponse =
        "{\n"
            + "  \"authorization_endpoint\": \"https://test.auth.endpoint/oidc/v1/authorize\",\n"
            + "  \"token_endpoint\": \"https://test.auth.endpoint/oidc/v1/token\"\n"
            + "}";

    try (FixtureServer server =
        new FixtureServer().with("GET", discoveryUrlSuffix, discoveryUrlResponse, 200)) {

      String discoveryUrl = server.getUrl() + discoveryUrlSuffix;

      OpenIDConnectEndpoints oidcEndpoints =
          new DatabricksConfig()
              .setHost(server.getUrl())
              .setDiscoveryUrl(discoveryUrl)
              .setHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(30).build())
              .getDatabricksOidcEndpoints();

      assertEquals(
          oidcEndpoints.getAuthorizationEndpoint(), "https://test.auth.endpoint/oidc/v1/authorize");
      assertEquals(oidcEndpoints.getTokenEndpoint(), "https://test.auth.endpoint/oidc/v1/token");
    }
  }

  @Test
  public void testNewWithWorkspaceHost() throws IOException {
    try (FixtureServer server = new FixtureServer()) {
      String workspaceHost = server.getUrl();
      DatabricksConfig config =
          new DatabricksConfig()
              .setAuthType("oauth-m2m")
              .setClientId("my-client-id")
              .setClientSecret("my-client-secret")
              .setAccountId("account-id")
              .setHost("https://account.cloud.databricks.com");

      DatabricksConfig newWorkspaceConfig = config.newWithWorkspaceHost(workspaceHost).resolve();

      assert newWorkspaceConfig.getHost().equals(workspaceHost);
      assert newWorkspaceConfig.getAuthType().equals("oauth-m2m");
      assert newWorkspaceConfig.getClientId().equals("my-client-id");
      assert newWorkspaceConfig.getClientSecret().equals("my-client-secret");
    }
  }

  @Test
  public void testClone() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setAuthType("oauth-m2m")
            .setClientId("my-client-id")
            .setClientSecret("my-client-secret")
            .setAccountId("account-id")
            .setHost("https://account.cloud.databricks.com");

    DatabricksConfig newWorkspaceConfig = config.clone();

    assert newWorkspaceConfig.getHost().equals("https://account.cloud.databricks.com");
    assert newWorkspaceConfig.getAuthType().equals("oauth-m2m");
    assert newWorkspaceConfig.getClientId().equals("my-client-id");
    assert newWorkspaceConfig.getClientSecret().equals("my-client-secret");
  }

  @Test
  public void testGetTokenSourceWithNonOAuth() {
    HttpClient httpClient = mock(HttpClient.class);
    HeaderFactory mockHeaderFactory = mock(HeaderFactory.class);
    CredentialsProvider mockProvider = mock(CredentialsProvider.class);
    when(mockProvider.authType()).thenReturn("test");
    when(mockProvider.configure(any())).thenReturn(mockHeaderFactory);

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://test.databricks.com")
            .setHttpClient(httpClient)
            .setCredentialsProvider(mockProvider);

    // This will set the headerFactory internally
    config.authenticate();

    TokenSource tokenSource = config.getTokenSource();
    assertTrue(tokenSource instanceof ErrorTokenSource);
    DatabricksException exception =
        assertThrows(DatabricksException.class, () -> tokenSource.getToken());
    assertEquals("OAuth Token not supported for current auth type test", exception.getMessage());
  }

  @Test
  public void testGetTokenSourceWithOAuth() {
    HttpClient httpClient = mock(HttpClient.class);
    TokenSource mockTokenSource = mock(TokenSource.class);
    when(mockTokenSource.getToken())
        .thenReturn(new Token("test-token", "Bearer", java.time.Instant.now().plusSeconds(3600)));
    OAuthHeaderFactory mockHeaderFactory = OAuthHeaderFactory.fromTokenSource(mockTokenSource);
    CredentialsProvider mockProvider = mock(CredentialsProvider.class);
    when(mockProvider.authType()).thenReturn("test");
    when(mockProvider.configure(any())).thenReturn(mockHeaderFactory);

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://test.databricks.com")
            .setHttpClient(httpClient)
            .setCredentialsProvider(mockProvider);

    // This will set the headerFactory internally
    config.authenticate();

    TokenSource tokenSource = config.getTokenSource();
    assertFalse(tokenSource instanceof ErrorTokenSource);
    assertEquals(tokenSource.getToken().getAccessToken(), "test-token");
  }

  @Test
  public void testOAuthBrowserAuthTimeout() {
    DatabricksConfig config = new DatabricksConfig();

    assertNull(config.getOAuthBrowserAuthTimeout());

    config.setOAuthBrowserAuthTimeout(Duration.ofSeconds(30));
    assertEquals(Duration.ofSeconds(30), config.getOAuthBrowserAuthTimeout());

    config.setOAuthBrowserAuthTimeout(Duration.ofSeconds(60));
    assertEquals(Duration.ofSeconds(60), config.getOAuthBrowserAuthTimeout());

    config.setOAuthBrowserAuthTimeout(Duration.ofSeconds(0));
    assertEquals(Duration.ZERO, config.getOAuthBrowserAuthTimeout());
  }

  @Test
  public void testEnvironmentVariableLoading() {
    Map<String, String> env = new HashMap<>();
    env.put("DATABRICKS_OAUTH_BROWSER_AUTH_TIMEOUT", "30");
    env.put("DATABRICKS_DEBUG_TRUNCATE_BYTES", "100");
    env.put("DATABRICKS_RATE_LIMIT", "50");

    DatabricksConfig config = new DatabricksConfig();
    config.resolve(new Environment(env, new ArrayList<>(), System.getProperty("os.name")));

    assertEquals(Duration.ofSeconds(30), config.getOAuthBrowserAuthTimeout());
    assertEquals(Integer.valueOf(100), config.getDebugTruncateBytes());
    assertEquals(Integer.valueOf(50), config.getRateLimit());
  }

  @Test
  public void testDisableRetriesSetAndGet() {
    DatabricksConfig config = new DatabricksConfig().setDisableRetries(true);
    assertEquals(true, config.getDisableRetries());
  }

  @Test
  public void testDisableRetriesEnvironmentVariable() {
    Map<String, String> env = new HashMap<>();
    env.put("DATABRICKS_DISABLE_RETRIES", "true");

    DatabricksConfig config = new DatabricksConfig();
    config.resolve(new Environment(env, new ArrayList<>(), System.getProperty("os.name")));

    assertEquals(true, config.getDisableRetries());
  }

  @Test
  public void testDisableOauthRefreshTokenDefaultValue() {
    DatabricksConfig config = new DatabricksConfig();
    assertEquals(false, config.getDisableOauthRefreshToken());
  }

  @Test
  public void testDisableOauthRefreshTokenSetAndGet() {
    DatabricksConfig config = new DatabricksConfig().setDisableOauthRefreshToken(true);
    assertEquals(true, config.getDisableOauthRefreshToken());
  }

  @Test
  public void testDisableOauthRefreshTokenEnvironmentVariable() {
    Map<String, String> env = new HashMap<>();
    env.put("DATABRICKS_DISABLE_OAUTH_REFRESH_TOKEN", "true");

    DatabricksConfig config = new DatabricksConfig();
    config.resolve(new Environment(env, new ArrayList<>(), System.getProperty("os.name")));

    assertEquals(true, config.getDisableOauthRefreshToken());
  }

  // Config File Scope Parsing Tests
  private static Stream<Arguments> provideConfigFileScopesTestCases() {
    return Stream.of(
        Arguments.of("Empty scopes defaults to all-apis", "scope-empty", Arrays.asList("all-apis")),
        Arguments.of("Single scope", "scope-single", Arrays.asList("clusters:read")),
        Arguments.of(
            "Multiple scopes sorted alphabetically",
            "scope-multiple",
            Arrays.asList(
                "clusters",
                "files:read",
                "iam:read",
                "jobs",
                "mlflow",
                "model-serving:read",
                "pipelines")));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideConfigFileScopesTestCases")
  public void testConfigFileScopes(String testName, String profile, List<String> expectedScopes) {
    Map<String, String> env = new HashMap<>();
    env.put("HOME", "src/test/resources/testdata");

    DatabricksConfig config = new DatabricksConfig().setProfile(profile);
    config.resolve(new Environment(env, new ArrayList<>(), System.getProperty("os.name")));

    List<String> scopes = config.getScopes();
    assertIterableEquals(expectedScopes, scopes);
  }

  // --- Unified Host Tests (added for SPOG support) ---

  @Test
  public void testGetHostTypeWorkspace() {
    assertEquals(
        HostType.WORKSPACE,
        new DatabricksConfig().setHost("https://adb-123.azuredatabricks.net").getHostType());
  }

  @Test
  public void testGetHostTypeAccounts() {
    assertEquals(
        HostType.ACCOUNTS,
        new DatabricksConfig().setHost("https://accounts.cloud.databricks.com").getHostType());
  }

  @Test
  public void testGetClientTypeWorkspace() {
    assertEquals(
        ClientType.WORKSPACE,
        new DatabricksConfig().setHost("https://adb-123.azuredatabricks.net").getClientType());
  }

  @Test
  public void testGetClientTypeAccount() {
    assertEquals(
        ClientType.ACCOUNT,
        new DatabricksConfig().setHost("https://accounts.cloud.databricks.com").getClientType());
  }

  // --- HostMetadata tests ---

  private static final String DUMMY_ACCOUNT_ID = "00000000-0000-0000-0000-000000000001";
  private static final String DUMMY_WORKSPACE_ID = "111111111111111";

  private static Environment emptyEnv() {
    return new Environment(new HashMap<>(), new ArrayList<>(), System.getProperty("os.name"));
  }

  // Note: getHostMetadata() is package-private and not called directly by users. It is invoked
  // internally by resolve() during config init. These tests call it explicitly to verify the raw
  // response parsing, so we register the well-known fixture twice: once consumed by resolve(),
  // and once for the explicit getHostMetadata() call under test.

  @Test
  public void testGetHostMetadataWorkspaceStaticOidcEndpoint() throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://ws.databricks.com/oidc\","
            + "\"account_id\":\""
            + DUMMY_ACCOUNT_ID
            + "\","
            + "\"workspace_id\":\""
            + DUMMY_WORKSPACE_ID
            + "\"}";
    try (FixtureServer server =
        new FixtureServer()
            .with("GET", "/.well-known/databricks-config", response, 200)
            .with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      HostMetadata meta = config.getHostMetadata();
      assertEquals("https://ws.databricks.com/oidc", meta.getOidcEndpoint());
      assertEquals(DUMMY_ACCOUNT_ID, meta.getAccountId());
      assertEquals(DUMMY_WORKSPACE_ID, meta.getWorkspaceId());
    }
  }

  @Test
  public void testGetHostMetadataAccountRawOidcTemplate() throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://acc.databricks.com/oidc/accounts/{account_id}\"}";
    try (FixtureServer server =
        new FixtureServer()
            .with("GET", "/.well-known/databricks-config", response, 200)
            .with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      HostMetadata meta = config.getHostMetadata();
      assertEquals("https://acc.databricks.com/oidc/accounts/{account_id}", meta.getOidcEndpoint());
      assertNull(meta.getAccountId());
      assertNull(meta.getWorkspaceId());
    }
  }

  @Test
  public void testGetHostMetadataRaisesOnHttpError() throws IOException {
    try (FixtureServer server =
        new FixtureServer()
            .with("GET", "/.well-known/databricks-config", "{}", 404)
            .with("GET", "/.well-known/databricks-config", "{}", 404)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      DatabricksException ex =
          assertThrows(DatabricksException.class, () -> config.getHostMetadata());
      assertTrue(ex.getMessage().contains("Failed to fetch host metadata"));
    }
  }

  // --- resolveHostMetadata tests ---

  @Test
  public void testResolveHostMetadataWorkspacePopulatesAllFields() throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://ws.databricks.com/oidc\","
            + "\"account_id\":\""
            + DUMMY_ACCOUNT_ID
            + "\","
            + "\"workspace_id\":\""
            + DUMMY_WORKSPACE_ID
            + "\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      assertEquals(DUMMY_ACCOUNT_ID, config.getAccountId());
      assertEquals(DUMMY_WORKSPACE_ID, config.getWorkspaceId());
      assertEquals(
          "https://ws.databricks.com/oidc/.well-known/oauth-authorization-server",
          config.getDiscoveryUrl());
    }
  }

  @Test
  public void testResolveHostMetadataAccountSubstitutesAccountId() throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://acc.databricks.com/oidc/accounts/{account_id}\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config =
          new DatabricksConfig().setHost(server.getUrl()).setAccountId(DUMMY_ACCOUNT_ID);
      config.resolve(emptyEnv());
      assertEquals(
          "https://acc.databricks.com/oidc/accounts/"
              + DUMMY_ACCOUNT_ID
              + "/.well-known/oauth-authorization-server",
          config.getDiscoveryUrl());
    }
  }

  @Test
  public void testResolveHostMetadataDoesNotOverwriteExistingFields() throws IOException {
    String existingAccountId = "existing-account-id";
    String existingWorkspaceId = "existing-workspace-id";
    String response =
        "{\"oidc_endpoint\":\"https://ws.databricks.com/oidc\","
            + "\"account_id\":\"other-account\","
            + "\"workspace_id\":\"other-ws\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config =
          new DatabricksConfig()
              .setHost(server.getUrl())
              .setAccountId(existingAccountId)
              .setWorkspaceId(existingWorkspaceId);
      config.resolve(emptyEnv());
      assertEquals(existingAccountId, config.getAccountId());
      assertEquals(existingWorkspaceId, config.getWorkspaceId());
    }
  }

  @Test
  public void testResolveHostMetadataMissingAccountIdWithPlaceholderSkipsDiscoveryUrl()
      throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://acc.databricks.com/oidc/accounts/{account_id}\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      // DiscoveryURL should not be set because account_id is empty and placeholder can't be
      // substituted
      assertNull(config.getDiscoveryUrl());
    }
  }

  @Test
  public void testResolveHostMetadataNoOidcEndpointSkipsDiscoveryUrl() throws IOException {
    String response = "{\"account_id\":\"" + DUMMY_ACCOUNT_ID + "\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      assertEquals(DUMMY_ACCOUNT_ID, config.getAccountId());
      assertNull(config.getDiscoveryUrl());
    }
  }

  @Test
  public void testResolveHostMetadataRaisesOnHttpError() throws IOException {
    try (FixtureServer server =
        new FixtureServer()
            .with("GET", "/.well-known/databricks-config", "{}", 500)
            .with("GET", "/.well-known/databricks-config", "{}", 500)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      DatabricksException ex =
          assertThrows(DatabricksException.class, () -> config.resolveHostMetadata());
      assertTrue(ex.getMessage().contains("Failed to fetch host metadata"));
    }
  }

  @Test
  public void testResolveHostMetadataDoesNotOverwriteTokenAudience() throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://acc.databricks.com/oidc/accounts/{account_id}\","
            + "\"account_id\":\""
            + DUMMY_ACCOUNT_ID
            + "\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config =
          new DatabricksConfig()
              .setHost(server.getUrl())
              .setAccountId(DUMMY_ACCOUNT_ID)
              .setTokenAudience("custom-audience");
      config.resolve(emptyEnv());
      assertEquals("custom-audience", config.getTokenAudience());
    }
  }

  // --- tryResolveHostMetadata (config init) tests ---

  @Test
  public void testEnsureResolvedResolvesHostMetadataWhenHostSet() throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://ws.databricks.com/oidc\","
            + "\"account_id\":\""
            + DUMMY_ACCOUNT_ID
            + "\","
            + "\"workspace_id\":\""
            + DUMMY_WORKSPACE_ID
            + "\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      assertEquals(DUMMY_ACCOUNT_ID, config.getAccountId());
      assertEquals(DUMMY_WORKSPACE_ID, config.getWorkspaceId());
      assertEquals(
          "https://ws.databricks.com/oidc/.well-known/oauth-authorization-server",
          config.getDiscoveryUrl());
    }
  }

  @Test
  public void testEnsureResolvedHostMetadataNotFoundNonFatal() throws IOException {
    // When host metadata endpoint returns 404, resolve should still succeed
    // (auto-stubbed by FixtureServer)
    try (FixtureServer server = new FixtureServer()) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      assertNull(config.getAccountId());
      assertNull(config.getWorkspaceId());
    }
  }

  @Test
  public void testEnsureResolvedHostMetadataFailureNonFatal() throws IOException {
    try (FixtureServer server =
        new FixtureServer()
            .with(
                "GET", "/.well-known/databricks-config", "{\"error\": \"internal error\"}", 500)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      // Should not throw — metadata failure is non-fatal
      config.resolve(emptyEnv());
      assertNull(config.getAccountId());
      assertNull(config.getWorkspaceId());
    }
  }

  @Test
  public void testEnsureResolvedHostMetadataNoOidcEndpointNonFatal() throws IOException {
    String response = "{\"account_id\":\"" + DUMMY_ACCOUNT_ID + "\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      assertEquals(DUMMY_ACCOUNT_ID, config.getAccountId());
      assertNull(config.getDiscoveryUrl());
    }
  }

  @Test
  public void testEnsureResolvedHostMetadataMissingAccountIdWithPlaceholderNonFatal()
      throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://acc.databricks.com/oidc/accounts/{account_id}\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      // DiscoveryURL should not be set because account_id is empty and placeholder can't be
      // substituted
      assertNull(config.getDiscoveryUrl());
    }
  }

  // --- resolveHostMetadata host type tests ---

  @Test
  public void testResolveHostMetadataPopulatesResolvedHostType() throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://ws.databricks.com/oidc\","
            + "\"account_id\":\""
            + DUMMY_ACCOUNT_ID
            + "\","
            + "\"host_type\":\"workspace\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      assertEquals(HostType.WORKSPACE, config.getResolvedHostType());
    }
  }

  @Test
  public void testResolveHostMetadataDoesNotOverwriteExistingHostType() throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://ws.databricks.com/oidc\","
            + "\"account_id\":\""
            + DUMMY_ACCOUNT_ID
            + "\","
            + "\"host_type\":\"workspace\"}";
    try (FixtureServer server =
        new FixtureServer()
            .with("GET", "/.well-known/databricks-config", response, 200)
            .with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      config.setResolvedHostType(HostType.UNIFIED);
      config.resolveHostMetadata();
      assertEquals(HostType.UNIFIED, config.getResolvedHostType());
    }
  }

  @Test
  public void testResolveHostMetadataUnknownHostTypeIgnored() throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://ws.databricks.com/oidc\","
            + "\"account_id\":\""
            + DUMMY_ACCOUNT_ID
            + "\","
            + "\"host_type\":\"unknown_value\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      assertNull(config.getResolvedHostType());
    }
  }

  @Test
  public void testResolveHostMetadataHostTypeAccount() throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://ws.databricks.com/oidc\","
            + "\"account_id\":\""
            + DUMMY_ACCOUNT_ID
            + "\","
            + "\"host_type\":\"account\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      assertEquals(HostType.ACCOUNTS, config.getResolvedHostType());
    }
  }

  @Test
  public void testResolveHostMetadataHostTypeUnified() throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://ws.databricks.com/oidc\","
            + "\"account_id\":\""
            + DUMMY_ACCOUNT_ID
            + "\","
            + "\"host_type\":\"unified\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      assertEquals(HostType.UNIFIED, config.getResolvedHostType());
    }
  }

  // --- resolveHostMetadata default_oidc_audience tests ---

  @Test
  public void testResolveHostMetadataSetsTokenAudienceFromDefaultOidcAudience() throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://ws.databricks.com/oidc\","
            + "\"account_id\":\""
            + DUMMY_ACCOUNT_ID
            + "\","
            + "\"default_oidc_audience\":\"https://ws.databricks.com/oidc/v1/token\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config = new DatabricksConfig().setHost(server.getUrl());
      config.resolve(emptyEnv());
      assertEquals("https://ws.databricks.com/oidc/v1/token", config.getTokenAudience());
    }
  }

  @Test
  public void testResolveHostMetadataDefaultOidcAudiencePriorityOverAccountIdFallback()
      throws IOException {
    // default_oidc_audience should take priority over the account_id fallback for account hosts
    String response =
        "{\"oidc_endpoint\":\"https://acc.databricks.com/oidc/accounts/{account_id}\","
            + "\"account_id\":\""
            + DUMMY_ACCOUNT_ID
            + "\","
            + "\"host_type\":\"account\","
            + "\"default_oidc_audience\":\"custom-audience\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config =
          new DatabricksConfig().setHost(server.getUrl()).setAccountId(DUMMY_ACCOUNT_ID);
      config.resolve(emptyEnv());
      // Should use default_oidc_audience, NOT account_id
      assertEquals("custom-audience", config.getTokenAudience());
    }
  }

  @Test
  public void testResolveHostMetadataDoesNotOverrideExistingTokenAudienceWithOidcAudience()
      throws IOException {
    String response =
        "{\"oidc_endpoint\":\"https://ws.databricks.com/oidc\","
            + "\"account_id\":\""
            + DUMMY_ACCOUNT_ID
            + "\","
            + "\"default_oidc_audience\":\"metadata-audience\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config =
          new DatabricksConfig().setHost(server.getUrl()).setTokenAudience("existing-audience");
      config.resolve(emptyEnv());
      assertEquals("existing-audience", config.getTokenAudience());
    }
  }

  @Test
  public void testResolveHostMetadataFallsBackToAccountIdWhenNoDefaultOidcAudience()
      throws IOException {
    // When no default_oidc_audience, should fall back to account_id for account hosts.
    // Use host_type=account in metadata so getClientType() returns ACCOUNT.
    String response =
        "{\"oidc_endpoint\":\"https://acc.databricks.com/oidc/accounts/{account_id}\","
            + "\"account_id\":\""
            + DUMMY_ACCOUNT_ID
            + "\","
            + "\"host_type\":\"account\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", "/.well-known/databricks-config", response, 200)) {
      DatabricksConfig config =
          new DatabricksConfig().setHost(server.getUrl()).setAccountId(DUMMY_ACCOUNT_ID);
      config.resolve(emptyEnv());
      // resolve() triggers tryResolveHostMetadata() which sets resolvedHostType=ACCOUNTS,
      // then the tokenAudience fallback sets tokenAudience to accountId.
      assertEquals(DUMMY_ACCOUNT_ID, config.getTokenAudience());
    }
  }

  // --- discoveryUrl / OIDC endpoint tests ---

  @Test
  public void testDiscoveryUrlFromEnv() {
    Map<String, String> env = new HashMap<>();
    env.put("DATABRICKS_DISCOVERY_URL", "https://custom.idp.example.com/oidc");
    DatabricksConfig config = new DatabricksConfig();
    config.resolve(new Environment(env, new ArrayList<>(), System.getProperty("os.name")));
    assertEquals("https://custom.idp.example.com/oidc", config.getDiscoveryUrl());
  }

  @Test
  public void testDatabricksOidcEndpointsUsesDiscoveryUrl() throws IOException {
    String discoveryUrlSuffix = "/oidc";
    String discoveryUrlResponse =
        "{\"authorization_endpoint\":\"https://ws.databricks.com/oidc/v1/authorize\","
            + "\"token_endpoint\":\"https://ws.databricks.com/oidc/v1/token\"}";
    try (FixtureServer server =
        new FixtureServer().with("GET", discoveryUrlSuffix, discoveryUrlResponse, 200)) {
      String discoveryUrl = server.getUrl() + discoveryUrlSuffix;
      OpenIDConnectEndpoints endpoints =
          new DatabricksConfig()
              .setHost(server.getUrl())
              .setDiscoveryUrl(discoveryUrl)
              .setHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(30).build())
              .getDatabricksOidcEndpoints();
      assertEquals(
          "https://ws.databricks.com/oidc/v1/authorize", endpoints.getAuthorizationEndpoint());
      assertEquals("https://ws.databricks.com/oidc/v1/token", endpoints.getTokenEndpoint());
    }
  }
}
