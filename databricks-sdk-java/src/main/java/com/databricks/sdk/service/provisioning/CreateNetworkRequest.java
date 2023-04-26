// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>CreateNetworkRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateNetworkRequest {
  /**
   * The Google Cloud specific information for this network (for example, the VPC ID, subnet ID, and
   * secondary IP ranges).
   */
  @JsonProperty("gcp_network_info")
  private GcpNetworkInfo gcpNetworkInfo;

  /** The human-readable name of the network configuration. */
  @JsonProperty("network_name")
  private String networkName;

  /**
   * IDs of one to five security groups associated with this network. Security group IDs **cannot**
   * be used in multiple network configurations.
   */
  @JsonProperty("security_group_ids")
  private Collection<String> securityGroupIds;

  /**
   * IDs of at least two subnets associated with this network. Subnet IDs **cannot** be used in
   * multiple network configurations.
   */
  @JsonProperty("subnet_ids")
  private Collection<String> subnetIds;

  /**
   * If specified, contains the VPC endpoints used to allow cluster communication from this VPC over
   * [AWS PrivateLink].
   *
   * <p>[AWS PrivateLink]: https://aws.amazon.com/privatelink/
   */
  @JsonProperty("vpc_endpoints")
  private NetworkVpcEndpoints vpcEndpoints;

  /**
   * The ID of the VPC associated with this network. VPC IDs can be used in multiple network
   * configurations.
   */
  @JsonProperty("vpc_id")
  private String vpcId;

  /**
   * <p>Setter for the field <code>gcpNetworkInfo</code>.</p>
   *
   * @param gcpNetworkInfo a {@link com.databricks.sdk.service.provisioning.GcpNetworkInfo} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateNetworkRequest} object
   */
  public CreateNetworkRequest setGcpNetworkInfo(GcpNetworkInfo gcpNetworkInfo) {
    this.gcpNetworkInfo = gcpNetworkInfo;
    return this;
  }

  /**
   * <p>Getter for the field <code>gcpNetworkInfo</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.GcpNetworkInfo} object
   */
  public GcpNetworkInfo getGcpNetworkInfo() {
    return gcpNetworkInfo;
  }

  /**
   * <p>Setter for the field <code>networkName</code>.</p>
   *
   * @param networkName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateNetworkRequest} object
   */
  public CreateNetworkRequest setNetworkName(String networkName) {
    this.networkName = networkName;
    return this;
  }

  /**
   * <p>Getter for the field <code>networkName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNetworkName() {
    return networkName;
  }

  /**
   * <p>Setter for the field <code>securityGroupIds</code>.</p>
   *
   * @param securityGroupIds a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateNetworkRequest} object
   */
  public CreateNetworkRequest setSecurityGroupIds(Collection<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  /**
   * <p>Getter for the field <code>securityGroupIds</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  /**
   * <p>Setter for the field <code>subnetIds</code>.</p>
   *
   * @param subnetIds a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateNetworkRequest} object
   */
  public CreateNetworkRequest setSubnetIds(Collection<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  /**
   * <p>Getter for the field <code>subnetIds</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getSubnetIds() {
    return subnetIds;
  }

  /**
   * <p>Setter for the field <code>vpcEndpoints</code>.</p>
   *
   * @param vpcEndpoints a {@link com.databricks.sdk.service.provisioning.NetworkVpcEndpoints} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateNetworkRequest} object
   */
  public CreateNetworkRequest setVpcEndpoints(NetworkVpcEndpoints vpcEndpoints) {
    this.vpcEndpoints = vpcEndpoints;
    return this;
  }

  /**
   * <p>Getter for the field <code>vpcEndpoints</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.NetworkVpcEndpoints} object
   */
  public NetworkVpcEndpoints getVpcEndpoints() {
    return vpcEndpoints;
  }

  /**
   * <p>Setter for the field <code>vpcId</code>.</p>
   *
   * @param vpcId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.CreateNetworkRequest} object
   */
  public CreateNetworkRequest setVpcId(String vpcId) {
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
    CreateNetworkRequest that = (CreateNetworkRequest) o;
    return Objects.equals(gcpNetworkInfo, that.gcpNetworkInfo)
        && Objects.equals(networkName, that.networkName)
        && Objects.equals(securityGroupIds, that.securityGroupIds)
        && Objects.equals(subnetIds, that.subnetIds)
        && Objects.equals(vpcEndpoints, that.vpcEndpoints)
        && Objects.equals(vpcId, that.vpcId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        gcpNetworkInfo, networkName, securityGroupIds, subnetIds, vpcEndpoints, vpcId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateNetworkRequest.class)
        .add("gcpNetworkInfo", gcpNetworkInfo)
        .add("networkName", networkName)
        .add("securityGroupIds", securityGroupIds)
        .add("subnetIds", subnetIds)
        .add("vpcEndpoints", vpcEndpoints)
        .add("vpcId", vpcId)
        .toString();
  }
}
