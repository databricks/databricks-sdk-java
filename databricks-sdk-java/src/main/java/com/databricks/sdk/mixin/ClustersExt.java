package com.databricks.sdk.mixin;

import static com.databricks.sdk.service.clusters.CloudProviderNodeStatus.NotAvailableInRegion;
import static com.databricks.sdk.service.clusters.CloudProviderNodeStatus.NotEnabledOnSubscription;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.service.clusters.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ClustersExt extends ClustersAPI {
  public ClustersExt(ApiClient apiClient) {
    super(apiClient);
  }

  public ClustersExt(ClustersService mock) {
    super(mock);
  }

  public String selectSparkVersion(SparkVersionSelector selector) throws IllegalArgumentException {
    // Logic ported from
    // https://github.com/databricks/databricks-sdk-go/blob/main/service/clusters/spark_version.go
    List<String> versions = new ArrayList<>();
    GetSparkVersionsResponse sv = sparkVersions();
    for (SparkVersion version : sv.getVersions()) {
      if (selector.scala != null && !version.getKey().contains("-scala" + selector.scala)) {
        continue;
      }
      boolean matches =
          ((!version.getKey().contains("apache-spark-"))
              && ((version.getKey().contains("-ml-")) == selector.ml)
              && ((version.getKey().contains("-hls-")) == selector.genomics)
              && ((version.getKey().contains("-gpu-")) == selector.gpu)
              && ((version.getKey().contains("-photon-")) == selector.photon)
              && ((version.getKey().contains("-aarch64-")) == selector.graviton)
              && ((version.getName().contains("Beta")) == selector.beta));
      if (matches && selector.longTermSupport) {
        matches = version.getName().contains("LTS") || version.getKey().contains("-esr-");
      }
      if (matches && selector.sparkVersion != null) {
        matches = ("Apache Spark " + selector.sparkVersion).equals(version.getName());
      }
      if (matches) {
        versions.add(version.getKey());
      }
    }
    if (versions.size() < 1) {
      throw new IllegalArgumentException("spark versions query returned no results");
    }
    if (versions.size() > 1) {
      if (!selector.latest) {
        throw new IllegalArgumentException("spark versions query returned multiple results");
      }
      versions.sort((v1, v2) -> SemVer.parse(v2).compareTo(SemVer.parse(v1)));
    }
    return versions.get(0);
  }

  public String selectNodeType(NodeTypeSelector selector) {
    // Logic ported from
    // https://github.com/databricks/databricks-sdk-go/blob/main/service/clusters/node_type.go
    ListNodeTypesResponse res = this.listNodeTypes();
    List<NodeType> types =
        res.getNodeTypes().stream().sorted(nodeSortingComparator).collect(Collectors.toList());
    for (NodeType nt : types) {
      if (shouldNodeBeSkipped(nt)) {
        continue;
      }
      Long gbs = nt.getMemoryMb() / 1024;
      if (selector.fleet != null && !nt.getNodeTypeId().contains(selector.fleet)) {
        continue;
      }
      if (selector.minMemoryGb != null && gbs < selector.minMemoryGb) {
        continue;
      }
      if (selector.gbPerCore != null && gbs / nt.getNumCores() < selector.gbPerCore) {
        continue;
      }
      if (selector.minCores != null && nt.getNumCores() < selector.minCores) {
        continue;
      }
      if ((selector.minGpus != null && nt.getNumGpus() < selector.minGpus)
          || (selector.minGpus == null && nt.getNumGpus() > 0)) {
        continue;
      }
      if (selector.localDisk != null || selector.localDiskMinSize != null) {
        NodeInstanceType instanceType = nt.getNodeInstanceType();
        if (instanceType == null) {
          continue;
        }
        long localDisks = instanceType.getLocalDisks() != null ? instanceType.getLocalDisks() : 0;
        long localNvmeDisks =
            instanceType.getLocalNvmeDisks() != null ? instanceType.getLocalNvmeDisks() : 0;
        if (localDisks < 1 && localNvmeDisks < 1) {
          continue;
        }
        Long localDiskSizeGb =
            instanceType.getLocalDiskSizeGb() != null ? instanceType.getLocalDiskSizeGb() : 0;
        Long localNvmeDiskSizeGb =
            instanceType.getLocalNvmeDiskSizeGb() != null
                ? instanceType.getLocalNvmeDiskSizeGb()
                : 0;
        long allDisksSize = localDiskSizeGb + localNvmeDiskSizeGb;
        if (selector.localDiskMinSize != null && allDisksSize < selector.localDiskMinSize) {
          continue;
        }
      }
      if (selector.category != null && !nt.getCategory().equalsIgnoreCase(selector.category)) {
        continue;
      }
      if (selector.isIoCacheEnabled != null
          && !nt.getIsIoCacheEnabled().equals(selector.isIoCacheEnabled)) {
        continue;
      }
      if (selector.supportPortForwarding != null
          && !nt.getSupportPortForwarding().equals(selector.supportPortForwarding)) {
        continue;
      }
      if (selector.photonDriverCapable != null
          && !nt.getPhotonDriverCapable().equals(selector.photonDriverCapable)) {
        continue;
      }
      if (selector.photonWorkerCapable != null
          && !nt.getPhotonWorkerCapable().equals(selector.photonWorkerCapable)) {
        continue;
      }
      if (selector.graviton != null && !nt.getIsGraviton().equals(selector.graviton)) {
        continue;
      }
      return nt.getNodeTypeId();
    }
    throw new IllegalArgumentException("Cannot determine smallest node type");
  }

  private static Function<NodeType, Long> instanceTypeComparator(
      Function<NodeInstanceType, Long> yy) {
    return nodeType -> {
      NodeInstanceType nodeInstanceType = nodeType.getNodeInstanceType();
      if (nodeInstanceType == null) {
        return 0L;
      }
      Long value = yy.apply(nodeInstanceType);
      if (value == null) {
        return 0L;
      }
      return value;
    };
  }

  private final Comparator<NodeType> nodeSortingComparator =
      (item1, item2) ->
          Comparator.comparing(NodeType::getIsDeprecated)
              .thenComparing(NodeType::getNumCores)
              .thenComparing(NodeType::getMemoryMb)
              .thenComparing(instanceTypeComparator(NodeInstanceType::getLocalDisks))
              .thenComparing(instanceTypeComparator(NodeInstanceType::getLocalDiskSizeGb))
              .thenComparing(instanceTypeComparator(NodeInstanceType::getLocalNvmeDisks))
              .thenComparing(instanceTypeComparator(NodeInstanceType::getLocalNvmeDiskSizeGb))
              .thenComparing(NodeType::getNumGpus)
              .thenComparing(NodeType::getInstanceTypeId)
              .compare(item1, item2);

  private static boolean shouldNodeBeSkipped(NodeType nt) {
    if (nt.getNodeInfo() == null) {
      return false;
    }
    if (nt.getNodeInfo().getStatus() == null) {
      return false;
    }
    for (CloudProviderNodeStatus st : nt.getNodeInfo().getStatus()) {
      if (st == NotAvailableInRegion || st == NotEnabledOnSubscription) {
        return true;
      }
    }
    return false;
  }

  public void ensureClusterIsRunning(String clusterId) throws TimeoutException {
    ClusterInfo info = get(clusterId);
    if (info.getState() == State.TERMINATED) {
      start(clusterId).get();
    } else if (info.getState() == State.TERMINATING) {
      waitGetClusterTerminated(clusterId);
      start(clusterId).get();
    } else if (Arrays.asList(State.PENDING, State.RESIZING, State.RESTARTING)
        .contains(info.getState())) {
      waitGetClusterRunning(clusterId);
    } else if (Arrays.asList(State.ERROR, State.UNKNOWN).contains(info.getState())) {
      throw new RuntimeException(
          "Cluster "
              + info.getClusterName()
              + " is "
              + info.getState()
              + ": "
              + info.getStateMessage());
    }
  }
}
