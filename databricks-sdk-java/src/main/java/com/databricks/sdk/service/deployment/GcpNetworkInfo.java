// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Google Cloud specific information for this network (for example, the VPC ID, subnet ID, and
 * secondary IP ranges).
 */
public class GcpNetworkInfo {
  /** The Google Cloud project ID of the VPC network. */
  @JsonProperty("network_project_id")
  private String networkProjectId;

  /**
   * The name of the secondary IP range for pods. A Databricks-managed GKE cluster uses this IP
   * range for its pods. This secondary IP range can be used by only one workspace.
   */
  @JsonProperty("pod_ip_range_name")
  private String podIpRangeName;

  /**
   * The name of the secondary IP range for services. A Databricks-managed GKE cluster uses this IP
   * range for its services. This secondary IP range can be used by only one workspace.
   */
  @JsonProperty("service_ip_range_name")
  private String serviceIpRangeName;

  /** The ID of the subnet associated with this network. */
  @JsonProperty("subnet_id")
  private String subnetId;

  /** The Google Cloud region of the workspace data plane (for example, `us-east4`). */
  @JsonProperty("subnet_region")
  private String subnetRegion;

  /**
   * The ID of the VPC associated with this network. VPC IDs can be used in multiple network
   * configurations.
   */
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
}
