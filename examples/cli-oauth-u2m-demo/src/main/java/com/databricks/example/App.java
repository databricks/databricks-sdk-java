package com.databricks.example;

import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.service.compute.ClusterInfo;
import com.databricks.sdk.service.compute.ListClustersRequest;

/**
 * Example for authenticating with Databricks Workspace through CLI using the external-browser auth type.
 *
 * <p>Before running this example, make sure to configure the host and client ID in the {@code DatabricksConfig} object.
 */
public class App {
    public static void main(String[] args) {
        DatabricksConfig config = new DatabricksConfig()
            .setAuthType("external-browser")
            .setClientId("abc")
            .setHost("https://localhost");
        DatabricksWorkspace workspace = new DatabricksWorkspace(config);
        for (ClusterInfo c : workspace.clusters().list(new ListClustersRequest())) {
            System.out.println(c.getClusterName());
        }
    }
}
