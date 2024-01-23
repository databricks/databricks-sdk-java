package com.databricks.sdk.examples;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.service.compute.ClusterDetails;
import com.databricks.sdk.service.compute.CreateCluster;
import com.databricks.sdk.service.compute.CreateClusterResponse;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

public class CreateClusterExample {
  public static void main(String[] args) throws TimeoutException {
    WorkspaceClient w = new WorkspaceClient();

    // Creating a cluster returns immediately.
    Wait<ClusterDetails, CreateClusterResponse> wait =
        w.clusters()
            .create(
                new CreateCluster()
                    .setClusterName("my-cluster")
                    .setSparkVersion("12.2.x-scala2.12")
                    .setNodeTypeId("i3.xlarge")
                    .setAutoterminationMinutes(15L)
                    .setNumWorkers(1L));

    // Creating a cluster is a long-running operation. Wait for the cluster to finish
    // starting by calling the Wait.get() method. This waits for 20 minutes by default.
    ClusterDetails c = wait.get();

    // Wait for a custom duration with the Wait.get(Duration timeout) method.
    c = wait.get(Duration.ofMinutes(10));

    System.out.println(
        "View the cluster at "
            + w.config().getHost()
            + "#setting/clusters/"
            + c.getClusterId()
            + "/configuration\n");
  }
}
