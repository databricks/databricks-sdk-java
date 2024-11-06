package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DummyHttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.service.compute.*;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeoutException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ClustersExtTest {
  @Mock ClustersService clustersMock;

  @Test
  void ensureClusterIsRunning() throws TimeoutException, MalformedURLException {
    Request req =
        new Request("GET", "https://localhost/api/2.1/clusters/get")
            .withQueryParam("cluster_id", "abc");
    DummyHttpClient httpClient =
        new DummyHttpClient().with(req, new Response("{}", req.getUri().toURL()));

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
    ClustersExt clustersExt = new ClustersExt(clustersMock);
    Mockito.doReturn(testGetSparkVersions()).when(clustersMock).sparkVersions();
    String sparkVersion = clustersExt.selectSparkVersion(new SparkVersionSelector());
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
    ClustersExt clustersExt = new ClustersExt(clustersMock);
    Mockito.doReturn(testListNodeTypesResponseComparator()).when(clustersMock).listNodeTypes();
    String nodeType = clustersExt.selectNodeType(new NodeTypeSelector());
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
    ClustersExt clustersExt = new ClustersExt(clustersMock);
    Mockito.doReturn(testListNodeTypesResponseLocalDisk()).when(clustersMock).listNodeTypes();
    String nodeType = clustersExt.selectNodeType(new NodeTypeSelector().withLocalDisk());
    assertEquals("testId", nodeType);
  }

  private ListNodeTypesResponse testListNullComparison() {
    Collection<NodeType> nodeTypes = new ArrayList<>();
    nodeTypes.add(
        new NodeType()
            .setNodeTypeId("testId1")
            .setNodeInstanceType(new NodeInstanceType().setLocalDisks(2L))
            .setIsIoCacheEnabled(true));
    // isIoCacheEnabled isn't set for second node defaulting to null
    nodeTypes.add(
        new NodeType()
            .setNodeTypeId("testId2")
            .setNodeInstanceType(new NodeInstanceType().setLocalDisks(2L)));
    ListNodeTypesResponse response = new ListNodeTypesResponse().setNodeTypes(nodeTypes);
    return response;
  }

  @Test
  void nullComparisonTest() {
    ClustersExt clustersExt = new ClustersExt(clustersMock);
    Mockito.doReturn(testListNullComparison()).when(clustersMock).listNodeTypes();
    String nodeType = clustersExt.selectNodeType(new NodeTypeSelector().withLocalDisk());
    assertEquals("testId1", nodeType);
  }
}
