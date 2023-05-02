// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
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

  public CreateNetworkRequest setGcpNetworkInfo(GcpNetworkInfo gcpNetworkInfo) {
    this.gcpNetworkInfo = gcpNetworkInfo;
    return this;
  }

  public GcpNetworkInfo getGcpNetworkInfo() {
    return gcpNetworkInfo;
  }

  public CreateNetworkRequest setNetworkName(String networkName) {
    this.networkName = networkName;
    return this;
  }

  public String getNetworkName() {
    return networkName;
  }

  public CreateNetworkRequest setSecurityGroupIds(Collection<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public Collection<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  public CreateNetworkRequest setSubnetIds(Collection<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public Collection<String> getSubnetIds() {
    return subnetIds;
  }

  public CreateNetworkRequest setVpcEndpoints(NetworkVpcEndpoints vpcEndpoints) {
    this.vpcEndpoints = vpcEndpoints;
    return this;
  }

  public NetworkVpcEndpoints getVpcEndpoints() {
    return vpcEndpoints;
  }

  public CreateNetworkRequest setVpcId(String vpcId) {
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
    CreateNetworkRequest that = (CreateNetworkRequest) o;
    return Objects.equals(gcpNetworkInfo, that.gcpNetworkInfo)
        && Objects.equals(networkName, that.networkName)
        && Objects.equals(securityGroupIds, that.securityGroupIds)
        && Objects.equals(subnetIds, that.subnetIds)
        && Objects.equals(vpcEndpoints, that.vpcEndpoints)
        && Objects.equals(vpcId, that.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        gcpNetworkInfo, networkName, securityGroupIds, subnetIds, vpcEndpoints, vpcId);
  }

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
