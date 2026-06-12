// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

/**
 * An AI Search endpoint — compute infrastructure that hosts AI Search indexes and serves queries
 * against them. Customers create, query, and delete endpoints; the system manages provisioning,
 * scaling, and health status.
 */
@Generated
public class Endpoint {
  /** The user-selected budget policy id for the endpoint. */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /** Time the endpoint was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Creator of the endpoint */
  @JsonProperty("creator")
  private String creator;

  /** The custom tags assigned to the endpoint */
  @JsonProperty("custom_tags")
  private Collection<CustomTag> customTags;

  /** The budget policy id applied to the endpoint */
  @JsonProperty("effective_budget_policy_id")
  private String effectiveBudgetPolicyId;

  /** Current status of the endpoint */
  @JsonProperty("endpoint_status")
  private EndpointStatus endpointStatus;

  /** Type of endpoint. Required on create and immutable thereafter. */
  @JsonProperty("endpoint_type")
  private EndpointType endpointType;

  /** Unique identifier of the endpoint */
  @JsonProperty("id")
  private String id;

  /** Number of indexes on the endpoint */
  @JsonProperty("index_count")
  private Long indexCount;

  /** User who last updated the endpoint */
  @JsonProperty("last_updated_user")
  private String lastUpdatedUser;

  /**
   * Name of the AI Search endpoint. Server-assigned full resource path ({@code
   * workspaces/{workspace}/endpoints/{endpoint}}) on output. On create, the user-supplied short
   * name is conveyed via {@code CreateEndpointRequest.endpoint_id}; the server composes the full
   * {@code name} and returns it on the response.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The client-supplied desired number of replicas for the endpoint, applied at create/update time.
   * Mutually exclusive with {@code target_qps}.
   */
  @JsonProperty("replica_count")
  private Long replicaCount;

  /** Scaling information for the endpoint */
  @JsonProperty("scaling_info")
  private EndpointScalingInfo scalingInfo;

  /**
   * Target QPS for the endpoint. Mutually exclusive with {@code replica_count}. Best-effort; the
   * system does not guarantee this QPS will be achieved.
   */
  @JsonProperty("target_qps")
  private Long targetQps;

  /** Throughput information for the endpoint */
  @JsonProperty("throughput_info")
  private EndpointThroughputInfo throughputInfo;

  /** Time the endpoint was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** The usage policy id applied to the endpoint. */
  @JsonProperty("usage_policy_id")
  private String usagePolicyId;

  public Endpoint setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public Endpoint setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Endpoint setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public Endpoint setCustomTags(Collection<CustomTag> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Collection<CustomTag> getCustomTags() {
    return customTags;
  }

  public Endpoint setEffectiveBudgetPolicyId(String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  public Endpoint setEndpointStatus(EndpointStatus endpointStatus) {
    this.endpointStatus = endpointStatus;
    return this;
  }

  public EndpointStatus getEndpointStatus() {
    return endpointStatus;
  }

  public Endpoint setEndpointType(EndpointType endpointType) {
    this.endpointType = endpointType;
    return this;
  }

  public EndpointType getEndpointType() {
    return endpointType;
  }

  public Endpoint setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Endpoint setIndexCount(Long indexCount) {
    this.indexCount = indexCount;
    return this;
  }

  public Long getIndexCount() {
    return indexCount;
  }

  public Endpoint setLastUpdatedUser(String lastUpdatedUser) {
    this.lastUpdatedUser = lastUpdatedUser;
    return this;
  }

  public String getLastUpdatedUser() {
    return lastUpdatedUser;
  }

  public Endpoint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Endpoint setReplicaCount(Long replicaCount) {
    this.replicaCount = replicaCount;
    return this;
  }

  public Long getReplicaCount() {
    return replicaCount;
  }

  public Endpoint setScalingInfo(EndpointScalingInfo scalingInfo) {
    this.scalingInfo = scalingInfo;
    return this;
  }

  public EndpointScalingInfo getScalingInfo() {
    return scalingInfo;
  }

  public Endpoint setTargetQps(Long targetQps) {
    this.targetQps = targetQps;
    return this;
  }

  public Long getTargetQps() {
    return targetQps;
  }

  public Endpoint setThroughputInfo(EndpointThroughputInfo throughputInfo) {
    this.throughputInfo = throughputInfo;
    return this;
  }

  public EndpointThroughputInfo getThroughputInfo() {
    return throughputInfo;
  }

  public Endpoint setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public Endpoint setUsagePolicyId(String usagePolicyId) {
    this.usagePolicyId = usagePolicyId;
    return this;
  }

  public String getUsagePolicyId() {
    return usagePolicyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Endpoint that = (Endpoint) o;
    return Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId)
        && Objects.equals(endpointStatus, that.endpointStatus)
        && Objects.equals(endpointType, that.endpointType)
        && Objects.equals(id, that.id)
        && Objects.equals(indexCount, that.indexCount)
        && Objects.equals(lastUpdatedUser, that.lastUpdatedUser)
        && Objects.equals(name, that.name)
        && Objects.equals(replicaCount, that.replicaCount)
        && Objects.equals(scalingInfo, that.scalingInfo)
        && Objects.equals(targetQps, that.targetQps)
        && Objects.equals(throughputInfo, that.throughputInfo)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(usagePolicyId, that.usagePolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        budgetPolicyId,
        createTime,
        creator,
        customTags,
        effectiveBudgetPolicyId,
        endpointStatus,
        endpointType,
        id,
        indexCount,
        lastUpdatedUser,
        name,
        replicaCount,
        scalingInfo,
        targetQps,
        throughputInfo,
        updateTime,
        usagePolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(Endpoint.class)
        .add("budgetPolicyId", budgetPolicyId)
        .add("createTime", createTime)
        .add("creator", creator)
        .add("customTags", customTags)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
        .add("endpointStatus", endpointStatus)
        .add("endpointType", endpointType)
        .add("id", id)
        .add("indexCount", indexCount)
        .add("lastUpdatedUser", lastUpdatedUser)
        .add("name", name)
        .add("replicaCount", replicaCount)
        .add("scalingInfo", scalingInfo)
        .add("targetQps", targetQps)
        .add("throughputInfo", throughputInfo)
        .add("updateTime", updateTime)
        .add("usagePolicyId", usagePolicyId)
        .toString();
  }
}
