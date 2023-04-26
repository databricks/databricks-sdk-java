// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>Network class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>accountId</code>.</p>
   *
   * @param accountId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>Getter for the field <code>accountId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * <p>Setter for the field <code>creationTime</code>.</p>
   *
   * @param creationTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>creationTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreationTime() {
    return creationTime;
  }

  /**
   * <p>Setter for the field <code>errorMessages</code>.</p>
   *
   * @param errorMessages a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network setErrorMessages(Collection<NetworkHealth> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  /**
   * <p>Getter for the field <code>errorMessages</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<NetworkHealth> getErrorMessages() {
    return errorMessages;
  }

  /**
   * <p>Setter for the field <code>gcpNetworkInfo</code>.</p>
   *
   * @param gcpNetworkInfo a {@link com.databricks.sdk.service.provisioning.GcpNetworkInfo} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network setGcpNetworkInfo(GcpNetworkInfo gcpNetworkInfo) {
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
   * <p>Setter for the field <code>networkId</code>.</p>
   *
   * @param networkId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  /**
   * <p>Getter for the field <code>networkId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNetworkId() {
    return networkId;
  }

  /**
   * <p>Setter for the field <code>networkName</code>.</p>
   *
   * @param networkName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network setNetworkName(String networkName) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network setSecurityGroupIds(Collection<String> securityGroupIds) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network setSubnetIds(Collection<String> subnetIds) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network setVpcEndpoints(NetworkVpcEndpoints vpcEndpoints) {
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
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network setVpcId(String vpcId) {
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

  /**
   * <p>Setter for the field <code>vpcStatus</code>.</p>
   *
   * @param vpcStatus a {@link com.databricks.sdk.service.provisioning.VpcStatus} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network setVpcStatus(VpcStatus vpcStatus) {
    this.vpcStatus = vpcStatus;
    return this;
  }

  /**
   * <p>Getter for the field <code>vpcStatus</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.VpcStatus} object
   */
  public VpcStatus getVpcStatus() {
    return vpcStatus;
  }

  /**
   * <p>Setter for the field <code>warningMessages</code>.</p>
   *
   * @param warningMessages a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network setWarningMessages(Collection<NetworkWarning> warningMessages) {
    this.warningMessages = warningMessages;
    return this;
  }

  /**
   * <p>Getter for the field <code>warningMessages</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<NetworkWarning> getWarningMessages() {
    return warningMessages;
  }

  /**
   * <p>Setter for the field <code>workspaceId</code>.</p>
   *
   * @param workspaceId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.provisioning.Network} object
   */
  public Network setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * <p>Getter for the field <code>workspaceId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getWorkspaceId() {
    return workspaceId;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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
