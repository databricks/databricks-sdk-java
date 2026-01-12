package com.databricks.sdk;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.ClientType;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.HostType;
import com.databricks.sdk.service.provisioning.Workspace;
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
  public void testGetWorkspaceClientForUnifiedHost() {
    String unifiedHost = "https://unified.databricks.com";
    DatabricksConfig accountConfig =
        new DatabricksConfig()
            .setHost(unifiedHost)
            .setExperimentalIsUnifiedHost(true)
            .setAccountId("test-account")
            .setToken("test-token");

    AccountClient accountClient = new AccountClient(accountConfig);

    Workspace workspace = new Workspace();
    workspace.setWorkspaceId(123456L);
    workspace.setDeploymentName("test-workspace");

    WorkspaceClient workspaceClient = accountClient.getWorkspaceClient(workspace);

    // Should have the same host
    assertEquals(unifiedHost, workspaceClient.config().getHost());

    // Should have workspace ID set
    assertEquals("123456", workspaceClient.config().getWorkspaceId());

    // Should be workspace-on-unified client type
    assertEquals(ClientType.WORKSPACE_ON_UNIFIED, workspaceClient.config().getClientType());
  }

  @Test
  public void testGetWorkspaceClientForUnifiedHostType() {
    // Verify unified host type is correctly detected
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://unified.databricks.com")
            .setExperimentalIsUnifiedHost(true);

    assertEquals(HostType.UNIFIED, config.getHostType());
  }
}
