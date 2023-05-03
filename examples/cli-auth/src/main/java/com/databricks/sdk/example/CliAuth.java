package com.databricks.sdk.example;

import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.service.compute.ClusterInfo;
import com.databricks.sdk.service.compute.ListClustersRequest;

import java.util.Objects;

public class CliAuth {
    public static void main(String[] args) {
        String authType = "bricks-cli"; // Change to "azure-cli" if you want to use az
        DatabricksConfig config = new DatabricksConfig()
                .setAuthType(authType);

        config.resolve().authenticate();

        assert Objects.equals(config.getAuthType(), authType);

        DatabricksWorkspace workspace = new DatabricksWorkspace(config);
        for (ClusterInfo c : workspace.clusters().list(new ListClustersRequest())) {
            System.out.println(c.getClusterName());
        }
    }
}