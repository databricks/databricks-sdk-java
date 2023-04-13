// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class Network {
  /** The Databricks account ID associated with this network configuration. */
  @JsonProperty("account_id")
  private String accountId;

  /** Time in epoch milliseconds when the network was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /** Array of error messages about the network configuration. */
  @JsonProperty("error_messages")
  private Collection<NetworkHealth> errorMessages;

  /**
   * The Google Cloud specific information for this network (for example, the VPC ID, subnet ID, and
   * secondary IP ranges).
   */
  @JsonProperty("gcp_network_info")
  private GcpNetworkInfo gcpNetworkInfo;

  /** The Databricks network configuration ID. */
  @JsonProperty("network_id")
  private String networkId;

  /** The human-readable name of the network configuration. */
  @JsonProperty("network_name")
  private String networkName;

  /** */
  @JsonProperty("security_group_ids")
  private Collection<String> securityGroupIds;

  /** */
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
   * The ID of the VPC associated with this network configuration. VPC IDs can be used in multiple
   * networks.
   */
  @JsonProperty("vpc_id")
  private String vpcId;

  /** This describes an enum */
  @JsonProperty("vpc_status")
  private VpcStatus vpcStatus;

  /** Array of warning messages about the network configuration. */
  @JsonProperty("warning_messages")
  private Collection<NetworkWarning> warningMessages;

  /** Workspace ID associated with this network configuration. */
  @JsonProperty("workspace_id")
  private Long workspaceId;

  public Network setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public Network setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public Network setErrorMessages(Collection<NetworkHealth> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public Collection<NetworkHealth> getErrorMessages() {
    return errorMessages;
  }

  public Network setGcpNetworkInfo(GcpNetworkInfo gcpNetworkInfo) {
    this.gcpNetworkInfo = gcpNetworkInfo;
    return this;
  }

  public GcpNetworkInfo getGcpNetworkInfo() {
    return gcpNetworkInfo;
  }

  public Network setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  public String getNetworkId() {
    return networkId;
  }

  public Network setNetworkName(String networkName) {
    this.networkName = networkName;
    return this;
  }

  public String getNetworkName() {
    return networkName;
  }

  public Network setSecurityGroupIds(Collection<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public Collection<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  public Network setSubnetIds(Collection<String> subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }

  public Collection<String> getSubnetIds() {
    return subnetIds;
  }

  public Network setVpcEndpoints(NetworkVpcEndpoints vpcEndpoints) {
    this.vpcEndpoints = vpcEndpoints;
    return this;
  }

  public NetworkVpcEndpoints getVpcEndpoints() {
    return vpcEndpoints;
  }

  public Network setVpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  public String getVpcId() {
    return vpcId;
  }

  public Network setVpcStatus(VpcStatus vpcStatus) {
    this.vpcStatus = vpcStatus;
    return this;
  }

  public VpcStatus getVpcStatus() {
    return vpcStatus;
  }

  public Network setWarningMessages(Collection<NetworkWarning> warningMessages) {
    this.warningMessages = warningMessages;
    return this;
  }

  public Collection<NetworkWarning> getWarningMessages() {
    return warningMessages;
  }

  public Network setWorkspaceId(Long workspaceId) {
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
    Network that = (Network) o;
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
    return new ToStringer(Network.class)
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
