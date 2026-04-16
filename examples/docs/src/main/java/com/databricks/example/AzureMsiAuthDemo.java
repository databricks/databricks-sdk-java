package com.databricks.example;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.service.compute.ClusterDetails;
import com.databricks.sdk.service.compute.ListClustersRequest;
import com.databricks.sdk.service.iam.Group;
import com.databricks.sdk.service.iam.ListAccountGroupsRequest;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

/**
 * Demo for Azure MSI authentication.
 *
 * <p>This example loads environment variables from ~/.databricks/debug-env.json (the "workspace" or
 * "account" section) and authenticates using Azure Managed Service Identity.
 *
 * <p>Prerequisites:
 *
 * <ul>
 *   <li>Running on an Azure VM (or compute) with a managed identity assigned
 *   <li>~/.databricks/debug-env.json configured with the appropriate section
 * </ul>
 *
 * <p>Expected debug-env.json format:
 *
 * <pre>{@code
 * {
 *   "workspace": {
 *     "DATABRICKS_HOST": "https://adb-xxxx.azuredatabricks.net",
 *     "ARM_USE_MSI": "true",
 *     "ARM_CLIENT_ID": "<optional-user-assigned-identity-client-id>"
 *   },
 *   "account": {
 *     "DATABRICKS_HOST": "https://accounts.azuredatabricks.net",
 *     "DATABRICKS_ACCOUNT_ID": "<account-id>",
 *     "DATABRICKS_AZURE_RESOURCE_ID": "/subscriptions/.../workspaces/...",
 *     "ARM_USE_MSI": "true",
 *     "ARM_CLIENT_ID": "<optional-user-assigned-identity-client-id>"
 *   }
 * }
 * }</pre>
 *
 * <p>Usage: Comment/uncomment the workspace or account demo in main() as needed.
 */
public class AzureMsiAuthDemo {

  public static void main(String[] args) throws Exception {
    // ── Uncomment ONE of the following ──

    workspaceDemo();
    // accountDemo();
  }

  /** Authenticate via Azure MSI and list clusters in the workspace. */
  static void workspaceDemo() throws Exception {
    Map<String, String> env = loadDebugEnv("workspace");

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(env.get("DATABRICKS_HOST"))
            .setAzureUseMsi(true)
            .setAuthType("azure-msi");

    // Set optional user-assigned identity client ID.
    if (env.containsKey("ARM_CLIENT_ID")) {
      config.setAzureClientId(env.get("ARM_CLIENT_ID"));
    }

    System.out.println("=== Azure MSI Workspace Demo ===");
    System.out.println("Host: " + config.getHost());
    System.out.println("Auth type: azure-msi");
    System.out.println();

    WorkspaceClient workspace = new WorkspaceClient(config);

    // This call will trigger authentication — the credential chain runs here.
    System.out.println("Authenticating and listing clusters...");
    System.out.println();

    int count = 0;
    for (ClusterDetails c : workspace.clusters().list(new ListClustersRequest())) {
      System.out.println("  Cluster: " + c.getClusterName() + " (" + c.getState() + ")");
      count++;
    }
    System.out.println();
    System.out.println("Total clusters: " + count);
    System.out.println("Auth succeeded with type: " + config.getAuthType());
  }

  /** Authenticate via Azure MSI and list groups in the account. */
  static void accountDemo() throws Exception {
    Map<String, String> env = loadDebugEnv("account");

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(env.get("DATABRICKS_HOST"))
            .setAccountId(env.get("DATABRICKS_ACCOUNT_ID"))
            .setAzureUseMsi(true)
            .setAuthType("azure-msi");

    if (env.containsKey("DATABRICKS_AZURE_RESOURCE_ID")) {
      config.setAzureWorkspaceResourceId(env.get("DATABRICKS_AZURE_RESOURCE_ID"));
    }
    if (env.containsKey("ARM_CLIENT_ID")) {
      config.setAzureClientId(env.get("ARM_CLIENT_ID"));
    }

    System.out.println("=== Azure MSI Account Demo ===");
    System.out.println("Host: " + config.getHost());
    System.out.println("Account ID: " + config.getAccountId());
    System.out.println("Auth type: azure-msi");
    System.out.println();

    AccountClient account = new AccountClient(config);

    System.out.println("Authenticating and listing account groups...");
    System.out.println();

    int count = 0;
    for (Group g : account.groups().list(new ListAccountGroupsRequest())) {
      System.out.println("  Group: " + g.getDisplayName());
      count++;
    }
    System.out.println();
    System.out.println("Total groups: " + count);
    System.out.println("Auth succeeded with type: " + config.getAuthType());
  }

  /**
   * Loads environment variables from ~/.databricks/debug-env.json for the given section.
   *
   * @param section The section name (e.g., "workspace", "account")
   * @return Map of environment variable names to values
   */
  private static Map<String, String> loadDebugEnv(String section) throws Exception {
    String path =
        String.format("%s/.databricks/debug-env.json", System.getProperty("user.home"));
    ObjectMapper mapper = new ObjectMapper();
    try (InputStream in = Files.newInputStream(Paths.get(path))) {
      Map<String, Map<String, String>> all =
          mapper.readValue(in, new TypeReference<Map<String, Map<String, String>>>() {});
      Map<String, String> env = all.get(section);
      if (env == null) {
        throw new RuntimeException(
            "Section '"
                + section
                + "' not found in "
                + path
                + ". Available: "
                + all.keySet());
      }
      return env;
    }
  }
}
