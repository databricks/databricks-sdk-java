package com.databricks.sdk.examples;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.service.compute.ClusterDetails;
import com.databricks.sdk.service.compute.ListClustersRequest;

public class ListClustersExample {
  public static void main(String[] args) {
    WorkspaceClient w = new WorkspaceClient();

    for (ClusterDetails c : w.clusters().list(new ListClustersRequest())) {
      System.out.println(c.getClusterName());
    }
  }
}
