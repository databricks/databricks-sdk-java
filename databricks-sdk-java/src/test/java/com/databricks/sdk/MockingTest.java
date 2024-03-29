package com.databricks.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.databricks.sdk.service.compute.*;
import java.util.concurrent.TimeoutException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockingTest {
  @Mock ClustersService clustersMock;

  @Test
  public void mockingAPI() {
    when(clustersMock.get(new GetClusterRequest().setClusterId("foo")))
        .thenReturn(new ClusterDetails().setState(State.RUNNING));

    ClustersAPI clustersAPI = new ClustersAPI(clustersMock);
    ClusterDetails info = clustersAPI.get("foo");

    assertEquals(State.RUNNING, info.getState());
  }

  @Test
  public void mockingWorkspaceClient() {
    when(clustersMock.get(new GetClusterRequest().setClusterId("foo")))
        .thenReturn(new ClusterDetails().setState(State.RUNNING));

    WorkspaceClient workspace = new WorkspaceClient(true).withClustersImpl(clustersMock);

    ClusterDetails info = workspace.clusters().get("foo");

    assertEquals(State.RUNNING, info.getState());
  }

  @Test
  public void mockingMixin() throws TimeoutException {
    when(clustersMock.get(new GetClusterRequest().setClusterId("foo")))
        .thenReturn(new ClusterDetails().setState(State.RUNNING));

    WorkspaceClient workspace = new WorkspaceClient(true).withClustersImpl(clustersMock);

    workspace.clusters().ensureClusterIsRunning("foo");
  }
}
