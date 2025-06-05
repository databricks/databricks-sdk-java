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
class NccPrivateEndpointRulePb {
  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("connection_state")
  private NccPrivateEndpointRulePrivateLinkConnectionState connectionState;

  @JsonProperty("creation_time")
  private Long creationTime;

  @JsonProperty("deactivated")
  private Boolean deactivated;

  @JsonProperty("deactivated_at")
  private Long deactivatedAt;

  @JsonProperty("domain_names")
  private Collection<String> domainNames;

  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("endpoint_name")
  private String endpointName;

  @JsonProperty("endpoint_service")
  private String endpointService;

  @JsonProperty("group_id")
  private String groupId;

  @JsonProperty("network_connectivity_config_id")
  private String networkConnectivityConfigId;

  @JsonProperty("resource_id")
  private String resourceId;

  @JsonProperty("resource_names")
  private Collection<String> resourceNames;

  @JsonProperty("rule_id")
  private String ruleId;

  @JsonProperty("updated_time")
  private Long updatedTime;

  @JsonProperty("vpc_endpoint_id")
  private String vpcEndpointId;

  public NccPrivateEndpointRulePb setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public NccPrivateEndpointRulePb setConnectionState(
      NccPrivateEndpointRulePrivateLinkConnectionState connectionState) {
    this.connectionState = connectionState;
    return this;
  }

  public NccPrivateEndpointRulePrivateLinkConnectionState getConnectionState() {
    return connectionState;
  }

  public NccPrivateEndpointRulePb setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public NccPrivateEndpointRulePb setDeactivated(Boolean deactivated) {
    this.deactivated = deactivated;
    return this;
  }

  public Boolean getDeactivated() {
    return deactivated;
  }

  public NccPrivateEndpointRulePb setDeactivatedAt(Long deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
    return this;
  }

  public Long getDeactivatedAt() {
    return deactivatedAt;
  }

  public NccPrivateEndpointRulePb setDomainNames(Collection<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public Collection<String> getDomainNames() {
    return domainNames;
  }

  public NccPrivateEndpointRulePb setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public NccPrivateEndpointRulePb setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public NccPrivateEndpointRulePb setEndpointService(String endpointService) {
    this.endpointService = endpointService;
    return this;
  }

  public String getEndpointService() {
    return endpointService;
  }

  public NccPrivateEndpointRulePb setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public String getGroupId() {
    return groupId;
  }

  public NccPrivateEndpointRulePb setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public NccPrivateEndpointRulePb setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  public NccPrivateEndpointRulePb setResourceNames(Collection<String> resourceNames) {
    this.resourceNames = resourceNames;
    return this;
  }

  public Collection<String> getResourceNames() {
    return resourceNames;
  }

  public NccPrivateEndpointRulePb setRuleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  public String getRuleId() {
    return ruleId;
  }

  public NccPrivateEndpointRulePb setUpdatedTime(Long updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  public Long getUpdatedTime() {
    return updatedTime;
  }

  public NccPrivateEndpointRulePb setVpcEndpointId(String vpcEndpointId) {
    this.vpcEndpointId = vpcEndpointId;
    return this;
  }

  public String getVpcEndpointId() {
    return vpcEndpointId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NccPrivateEndpointRulePb that = (NccPrivateEndpointRulePb) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(connectionState, that.connectionState)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(deactivated, that.deactivated)
        && Objects.equals(deactivatedAt, that.deactivatedAt)
        && Objects.equals(domainNames, that.domainNames)
        && Objects.equals(enabled, that.enabled)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(endpointService, that.endpointService)
        && Objects.equals(groupId, that.groupId)
        && Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(resourceId, that.resourceId)
        && Objects.equals(resourceNames, that.resourceNames)
        && Objects.equals(ruleId, that.ruleId)
        && Objects.equals(updatedTime, that.updatedTime)
        && Objects.equals(vpcEndpointId, that.vpcEndpointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        connectionState,
        creationTime,
        deactivated,
        deactivatedAt,
        domainNames,
        enabled,
        endpointName,
        endpointService,
        groupId,
        networkConnectivityConfigId,
        resourceId,
        resourceNames,
        ruleId,
        updatedTime,
        vpcEndpointId);
  }

  @Override
  public String toString() {
    return new ToStringer(NccPrivateEndpointRulePb.class)
        .add("accountId", accountId)
        .add("connectionState", connectionState)
        .add("creationTime", creationTime)
        .add("deactivated", deactivated)
        .add("deactivatedAt", deactivatedAt)
        .add("domainNames", domainNames)
        .add("enabled", enabled)
        .add("endpointName", endpointName)
        .add("endpointService", endpointService)
        .add("groupId", groupId)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("resourceId", resourceId)
        .add("resourceNames", resourceNames)
        .add("ruleId", ruleId)
        .add("updatedTime", updatedTime)
        .add("vpcEndpointId", vpcEndpointId)
        .toString();
  }
}
