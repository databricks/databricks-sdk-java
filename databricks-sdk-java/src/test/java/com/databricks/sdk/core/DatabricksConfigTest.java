package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

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
                "{\"authorization_endpoint\":\"https://test-workspace.cloud.databricks.com/oidc/v1/authorize\"}")) {
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
}
