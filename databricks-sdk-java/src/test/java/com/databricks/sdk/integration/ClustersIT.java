package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.integration.framework.CollectionUtils;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.mixin.NodeTypeSelector;
import com.databricks.sdk.mixin.SparkVersionSelector;
import com.databricks.sdk.service.compute.ClusterEvent;
import java.util.*;
import java.util.concurrent.TimeoutException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class ClustersIT {
  @Test
  void ensuresClusterIsRunning(
      DatabricksWorkspace w, @EnvOrSkip("TEST_DEFAULT_CLUSTER_ID") String clusterId)
      throws TimeoutException {
    w.clusters().ensureClusterIsRunning(clusterId);
  }

  @Test
  void listsEvents(DatabricksWorkspace w, @EnvOrSkip("TEST_DEFAULT_CLUSTER_ID") String clusterId) {
    Iterable<ClusterEvent> events = w.clusters().events(clusterId);

    List<ClusterEvent> all = CollectionUtils.asList(events);

    CollectionUtils.assertUnique(all);
  }

  @Test
  void smallestNode(DatabricksWorkspace w) {
    String nodeType = w.clusters().selectNodeType(new NodeTypeSelector().withLocalDisk());

    assertNotNull(nodeType);
  }

  @Test
  void latestRuntime(DatabricksWorkspace w) {
    String runtime = w.clusters().selectSparkVersion(new SparkVersionSelector().withLatest());

    assertNotNull(runtime);
  }
}
