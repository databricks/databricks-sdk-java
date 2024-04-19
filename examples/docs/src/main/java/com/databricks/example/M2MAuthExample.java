package com.databricks.example;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.service.compute.ClusterDetails;
import com.databricks.sdk.service.compute.ListClustersRequest;
import com.databricks.sdk.service.provisioning.Workspace;

/**
 Example for authenticating with Databricks Account through CLI.
 The authentication type can be set to either "databricks-cli" or "azure-cli".
 For details on authenticating via bricks cli, please see: <a href="https://docs.databricks.com/dev-tools/cli/auth-commands.html">...</a>
 */
public class M2MWorkspaceAuthExample {
    /**
     Get config used for authenticating with Databricks.
     @return DatabricksConfig object used for authentication
     */
    private static DatabricksConfig getConfig() {
        return new DatabricksConfig()
            .setHost("https://accounts.cloud.databricks.com")
            .setAccountId("4d9d3bc8-66c3-4e5a-8a0a-551f564257f0")
            .setClientId("be8a7e9d-609d-4719-a574-614067b6fc3f")
            .setClientSecret("dosea225161b0f804998f0cf2d97e1088d89");
    }

    /**
     Authenticate and retrieve the list of workspaces from account
     */
    public static void main(String[] args) {
        DatabricksConfig config = getConfig();

        AccountClient account = new AccountClient(config);
        Workspace firstWorkspace = null;
        for (Workspace w : account.workspaces().list()) {
            if (w.getDeploymentName().equals("dbc-a39a1eb1-ef95")) {
                firstWorkspace = w;
            }
            System.out.println(w.getWorkspaceName());
        }

        WorkspaceClient w = account.getWorkspaceClient(firstWorkspace);
        for (ClusterDetails c : w.clusters().list(new ListClustersRequest())) {
            System.out.println(c.getClusterName());
        }
    }
}
