// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The Google Cloud specific information for this network (for example, the VPC ID, subnet ID, and
 * secondary IP ranges).
 */
@Generated
class GcpNetworkInfoPb {
  @JsonProperty("network_project_id")
  private String networkProjectId;

  @JsonProperty("pod_ip_range_name")
  private String podIpRangeName;

  @JsonProperty("service_ip_range_name")
  private String serviceIpRangeName;

  @JsonProperty("subnet_id")
  private String subnetId;

  @JsonProperty("subnet_region")
  private String subnetRegion;

  @JsonProperty("vpc_id")
  private String vpcId;

  public GcpNetworkInfoPb setNetworkProjectId(String networkProjectId) {
    this.networkProjectId = networkProjectId;
    return this;
  }

  public String getNetworkProjectId() {
    return networkProjectId;
  }

  public GcpNetworkInfoPb setPodIpRangeName(String podIpRangeName) {
    this.podIpRangeName = podIpRangeName;
    return this;
  }

  public String getPodIpRangeName() {
    return podIpRangeName;
  }

  public GcpNetworkInfoPb setServiceIpRangeName(String serviceIpRangeName) {
    this.serviceIpRangeName = serviceIpRangeName;
    return this;
  }

  public String getServiceIpRangeName() {
    return serviceIpRangeName;
  }

  public GcpNetworkInfoPb setSubnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

  public String getSubnetId() {
    return subnetId;
  }

  public GcpNetworkInfoPb setSubnetRegion(String subnetRegion) {
    this.subnetRegion = subnetRegion;
    return this;
  }

  public String getSubnetRegion() {
    return subnetRegion;
  }

  public GcpNetworkInfoPb setVpcId(String vpcId) {
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
    GcpNetworkInfoPb that = (GcpNetworkInfoPb) o;
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
    return new ToStringer(GcpNetworkInfoPb.class)
        .add("networkProjectId", networkProjectId)
        .add("podIpRangeName", podIpRangeName)
        .add("serviceIpRangeName", serviceIpRangeName)
        .add("subnetId", subnetId)
        .add("subnetRegion", subnetRegion)
        .add("vpcId", vpcId)
        .toString();
  }
}
