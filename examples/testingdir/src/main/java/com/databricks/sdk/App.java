package com.databricks.sdk;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        DatabricksConfig config = new DatabricksConfig().setAuthType("external-browser");
        DatabricksWorkspace workspace = new DatabricksWorkspace(config);
        for (ClusterInfo c : workspace.clusters().list(new ListClustersRequest())) {
            System.out.println(c.getClusterName());
        }
    }
}
