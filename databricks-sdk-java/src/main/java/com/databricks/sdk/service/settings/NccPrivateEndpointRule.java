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
public class NccPrivateEndpointRule {
  /** Databricks account ID. You can find your account ID from the Accounts Console. */
  @JsonProperty("account_id")
  private String accountId;

  /**
   * The current status of this private endpoint. The private endpoint rules are effective only if
   * the connection state is ESTABLISHED. Remember that you must approve new endpoints on your
   * resources in the Cloud console before they take effect. The possible values are: - PENDING: The
   * endpoint has been created and pending approval. - ESTABLISHED: The endpoint has been approved
   * and is ready to use in your serverless compute resources. - REJECTED: Connection was rejected
   * by the private link resource owner. - DISCONNECTED: Connection was removed by the private link
   * resource owner, the private endpoint becomes informative and should be deleted for clean-up. -
   * EXPIRED: If the endpoint was created but not approved in 14 days, it will be EXPIRED.
   */
  @JsonProperty("connection_state")
  private NccPrivateEndpointRulePrivateLinkConnectionState connectionState;

  /** Time in epoch milliseconds when this object was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /** Whether this private endpoint is deactivated. */
  @JsonProperty("deactivated")
  private Boolean deactivated;

  /** Time in epoch milliseconds when this object was deactivated. */
  @JsonProperty("deactivated_at")
  private Long deactivatedAt;

  /**
   * Only used by private endpoints to customer-managed private endpoint services.
   *
   * <p>Domain names of target private link service. When updating this field, the full list of
   * target domain_names must be specified.
   */
  @JsonProperty("domain_names")
  private Collection<String> domainNames;

  /**
   * Only used by private endpoints towards an AWS S3 service.
   *
   * <p>Update this field to activate/deactivate this private endpoint to allow egress access from
   * serverless compute resources.
   */
  @JsonProperty("enabled")
  private Boolean enabled;

  /** The name of the Azure private endpoint resource. */
  @JsonProperty("endpoint_name")
  private String endpointName;

  /**
   * The full target AWS endpoint service name that connects to the destination resources of the
   * private endpoint.
   */
  @JsonProperty("endpoint_service")
  private String endpointService;

  /**
   * Not used by customer-managed private endpoint services.
   *
   * <p>The sub-resource type (group ID) of the target resource. Note that to connect to workspace
   * root storage (root DBFS), you need two endpoints, one for blob and one for dfs.
   */
  @JsonProperty("group_id")
  private String groupId;

  /**
   * The ID of a network connectivity configuration, which is the parent resource of this private
   * endpoint rule object.
   */
  @JsonProperty("network_connectivity_config_id")
  private String networkConnectivityConfigId;

  /** The Azure resource ID of the target resource. */
  @JsonProperty("resource_id")
  private String resourceId;

  /**
   * Only used by private endpoints towards AWS S3 service.
   *
   * <p>The globally unique S3 bucket names that will be accessed via the VPC endpoint. The bucket
   * names must be in the same region as the NCC/endpoint service. When updating this field, we
   * perform full update on this field. Please ensure a full list of desired resource_names is
   * provided.
   */
  @JsonProperty("resource_names")
  private Collection<String> resourceNames;

  /** The ID of a private endpoint rule. */
  @JsonProperty("rule_id")
  private String ruleId;

  /** Time in epoch milliseconds when this object was updated. */
  @JsonProperty("updated_time")
  private Long updatedTime;

  /**
   * The AWS VPC endpoint ID. You can use this ID to identify the VPC endpoint created by
   * Databricks.
   */
  @JsonProperty("vpc_endpoint_id")
  private String vpcEndpointId;

  public NccPrivateEndpointRule setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public NccPrivateEndpointRule setConnectionState(
      NccPrivateEndpointRulePrivateLinkConnectionState connectionState) {
    this.connectionState = connectionState;
    return this;
  }

  public NccPrivateEndpointRulePrivateLinkConnectionState getConnectionState() {
    return connectionState;
  }

  public NccPrivateEndpointRule setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public NccPrivateEndpointRule setDeactivated(Boolean deactivated) {
    this.deactivated = deactivated;
    return this;
  }

  public Boolean getDeactivated() {
    return deactivated;
  }

  public NccPrivateEndpointRule setDeactivatedAt(Long deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
    return this;
  }

  public Long getDeactivatedAt() {
    return deactivatedAt;
  }

  public NccPrivateEndpointRule setDomainNames(Collection<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public Collection<String> getDomainNames() {
    return domainNames;
  }

  public NccPrivateEndpointRule setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public NccPrivateEndpointRule setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public NccPrivateEndpointRule setEndpointService(String endpointService) {
    this.endpointService = endpointService;
    return this;
  }

  public String getEndpointService() {
    return endpointService;
  }

  public NccPrivateEndpointRule setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public String getGroupId() {
    return groupId;
  }

  public NccPrivateEndpointRule setNetworkConnectivityConfigId(String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public NccPrivateEndpointRule setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  public NccPrivateEndpointRule setResourceNames(Collection<String> resourceNames) {
    this.resourceNames = resourceNames;
    return this;
  }

  public Collection<String> getResourceNames() {
    return resourceNames;
  }

  public NccPrivateEndpointRule setRuleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  public String getRuleId() {
    return ruleId;
  }

  public NccPrivateEndpointRule setUpdatedTime(Long updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  public Long getUpdatedTime() {
    return updatedTime;
  }

  public NccPrivateEndpointRule setVpcEndpointId(String vpcEndpointId) {
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
    NccPrivateEndpointRule that = (NccPrivateEndpointRule) o;
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
    return new ToStringer(NccPrivateEndpointRule.class)
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
