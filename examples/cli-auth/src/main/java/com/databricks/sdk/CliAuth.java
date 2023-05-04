package com.databricks.sdk;

import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.service.compute.ClusterInfo;
import com.databricks.sdk.service.compute.ListClustersRequest;

/**
 Example for authenticating with Databricks through CLI.
 The authentication type can be set to either "bricks-cli" or "azure-cli".
 For details on authenticating via bricks cli, please see: <a href="https://docs.databricks.com/dev-tools/cli/auth-commands.html">...</a>
 */
public class CliAuth {
    /**
     Get config used for authenticating with Databricks.
     @return DatabricksConfig object used for authentication
     */
    private static DatabricksConfig getConfig() {
        // Change to "azure-cli" if you want to authenticate through azure cli
        String authType = "bricks-cli";
        return new DatabricksConfig().setAuthType(authType);
    }

    /**
     Authenticate and retrieve the list of clusters from the workspace.
     */
    public static void main(String[] args) {
        DatabricksConfig config = getConfig();
        DatabricksWorkspace workspace = new DatabricksWorkspace(config);
        for (ClusterInfo c : workspace.clusters().list(new ListClustersRequest())) {
            System.out.println(c.getClusterName());
        }
    }
}