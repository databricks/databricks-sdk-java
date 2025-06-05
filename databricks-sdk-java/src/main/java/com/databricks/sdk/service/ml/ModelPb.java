// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ModelPb {
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  @JsonProperty("description")
  private String description;

  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  @JsonProperty("latest_versions")
  private Collection<ModelVersion> latestVersions;

  @JsonProperty("name")
  private String name;

  @JsonProperty("tags")
  private Collection<ModelTag> tags;

  @JsonProperty("user_id")
  private String userId;

  public ModelPb setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ModelPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ModelPb setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public ModelPb setLatestVersions(Collection<ModelVersion> latestVersions) {
    this.latestVersions = latestVersions;
    return this;
  }

  public Collection<ModelVersion> getLatestVersions() {
    return latestVersions;
  }

  public ModelPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ModelPb setTags(Collection<ModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ModelTag> getTags() {
    return tags;
  }

  public ModelPb setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelPb that = (ModelPb) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(description, that.description)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(latestVersions, that.latestVersions)
        && Objects.equals(name, that.name)
        && Objects.equals(tags, that.tags)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp, description, lastUpdatedTimestamp, latestVersions, name, tags, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelPb.class)
        .add("creationTimestamp", creationTimestamp)
        .add("description", description)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("latestVersions", latestVersions)
        .add("name", name)
        .add("tags", tags)
        .add("userId", userId)
        .toString();
  }
}
