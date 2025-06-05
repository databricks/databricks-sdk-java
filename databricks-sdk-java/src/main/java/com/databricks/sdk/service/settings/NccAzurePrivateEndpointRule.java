// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

/**
 * Properties of the new private endpoint rule. Note that you must approve the endpoint in Azure
 * portal after initialization.
 */
@Generated
@JsonSerialize(using = NccAzurePrivateEndpointRule.NccAzurePrivateEndpointRuleSerializer.class)
@JsonDeserialize(using = NccAzurePrivateEndpointRule.NccAzurePrivateEndpointRuleDeserializer.class)
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
  private NccAzurePrivateEndpointRuleConnectionState connectionState;

  /** Time in epoch milliseconds when this object was created. */
  private Long creationTime;

  /** Whether this private endpoint is deactivated. */
  private Boolean deactivated;

  /** Time in epoch milliseconds when this object was deactivated. */
  private Long deactivatedAt;

  /**
   * Not used by customer-managed private endpoint services.
   *
   * <p>Domain names of target private link service. When updating this field, the full list of
   * target domain_names must be specified.
   */
  private Collection<String> domainNames;

  /** The name of the Azure private endpoint resource. */
  private String endpointName;

  /**
   * Only used by private endpoints to Azure first-party services.
   *
   * <p>The sub-resource type (group ID) of the target resource. Note that to connect to workspace
   * root storage (root DBFS), you need two endpoints, one for blob and one for dfs.
   */
  private String groupId;

  /**
   * The ID of a network connectivity configuration, which is the parent resource of this private
   * endpoint rule object.
   */
  private String networkConnectivityConfigId;

  /** The Azure resource ID of the target resource. */
  private String resourceId;

  /** The ID of a private endpoint rule. */
  private String ruleId;

  /** Time in epoch milliseconds when this object was updated. */
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
    return new ToStringer(NccAzurePrivateEndpointRule.class)
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

  NccAzurePrivateEndpointRulePb toPb() {
    NccAzurePrivateEndpointRulePb pb = new NccAzurePrivateEndpointRulePb();
    pb.setConnectionState(connectionState);
    pb.setCreationTime(creationTime);
    pb.setDeactivated(deactivated);
    pb.setDeactivatedAt(deactivatedAt);
    pb.setDomainNames(domainNames);
    pb.setEndpointName(endpointName);
    pb.setGroupId(groupId);
    pb.setNetworkConnectivityConfigId(networkConnectivityConfigId);
    pb.setResourceId(resourceId);
    pb.setRuleId(ruleId);
    pb.setUpdatedTime(updatedTime);

    return pb;
  }

  static NccAzurePrivateEndpointRule fromPb(NccAzurePrivateEndpointRulePb pb) {
    NccAzurePrivateEndpointRule model = new NccAzurePrivateEndpointRule();
    model.setConnectionState(pb.getConnectionState());
    model.setCreationTime(pb.getCreationTime());
    model.setDeactivated(pb.getDeactivated());
    model.setDeactivatedAt(pb.getDeactivatedAt());
    model.setDomainNames(pb.getDomainNames());
    model.setEndpointName(pb.getEndpointName());
    model.setGroupId(pb.getGroupId());
    model.setNetworkConnectivityConfigId(pb.getNetworkConnectivityConfigId());
    model.setResourceId(pb.getResourceId());
    model.setRuleId(pb.getRuleId());
    model.setUpdatedTime(pb.getUpdatedTime());

    return model;
  }

  public static class NccAzurePrivateEndpointRuleSerializer
      extends JsonSerializer<NccAzurePrivateEndpointRule> {
    @Override
    public void serialize(
        NccAzurePrivateEndpointRule value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NccAzurePrivateEndpointRulePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NccAzurePrivateEndpointRuleDeserializer
      extends JsonDeserializer<NccAzurePrivateEndpointRule> {
    @Override
    public NccAzurePrivateEndpointRule deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NccAzurePrivateEndpointRulePb pb = mapper.readValue(p, NccAzurePrivateEndpointRulePb.class);
      return NccAzurePrivateEndpointRule.fromPb(pb);
    }
  }
}
