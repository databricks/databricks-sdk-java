// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class RegisteredModel {
  /** Timestamp recorded when this `registered_model` was created. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /** Description of this `registered_model`. */
  @JsonProperty("description")
  private String description;

  /** Timestamp recorded when metadata for this `registered_model` was last updated. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /**
   * Collection of latest model versions for each stage. Only contains models with current `READY`
   * status.
   */
  @JsonProperty("latest_versions")
  private Collection<ModelVersion> latestVersions;

  /** Unique name for the model. */
  @JsonProperty("name")
  private String name;

  /** Tags: Additional metadata key-value pairs for this `registered_model`. */
  @JsonProperty("tags")
  private Collection<RegisteredModelTag> tags;

  /** User that created this `registered_model` */
  @JsonProperty("user_id")
  private String userId;

  public RegisteredModel setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public RegisteredModel setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public RegisteredModel setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public RegisteredModel setLatestVersions(Collection<ModelVersion> latestVersions) {
    this.latestVersions = latestVersions;
    return this;
  }

  public Collection<ModelVersion> getLatestVersions() {
    return latestVersions;
  }

  public RegisteredModel setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RegisteredModel setTags(Collection<RegisteredModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<RegisteredModelTag> getTags() {
    return tags;
  }

  public RegisteredModel setUserId(String userId) {
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
    RegisteredModel that = (RegisteredModel) o;
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
    return new ToStringer(RegisteredModel.class)
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
