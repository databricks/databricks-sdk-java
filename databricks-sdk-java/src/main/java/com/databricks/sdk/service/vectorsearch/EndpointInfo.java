// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EndpointInfo {
  /** The user-selected budget policy id for the endpoint. */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /** Time at which the endpoint was created, in milliseconds since the Unix epoch. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /**
   * User or service principal that created the endpoint. Users are identified by username and
   * service principals by application ID.
   */
  @JsonProperty("creator")
  private String creator;

  /** The custom tags assigned to the endpoint */
  @JsonProperty("custom_tags")
  private Collection<CustomTag> customTags;

  /**
   * Budget policy ID in effect for the endpoint. This is the policy set on the endpoint when one
   * was set, and otherwise the default budget policy.
   */
  @JsonProperty("effective_budget_policy_id")
  private String effectiveBudgetPolicyId;

  /** Current status of the endpoint */
  @JsonProperty("endpoint_status")
  private EndpointStatus endpointStatus;

  /**
   * Type of the endpoint. See
   * https://docs.databricks.com/aws/en/ai-search/ai-search#endpoint-options for how the types
   * differ.
   */
  @JsonProperty("endpoint_type")
  private EndpointType endpointType;

  /** Unique identifier of the endpoint */
  @JsonProperty("id")
  private String id;

  /** Time at which the endpoint was last updated, in milliseconds since the Unix epoch. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** User or service principal that last updated the endpoint, in the same form as creator. */
  @JsonProperty("last_updated_user")
  private String lastUpdatedUser;

  /** Name of the AI Search endpoint */
  @JsonProperty("name")
  private String name;

  /** Number of indexes on the endpoint */
  @JsonProperty("num_indexes")
  private Long numIndexes;

  /**
   * Scaling information for the endpoint. Present only for STANDARD endpoints that have a Target
   * QPS set.
   */
  @JsonProperty("scaling_info")
  private EndpointScalingInfo scalingInfo;

  public EndpointInfo setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public EndpointInfo setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public EndpointInfo setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public EndpointInfo setCustomTags(Collection<CustomTag> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Collection<CustomTag> getCustomTags() {
    return customTags;
  }

  public EndpointInfo setEffectiveBudgetPolicyId(String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  public EndpointInfo setEndpointStatus(EndpointStatus endpointStatus) {
    this.endpointStatus = endpointStatus;
    return this;
  }

  public EndpointStatus getEndpointStatus() {
    return endpointStatus;
  }

  public EndpointInfo setEndpointType(EndpointType endpointType) {
    this.endpointType = endpointType;
    return this;
  }

  public EndpointType getEndpointType() {
    return endpointType;
  }

  public EndpointInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public EndpointInfo setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public EndpointInfo setLastUpdatedUser(String lastUpdatedUser) {
    this.lastUpdatedUser = lastUpdatedUser;
    return this;
  }

  public String getLastUpdatedUser() {
    return lastUpdatedUser;
  }

  public EndpointInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EndpointInfo setNumIndexes(Long numIndexes) {
    this.numIndexes = numIndexes;
    return this;
  }

  public Long getNumIndexes() {
    return numIndexes;
  }

  public EndpointInfo setScalingInfo(EndpointScalingInfo scalingInfo) {
    this.scalingInfo = scalingInfo;
    return this;
  }

  public EndpointScalingInfo getScalingInfo() {
    return scalingInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointInfo that = (EndpointInfo) o;
    return Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(creator, that.creator)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId)
        && Objects.equals(endpointStatus, that.endpointStatus)
        && Objects.equals(endpointType, that.endpointType)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(lastUpdatedUser, that.lastUpdatedUser)
        && Objects.equals(name, that.name)
        && Objects.equals(numIndexes, that.numIndexes)
        && Objects.equals(scalingInfo, that.scalingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        budgetPolicyId,
        creationTimestamp,
        creator,
        customTags,
        effectiveBudgetPolicyId,
        endpointStatus,
        endpointType,
        id,
        lastUpdatedTimestamp,
        lastUpdatedUser,
        name,
        numIndexes,
        scalingInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointInfo.class)
        .add("budgetPolicyId", budgetPolicyId)
        .add("creationTimestamp", creationTimestamp)
        .add("creator", creator)
        .add("customTags", customTags)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
        .add("endpointStatus", endpointStatus)
        .add("endpointType", endpointType)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("lastUpdatedUser", lastUpdatedUser)
        .add("name", name)
        .add("numIndexes", numIndexes)
        .add("scalingInfo", scalingInfo)
        .toString();
  }
}
