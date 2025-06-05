// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class EndpointInfoPb {
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  @JsonProperty("creator")
  private String creator;

  @JsonProperty("custom_tags")
  private Collection<CustomTag> customTags;

  @JsonProperty("effective_budget_policy_id")
  private String effectiveBudgetPolicyId;

  @JsonProperty("endpoint_status")
  private EndpointStatus endpointStatus;

  @JsonProperty("endpoint_type")
  private EndpointType endpointType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  @JsonProperty("last_updated_user")
  private String lastUpdatedUser;

  @JsonProperty("name")
  private String name;

  @JsonProperty("num_indexes")
  private Long numIndexes;

  public EndpointInfoPb setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public EndpointInfoPb setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public EndpointInfoPb setCustomTags(Collection<CustomTag> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Collection<CustomTag> getCustomTags() {
    return customTags;
  }

  public EndpointInfoPb setEffectiveBudgetPolicyId(String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  public EndpointInfoPb setEndpointStatus(EndpointStatus endpointStatus) {
    this.endpointStatus = endpointStatus;
    return this;
  }

  public EndpointStatus getEndpointStatus() {
    return endpointStatus;
  }

  public EndpointInfoPb setEndpointType(EndpointType endpointType) {
    this.endpointType = endpointType;
    return this;
  }

  public EndpointType getEndpointType() {
    return endpointType;
  }

  public EndpointInfoPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public EndpointInfoPb setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public EndpointInfoPb setLastUpdatedUser(String lastUpdatedUser) {
    this.lastUpdatedUser = lastUpdatedUser;
    return this;
  }

  public String getLastUpdatedUser() {
    return lastUpdatedUser;
  }

  public EndpointInfoPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EndpointInfoPb setNumIndexes(Long numIndexes) {
    this.numIndexes = numIndexes;
    return this;
  }

  public Long getNumIndexes() {
    return numIndexes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointInfoPb that = (EndpointInfoPb) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(creator, that.creator)
        && Objects.equals(customTags, that.customTags)
        && Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId)
        && Objects.equals(endpointStatus, that.endpointStatus)
        && Objects.equals(endpointType, that.endpointType)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(lastUpdatedUser, that.lastUpdatedUser)
        && Objects.equals(name, that.name)
        && Objects.equals(numIndexes, that.numIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
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
        numIndexes);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointInfoPb.class)
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
        .toString();
  }
}
