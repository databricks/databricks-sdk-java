// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class NetworkConnectivityConfiguration {
  /** The Databricks account ID that hosts the credential. */
  @JsonProperty("account_id")
  private String accountId;

  /** Time in epoch milliseconds when this object was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /**
   * The network connectivity rules that apply to network traffic from your serverless compute
   * resources.
   */
  @JsonProperty("egress_config")
  private NccEgressConfig egressConfig;

  /**
   * The name of the network connectivity configuration. The name can contain alphanumeric
   * characters, hyphens, and underscores. The length must be between 3 and 30 characters. The name
   * must match the regular expression `^[0-9a-zA-Z-_]{3,30}$`.
   */
  @JsonProperty("name")
  private String name;

  /** Databricks network connectivity configuration ID. */
  @JsonProperty("network_connectivity_config_id")
  private String networkConnectivityConfigId;

  /**
   * The region for the network connectivity configuration. Only workspaces in the same region can
   * be attached to the network connectivity configuration.
   */
  @JsonProperty("region")
  private String region;

  /** Time in epoch milliseconds when this object was updated. */
  @JsonProperty("updated_time")
  private Long updatedTime;

  public NetworkConnectivityConfiguration setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public NetworkConnectivityConfiguration setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public NetworkConnectivityConfiguration setEgressConfig(NccEgressConfig egressConfig) {
    this.egressConfig = egressConfig;
    return this;
  }

  public NccEgressConfig getEgressConfig() {
    return egressConfig;
  }

  public NetworkConnectivityConfiguration setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public NetworkConnectivityConfiguration setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public NetworkConnectivityConfiguration setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public NetworkConnectivityConfiguration setUpdatedTime(Long updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  public Long getUpdatedTime() {
    return updatedTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NetworkConnectivityConfiguration that = (NetworkConnectivityConfiguration) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(egressConfig, that.egressConfig)
        && Objects.equals(name, that.name)
        && Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(region, that.region)
        && Objects.equals(updatedTime, that.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        creationTime,
        egressConfig,
        name,
        networkConnectivityConfigId,
        region,
        updatedTime);
  }

  @Override
  public String toString() {
    return new ToStringer(NetworkConnectivityConfiguration.class)
        .add("accountId", accountId)
        .add("creationTime", creationTime)
        .add("egressConfig", egressConfig)
        .add("name", name)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("region", region)
        .add("updatedTime", updatedTime)
        .toString();
  }
}
