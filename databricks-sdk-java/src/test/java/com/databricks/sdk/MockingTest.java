package com.databricks.sdk;

import com.databricks.sdk.service.clusters.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockingTest {
    @Mock
    ClustersService clustersMock;

    @Test
    public void mockingAPI() {
        // TODO: generate equals & hashCode for all entities
        when(clustersMock.sparkVersions()).thenReturn(new GetSparkVersionsResponse()
                .setVersions(Collections.singletonList(
                        new SparkVersion().setKey("foo").setName("bar"))));

        ClustersAPI clustersAPI = new ClustersAPI(clustersMock);
        GetSparkVersionsResponse sparkVersions = clustersAPI.sparkVersions();

        assertEquals(1, sparkVersions.getVersions().size());
    }

    @Test
    public void mockingWorkspaceClient() {
        when(clustersMock.sparkVersions()).thenReturn(new GetSparkVersionsResponse()
                .setVersions(Collections.singletonList(
                        new SparkVersion().setKey("foo").setName("bar"))));

        DatabricksWorkspace workspace = new DatabricksWorkspace(true)
                .withClustersImpl(clustersMock);

        GetSparkVersionsResponse sparkVersions = workspace.clusters().sparkVersions();

        assertEquals(1, sparkVersions.getVersions().size());
    }
}
