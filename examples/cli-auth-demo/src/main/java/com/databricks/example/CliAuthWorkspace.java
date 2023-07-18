package com.databricks.example;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.service.compute.ClusterDetails;
import com.databricks.sdk.service.compute.ListClustersRequest;

/**
 Example for authenticating with Databricks Workspace through CLI.
 The authentication type can be set to either "databricks-cli" or "azure-cli".
 For details on authenticating via bricks cli, please see: <a href="https://docs.databricks.com/dev-tools/cli/auth-commands.html">...</a>
 */
public class CliAuthWorkspace {
    /**
     Get config used for authenticating with Databricks.
     @return DatabricksConfig object used for authentication
     */
    private static DatabricksConfig getConfig() {
        // Change to "azure-cli" if you want to authenticate through azure cli
        // Please authenticate using cli before using them in SDK.
        // Example: $ bricks auth login --host <host>
        String authType = "databricks-cli";
        String profile = "";
        return new DatabricksConfig()
                .setAuthType(authType)
                .setProfile(profile);
    }

    /**
     Authenticate and retrieve the list of clusters from the workspace
     */
    public static void main(String[] args) {
        DatabricksConfig config = getConfig();

        WorkspaceClient workspace = new WorkspaceClient(config);
        for (ClusterDetails c : workspace.clusters().list(new ListClustersRequest())) {
            System.out.println(c.getClusterName());
        }
    }
}
