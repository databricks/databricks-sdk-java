package com.databricks.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;

import com.databricks.sdk.core.ConfigResolving;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.utils.TestOSUtils;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class DatabricksAuthManualTest implements ConfigResolving {

  private DatabricksConfig createConfigWithMockClient() {
    HttpClient mockClient = mock(HttpClient.class);
    return new DatabricksConfig().setHttpClient(mockClient);
  }

  @Test
  void azureCliWorkspaceHeaderPresent() {
    StaticEnv env =
        new StaticEnv()
            .with("HOME", TestOSUtils.resource("/testdata/azure"))
            .with("PATH", "/bin:testdata")
            .with("AZ_PATH", TestOSUtils.resource("/testdata/az"));
    String azureWorkspaceResourceId =
        "/subscriptions/123/resourceGroups/abc/providers/Microsoft.Databricks/workspaces/abc123";
    DatabricksConfig config =
        createConfigWithMockClient()
            .setAuthType("azure-cli")
            .setHost("https://x")
            .setAzureWorkspaceResourceId(azureWorkspaceResourceId);
    resolveConfig(config, env);
    Map<String, String> headers = config.authenticate();
    assertEquals(azureWorkspaceResourceId, headers.get("X-Databricks-Azure-Workspace-Resource-Id"));
  }

  @Test
  void azureCliUserWithManagementAccess() {
    StaticEnv env =
        new StaticEnv()
            .with("HOME", TestOSUtils.resource("/testdata/azure"))
            .with("PATH", "/bin:testdata")
            .with("AZ_PATH", TestOSUtils.resource("/testdata/az"));
    String azureWorkspaceResourceId =
        "/subscriptions/123/resourceGroups/abc/providers/Microsoft.Databricks/workspaces/abc123";
    DatabricksConfig config =
        createConfigWithMockClient()
            .setAuthType("azure-cli")
            .setHost("https://x")
            .setAzureWorkspaceResourceId(azureWorkspaceResourceId);
    resolveConfig(config, env);
    Map<String, String> headers = config.authenticate();
    assertEquals("...", headers.get("X-Databricks-Azure-SP-Management-Token"));
  }

  @Test
  void azureCliUserNoManagementAccess() {
    StaticEnv env =
        new StaticEnv()
            .with("HOME", TestOSUtils.resource("/testdata/azure"))
            .with("PATH", "/bin:testdata")
            .with("AZ_PATH", TestOSUtils.resource("/testdata/az"))
            .with("FAIL_IF", "https://management.core.windows.net/");
    String azureWorkspaceResourceId =
        "/subscriptions/123/resourceGroups/abc/providers/Microsoft.Databricks/workspaces/abc123";
    DatabricksConfig config =
        createConfigWithMockClient()
            .setAuthType("azure-cli")
            .setHost("https://x")
            .setAzureWorkspaceResourceId(azureWorkspaceResourceId);
    resolveConfig(config, env);
    Map<String, String> headers = config.authenticate();
    assertNull(headers.get("X-Databricks-Azure-SP-Management-Token"));
  }
}
