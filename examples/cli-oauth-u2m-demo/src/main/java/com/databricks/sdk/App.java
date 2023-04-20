package com.databricks.sdk;

import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.service.compute.ClusterInfo;
import com.databricks.sdk.service.compute.ListClustersRequest;

public class App {
    public static void main( String[] args ) {
        DatabricksConfig config = new DatabricksConfig().setAuthType("external-browser");
        DatabricksWorkspace workspace = new DatabricksWorkspace(config);
        for (ClusterInfo c : workspace.clusters().list(new ListClustersRequest())) {
            System.out.println(c.getClusterName());
        }
    }
}
