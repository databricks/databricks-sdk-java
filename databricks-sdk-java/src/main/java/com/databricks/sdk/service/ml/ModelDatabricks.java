// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ModelDatabricks class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>creationTimestamp</code>.</p>
   *
   * @param creationTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.ModelDatabricks} object
   */
  public ModelDatabricks setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>creationTimestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * <p>Setter for the field <code>description</code>.</p>
   *
   * @param description a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ModelDatabricks} object
   */
  public ModelDatabricks setDescription(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Getter for the field <code>description</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDescription() {
    return description;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ModelDatabricks} object
   */
  public ModelDatabricks setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>lastUpdatedTimestamp</code>.</p>
   *
   * @param lastUpdatedTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.ModelDatabricks} object
   */
  public ModelDatabricks setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastUpdatedTimestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  /**
   * <p>Setter for the field <code>latestVersions</code>.</p>
   *
   * @param latestVersions a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.ModelDatabricks} object
   */
  public ModelDatabricks setLatestVersions(Collection<ModelVersion> latestVersions) {
    this.latestVersions = latestVersions;
    return this;
  }

  /**
   * <p>Getter for the field <code>latestVersions</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ModelVersion> getLatestVersions() {
    return latestVersions;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ModelDatabricks} object
   */
  public ModelDatabricks setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>permissionLevel</code>.</p>
   *
   * @param permissionLevel a {@link com.databricks.sdk.service.ml.PermissionLevel} object
   * @return a {@link com.databricks.sdk.service.ml.ModelDatabricks} object
   */
  public ModelDatabricks setPermissionLevel(PermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  /**
   * <p>Getter for the field <code>permissionLevel</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.PermissionLevel} object
   */
  public PermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  /**
   * <p>Setter for the field <code>tags</code>.</p>
   *
   * @param tags a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.ModelDatabricks} object
   */
  public ModelDatabricks setTags(Collection<ModelTag> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * <p>Getter for the field <code>tags</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ModelTag> getTags() {
    return tags;
  }

  /**
   * <p>Setter for the field <code>userId</code>.</p>
   *
   * @param userId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ModelDatabricks} object
   */
  public ModelDatabricks setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * <p>Getter for the field <code>userId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUserId() {
    return userId;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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
