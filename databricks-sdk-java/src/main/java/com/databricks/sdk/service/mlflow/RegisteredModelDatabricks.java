// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisteredModelDatabricks {
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
  private java.util.List<ModelVersion> latestVersions;

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
  private java.util.List<RegisteredModelTag> tags;

  /** The username of the user that created the object. */
  @JsonProperty("user_id")
  private String userId;

  public RegisteredModelDatabricks setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public RegisteredModelDatabricks setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public RegisteredModelDatabricks setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public RegisteredModelDatabricks setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public RegisteredModelDatabricks setLatestVersions(java.util.List<ModelVersion> latestVersions) {
    this.latestVersions = latestVersions;
    return this;
  }

  public java.util.List<ModelVersion> getLatestVersions() {
    return latestVersions;
  }

  public RegisteredModelDatabricks setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RegisteredModelDatabricks setPermissionLevel(PermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public PermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public RegisteredModelDatabricks setTags(java.util.List<RegisteredModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public java.util.List<RegisteredModelTag> getTags() {
    return tags;
  }

  public RegisteredModelDatabricks setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }
}
