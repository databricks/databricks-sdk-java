// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>Model class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Model {
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
  private Collection<ModelTag> tags;

  /** User that created this `registered_model` */
  @JsonProperty("user_id")
  private String userId;

  /**
   * <p>Setter for the field <code>creationTimestamp</code>.</p>
   *
   * @param creationTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.Model} object
   */
  public Model setCreationTimestamp(Long creationTimestamp) {
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
   * @return a {@link com.databricks.sdk.service.ml.Model} object
   */
  public Model setDescription(String description) {
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
   * <p>Setter for the field <code>lastUpdatedTimestamp</code>.</p>
   *
   * @param lastUpdatedTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.Model} object
   */
  public Model setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
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
   * @return a {@link com.databricks.sdk.service.ml.Model} object
   */
  public Model setLatestVersions(Collection<ModelVersion> latestVersions) {
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
   * @return a {@link com.databricks.sdk.service.ml.Model} object
   */
  public Model setName(String name) {
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
   * <p>Setter for the field <code>tags</code>.</p>
   *
   * @param tags a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.Model} object
   */
  public Model setTags(Collection<ModelTag> tags) {
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
   * @return a {@link com.databricks.sdk.service.ml.Model} object
   */
  public Model setUserId(String userId) {
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
    Model that = (Model) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(description, that.description)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(latestVersions, that.latestVersions)
        && Objects.equals(name, that.name)
        && Objects.equals(tags, that.tags)
        && Objects.equals(userId, that.userId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp, description, lastUpdatedTimestamp, latestVersions, name, tags, userId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Model.class)
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
