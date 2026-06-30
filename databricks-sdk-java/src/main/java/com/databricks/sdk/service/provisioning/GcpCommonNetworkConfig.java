// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The shared network config for GCP workspace. This object has common network configurations that
 * are network attributions of a workspace. DEPRECATED. Use GkeConfig instead.
 */
@Generated
public class GcpCommonNetworkConfig {
  /**
   * The IP range that will be used to allocate GKE cluster master resources from. This field must
   * not be set if gke_cluster_type=PUBLIC_NODE_PUBLIC_MASTER.
   */
  @JsonProperty("gke_cluster_master_ip_range")
  private String gkeClusterMasterIpRange;

  /** The type of network connectivity of the GKE cluster. */
  @JsonProperty("gke_connectivity_type")
  private GkeConfigConnectivityType gkeConnectivityType;

  public GcpCommonNetworkConfig setGkeClusterMasterIpRange(String gkeClusterMasterIpRange) {
    this.gkeClusterMasterIpRange = gkeClusterMasterIpRange;
    return this;
  }

  public String getGkeClusterMasterIpRange() {
    return gkeClusterMasterIpRange;
  }

  public GcpCommonNetworkConfig setGkeConnectivityType(
      GkeConfigConnectivityType gkeConnectivityType) {
    this.gkeConnectivityType = gkeConnectivityType;
    return this;
  }

  public GkeConfigConnectivityType getGkeConnectivityType() {
    return gkeConnectivityType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpCommonNetworkConfig that = (GcpCommonNetworkConfig) o;
    return Objects.equals(gkeClusterMasterIpRange, that.gkeClusterMasterIpRange)
        && Objects.equals(gkeConnectivityType, that.gkeConnectivityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gkeClusterMasterIpRange, gkeConnectivityType);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpCommonNetworkConfig.class)
        .add("gkeClusterMasterIpRange", gkeClusterMasterIpRange)
        .add("gkeConnectivityType", gkeConnectivityType)
        .toString();
  }
}
