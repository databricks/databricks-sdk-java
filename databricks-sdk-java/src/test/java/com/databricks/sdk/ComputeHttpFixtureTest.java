package com.databricks.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DummyCredentialsProvider;
import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.FixtureServer.FixtureMapping;
import com.databricks.sdk.mixin.NodeTypeSelector;
import com.databricks.sdk.mixin.SparkVersionSelector;
import com.databricks.sdk.service.compute.ClusterEvent;
import com.databricks.sdk.service.compute.GetEvents;
import com.databricks.sdk.service.jobs.BaseJob;
import com.databricks.sdk.service.jobs.ListJobsRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class ComputeHttpFixtureTest {
  @Test
  void clusterSelectorsUseGeneratedHttpImplementations() throws IOException {
    FixtureMapping sparkVersions =
        fixture(
            "GET",
            "/api/2.1/clusters/spark-versions",
            "{\"versions\":["
                + "{\"key\":\"14.3.x-scala2.12\",\"name\":\"14.3 LTS (includes Apache Spark 3.5.0, Scala 2.12)\"},"
                + "{\"key\":\"15.4.x-scala2.12\",\"name\":\"15.4 LTS (includes Apache Spark 3.5.0, Scala 2.12)\"}]}");
    FixtureMapping nodeTypes =
        fixture(
            "GET",
            "/api/2.1/clusters/list-node-types",
            "{\"node_types\":["
                + "{\"node_type_id\":\"unavailable\",\"is_deprecated\":false,\"node_info\":{\"status\":[\"NotAvailableInRegion\"]}},"
                + "{\"node_type_id\":\"available\",\"is_deprecated\":false}]}");

    try (FixtureServer server = new FixtureServer().with(sparkVersions).with(nodeTypes)) {
      WorkspaceClient workspace = workspace(server);

      assertEquals(
          "15.4.x-scala2.12",
          workspace.clusters().selectSparkVersion(new SparkVersionSelector().withLatest()));
      assertEquals("available", workspace.clusters().selectNodeType(new NodeTypeSelector()));
      server.assertAllFixturesConsumed();
    }
  }

  @Test
  void clusterEventsReplayServerProvidedNextRequest() throws IOException {
    FixtureMapping firstPage =
        new FixtureMapping.Builder()
            .validateMethod("POST")
            .validatePath("/api/2.1/clusters/events")
            .validateBody("{\"cluster_id\":\"cluster-1\",\"page_size\":1}")
            .withResponse(
                "{\"events\":[{\"cluster_id\":\"cluster-1\",\"timestamp\":1}],"
                    + "\"next_page\":{\"cluster_id\":\"cluster-1\",\"page_size\":1,\"page_token\":\"next\"}}",
                200)
            .build();
    FixtureMapping secondPage =
        new FixtureMapping.Builder()
            .validateMethod("POST")
            .validatePath("/api/2.1/clusters/events")
            .validateBody("{\"cluster_id\":\"cluster-1\",\"page_size\":1,\"page_token\":\"next\"}")
            .withResponse("{\"events\":[{\"cluster_id\":\"cluster-1\",\"timestamp\":2}]}", 200)
            .build();

    try (FixtureServer server = new FixtureServer().with(firstPage).with(secondPage)) {
      List<Long> timestamps = new ArrayList<>();
      for (ClusterEvent event :
          workspace(server)
              .clusters()
              .events(new GetEvents().setClusterId("cluster-1").setPageSize(1L))) {
        timestamps.add(event.getTimestamp());
      }

      assertEquals(Arrays.asList(1L, 2L), timestamps);
      server.assertAllFixturesConsumed();
    }
  }

  @Test
  void jobsListPropagatesPageTokenAndExpansionAtHttpBoundary() throws IOException {
    FixtureMapping firstPage =
        fixture(
            "GET",
            "/api/2.2/jobs/list?expand_tasks=true&limit=1",
            "{\"jobs\":[{\"job_id\":11}],\"next_page_token\":\"page two\"}");
    FixtureMapping secondPage =
        fixture(
            "GET",
            "/api/2.2/jobs/list?expand_tasks=true&limit=1&page_token=page+two",
            "{\"jobs\":[{\"job_id\":12}]}");

    try (FixtureServer server = new FixtureServer().with(firstPage).with(secondPage)) {
      List<Long> jobIds = new ArrayList<>();
      for (BaseJob job :
          workspace(server).jobs().list(new ListJobsRequest().setExpandTasks(true).setLimit(1L))) {
        jobIds.add(job.getJobId());
      }

      assertEquals(Arrays.asList(11L, 12L), jobIds);
      server.assertAllFixturesConsumed();
    }
  }

  private static WorkspaceClient workspace(FixtureServer server) {
    return new WorkspaceClient(
        new DatabricksConfig()
            .setHost(server.getUrl())
            .setCredentialsProvider(new DummyCredentialsProvider())
            .setDisableRetries(true));
  }

  private static FixtureMapping fixture(String method, String path, String response) {
    return new FixtureMapping.Builder()
        .validateMethod(method)
        .validatePath(path)
        .withResponse(response, 200)
        .build();
  }
}
