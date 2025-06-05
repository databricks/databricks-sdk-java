// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Properties of the new private endpoint rule. Note that you must approve the endpoint in Azure
 * portal after initialization.
 */
@Generated
class NccAzurePrivateEndpointRulePb {
  @JsonProperty("connection_state")
  private NccAzurePrivateEndpointRuleConnectionState connectionState;

  @JsonProperty("creation_time")
  private Long creationTime;

  @JsonProperty("deactivated")
  private Boolean deactivated;

  @JsonProperty("deactivated_at")
  private Long deactivatedAt;

  @JsonProperty("domain_names")
  private Collection<String> domainNames;

  @JsonProperty("endpoint_name")
  private String endpointName;

  @JsonProperty("group_id")
  private String groupId;

  @JsonProperty("network_connectivity_config_id")
  private String networkConnectivityConfigId;

  @JsonProperty("resource_id")
  private String resourceId;

  @JsonProperty("rule_id")
  private String ruleId;

  @JsonProperty("updated_time")
  private Long updatedTime;

  public NccAzurePrivateEndpointRulePb setConnectionState(
      NccAzurePrivateEndpointRuleConnectionState connectionState) {
    this.connectionState = connectionState;
    return this;
  }

  public NccAzurePrivateEndpointRuleConnectionState getConnectionState() {
    return connectionState;
  }

  public NccAzurePrivateEndpointRulePb setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public NccAzurePrivateEndpointRulePb setDeactivated(Boolean deactivated) {
    this.deactivated = deactivated;
    return this;
  }

  public Boolean getDeactivated() {
    return deactivated;
  }

  public NccAzurePrivateEndpointRulePb setDeactivatedAt(Long deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
    return this;
  }

  public Long getDeactivatedAt() {
    return deactivatedAt;
  }

  public NccAzurePrivateEndpointRulePb setDomainNames(Collection<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public Collection<String> getDomainNames() {
    return domainNames;
  }

  public NccAzurePrivateEndpointRulePb setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public NccAzurePrivateEndpointRulePb setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public String getGroupId() {
    return groupId;
  }

  public NccAzurePrivateEndpointRulePb setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public NccAzurePrivateEndpointRulePb setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  public NccAzurePrivateEndpointRulePb setRuleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  public String getRuleId() {
    return ruleId;
  }

  public NccAzurePrivateEndpointRulePb setUpdatedTime(Long updatedTime) {
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
    NccAzurePrivateEndpointRulePb that = (NccAzurePrivateEndpointRulePb) o;
    return Objects.equals(connectionState, that.connectionState)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(deactivated, that.deactivated)
        && Objects.equals(deactivatedAt, that.deactivatedAt)
        && Objects.equals(domainNames, that.domainNames)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(groupId, that.groupId)
        && Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(resourceId, that.resourceId)
        && Objects.equals(ruleId, that.ruleId)
        && Objects.equals(updatedTime, that.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        connectionState,
        creationTime,
        deactivated,
        deactivatedAt,
        domainNames,
        endpointName,
        groupId,
        networkConnectivityConfigId,
        resourceId,
        ruleId,
        updatedTime);
  }

  @Override
  public String toString() {
    return new ToStringer(NccAzurePrivateEndpointRulePb.class)
        .add("connectionState", connectionState)
        .add("creationTime", creationTime)
        .add("deactivated", deactivated)
        .add("deactivatedAt", deactivatedAt)
        .add("domainNames", domainNames)
        .add("endpointName", endpointName)
        .add("groupId", groupId)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("resourceId", resourceId)
        .add("ruleId", ruleId)
        .add("updatedTime", updatedTime)
        .toString();
  }
}
