package com.databricks.sdk;

import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.service.compute.ClusterInfo;
import com.databricks.sdk.service.compute.ListClustersRequest;

import java.util.Objects;

public class CliAuth {
    private static DatabricksConfig getConfig() {
        // Change to "azure-cli" if you want to authenticate through azure cli
        String authType = "bricks-cli";
        DatabricksConfig config = new DatabricksConfig().setAuthType(authType);
        config.resolve().authenticate();
        return config;
    }
    public static void main(String[] args) {
        DatabricksConfig config = getConfig();
        DatabricksWorkspace workspace = new DatabricksWorkspace(config);
        for (ClusterInfo c : workspace.clusters().list(new ListClustersRequest())) {
            System.out.println(c.getClusterName());
        }
    }
}