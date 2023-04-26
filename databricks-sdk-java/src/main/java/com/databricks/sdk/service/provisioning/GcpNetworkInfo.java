// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The Google Cloud specific information for this network (for example, the VPC ID, subnet ID, and
 * secondary IP ranges).
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
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

  /**
   * <p>Setter for the field <code>networkProjectId</code>.</p>
   *
   * @param networkProjectId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.GcpNetworkInfo} object
   */
  public GcpNetworkInfo setNetworkProjectId(String networkProjectId) {
    this.networkProjectId = networkProjectId;
    return this;
  }

  /**
   * <p>Getter for the field <code>networkProjectId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNetworkProjectId() {
    return networkProjectId;
  }

  /**
   * <p>Setter for the field <code>podIpRangeName</code>.</p>
   *
   * @param podIpRangeName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.GcpNetworkInfo} object
   */
  public GcpNetworkInfo setPodIpRangeName(String podIpRangeName) {
    this.podIpRangeName = podIpRangeName;
    return this;
  }

  /**
   * <p>Getter for the field <code>podIpRangeName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPodIpRangeName() {
    return podIpRangeName;
  }

  /**
   * <p>Setter for the field <code>serviceIpRangeName</code>.</p>
   *
   * @param serviceIpRangeName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.GcpNetworkInfo} object
   */
  public GcpNetworkInfo setServiceIpRangeName(String serviceIpRangeName) {
    this.serviceIpRangeName = serviceIpRangeName;
    return this;
  }

  /**
   * <p>Getter for the field <code>serviceIpRangeName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getServiceIpRangeName() {
    return serviceIpRangeName;
  }

  /**
   * <p>Setter for the field <code>subnetId</code>.</p>
   *
   * @param subnetId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.GcpNetworkInfo} object
   */
  public GcpNetworkInfo setSubnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

  /**
   * <p>Getter for the field <code>subnetId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSubnetId() {
    return subnetId;
  }

  /**
   * <p>Setter for the field <code>subnetRegion</code>.</p>
   *
   * @param subnetRegion a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.GcpNetworkInfo} object
   */
  public GcpNetworkInfo setSubnetRegion(String subnetRegion) {
    this.subnetRegion = subnetRegion;
    return this;
  }

  /**
   * <p>Getter for the field <code>subnetRegion</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSubnetRegion() {
    return subnetRegion;
  }

  /**
   * <p>Setter for the field <code>vpcId</code>.</p>
   *
   * @param vpcId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.GcpNetworkInfo} object
   */
  public GcpNetworkInfo setVpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  /**
   * <p>Getter for the field <code>vpcId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getVpcId() {
    return vpcId;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        networkProjectId, podIpRangeName, serviceIpRangeName, subnetId, subnetRegion, vpcId);
  }

  /** {@inheritDoc} */
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
