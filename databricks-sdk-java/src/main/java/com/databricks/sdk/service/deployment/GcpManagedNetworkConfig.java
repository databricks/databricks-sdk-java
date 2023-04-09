// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The network settings for the workspace. The configurations are only for Databricks-managed VPCs.
 * It is ignored if you specify a customer-managed VPC in the `network_id` field.", All the IP range
 * configurations must be mutually exclusive. An attempt to create a workspace fails if Databricks
 * detects an IP range overlap.
 *
 * <p>Specify custom IP ranges in CIDR format. The IP ranges for these fields must not overlap, and
 * all IP addresses must be entirely within the following ranges: `10.0.0.0/8`, `100.64.0.0/10`,
 * `172.16.0.0/12`, `192.168.0.0/16`, and `240.0.0.0/4`.
 *
 * <p>The sizes of these IP ranges affect the maximum number of nodes for the workspace.
 *
 * <p>**Important**: Confirm the IP ranges used by your Databricks workspace before creating the
 * workspace. You cannot change them after your workspace is deployed. If the IP address ranges for
 * your Databricks are too small, IP exhaustion can occur, causing your Databricks jobs to fail. To
 * determine the address range sizes that you need, Databricks provides a calculator as a Microsoft
 * Excel spreadsheet. See [calculate subnet sizes for a new workspace].
 *
 * <p>[calculate subnet sizes for a new workspace]:
 * https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/network-sizing.html
 */
public class GcpManagedNetworkConfig {
  /**
   * The IP range from which to allocate GKE cluster pods. No bigger than `/9` and no smaller than
   * `/21`.
   */
  @JsonProperty("gke_cluster_pod_ip_range")
  private String gkeClusterPodIpRange;

  /**
   * The IP range from which to allocate GKE cluster services. No bigger than `/16` and no smaller
   * than `/27`.
   */
  @JsonProperty("gke_cluster_service_ip_range")
  private String gkeClusterServiceIpRange;

  /**
   * The IP range from which to allocate GKE cluster nodes. No bigger than `/9` and no smaller than
   * `/29`.
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
