package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.mixin.ClustersExt;
import com.databricks.sdk.mixin.NodeTypeSelector;
import com.databricks.sdk.mixin.SparkVersionSelector;
import com.databricks.sdk.service.clusters.ClusterEvent;
import com.databricks.sdk.service.clusters.GetEvents;
import com.databricks.sdk.service.clusters.GetEventsResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.*;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class ClustersIT {
  @Test
  void listsEvents(DatabricksWorkspace w, @EnvOrSkip("TEST_DEFAULT_CLUSTER_ID") String clusterId) {
    Iterable<ClusterEvent> events = w.clusters().events(clusterId);

    Set<ClusterEvent> unique = new HashSet<>();
    events.forEach(unique::add);
    assertTrue(unique.size() > 1);

    Iterable<ClusterEvent> secondPass = w.clusters().events(clusterId);
    List<ClusterEvent> all = new ArrayList<>();
    secondPass.forEach(all::add);
    assertEquals(unique.size(), all.size());
  }

  @Test
  void smallestNode(DatabricksWorkspace w) {
    ClustersExt clustersExt = new ClustersExt(w.apiClient());

    String nodeType = clustersExt.selectNodeType(new NodeTypeSelector().withLocalDisk());

    assertNotNull(nodeType);
  }

  @Test
  void latestRuntime(DatabricksWorkspace w) {
    ClustersExt clustersExt = new ClustersExt(w.apiClient());

    String runtime = clustersExt.selectSparkVersion(new SparkVersionSelector().withLatest());

    assertNotNull(runtime);
  }
}
