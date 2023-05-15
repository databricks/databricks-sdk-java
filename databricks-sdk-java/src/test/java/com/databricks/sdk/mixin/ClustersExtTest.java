package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DummyHttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.service.compute.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeoutException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ClustersExtTest {

  @Test
  void ensureClusterIsRunning() throws TimeoutException {
    DummyHttpClient httpClient =
        new DummyHttpClient()
            .with(
                new Request("GET", "https://localhost/api/2.0/clusters/get")
                    .withQueryParam("cluster_id", "abc"),
                new Response("{}"));

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://localhost")
            .setToken("bcd")
            .setHttpClient(httpClient);
    DatabricksConfig mockConfig = Mockito.spy(config);
    Mockito.doReturn(mockConfig).when(mockConfig).resolve();

    ClustersExt clustersExt = new ClustersExt(new ApiClient(mockConfig));

    clustersExt.ensureClusterIsRunning("abc");
  }

  private GetSparkVersionsResponse testGetSparkVersions() {
    Collection<SparkVersion> version = new ArrayList<>();
    version.add(new SparkVersion().setName("testName").setKey("testVersion"));
    return new GetSparkVersionsResponse().setVersions(version);
  }

  @Test
  void sparkVersions() {
    ClustersExt clustersExt = new ClustersExt(new ApiClient());
    ClustersExt mockClusterExt = Mockito.spy(clustersExt);
    Mockito.doReturn(testGetSparkVersions()).when(mockClusterExt).getSparkVersions();
    String sparkVersion = mockClusterExt.selectSparkVersion(new SparkVersionSelector());
    assertEquals("testVersion", sparkVersion);
  }

  private ListNodeTypesResponse testListNodeTypesResponseComparator() {
    Collection<NodeType> nodeTypes = new ArrayList<>();
    nodeTypes.add(new NodeType().setNodeTypeId("testId1").setIsDeprecated(false));
    nodeTypes.add(new NodeType().setNodeTypeId("testId2").setIsDeprecated(true));
    ListNodeTypesResponse response = new ListNodeTypesResponse().setNodeTypes(nodeTypes);
    return response;
  }

  @Test
  void nodeType() {
    ClustersExt clustersExt = new ClustersExt(new ApiClient());
    ClustersExt mockClusterExt = Mockito.spy(clustersExt);
    Mockito.doReturn(testListNodeTypesResponseComparator())
        .when(mockClusterExt)
        .listNodeTypesResponse();
    String nodeType = mockClusterExt.selectNodeType(new NodeTypeSelector());
    assertEquals("testId1", nodeType);
  }

  private ListNodeTypesResponse testListNodeTypesResponseLocalDisk() {
    Collection<NodeType> nodeTypes = new ArrayList<>();
    nodeTypes.add(
        new NodeType()
            .setNodeTypeId("testId")
            .setNodeInstanceType(new NodeInstanceType().setLocalDisks(2L))
            .setIsIoCacheEnabled(true)
            .setSupportPortForwarding(true)
            .setPhotonWorkerCapable(true)
            .setPhotonDriverCapable(true));
    ListNodeTypesResponse response = new ListNodeTypesResponse().setNodeTypes(nodeTypes);
    return response;
  }

  @Test
  void localDiskNodeType() {
    ClustersExt clustersExt = new ClustersExt(new ApiClient());
    ClustersExt mockClusterExt = Mockito.spy(clustersExt);
    Mockito.doReturn(testListNodeTypesResponseLocalDisk())
        .when(mockClusterExt)
        .listNodeTypesResponse();
    String nodeType = mockClusterExt.selectNodeType(new NodeTypeSelector().withLocalDisk());
    assertEquals("testId", nodeType);
  }
}
