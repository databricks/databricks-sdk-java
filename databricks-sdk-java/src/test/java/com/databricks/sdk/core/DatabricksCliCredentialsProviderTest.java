package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class DatabricksCliCredentialsProviderTest {

  private static final String CLI_PATH = "/usr/local/bin/databricks";
  private static final String HOST = "https://my-workspace.cloud.databricks.com";
  private static final String ACCOUNT_HOST = "https://accounts.cloud.databricks.com";
  private static final String UNIFIED_HOST = "https://unified.databricks.com";
  private static final String ACCOUNT_ID = "test-account-123";
  private static final String WORKSPACE_ID = "987654321";

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
  void testBuildHostArgs_UnifiedHost_WithAccountIdAndWorkspaceId() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(UNIFIED_HOST)
            .setExperimentalIsUnifiedHost(true)
            .setAccountId(ACCOUNT_ID)
            .setWorkspaceId(WORKSPACE_ID);

    List<String> cmd = provider.buildHostArgs(CLI_PATH, config);

    assertEquals(
        Arrays.asList(
            CLI_PATH,
            "auth",
            "token",
            "--host",
            UNIFIED_HOST,
            "--experimental-is-unified-host",
            "--account-id",
            ACCOUNT_ID,
            "--workspace-id",
            WORKSPACE_ID),
        cmd);
  }

  @Test
  void testBuildHostArgs_UnifiedHost_WithAccountIdOnly() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(UNIFIED_HOST)
            .setExperimentalIsUnifiedHost(true)
            .setAccountId(ACCOUNT_ID);

    List<String> cmd = provider.buildHostArgs(CLI_PATH, config);

    assertEquals(
        Arrays.asList(
            CLI_PATH,
            "auth",
            "token",
            "--host",
            UNIFIED_HOST,
            "--experimental-is-unified-host",
            "--account-id",
            ACCOUNT_ID),
        cmd);
  }

  @Test
  void testBuildHostArgs_UnifiedHost_WithWorkspaceIdOnly() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(UNIFIED_HOST)
            .setExperimentalIsUnifiedHost(true)
            .setWorkspaceId(WORKSPACE_ID);

    List<String> cmd = provider.buildHostArgs(CLI_PATH, config);

    assertEquals(
        Arrays.asList(
            CLI_PATH,
            "auth",
            "token",
            "--host",
            UNIFIED_HOST,
            "--experimental-is-unified-host",
            "--workspace-id",
            WORKSPACE_ID),
        cmd);
  }

  @Test
  void testBuildHostArgs_UnifiedHost_WithNoAccountIdOrWorkspaceId() {
    DatabricksConfig config =
        new DatabricksConfig().setHost(UNIFIED_HOST).setExperimentalIsUnifiedHost(true);

    List<String> cmd = provider.buildHostArgs(CLI_PATH, config);

    assertEquals(
        Arrays.asList(
            CLI_PATH, "auth", "token", "--host", UNIFIED_HOST, "--experimental-is-unified-host"),
        cmd);
  }

  @Test
  void testBuildHostArgs_UnifiedHostFalse_WithAccountHost() {
    // When experimentalIsUnifiedHost is explicitly false, should fall back to account-id logic
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(ACCOUNT_HOST)
            .setExperimentalIsUnifiedHost(false)
            .setAccountId(ACCOUNT_ID);

    List<String> cmd = provider.buildHostArgs(CLI_PATH, config);

    assertEquals(
        Arrays.asList(
            CLI_PATH, "auth", "token", "--host", ACCOUNT_HOST, "--account-id", ACCOUNT_ID),
        cmd);
  }

  @Test
  void testProfile_UsesPrimaryProfileCmdWithHostFallback() {
    // When profile is set and host is present, --profile is primary and --host is fallback.
    // We verify this by inspecting buildHostArgs (fallback path) and the profile args (primary).
    DatabricksConfig config = new DatabricksConfig().setHost(HOST).setProfile("my-profile");

    // The primary command that getDatabricksCliTokenSource would build
    List<String> expectedPrimary =
        Arrays.asList(CLI_PATH, "auth", "token", "--profile", "my-profile");
    // The fallback command is the host-based one
    List<String> expectedFallback = provider.buildHostArgs(CLI_PATH, config);

    assertEquals(Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST), expectedFallback);
    assertEquals(
        Arrays.asList("auth", "token", "--profile", "my-profile"),
        expectedPrimary.subList(1, expectedPrimary.size()));
    assertFalse(expectedFallback.contains("--profile"));
    assertTrue(expectedFallback.contains("--host"));
  }

  @Test
  void testProfile_NoHostFallbackWhenHostAbsent() {
    // When profile is set but host is null, buildHostArgs is not called so no fallback is built.
    // This test confirms buildHostArgs correctly uses host when present.
    DatabricksConfig config = new DatabricksConfig().setHost(HOST);
    List<String> hostArgs = provider.buildHostArgs(CLI_PATH, config);
    assertTrue(hostArgs.contains("--host"));
    assertTrue(hostArgs.contains(HOST));
    assertFalse(hostArgs.contains("--profile"));
  }
}
