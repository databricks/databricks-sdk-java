// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

/**
 * A private network gateway connects serverless compute to destinations in a customer-managed VPC
 * or VNet.
 */
@Generated
public class PrivateNetworkGateway {
  /** The AWS connection used by the gateway. */
  @JsonProperty("aws_cloud_connection")
  private PrivateNetworkGatewayAwsCloudConnection awsCloudConnection;

  /** The Azure connection used by the gateway. */
  @JsonProperty("azure_cloud_connection")
  private PrivateNetworkGatewayAzureCloudConnection azureCloudConnection;

  /**
   * The provisioned bandwidth tier for an Azure gateway, in gigabits per second. Required when
   * creating an Azure gateway.
   */
  @JsonProperty("bandwidth_tier_gigabits_per_second")
  private Long bandwidthTierGigabitsPerSecond;

  /** The time when the gateway was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The destinations routed through this gateway. */
  @JsonProperty("destinations")
  private Collection<PrivateNetworkGatewayDestination> destinations;

  /** The human-readable name of the gateway. */
  @JsonProperty("display_name")
  private String displayName;

  /** The failure reason when the gateway is in the FAILED state. */
  @JsonProperty("error_message")
  private String errorMessage;

  /**
   * The canonical resource name of the gateway, in the form
   * `accounts/{account_id}/network-connectivity-configs/{ncc_id}/private-network-gateways/{gateway_id}`.
   */
  @JsonProperty("name")
  private String name;

  /** The DNS resolvers used for private name resolution. */
  @JsonProperty("private_dns_resolvers")
  private Collection<PrivateNetworkGatewayPrivateDnsResolver> privateDnsResolvers;

  /** The current lifecycle state of the gateway. */
  @JsonProperty("state")
  private PrivateNetworkGatewayGatewayState state;

  /** The traffic routed through this gateway. */
  @JsonProperty("traffic_mode")
  private PrivateNetworkGatewayTrafficMode trafficMode;

  /** The time when the gateway was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public PrivateNetworkGateway setAwsCloudConnection(
      PrivateNetworkGatewayAwsCloudConnection awsCloudConnection) {
    this.awsCloudConnection = awsCloudConnection;
    return this;
  }

  public PrivateNetworkGatewayAwsCloudConnection getAwsCloudConnection() {
    return awsCloudConnection;
  }

  public PrivateNetworkGateway setAzureCloudConnection(
      PrivateNetworkGatewayAzureCloudConnection azureCloudConnection) {
    this.azureCloudConnection = azureCloudConnection;
    return this;
  }

  public PrivateNetworkGatewayAzureCloudConnection getAzureCloudConnection() {
    return azureCloudConnection;
  }

  public PrivateNetworkGateway setBandwidthTierGigabitsPerSecond(
      Long bandwidthTierGigabitsPerSecond) {
    this.bandwidthTierGigabitsPerSecond = bandwidthTierGigabitsPerSecond;
    return this;
  }

  public Long getBandwidthTierGigabitsPerSecond() {
    return bandwidthTierGigabitsPerSecond;
  }

  public PrivateNetworkGateway setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public PrivateNetworkGateway setDestinations(
      Collection<PrivateNetworkGatewayDestination> destinations) {
    this.destinations = destinations;
    return this;
  }

  public Collection<PrivateNetworkGatewayDestination> getDestinations() {
    return destinations;
  }

  public PrivateNetworkGateway setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public PrivateNetworkGateway setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public PrivateNetworkGateway setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PrivateNetworkGateway setPrivateDnsResolvers(
      Collection<PrivateNetworkGatewayPrivateDnsResolver> privateDnsResolvers) {
    this.privateDnsResolvers = privateDnsResolvers;
    return this;
  }

  public Collection<PrivateNetworkGatewayPrivateDnsResolver> getPrivateDnsResolvers() {
    return privateDnsResolvers;
  }

  public PrivateNetworkGateway setState(PrivateNetworkGatewayGatewayState state) {
    this.state = state;
    return this;
  }

  public PrivateNetworkGatewayGatewayState getState() {
    return state;
  }

  public PrivateNetworkGateway setTrafficMode(PrivateNetworkGatewayTrafficMode trafficMode) {
    this.trafficMode = trafficMode;
    return this;
  }

  public PrivateNetworkGatewayTrafficMode getTrafficMode() {
    return trafficMode;
  }

  public PrivateNetworkGateway setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateNetworkGateway that = (PrivateNetworkGateway) o;
    return Objects.equals(awsCloudConnection, that.awsCloudConnection)
        && Objects.equals(azureCloudConnection, that.azureCloudConnection)
        && Objects.equals(bandwidthTierGigabitsPerSecond, that.bandwidthTierGigabitsPerSecond)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(destinations, that.destinations)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(name, that.name)
        && Objects.equals(privateDnsResolvers, that.privateDnsResolvers)
        && Objects.equals(state, that.state)
        && Objects.equals(trafficMode, that.trafficMode)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsCloudConnection,
        azureCloudConnection,
        bandwidthTierGigabitsPerSecond,
        createTime,
        destinations,
        displayName,
        errorMessage,
        name,
        privateDnsResolvers,
        state,
        trafficMode,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(PrivateNetworkGateway.class)
        .add("awsCloudConnection", awsCloudConnection)
        .add("azureCloudConnection", azureCloudConnection)
        .add("bandwidthTierGigabitsPerSecond", bandwidthTierGigabitsPerSecond)
        .add("createTime", createTime)
        .add("destinations", destinations)
        .add("displayName", displayName)
        .add("errorMessage", errorMessage)
        .add("name", name)
        .add("privateDnsResolvers", privateDnsResolvers)
        .add("state", state)
        .add("trafficMode", trafficMode)
        .add("updateTime", updateTime)
        .toString();
  }
}
