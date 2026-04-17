package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class DatabricksCliCredentialsProviderTest {

  private static final String CLI_PATH = "/usr/local/bin/databricks";
  private static final String HOST = "https://my-workspace.cloud.databricks.com";
  private static final String ACCOUNT_HOST = "https://accounts.cloud.databricks.com";
  private static final String ACCOUNT_ID = "test-account-123";

  private final DatabricksCliCredentialsProvider provider = new DatabricksCliCredentialsProvider();

  @Test
  void testBuildHostArgs_WorkspaceHost() {
    DatabricksConfig config = new DatabricksConfig().setHost(HOST);

    List<String> cmd = provider.buildHostArgs(CLI_PATH, config);

    assertEquals(Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST), cmd);
  }

  @Test
  void testBuildHostArgs_AccountHost() {
    DatabricksConfig config = new DatabricksConfig().setHost(ACCOUNT_HOST).setAccountId(ACCOUNT_ID);

    List<String> cmd = provider.buildHostArgs(CLI_PATH, config);

    assertEquals(
        Arrays.asList(
            CLI_PATH, "auth", "token", "--host", ACCOUNT_HOST, "--account-id", ACCOUNT_ID),
        cmd);
  }

  @Test
  void testBuildHostArgs_NonAccountsHostWithAccountId() {
    // Non-accounts hosts should not pass --account-id even if accountId is set
    DatabricksConfig config = new DatabricksConfig().setHost(HOST).setAccountId(ACCOUNT_ID);

    List<String> cmd = provider.buildHostArgs(CLI_PATH, config);

    assertEquals(Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST), cmd);
  }

  // ---- Profile args construction tests ----

  @Test
  void testBuildProfileArgs() {
    DatabricksConfig config = new DatabricksConfig().setProfile("my-profile");

    List<String> cmd = provider.buildProfileArgs(CLI_PATH, config);

    assertEquals(Arrays.asList(CLI_PATH, "auth", "token", "--profile", "my-profile"), cmd);
  }
}
