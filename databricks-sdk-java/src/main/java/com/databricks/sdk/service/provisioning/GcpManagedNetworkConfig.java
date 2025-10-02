// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The network configuration for the workspace. */
@Generated
public class GcpManagedNetworkConfig {
  /** The IP range that will be used to allocate GKE cluster Pods from. */
  @JsonProperty("gke_cluster_pod_ip_range")
  private String gkeClusterPodIpRange;

  /** The IP range that will be used to allocate GKE cluster Services from. */
  @JsonProperty("gke_cluster_service_ip_range")
  private String gkeClusterServiceIpRange;

  /**
   * The IP range which will be used to allocate GKE cluster nodes from. Note: Pods, services and
   * master IP range must be mutually exclusive.
   */
  @JsonProperty("subnet_cidr")
  private String subnetCidr;

  public GcpManagedNetworkConfig setGkeClusterPodIpRange(String gkeClusterPodIpRange) {
    this.gkeClusterPodIpRange = gkeClusterPodIpRange;
    return this;
  }

  public String getGkeClusterPodIpRange() {
    return gkeClusterPodIpRange;
  }

  public GcpManagedNetworkConfig setGkeClusterServiceIpRange(String gkeClusterServiceIpRange) {
    this.gkeClusterServiceIpRange = gkeClusterServiceIpRange;
    return this;
  }

  public String getGkeClusterServiceIpRange() {
    return gkeClusterServiceIpRange;
  }

  public GcpManagedNetworkConfig setSubnetCidr(String subnetCidr) {
    this.subnetCidr = subnetCidr;
    return this;
  }

  public String getSubnetCidr() {
    return subnetCidr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpManagedNetworkConfig that = (GcpManagedNetworkConfig) o;
    return Objects.equals(gkeClusterPodIpRange, that.gkeClusterPodIpRange)
        && Objects.equals(gkeClusterServiceIpRange, that.gkeClusterServiceIpRange)
        && Objects.equals(subnetCidr, that.subnetCidr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gkeClusterPodIpRange, gkeClusterServiceIpRange, subnetCidr);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpManagedNetworkConfig.class)
        .add("gkeClusterPodIpRange", gkeClusterPodIpRange)
        .add("gkeClusterServiceIpRange", gkeClusterServiceIpRange)
        .add("subnetCidr", subnetCidr)
        .toString();
  }
}
