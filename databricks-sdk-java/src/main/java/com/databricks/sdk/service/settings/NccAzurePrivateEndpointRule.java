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
public class NccAzurePrivateEndpointRule {
  /**
   * The current status of this private endpoint. The private endpoint rules are effective only if
   * the connection state is ESTABLISHED. Remember that you must approve new endpoints on your
   * resources in the Azure portal before they take effect. The possible values are: - INIT:
   * (deprecated) The endpoint has been created and pending approval. - PENDING: The endpoint has
   * been created and pending approval. - ESTABLISHED: The endpoint has been approved and is ready
   * to use in your serverless compute resources. - REJECTED: Connection was rejected by the private
   * link resource owner. - DISCONNECTED: Connection was removed by the private link resource owner,
   * the private endpoint becomes informative and should be deleted for clean-up. - EXPIRED: If the
   * endpoint was created but not approved in 14 days, it will be EXPIRED.
   */
  @JsonProperty("connection_state")
  private NccAzurePrivateEndpointRuleConnectionState connectionState;

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
   * Not used by customer-managed private endpoint services.
   *
   * <p>Domain names of target private link service. When updating this field, the full list of
   * target domain_names must be specified.
   */
  @JsonProperty("domain_names")
  private Collection<String> domainNames;

  /** The name of the Azure private endpoint resource. */
  @JsonProperty("endpoint_name")
  private String endpointName;

  /** */
  @JsonProperty("error_message")
  private String errorMessage;

  /**
   * Only used by private endpoints to Azure first-party services.
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

  /** The ID of a private endpoint rule. */
  @JsonProperty("rule_id")
  private String ruleId;

  /** Time in epoch milliseconds when this object was updated. */
  @JsonProperty("updated_time")
  private Long updatedTime;

  public NccAzurePrivateEndpointRule setConnectionState(
      NccAzurePrivateEndpointRuleConnectionState connectionState) {
    this.connectionState = connectionState;
    return this;
  }

  public NccAzurePrivateEndpointRuleConnectionState getConnectionState() {
    return connectionState;
  }

  public NccAzurePrivateEndpointRule setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public NccAzurePrivateEndpointRule setDeactivated(Boolean deactivated) {
    this.deactivated = deactivated;
    return this;
  }

  public Boolean getDeactivated() {
    return deactivated;
  }

  public NccAzurePrivateEndpointRule setDeactivatedAt(Long deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
    return this;
  }

  public Long getDeactivatedAt() {
    return deactivatedAt;
  }

  public NccAzurePrivateEndpointRule setDomainNames(Collection<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public Collection<String> getDomainNames() {
    return domainNames;
  }

  public NccAzurePrivateEndpointRule setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public NccAzurePrivateEndpointRule setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public NccAzurePrivateEndpointRule setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public String getGroupId() {
    return groupId;
  }

  public NccAzurePrivateEndpointRule setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public NccAzurePrivateEndpointRule setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  public NccAzurePrivateEndpointRule setRuleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  public String getRuleId() {
    return ruleId;
  }

  public NccAzurePrivateEndpointRule setUpdatedTime(Long updatedTime) {
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
    NccAzurePrivateEndpointRule that = (NccAzurePrivateEndpointRule) o;
    return Objects.equals(connectionState, that.connectionState)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(deactivated, that.deactivated)
        && Objects.equals(deactivatedAt, that.deactivatedAt)
        && Objects.equals(domainNames, that.domainNames)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(errorMessage, that.errorMessage)
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
        errorMessage,
        groupId,
        networkConnectivityConfigId,
        resourceId,
        ruleId,
        updatedTime);
  }

  @Override
  public String toString() {
    return new ToStringer(NccAzurePrivateEndpointRule.class)
        .add("connectionState", connectionState)
        .add("creationTime", creationTime)
        .add("deactivated", deactivated)
        .add("deactivatedAt", deactivatedAt)
        .add("domainNames", domainNames)
        .add("endpointName", endpointName)
        .add("errorMessage", errorMessage)
        .add("groupId", groupId)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("resourceId", resourceId)
        .add("ruleId", ruleId)
        .add("updatedTime", updatedTime)
        .toString();
  }
}
