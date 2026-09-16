package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.databricks.sdk.service.compute.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ClustersExtTest {
  @Mock ClustersService clustersMock;

  @Test
  void ensureClusterIsRunningStartsTerminatedClusterAndPollsUntilRunning() throws TimeoutException {
    when(clustersMock.get(argThat(request -> request.getClusterId().equals("abc"))))
        .thenReturn(
            new ClusterDetails().setState(State.TERMINATED),
            new ClusterDetails().setState(State.PENDING),
            new ClusterDetails().setState(State.RUNNING));
    ClustersExt clustersExt = new ClustersExt(clustersMock);

    clustersExt.ensureClusterIsRunning("abc");

    List<String> requests =
        Mockito.mockingDetails(clustersMock).getInvocations().stream()
            .map(invocation -> invocation.getMethod().getName())
            .collect(Collectors.toList());
    assertEquals(Arrays.asList("get", "start", "get", "get"), requests);

    ArgumentCaptor<GetClusterRequest> getRequests =
        ArgumentCaptor.forClass(GetClusterRequest.class);
    verify(clustersMock, times(3)).get(getRequests.capture());
    assertEquals(
        Arrays.asList("abc", "abc", "abc"),
        getRequests.getAllValues().stream()
            .map(GetClusterRequest::getClusterId)
            .collect(Collectors.toList()));
    verify(clustersMock).start(argThat(request -> request.getClusterId().equals("abc")));
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
    // Mock realistic Databricks Runtime version based on actual API response format
    // The key point: version name contains more than just "Apache Spark X.Y.Z"
    versions.add(
        new SparkVersion()
            .setName("13.3 LTS (includes Apache Spark 3.4.1, Scala 2.12)")
            .setKey("13.3.x-scala2.12"));
    return new GetSparkVersionsResponse().setVersions(versions);
  }

  @Test
  void sparkVersionWithSparkVersionParameter() {
    ClustersExt clustersExt = new ClustersExt(clustersMock);
    Mockito.doReturn(testGetSparkVersionsWithSparkVersion()).when(clustersMock).sparkVersions();

    // Test that sparkVersion parameter works with realistic API response format
    // This tests the contains() fix - the version name is "13.3 LTS (includes Apache Spark 3.4.1,
    // Scala 2.12)"
    // not just "Apache Spark 3.4.1", so equals() would fail but contains() works
    String sparkVersion =
        clustersExt.selectSparkVersion(new SparkVersionSelector().withSparkVersion("3.4.1"));
    assertEquals("13.3.x-scala2.12", sparkVersion);
  }

  private GetSparkVersionsResponse testGetSparkVersionsWithUnparseableKey() {
    Collection<SparkVersion> versions = new ArrayList<>();
    versions.add(
        new SparkVersion()
            .setName("14.3 LTS (includes Apache Spark 3.5.0, Scala 2.12)")
            .setKey("14.3.x-scala2.12"));
    versions.add(
        new SparkVersion()
            .setName("15.4 LTS (includes Apache Spark 3.5.0, Scala 2.12)")
            .setKey("15.4.x-scala2.12"));
    // Non-SemVer runtime key returned by the API. Sorting this with SemVer.parse() previously threw
    // "Not a valid SemVer: v18.x-scala2.13" and broke selection for every caller.
    versions.add(
        new SparkVersion()
            .setName("18.x (includes Apache Spark 4.0.0, Scala 2.13)")
            .setKey("v18.x-scala2.13"));
    return new GetSparkVersionsResponse().setVersions(versions);
  }

  @Test
  void selectLatestSparkVersionIgnoresUnparseableKey() {
    ClustersExt clustersExt = new ClustersExt(clustersMock);
    Mockito.doReturn(testGetSparkVersionsWithUnparseableKey()).when(clustersMock).sparkVersions();

    // Must not throw on the non-SemVer key, and must return the latest parseable runtime - matching
    // databricks-sdk-go, which ranks unparseable keys lowest rather than failing.
    String sparkVersion = clustersExt.selectSparkVersion(new SparkVersionSelector().withLatest());
    assertEquals("15.4.x-scala2.12", sparkVersion);
  }
}
