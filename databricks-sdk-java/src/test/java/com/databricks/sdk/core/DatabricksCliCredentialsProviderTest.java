package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class DatabricksCliCredentialsProviderTest {

  private static final String CLI_PATH = "/usr/local/bin/databricks";
  private static final String HOST = "https://my-workspace.cloud.databricks.com";
  private static final String ACCOUNT_HOST = "https://accounts.cloud.databricks.com";
  private static final String ACCOUNT_ID = "test-account-123";

  private static final String FORCE_REFRESH_FALLBACK_MSG =
      "Databricks CLI does not support --force-refresh flag. "
          + "Falling back to regular token fetch. "
          + "Please upgrade your CLI to the latest version.";
  private static final String PROFILE_FALLBACK_MSG =
      "Databricks CLI does not support --profile flag. Falling back to --host. "
          + "Please upgrade your CLI to the latest version.";

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

  // ---- Command chain construction tests ----

  @Test
  void testBuildAttempts_WithProfileAndHost() {
    DatabricksConfig config = new DatabricksConfig().setHost(HOST).setProfile("my-profile");

    List<CliTokenSource.CliCommand> commands = provider.buildCommands(CLI_PATH, config);

    assertEquals(3, commands.size());

    assertEquals(
        Arrays.asList(CLI_PATH, "auth", "token", "--profile", "my-profile", "--force-refresh"),
        commands.get(0).cmd);
    assertEquals(Arrays.asList("--force-refresh", "--profile"), commands.get(0).usedFlags);
    assertEquals(FORCE_REFRESH_FALLBACK_MSG, commands.get(0).fallbackMessage);

    assertEquals(
        Arrays.asList(CLI_PATH, "auth", "token", "--profile", "my-profile"), commands.get(1).cmd);
    assertEquals(Collections.singletonList("--profile"), commands.get(1).usedFlags);
    assertEquals(PROFILE_FALLBACK_MSG, commands.get(1).fallbackMessage);

    assertEquals(Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST), commands.get(2).cmd);
    assertEquals(Collections.emptyList(), commands.get(2).usedFlags);
    assertNull(commands.get(2).fallbackMessage);
  }

  @Test
  void testBuildAttempts_WithProfileOnly() {
    DatabricksConfig config = new DatabricksConfig().setProfile("my-profile");

    List<CliTokenSource.CliCommand> commands = provider.buildCommands(CLI_PATH, config);

    assertEquals(2, commands.size());

    assertEquals(
        Arrays.asList(CLI_PATH, "auth", "token", "--profile", "my-profile", "--force-refresh"),
        commands.get(0).cmd);
    assertEquals(Arrays.asList("--force-refresh", "--profile"), commands.get(0).usedFlags);
    assertEquals(FORCE_REFRESH_FALLBACK_MSG, commands.get(0).fallbackMessage);

    assertEquals(
        Arrays.asList(CLI_PATH, "auth", "token", "--profile", "my-profile"), commands.get(1).cmd);
    assertEquals(Collections.singletonList("--profile"), commands.get(1).usedFlags);
    assertEquals(PROFILE_FALLBACK_MSG, commands.get(1).fallbackMessage);
  }

  @Test
  void testBuildAttempts_WithHostOnly() {
    DatabricksConfig config = new DatabricksConfig().setHost(HOST);

    List<CliTokenSource.CliCommand> commands = provider.buildCommands(CLI_PATH, config);

    assertEquals(1, commands.size());

    assertEquals(Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST), commands.get(0).cmd);
    assertEquals(Collections.emptyList(), commands.get(0).usedFlags);
    assertNull(commands.get(0).fallbackMessage);
  }

  @Test
  void testBuildAttempts_WithAccountHost() {
    DatabricksConfig config = new DatabricksConfig().setHost(ACCOUNT_HOST).setAccountId(ACCOUNT_ID);

    List<CliTokenSource.CliCommand> commands = provider.buildCommands(CLI_PATH, config);

    assertEquals(1, commands.size());

    assertEquals(
        Arrays.asList(
            CLI_PATH, "auth", "token", "--host", ACCOUNT_HOST, "--account-id", ACCOUNT_ID),
        commands.get(0).cmd);
    assertEquals(Collections.emptyList(), commands.get(0).usedFlags);
    assertNull(commands.get(0).fallbackMessage);
  }
}
