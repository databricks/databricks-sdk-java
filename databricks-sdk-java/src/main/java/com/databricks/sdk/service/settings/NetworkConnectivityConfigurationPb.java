// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Properties of the new network connectivity configuration. */
@Generated
class NetworkConnectivityConfigurationPb {
  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("creation_time")
  private Long creationTime;

  @JsonProperty("egress_config")
  private NccEgressConfig egressConfig;

  @JsonProperty("name")
  private String name;

  @JsonProperty("network_connectivity_config_id")
  private String networkConnectivityConfigId;

  @JsonProperty("region")
  private String region;

  @JsonProperty("updated_time")
  private Long updatedTime;

  public NetworkConnectivityConfigurationPb setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public NetworkConnectivityConfigurationPb setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public NetworkConnectivityConfigurationPb setEgressConfig(NccEgressConfig egressConfig) {
    this.egressConfig = egressConfig;
    return this;
  }

  public NccEgressConfig getEgressConfig() {
    return egressConfig;
  }

  public NetworkConnectivityConfigurationPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public NetworkConnectivityConfigurationPb setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public NetworkConnectivityConfigurationPb setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public NetworkConnectivityConfigurationPb setUpdatedTime(Long updatedTime) {
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
    NetworkConnectivityConfigurationPb that = (NetworkConnectivityConfigurationPb) o;
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
    return new ToStringer(NetworkConnectivityConfigurationPb.class)
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
