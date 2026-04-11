package com.databricks.sdk;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.HostType;
import com.databricks.sdk.service.provisioning.Workspace;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class AccountClientTest {

  @Test
  public void testGetWorkspaceClientForTraditionalAccount() {
    DatabricksConfig accountConfig =
        new DatabricksConfig()
            .setHost("https://accounts.cloud.databricks.com")
            .setAccountId("test-account")
            .setToken("test-token");

    AccountClient accountClient = new AccountClient(accountConfig);

    Workspace workspace = new Workspace();
    workspace.setWorkspaceId(123L);
    workspace.setDeploymentName("test-workspace");

    WorkspaceClient workspaceClient = accountClient.getWorkspaceClient(workspace);

    // Should have a different host
    assertNotEquals(accountConfig.getHost(), workspaceClient.config().getHost());
    assertTrue(workspaceClient.config().getHost().contains("test-workspace"));
  }

  @Test
  public void testGetWorkspaceClientForUnifiedHost() throws IOException {
    try (FixtureServer server = new FixtureServer()) {
      String unifiedHost = server.getUrl();
      DatabricksConfig accountConfig =
          new DatabricksConfig()
              .setHost(unifiedHost)
              .setAccountId("test-account")
              .setToken("test-token");

      AccountClient accountClient = new AccountClient(accountConfig);

      Workspace workspace = new Workspace();
      workspace.setWorkspaceId(123456L);
      workspace.setDeploymentName("test-workspace");

      WorkspaceClient workspaceClient = accountClient.getWorkspaceClient(workspace);

      // Should have the same host (non-matching DNS zone means SPOG path)
      assertEquals(unifiedHost, workspaceClient.config().getHost());

      // Should have workspace ID set
      assertEquals("123456", workspaceClient.config().getWorkspaceId());

      // Host type is WORKSPACE (no resolved host type from metadata, URL doesn't match accounts
      // pattern)
      assertEquals(HostType.WORKSPACE, workspaceClient.config().getHostType());
    }
  }

  @Test
  public void testGetWorkspaceClientForSpogHostDoesNotMutateAccountConfig() {
    String spogHost = "https://mycompany.databricks.com";
    DatabricksConfig accountConfig =
        new DatabricksConfig()
            .setHost(spogHost)
            .setAccountId("test-account")
            .setToken("test-token");

    AccountClient accountClient = new AccountClient(accountConfig);

    // Get workspace client for first workspace
    Workspace workspace1 = new Workspace();
    workspace1.setWorkspaceId(111L);
    workspace1.setDeploymentName("ws-1");
    WorkspaceClient wc1 = accountClient.getWorkspaceClient(workspace1);

    // Get workspace client for second workspace
    Workspace workspace2 = new Workspace();
    workspace2.setWorkspaceId(222L);
    workspace2.setDeploymentName("ws-2");
    WorkspaceClient wc2 = accountClient.getWorkspaceClient(workspace2);

    // Each workspace client should have its own workspace ID
    assertEquals("111", wc1.config().getWorkspaceId());
    assertEquals("222", wc2.config().getWorkspaceId());

    // Account config should not have been mutated
    assertNull(accountConfig.getWorkspaceId());

    // Both should share the same SPOG host
    assertEquals(spogHost, wc1.config().getHost());
    assertEquals(spogHost, wc2.config().getHost());
  }
}
