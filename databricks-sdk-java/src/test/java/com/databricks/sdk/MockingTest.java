package com.databricks.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.databricks.sdk.service.clusters.*;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockingTest {
  @Mock ClustersService clustersMock;

  @Test
  public void mockingAPI() {
    when(clustersMock.get(new Get().setClusterId("foo")))
        .thenReturn(new ClusterInfo().setState(State.RUNNING));

    ClustersAPI clustersAPI = new ClustersAPI(clustersMock);
    ClusterInfo info = clustersAPI.get("foo");

    assertEquals(State.RUNNING, info.getState());
  }

  @Test
  public void mockingWorkspaceClient() {
    when(clustersMock.get(new Get().setClusterId("foo")))
            .thenReturn(new ClusterInfo().setState(State.RUNNING));

    DatabricksWorkspace workspace = new DatabricksWorkspace(true).withClustersImpl(clustersMock);

    ClusterInfo info = workspace.clusters().get("foo");

    assertEquals(State.RUNNING, info.getState());
  }
}
