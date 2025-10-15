package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.commons.CommonsHttpClient;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.oauth.ErrorTokenSource;
import com.databricks.sdk.core.oauth.OAuthHeaderFactory;
import com.databricks.sdk.core.oauth.OpenIDConnectEndpoints;
import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.oauth.TokenSource;
import com.databricks.sdk.core.utils.Environment;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

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
          c.getOidcEndpoints().getAuthorizationEndpoint(),
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
          c.getOidcEndpoints().getAuthorizationEndpoint(),
          "https://test-workspace.cloud.databricks.com/oidc/v1/authorize");
    }
  }

  @Test
  public void testAccountLevelOidcEndpoints() throws IOException {
    assertEquals(
        new DatabricksConfig()
            .setHost("https://accounts.cloud.databricks.com")
            .setAccountId("1234567890")
            .getOidcEndpoints()
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
              .getOidcEndpoints();

      assertEquals(
          oidcEndpoints.getAuthorizationEndpoint(), "https://test.auth.endpoint/oidc/v1/authorize");
      assertEquals(oidcEndpoints.getTokenEndpoint(), "https://test.auth.endpoint/oidc/v1/token");
    }
  }

  @Test
  public void testNewWithWorkspaceHost() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setAuthType("oauth-m2m")
            .setClientId("my-client-id")
            .setClientSecret("my-client-secret")
            .setAccountId("account-id")
            .setHost("https://account.cloud.databricks.com");
    String workspaceHost = "https://workspace.cloud.databricks.com";

    DatabricksConfig newWorkspaceConfig = config.newWithWorkspaceHost(workspaceHost).resolve();

    assert newWorkspaceConfig.getHost().equals(workspaceHost);
    assert newWorkspaceConfig.getAuthType().equals("oauth-m2m");
    assert newWorkspaceConfig.getClientId().equals("my-client-id");
    assert newWorkspaceConfig.getClientSecret().equals("my-client-secret");
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
}
