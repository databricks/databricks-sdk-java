package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.oauth.Token;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DatabricksCliCredentialsProviderTest {

  private static final String HOST = "https://company.databricks.com";
  private static final String ACCOUNT_ID = "12345678";
  private static final String WORKSPACE_ID = "1234";
  private static final String TOKEN = "test-token";
  private static final String TOKEN_TYPE = "Bearer";

  private static CliTokenSource mockCliTokenSource() {
    CliTokenSource cliTokenSource = Mockito.mock(CliTokenSource.class);
    Mockito.when(cliTokenSource.getToken())
        .thenReturn(new Token(TOKEN, TOKEN_TYPE, Instant.now().plusSeconds(3600)));
    return cliTokenSource;
  }

  /**
   * Test provider that captures the CLI command for verification. This follows the same pattern as
   * AzureCliCredentialsProviderTest. Overrides the method to capture the command without actually
   * executing the CLI.
   */
  private static class TestDatabricksCliCredentialsProvider
      extends DatabricksCliCredentialsProvider {
    private List<String> capturedCommand;

    @Override
    CliTokenSource getDatabricksCliTokenSource(DatabricksConfig config) {
      String cliPath = config.getDatabricksCliPath();
      if (cliPath == null) {
        return null;
      }

      // Build command exactly as the real implementation does (before OSUtils transforms it)
      List<String> cmd =
          new ArrayList<>(Arrays.asList(cliPath, "auth", "token", "--host", config.getHost()));
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

      this.capturedCommand = cmd;

      // Return mock token source instead of creating real one
      return mockCliTokenSource();
    }

    public List<String> getCapturedCommand() {
      return capturedCommand;
    }
  }

  @Test
  void testUnifiedHostWithAccountId() {
    TestDatabricksCliCredentialsProvider provider = new TestDatabricksCliCredentialsProvider();
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(HOST)
            .setAccountId(ACCOUNT_ID)
            .setExperimentalIsUnifiedHost(true)
            .setDatabricksCliPath("/usr/bin/databricks")
            .setCredentialsProvider(provider);

    HeaderFactory header = provider.configure(config);

    assertNotNull(header);
    List<String> cmd = provider.getCapturedCommand();
    assertNotNull(cmd);
    assertTrue(cmd.contains("--experimental-is-unified-host"));
    assertTrue(cmd.contains("--account-id"));
    assertTrue(cmd.contains(ACCOUNT_ID));
    assertFalse(cmd.contains("--workspace-id"));
  }

  @Test
  void testUnifiedHostWithWorkspaceId() {
    TestDatabricksCliCredentialsProvider provider = new TestDatabricksCliCredentialsProvider();
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(HOST)
            .setWorkspaceId(WORKSPACE_ID)
            .setExperimentalIsUnifiedHost(true)
            .setDatabricksCliPath("/usr/bin/databricks")
            .setCredentialsProvider(provider);

    HeaderFactory header = provider.configure(config);

    assertNotNull(header);
    List<String> cmd = provider.getCapturedCommand();
    assertNotNull(cmd);
    assertTrue(cmd.contains("--experimental-is-unified-host"));
    assertTrue(cmd.contains("--workspace-id"));
    assertTrue(cmd.contains(WORKSPACE_ID));
    assertFalse(cmd.contains("--account-id"));
  }

  @Test
  void testUnifiedHostWithBothIds() {
    TestDatabricksCliCredentialsProvider provider = new TestDatabricksCliCredentialsProvider();
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(HOST)
            .setAccountId(ACCOUNT_ID)
            .setWorkspaceId(WORKSPACE_ID)
            .setExperimentalIsUnifiedHost(true)
            .setDatabricksCliPath("/usr/bin/databricks")
            .setCredentialsProvider(provider);

    HeaderFactory header = provider.configure(config);

    assertNotNull(header);
    List<String> cmd = provider.getCapturedCommand();
    assertNotNull(cmd);
    assertTrue(cmd.contains("--experimental-is-unified-host"));
    assertTrue(cmd.contains("--account-id"));
    assertTrue(cmd.contains(ACCOUNT_ID));
    assertTrue(cmd.contains("--workspace-id"));
    assertTrue(cmd.contains(WORKSPACE_ID));
  }

  @Test
  void testUnifiedHostWithoutIds() {
    TestDatabricksCliCredentialsProvider provider = new TestDatabricksCliCredentialsProvider();
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(HOST)
            .setExperimentalIsUnifiedHost(true)
            .setDatabricksCliPath("/usr/bin/databricks")
            .setCredentialsProvider(provider);

    HeaderFactory header = provider.configure(config);

    assertNotNull(header);
    List<String> cmd = provider.getCapturedCommand();
    assertNotNull(cmd);
    assertTrue(cmd.contains("--experimental-is-unified-host"));
    assertFalse(cmd.contains("--account-id"));
    assertFalse(cmd.contains("--workspace-id"));
  }

  @Test
  void testAccountClientWithoutUnifiedHost() {
    TestDatabricksCliCredentialsProvider provider = new TestDatabricksCliCredentialsProvider();
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://accounts.cloud.databricks.com")
            .setAccountId(ACCOUNT_ID)
            .setDatabricksCliPath("/usr/bin/databricks")
            .setCredentialsProvider(provider);

    HeaderFactory header = provider.configure(config);

    assertNotNull(header);
    List<String> cmd = provider.getCapturedCommand();
    assertNotNull(cmd);
    assertFalse(cmd.contains("--experimental-is-unified-host"));
    assertTrue(cmd.contains("--account-id"));
    assertTrue(cmd.contains(ACCOUNT_ID));
  }

  @Test
  void testWorkspaceClientWithoutUnifiedHost() {
    TestDatabricksCliCredentialsProvider provider = new TestDatabricksCliCredentialsProvider();
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(HOST)
            .setDatabricksCliPath("/usr/bin/databricks")
            .setCredentialsProvider(provider);

    HeaderFactory header = provider.configure(config);

    assertNotNull(header);
    List<String> cmd = provider.getCapturedCommand();
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
  void testUnifiedHostFalseUsesRegularBehavior() {
    TestDatabricksCliCredentialsProvider provider = new TestDatabricksCliCredentialsProvider();
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://accounts.cloud.databricks.com")
            .setAccountId(ACCOUNT_ID)
            .setExperimentalIsUnifiedHost(false)
            .setDatabricksCliPath("/usr/bin/databricks")
            .setCredentialsProvider(provider);

    HeaderFactory header = provider.configure(config);

    assertNotNull(header);
    List<String> cmd = provider.getCapturedCommand();
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
