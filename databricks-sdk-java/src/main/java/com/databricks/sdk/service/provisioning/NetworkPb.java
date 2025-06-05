// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class NetworkPb {
  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("creation_time")
  private Long creationTime;

  @JsonProperty("error_messages")
  private Collection<NetworkHealth> errorMessages;

  @JsonProperty("gcp_network_info")
  private GcpNetworkInfo gcpNetworkInfo;

  @JsonProperty("network_id")
  private String networkId;

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

  @JsonProperty("vpc_status")
  private VpcStatus vpcStatus;

  @JsonProperty("warning_messages")
  private Collection<NetworkWarning> warningMessages;

  @JsonProperty("workspace_id")
  private Long workspaceId;

  public NetworkPb setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public NetworkPb setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public NetworkPb setErrorMessages(Collection<NetworkHealth> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public Collection<NetworkHealth> getErrorMessages() {
    return errorMessages;
  }

  public NetworkPb setGcpNetworkInfo(GcpNetworkInfo gcpNetworkInfo) {
    this.gcpNetworkInfo = gcpNetworkInfo;
    return this;
  }

  public GcpNetworkInfo getGcpNetworkInfo() {
    return gcpNetworkInfo;
  }

  public NetworkPb setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  public String getNetworkId() {
    return networkId;
  }

  public NetworkPb setNetworkName(String networkName) {
    this.networkName = networkName;
    return this;
  }

  public String getNetworkName() {
    return networkName;
  }

  public NetworkPb setSecurityGroupIds(Collection<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public Collection<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  public NetworkPb setSubnetIds(Collection<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public Collection<String> getSubnetIds() {
    return subnetIds;
  }

  public NetworkPb setVpcEndpoints(NetworkVpcEndpoints vpcEndpoints) {
    this.vpcEndpoints = vpcEndpoints;
    return this;
  }

  public NetworkVpcEndpoints getVpcEndpoints() {
    return vpcEndpoints;
  }

  public NetworkPb setVpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  public String getVpcId() {
    return vpcId;
  }

  public NetworkPb setVpcStatus(VpcStatus vpcStatus) {
    this.vpcStatus = vpcStatus;
    return this;
  }

  public VpcStatus getVpcStatus() {
    return vpcStatus;
  }

  public NetworkPb setWarningMessages(Collection<NetworkWarning> warningMessages) {
    this.warningMessages = warningMessages;
    return this;
  }

  public Collection<NetworkWarning> getWarningMessages() {
    return warningMessages;
  }

  public NetworkPb setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NetworkPb that = (NetworkPb) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(errorMessages, that.errorMessages)
        && Objects.equals(gcpNetworkInfo, that.gcpNetworkInfo)
        && Objects.equals(networkId, that.networkId)
        && Objects.equals(networkName, that.networkName)
        && Objects.equals(securityGroupIds, that.securityGroupIds)
        && Objects.equals(subnetIds, that.subnetIds)
        && Objects.equals(vpcEndpoints, that.vpcEndpoints)
        && Objects.equals(vpcId, that.vpcId)
        && Objects.equals(vpcStatus, that.vpcStatus)
        && Objects.equals(warningMessages, that.warningMessages)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        creationTime,
        errorMessages,
        gcpNetworkInfo,
        networkId,
        networkName,
        securityGroupIds,
        subnetIds,
        vpcEndpoints,
        vpcId,
        vpcStatus,
        warningMessages,
        workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(NetworkPb.class)
        .add("accountId", accountId)
        .add("creationTime", creationTime)
        .add("errorMessages", errorMessages)
        .add("gcpNetworkInfo", gcpNetworkInfo)
        .add("networkId", networkId)
        .add("networkName", networkName)
        .add("securityGroupIds", securityGroupIds)
        .add("subnetIds", subnetIds)
        .add("vpcEndpoints", vpcEndpoints)
        .add("vpcId", vpcId)
        .add("vpcStatus", vpcStatus)
        .add("warningMessages", warningMessages)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
