// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GcpNetworkInfo {
  /** The GCP project ID for network resources. This project is where the VPC and subnet resides. */
  @JsonProperty("network_project_id")
  private String networkProjectId;

  /**
   * Name of the secondary range within the subnet that will be used by GKE as Pod IP range. This is
   * BYO VPC specific. DB VPC uses network.getGcpManagedNetworkConfig.getGkeClusterPodIpRange
   */
  @JsonProperty("pod_ip_range_name")
  private String podIpRangeName;

  /** Name of the secondary range within the subnet that will be used by GKE as Service IP range. */
  @JsonProperty("service_ip_range_name")
  private String serviceIpRangeName;

  /**
   * The customer-provided Subnet ID that will be available to Clusters in Workspaces using this
   * Network.
   */
  @JsonProperty("subnet_id")
  private String subnetId;

  /** */
  @JsonProperty("subnet_region")
  private String subnetRegion;

  /** The customer-provided VPC ID. */
  @JsonProperty("vpc_id")
  private String vpcId;

  public GcpNetworkInfo setNetworkProjectId(String networkProjectId) {
    this.networkProjectId = networkProjectId;
    return this;
  }

  public String getNetworkProjectId() {
    return networkProjectId;
  }

  public GcpNetworkInfo setPodIpRangeName(String podIpRangeName) {
    this.podIpRangeName = podIpRangeName;
    return this;
  }

  public String getPodIpRangeName() {
    return podIpRangeName;
  }

  public GcpNetworkInfo setServiceIpRangeName(String serviceIpRangeName) {
    this.serviceIpRangeName = serviceIpRangeName;
    return this;
  }

  public String getServiceIpRangeName() {
    return serviceIpRangeName;
  }

  public GcpNetworkInfo setSubnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

  public String getSubnetId() {
    return subnetId;
  }

  public GcpNetworkInfo setSubnetRegion(String subnetRegion) {
    this.subnetRegion = subnetRegion;
    return this;
  }

  public String getSubnetRegion() {
    return subnetRegion;
  }

  public GcpNetworkInfo setVpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  public String getVpcId() {
    return vpcId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpNetworkInfo that = (GcpNetworkInfo) o;
    return Objects.equals(networkProjectId, that.networkProjectId)
        && Objects.equals(podIpRangeName, that.podIpRangeName)
        && Objects.equals(serviceIpRangeName, that.serviceIpRangeName)
        && Objects.equals(subnetId, that.subnetId)
        && Objects.equals(subnetRegion, that.subnetRegion)
        && Objects.equals(vpcId, that.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        networkProjectId, podIpRangeName, serviceIpRangeName, subnetId, subnetRegion, vpcId);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpNetworkInfo.class)
        .add("networkProjectId", networkProjectId)
        .add("podIpRangeName", podIpRangeName)
        .add("serviceIpRangeName", serviceIpRangeName)
        .add("subnetId", subnetId)
        .add("subnetRegion", subnetRegion)
        .add("vpcId", vpcId)
        .toString();
  }
}
