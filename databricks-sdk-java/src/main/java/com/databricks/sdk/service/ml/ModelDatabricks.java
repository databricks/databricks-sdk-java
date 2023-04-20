// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ModelDatabricks {
  /** Creation time of the object, as a Unix timestamp in milliseconds. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /** User-specified description for the object. */
  @JsonProperty("description")
  private String description;

  /** Unique identifier for the object. */
  @JsonProperty("id")
  private String id;

  /** Time of the object at last update, as a Unix timestamp in milliseconds. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** Array of model versions, each the latest version for its stage. */
  @JsonProperty("latest_versions")
  private Collection<ModelVersion> latestVersions;

  /** Name of the model. */
  @JsonProperty("name")
  private String name;

  /**
   * Permission level of the requesting user on the object. For what is allowed at each level, see
   * [MLflow Model permissions](..).
   */
  @JsonProperty("permission_level")
  private PermissionLevel permissionLevel;

  /** Array of tags associated with the model. */
  @JsonProperty("tags")
  private Collection<ModelTag> tags;

  /** The username of the user that created the object. */
  @JsonProperty("user_id")
  private String userId;

  public ModelDatabricks setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ModelDatabricks setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ModelDatabricks setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ModelDatabricks setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public ModelDatabricks setLatestVersions(Collection<ModelVersion> latestVersions) {
    this.latestVersions = latestVersions;
    return this;
  }

  public Collection<ModelVersion> getLatestVersions() {
    return latestVersions;
  }

  public ModelDatabricks setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ModelDatabricks setPermissionLevel(PermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public PermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public ModelDatabricks setTags(Collection<ModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ModelTag> getTags() {
    return tags;
  }

  public ModelDatabricks setUserId(String userId) {
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
    ModelDatabricks that = (ModelDatabricks) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(latestVersions, that.latestVersions)
        && Objects.equals(name, that.name)
        && Objects.equals(permissionLevel, that.permissionLevel)
        && Objects.equals(tags, that.tags)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp,
        description,
        id,
        lastUpdatedTimestamp,
        latestVersions,
        name,
        permissionLevel,
        tags,
        userId);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelDatabricks.class)
        .add("creationTimestamp", creationTimestamp)
        .add("description", description)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("latestVersions", latestVersions)
        .add("name", name)
        .add("permissionLevel", permissionLevel)
        .add("tags", tags)
        .add("userId", userId)
        .toString();
  }
}
