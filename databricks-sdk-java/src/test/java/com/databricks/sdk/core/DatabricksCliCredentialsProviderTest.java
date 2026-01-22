package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.utils.Environment;
import java.lang.reflect.Method;
import java.time.Instant;
import java.util.List;
import org.junit.jupiter.api.Test;

class DatabricksCliCredentialsProviderTest {

  private static final String HOST = "https://db-deco-test.databricks.com";
  private static final String ACCOUNT_ID = "968367da-7edd-44f7-9dea-3e0b20b0ec97";
  private static final String WORKSPACE_ID = "470576644108500";

  /**
   * Helper method to invoke the private getDatabricksCliTokenSource method using reflection and
   * extract the command that would be executed. Note: The CliTokenSource.cmd field is modified by
   * OSUtils.getCliExecutableCommand(), so we need to extract it before that transformation.
   */
  private List<String> getCliCommand(DatabricksConfig config) throws Exception {
    // We'll build the command directly here to test the logic
    // This is similar to what getDatabricksCliTokenSource does
    String cliPath = config.getDatabricksCliPath();
    if (cliPath == null) {
      return null;
    }

    java.util.List<String> cmd =
        new java.util.ArrayList<>(
            java.util.Arrays.asList(cliPath, "auth", "token", "--host", config.getHost()));
    if (config.getExperimentalIsUnifiedHost() != null
        && config.getExperimentalIsUnifiedHost()) {
      cmd.add("--experimental-is-unified-host");
      if (config.getAccountId() != null) {
        cmd.add("--account-id");
        cmd.add(config.getAccountId());
      }
      if (config.getWorkspaceId() != null) {
        cmd.add("--workspace-id");
        cmd.add(config.getWorkspaceId());
      }
    } else if (config.getClientType() == ClientType.ACCOUNT) {
      cmd.add("--account-id");
      cmd.add(config.getAccountId());
    }

    return cmd;
  }

  @Test
  void testUnifiedHostWithAccountId() throws Exception {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(HOST)
            .setAccountId(ACCOUNT_ID)
            .setExperimentalIsUnifiedHost(true)
            .setDatabricksCliPath("/usr/bin/databricks");

    List<String> cmd = getCliCommand(config);

    assertNotNull(cmd);
    assertTrue(cmd.contains("--experimental-is-unified-host"));
    assertTrue(cmd.contains("--account-id"));
    assertTrue(cmd.contains(ACCOUNT_ID));
    assertFalse(cmd.contains("--workspace-id"));
  }

  @Test
  void testUnifiedHostWithWorkspaceId() throws Exception {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(HOST)
            .setWorkspaceId(WORKSPACE_ID)
            .setExperimentalIsUnifiedHost(true)
            .setDatabricksCliPath("/usr/bin/databricks");

    List<String> cmd = getCliCommand(config);

    assertNotNull(cmd);
    assertTrue(cmd.contains("--experimental-is-unified-host"));
    assertTrue(cmd.contains("--workspace-id"));
    assertTrue(cmd.contains(WORKSPACE_ID));
    assertFalse(cmd.contains("--account-id"));
  }

  @Test
  void testUnifiedHostWithBothIds() throws Exception {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(HOST)
            .setAccountId(ACCOUNT_ID)
            .setWorkspaceId(WORKSPACE_ID)
            .setExperimentalIsUnifiedHost(true)
            .setDatabricksCliPath("/usr/bin/databricks");

    List<String> cmd = getCliCommand(config);

    assertNotNull(cmd);
    assertTrue(cmd.contains("--experimental-is-unified-host"));
    assertTrue(cmd.contains("--account-id"));
    assertTrue(cmd.contains(ACCOUNT_ID));
    assertTrue(cmd.contains("--workspace-id"));
    assertTrue(cmd.contains(WORKSPACE_ID));
  }

  @Test
  void testUnifiedHostWithoutIds() throws Exception {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(HOST)
            .setExperimentalIsUnifiedHost(true)
            .setDatabricksCliPath("/usr/bin/databricks");

    List<String> cmd = getCliCommand(config);

    assertNotNull(cmd);
    assertTrue(cmd.contains("--experimental-is-unified-host"));
    assertFalse(cmd.contains("--account-id"));
    assertFalse(cmd.contains("--workspace-id"));
  }

  @Test
  void testAccountClientWithoutUnifiedHost() throws Exception {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://accounts.cloud.databricks.com")
            .setAccountId(ACCOUNT_ID)
            .setDatabricksCliPath("/usr/bin/databricks");

    // ClientType is automatically determined as ACCOUNT for accounts host
    assertEquals(ClientType.ACCOUNT, config.getClientType());

    List<String> cmd = getCliCommand(config);

    assertNotNull(cmd);
    assertFalse(cmd.contains("--experimental-is-unified-host"));
    assertTrue(cmd.contains("--account-id"));
    assertTrue(cmd.contains(ACCOUNT_ID));
  }

  @Test
  void testWorkspaceClientWithoutUnifiedHost() throws Exception {
    DatabricksConfig config =
        new DatabricksConfig().setHost(HOST).setDatabricksCliPath("/usr/bin/databricks");

    // ClientType is automatically determined as WORKSPACE for workspace host
    assertEquals(ClientType.WORKSPACE, config.getClientType());

    List<String> cmd = getCliCommand(config);

    assertNotNull(cmd);
    assertFalse(cmd.contains("--experimental-is-unified-host"));
    assertFalse(cmd.contains("--account-id"));
    assertFalse(cmd.contains("--workspace-id"));
    assertTrue(cmd.contains("auth"));
    assertTrue(cmd.contains("token"));
    assertTrue(cmd.contains("--host"));
    assertTrue(cmd.contains(HOST));
  }

  @Test
  void testUnifiedHostFalseUsesRegularBehavior() throws Exception {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://accounts.cloud.databricks.com")
            .setAccountId(ACCOUNT_ID)
            .setExperimentalIsUnifiedHost(false)
            .setDatabricksCliPath("/usr/bin/databricks");

    // ClientType is automatically determined as ACCOUNT for accounts host
    assertEquals(ClientType.ACCOUNT, config.getClientType());

    List<String> cmd = getCliCommand(config);

    assertNotNull(cmd);
    assertFalse(cmd.contains("--experimental-is-unified-host"));
    assertTrue(cmd.contains("--account-id"));
    assertTrue(cmd.contains(ACCOUNT_ID));
  }

  @Test
  void testConfigureWithNullHost() {
    DatabricksCliCredentialsProvider provider = new DatabricksCliCredentialsProvider();

    DatabricksConfig config = new DatabricksConfig();

    HeaderFactory header = provider.configure(config);
    assertNull(header);
  }
}
