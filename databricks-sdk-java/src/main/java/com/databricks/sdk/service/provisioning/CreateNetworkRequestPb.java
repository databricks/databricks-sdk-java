// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CreateNetworkRequestPb {
  @JsonProperty("gcp_network_info")
  private GcpNetworkInfo gcpNetworkInfo;

  @JsonProperty("network_name")
  private String networkName;

  @JsonProperty("security_group_ids")
  private Collection<String> securityGroupIds;

  @JsonProperty("subnet_ids")
  private Collection<String> subnetIds;

  @JsonProperty("vpc_endpoints")
  private NetworkVpcEndpoints vpcEndpoints;

  @JsonProperty("vpc_id")
  private String vpcId;

  public CreateNetworkRequestPb setGcpNetworkInfo(GcpNetworkInfo gcpNetworkInfo) {
    this.gcpNetworkInfo = gcpNetworkInfo;
    return this;
  }

  public GcpNetworkInfo getGcpNetworkInfo() {
    return gcpNetworkInfo;
  }

  public CreateNetworkRequestPb setNetworkName(String networkName) {
    this.networkName = networkName;
    return this;
  }

  public String getNetworkName() {
    return networkName;
  }

  public CreateNetworkRequestPb setSecurityGroupIds(Collection<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public Collection<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  public CreateNetworkRequestPb setSubnetIds(Collection<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public Collection<String> getSubnetIds() {
    return subnetIds;
  }

  public CreateNetworkRequestPb setVpcEndpoints(NetworkVpcEndpoints vpcEndpoints) {
    this.vpcEndpoints = vpcEndpoints;
    return this;
  }

  public NetworkVpcEndpoints getVpcEndpoints() {
    return vpcEndpoints;
  }

  public CreateNetworkRequestPb setVpcId(String vpcId) {
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
    CreateNetworkRequestPb that = (CreateNetworkRequestPb) o;
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
    return new ToStringer(CreateNetworkRequestPb.class)
        .add("gcpNetworkInfo", gcpNetworkInfo)
        .add("networkName", networkName)
        .add("securityGroupIds", securityGroupIds)
        .add("subnetIds", subnetIds)
        .add("vpcEndpoints", vpcEndpoints)
        .add("vpcId", vpcId)
        .toString();
  }
}
