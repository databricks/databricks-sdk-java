package com.databricks.sdk.core;

import static com.databricks.sdk.core.DatabricksCliCredentialsProvider.ERR_CUSTOM_SCOPES_NOT_SUPPORTED;
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
  void testBuildCliCommand_WorkspaceHost() {
    DatabricksConfig config = new DatabricksConfig().setHost(HOST);

    List<String> cmd = provider.buildCliCommand(CLI_PATH, config);

    assertEquals(Arrays.asList(CLI_PATH, "auth", "token", "--host", HOST), cmd);
  }

  @Test
  void testBuildCliCommand_AccountHost() {
    DatabricksConfig config = new DatabricksConfig().setHost(ACCOUNT_HOST).setAccountId(ACCOUNT_ID);

    List<String> cmd = provider.buildCliCommand(CLI_PATH, config);

    assertEquals(
        Arrays.asList(
            CLI_PATH, "auth", "token", "--host", ACCOUNT_HOST, "--account-id", ACCOUNT_ID),
        cmd);
  }

  @Test
  void testBuildCliCommand_UnifiedHost_WithAccountIdAndWorkspaceId() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(UNIFIED_HOST)
            .setExperimentalIsUnifiedHost(true)
            .setAccountId(ACCOUNT_ID)
            .setWorkspaceId(WORKSPACE_ID);

    List<String> cmd = provider.buildCliCommand(CLI_PATH, config);

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
  void testBuildCliCommand_UnifiedHost_WithAccountIdOnly() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(UNIFIED_HOST)
            .setExperimentalIsUnifiedHost(true)
            .setAccountId(ACCOUNT_ID);

    List<String> cmd = provider.buildCliCommand(CLI_PATH, config);

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
  void testBuildCliCommand_UnifiedHost_WithWorkspaceIdOnly() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(UNIFIED_HOST)
            .setExperimentalIsUnifiedHost(true)
            .setWorkspaceId(WORKSPACE_ID);

    List<String> cmd = provider.buildCliCommand(CLI_PATH, config);

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
  void testBuildCliCommand_UnifiedHost_WithNoAccountIdOrWorkspaceId() {
    DatabricksConfig config =
        new DatabricksConfig().setHost(UNIFIED_HOST).setExperimentalIsUnifiedHost(true);

    List<String> cmd = provider.buildCliCommand(CLI_PATH, config);

    assertEquals(
        Arrays.asList(
            CLI_PATH, "auth", "token", "--host", UNIFIED_HOST, "--experimental-is-unified-host"),
        cmd);
  }

  @Test
  void testBuildCliCommand_UnifiedHostFalse_WithAccountHost() {
    // When experimentalIsUnifiedHost is explicitly false, should fall back to account-id logic
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(ACCOUNT_HOST)
            .setExperimentalIsUnifiedHost(false)
            .setAccountId(ACCOUNT_ID);

    List<String> cmd = provider.buildCliCommand(CLI_PATH, config);

    assertEquals(
        Arrays.asList(
            CLI_PATH, "auth", "token", "--host", ACCOUNT_HOST, "--account-id", ACCOUNT_ID),
        cmd);
  }

  @Test
  void testConfigure_ErrorsWhenScopesExplicitlySet() {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(HOST)
            .setDatabricksCliPath(CLI_PATH)
            .setScopes(Arrays.asList("sql"));

    DatabricksException e =
        assertThrows(DatabricksException.class, () -> provider.configure(config));
    assertEquals(ERR_CUSTOM_SCOPES_NOT_SUPPORTED, e.getMessage());
  }

  @Test
  void testConfigure_SkipsWhenCliNotFoundEvenWithScopes() {
    // When CLI is not available, the provider should return null (skip)
    // rather than throwing an error about scopes.
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(HOST)
            .setScopes(Arrays.asList("sql"));

    assertNull(provider.configure(config));
  }

  @Test
  void testConfigure_NoErrorWhenNoScopes() {
    DatabricksConfig config = new DatabricksConfig().setHost(HOST);

    try {
      provider.configure(config);
    } catch (Exception e) {
      // May fail for other reasons (CLI not found, env not set), but must not be the scope error
      assertNotEquals(ERR_CUSTOM_SCOPES_NOT_SUPPORTED, e.getMessage());
    }
  }

  @Test
  void testScopesExplicitlySetFlag() {
    DatabricksConfig config = new DatabricksConfig();
    assertFalse(config.isScopesExplicitlySet());

    config.setScopes(Arrays.asList("sql", "clusters"));
    assertTrue(config.isScopesExplicitlySet());
  }
}
