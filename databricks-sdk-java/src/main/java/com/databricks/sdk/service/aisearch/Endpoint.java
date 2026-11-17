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
  /**
   * ID of the serverless budget policy to apply to the endpoint. The caller must have permission to
   * use the policy. Set either this field or `usage_policy_id`, not both. Responses do not echo
   * this field; they report the applied policy in `effective_budget_policy_id`.
   */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /** Time the endpoint was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * User name of the principal that created the endpoint. For a user, it is the user's email
   * address; for any other principal, it is the principal's unique name.
   */
  @JsonProperty("creator")
  private String creator;

  /**
   * Custom tags assigned to the endpoint. On update, the list replaces all of the endpoint's
   * existing tags.
   */
  @JsonProperty("custom_tags")
  private Collection<CustomTag> customTags;

  /** ID of the budget policy that is currently applied to the endpoint. */
  @JsonProperty("effective_budget_policy_id")
  private String effectiveBudgetPolicyId;

  /** Current lifecycle state of the endpoint, with an optional message that explains it. */
  @JsonProperty("endpoint_status")
  private EndpointStatus endpointStatus;

  /** Type of endpoint. Required on create and immutable thereafter. */
  @JsonProperty("endpoint_type")
  private EndpointType endpointType;

  /** System-generated UUID that uniquely identifies the endpoint. */
  @JsonProperty("id")
  private String id;

  /** Number of indexes on the endpoint */
  @JsonProperty("index_count")
  private Long indexCount;

  /** User name of the principal that last updated the endpoint, in the same format as `creator`. */
  @JsonProperty("last_updated_user")
  private String lastUpdatedUser;

  /**
   * Full resource name of the endpoint, in the form
   * `workspaces/{workspace_id}/endpoints/{endpoint_id}`. On create, the server composes it from
   * `parent` and `endpoint_id` and ignores any value supplied in the request body.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The client-supplied desired number of replicas for the endpoint, applied at create/update time.
   * Mutually exclusive with `target_qps`.
   */
  @JsonProperty("replica_count")
  private Long replicaCount;

  /** Scaling information for the endpoint */
  @JsonProperty("scaling_info")
  private EndpointScalingInfo scalingInfo;

  /**
   * Target QPS for the endpoint. Mutually exclusive with `replica_count`. Best-effort; the system
   * does not guarantee this QPS will be achieved. Responses report the requested value in
   * `scaling_info.requested_target_qps`.
   */
  @JsonProperty("target_qps")
  private Long targetQps;

  /** Throughput information for the endpoint */
  @JsonProperty("throughput_info")
  private EndpointThroughputInfo throughputInfo;

  /** Time the endpoint was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /**
   * ID of the usage policy to apply to the endpoint. The server treats it as the same setting as
   * `budget_policy_id`, so set only one of the two.
   */
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
