package com.databricks.example;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.service.compute.ClusterDetails;
import com.databricks.sdk.service.compute.ListClustersRequest;

/**
 Example for authenticating with Databricks Workspace through Databricks' Unified Authentication. Unified 
 Authentication takes care of inspecting your environment to determine the best way to authenticate. 

 <p>
 For more details, please see <a href="https://docs.databricks.com/en/dev-tools/sdk-java.html#authenticate-the-databricks-sdk-for-java-with-your-databricks-account-or-workspace">Authenticate with Databricks SDK for Java</a>.
 */
public class UnifiedAuthWorkspace {
    /**
     Authenticate and retrieve the list of clusters from the workspace
     */
    public static void main(String[] args) {
        DatabricksConfig config = new DatabricksConfig();

        WorkspaceClient workspace = new WorkspaceClient(config);
        for (ClusterDetails c : workspace.clusters().list(new ListClustersRequest())) {
            System.out.println(c.getClusterName());
        }
    }
}
