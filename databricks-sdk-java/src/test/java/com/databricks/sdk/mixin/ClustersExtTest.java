package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

  private GetSparkVersionsResponse testGetSparkVersionsWithSparkVersion() {
    Collection<SparkVersion> versions = new ArrayList<>();
    // Mock realistic Databricks Runtime versions based on actual API response format
    versions.add(new SparkVersion()
        .setName("12.2 LTS (includes Apache Spark 3.3.2, Scala 2.12)")
        .setKey("12.2.x-scala2.12"));
    versions.add(new SparkVersion()
        .setName("13.3 LTS (includes Apache Spark 3.4.1, Scala 2.12)")
        .setKey("13.3.x-scala2.12"));
    versions.add(new SparkVersion()
        .setName("14.3 LTS (includes Apache Spark 3.5.0, Scala 2.12)")
        .setKey("14.3.x-scala2.12"));
    versions.add(new SparkVersion()
        .setName("14.2 ML (includes Apache Spark 3.5.0, Scala 2.12)")
        .setKey("14.2.x-cpu-ml-scala2.12"));
    // Add another version with same Spark version to create multiple matches
    versions.add(new SparkVersion()
        .setName("14.1 (includes Apache Spark 3.5.0, Scala 2.12)")
        .setKey("14.1.x-scala2.12"));
    return new GetSparkVersionsResponse().setVersions(versions);
  }

  @Test
  void sparkVersionWithSparkVersionParameter() {
    ClustersExt clustersExt = new ClustersExt(clustersMock);
    Mockito.doReturn(testGetSparkVersionsWithSparkVersion()).when(clustersMock).sparkVersions();
    
    // Test exact spark version match
    String sparkVersion = clustersExt.selectSparkVersion(
        new SparkVersionSelector().withSparkVersion("3.4.1"));
    assertEquals("13.3.x-scala2.12", sparkVersion);
  }

  @Test
  void sparkVersionWithSparkVersionParameterMultipleMatches() {
    ClustersExt clustersExt = new ClustersExt(clustersMock);
    Mockito.doReturn(testGetSparkVersionsWithSparkVersion()).when(clustersMock).sparkVersions();
    
    // Test spark version with multiple matches - should return latest when latest=true is explicitly set
    String sparkVersion = clustersExt.selectSparkVersion(
        new SparkVersionSelector().withSparkVersion("3.5.0").withLatest());
    // Should return the highest version (14.3.x) when latest=true and multiple 3.5.0 versions match
    assertEquals("14.3.x-scala2.12", sparkVersion);
  }

  @Test
  void sparkVersionWithSparkVersionParameterAndML() {
    ClustersExt clustersExt = new ClustersExt(clustersMock);
    Mockito.doReturn(testGetSparkVersionsWithSparkVersion()).when(clustersMock).sparkVersions();
    
    // Test spark version combined with ML requirement
    String sparkVersion = clustersExt.selectSparkVersion(
        new SparkVersionSelector().withSparkVersion("3.5.0").withML());
    assertEquals("14.2.x-cpu-ml-scala2.12", sparkVersion);
  }

  @Test
  void sparkVersionWithSparkVersionParameterNoMatch() {
    ClustersExt clustersExt = new ClustersExt(clustersMock);
    Mockito.doReturn(testGetSparkVersionsWithSparkVersion()).when(clustersMock).sparkVersions();
    
    // Test spark version that doesn't exist
    assertThrows(IllegalArgumentException.class, () -> {
      clustersExt.selectSparkVersion(
          new SparkVersionSelector().withSparkVersion("2.4.5"));
    });
  }

  @Test
  void sparkVersionWithSparkVersionParameterMultipleMatchesLatestFalse() {
    ClustersExt clustersExt = new ClustersExt(clustersMock);
    Mockito.doReturn(testGetSparkVersionsWithSparkVersion()).when(clustersMock).sparkVersions();
    
    // Test spark version with multiple matches and latest=false (default) - should throw exception
    SparkVersionSelector selector = new SparkVersionSelector().withSparkVersion("3.5.0");
    // latest defaults to false, so multiple matches should throw an exception
    
    assertThrows(IllegalArgumentException.class, () -> {
      clustersExt.selectSparkVersion(selector);
    }, "Expected exception when multiple versions match with latest=false (default)");
  }
}
