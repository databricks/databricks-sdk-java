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
public class M2MAuthExample {
    /**
     Get config used for authenticating with Databricks.
     @return DatabricksConfig object used for authentication
     */
    private static DatabricksConfig getConfig() {
        return new DatabricksConfig()
            .setHost("https://accounts.cloud.databricks.com")
            // Fill in your E2 account ID. Click on your username in the top-right corner of the accounts console to
            // display your account ID.
            .setAccountId("")
            // Create a service principal in the Account console at "User Management" -> "Service Principals" and
            // click "Create service principal". Generate a secret and paste the client ID and secret below.
            .setClientId("")
            .setClientSecret("");
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
