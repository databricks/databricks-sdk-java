package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.commons.CommonsHttpClient;
import com.databricks.sdk.core.oauth.OpenIDConnectEndpoints;
import com.databricks.sdk.core.utils.Environment;
import java.io.IOException;
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
}
