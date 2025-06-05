// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Properties of the new private endpoint rule. Note that for private endpoints towards a VPC
 * endpoint service behind a customer-managed NLB, you must approve the endpoint in AWS console
 * after initialization.
 */
@Generated
class CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb {
  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("connection_state")
  private CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePrivateLinkConnectionState
      connectionState;

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

  @JsonProperty("endpoint_service")
  private String endpointService;

  @JsonProperty("network_connectivity_config_id")
  private String networkConnectivityConfigId;

  @JsonProperty("resource_names")
  private Collection<String> resourceNames;

  @JsonProperty("rule_id")
  private String ruleId;

  @JsonProperty("updated_time")
  private Long updatedTime;

  @JsonProperty("vpc_endpoint_id")
  private String vpcEndpointId;

  public CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb setAccountId(
      String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb setConnectionState(
      CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePrivateLinkConnectionState
          connectionState) {
    this.connectionState = connectionState;
    return this;
  }

  public CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePrivateLinkConnectionState
      getConnectionState() {
    return connectionState;
  }

  public CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb setCreationTime(
      Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb setDeactivated(
      Boolean deactivated) {
    this.deactivated = deactivated;
    return this;
  }

  public Boolean getDeactivated() {
    return deactivated;
  }

  public CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb setDeactivatedAt(
      Long deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
    return this;
  }

  public Long getDeactivatedAt() {
    return deactivatedAt;
  }

  public CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb setDomainNames(
      Collection<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public Collection<String> getDomainNames() {
    return domainNames;
  }

  public CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb setEnabled(
      Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb setEndpointService(
      String endpointService) {
    this.endpointService = endpointService;
    return this;
  }

  public String getEndpointService() {
    return endpointService;
  }

  public CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb
      setNetworkConnectivityConfigId(String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb setResourceNames(
      Collection<String> resourceNames) {
    this.resourceNames = resourceNames;
    return this;
  }

  public Collection<String> getResourceNames() {
    return resourceNames;
  }

  public CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb setRuleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  public String getRuleId() {
    return ruleId;
  }

  public CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb setUpdatedTime(
      Long updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  public Long getUpdatedTime() {
    return updatedTime;
  }

  public CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb setVpcEndpointId(
      String vpcEndpointId) {
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
    CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb that =
        (CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(connectionState, that.connectionState)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(deactivated, that.deactivated)
        && Objects.equals(deactivatedAt, that.deactivatedAt)
        && Objects.equals(domainNames, that.domainNames)
        && Objects.equals(enabled, that.enabled)
        && Objects.equals(endpointService, that.endpointService)
        && Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
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
        endpointService,
        networkConnectivityConfigId,
        resourceNames,
        ruleId,
        updatedTime,
        vpcEndpointId);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRulePb.class)
        .add("accountId", accountId)
        .add("connectionState", connectionState)
        .add("creationTime", creationTime)
        .add("deactivated", deactivated)
        .add("deactivatedAt", deactivatedAt)
        .add("domainNames", domainNames)
        .add("enabled", enabled)
        .add("endpointService", endpointService)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("resourceNames", resourceNames)
        .add("ruleId", ruleId)
        .add("updatedTime", updatedTime)
        .add("vpcEndpointId", vpcEndpointId)
        .toString();
  }
}
