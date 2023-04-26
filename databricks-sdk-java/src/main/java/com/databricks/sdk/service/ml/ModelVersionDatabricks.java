// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ModelVersionDatabricks class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ModelVersionDatabricks {
  /** Creation time of the object, as a Unix timestamp in milliseconds. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /** This describes an enum */
  @JsonProperty("current_stage")
  private Stage currentStage;

  /** User-specified description for the object. */
  @JsonProperty("description")
  private String description;

  /** Time of the object at last update, as a Unix timestamp in milliseconds. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** Name of the model. */
  @JsonProperty("name")
  private String name;

  /**
   * Permission level of the requesting user on the object. For what is allowed at each level, see
   * [MLflow Model permissions](..).
   */
  @JsonProperty("permission_level")
  private PermissionLevel permissionLevel;

  /** Unique identifier for the MLflow tracking run associated with the source model artifacts. */
  @JsonProperty("run_id")
  private String runId;

  /**
   * URL of the run associated with the model artifacts. This field is set at model version creation
   * time only for model versions whose source run is from a tracking server that is different from
   * the registry server.
   */
  @JsonProperty("run_link")
  private String runLink;

  /**
   * URI that indicates the location of the source model artifacts. This is used when creating the
   * model version.
   */
  @JsonProperty("source")
  private String source;

  /** This describes an enum */
  @JsonProperty("status")
  private Status status;

  /** Details on the current status, for example why registration failed. */
  @JsonProperty("status_message")
  private String statusMessage;

  /** Array of tags that are associated with the model version. */
  @JsonProperty("tags")
  private Collection<ModelVersionTag> tags;

  /** The username of the user that created the object. */
  @JsonProperty("user_id")
  private String userId;

  /** Version of the model. */
  @JsonProperty("version")
  private String version;

  /**
   * <p>Setter for the field <code>creationTimestamp</code>.</p>
   *
   * @param creationTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks setCreationTimestamp(Long creationTimestamp) {
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
   * <p>Setter for the field <code>currentStage</code>.</p>
   *
   * @param currentStage a {@link com.databricks.sdk.service.ml.Stage} object
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks setCurrentStage(Stage currentStage) {
    this.currentStage = currentStage;
    return this;
  }

  /**
   * <p>Getter for the field <code>currentStage</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.Stage} object
   */
  public Stage getCurrentStage() {
    return currentStage;
  }

  /**
   * <p>Setter for the field <code>description</code>.</p>
   *
   * @param description a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks setDescription(String description) {
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
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
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
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks setPermissionLevel(PermissionLevel permissionLevel) {
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
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * <p>Getter for the field <code>runId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunId() {
    return runId;
  }

  /**
   * <p>Setter for the field <code>runLink</code>.</p>
   *
   * @param runLink a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks setRunLink(String runLink) {
    this.runLink = runLink;
    return this;
  }

  /**
   * <p>Getter for the field <code>runLink</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunLink() {
    return runLink;
  }

  /**
   * <p>Setter for the field <code>source</code>.</p>
   *
   * @param source a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks setSource(String source) {
    this.source = source;
    return this;
  }

  /**
   * <p>Getter for the field <code>source</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSource() {
    return source;
  }

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.databricks.sdk.service.ml.Status} object
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks setStatus(Status status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.Status} object
   */
  public Status getStatus() {
    return status;
  }

  /**
   * <p>Setter for the field <code>statusMessage</code>.</p>
   *
   * @param statusMessage a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * <p>Getter for the field <code>statusMessage</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStatusMessage() {
    return statusMessage;
  }

  /**
   * <p>Setter for the field <code>tags</code>.</p>
   *
   * @param tags a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks setTags(Collection<ModelVersionTag> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * <p>Getter for the field <code>tags</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ModelVersionTag> getTags() {
    return tags;
  }

  /**
   * <p>Setter for the field <code>userId</code>.</p>
   *
   * @param userId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks setUserId(String userId) {
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

  /**
   * <p>Setter for the field <code>version</code>.</p>
   *
   * @param version a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ModelVersionDatabricks} object
   */
  public ModelVersionDatabricks setVersion(String version) {
    this.version = version;
    return this;
  }

  /**
   * <p>Getter for the field <code>version</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getVersion() {
    return version;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelVersionDatabricks that = (ModelVersionDatabricks) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(currentStage, that.currentStage)
        && Objects.equals(description, that.description)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(name, that.name)
        && Objects.equals(permissionLevel, that.permissionLevel)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runLink, that.runLink)
        && Objects.equals(source, that.source)
        && Objects.equals(status, that.status)
        && Objects.equals(statusMessage, that.statusMessage)
        && Objects.equals(tags, that.tags)
        && Objects.equals(userId, that.userId)
        && Objects.equals(version, that.version);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp,
        currentStage,
        description,
        lastUpdatedTimestamp,
        name,
        permissionLevel,
        runId,
        runLink,
        source,
        status,
        statusMessage,
        tags,
        userId,
        version);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ModelVersionDatabricks.class)
        .add("creationTimestamp", creationTimestamp)
        .add("currentStage", currentStage)
        .add("description", description)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("name", name)
        .add("permissionLevel", permissionLevel)
        .add("runId", runId)
        .add("runLink", runLink)
        .add("source", source)
        .add("status", status)
        .add("statusMessage", statusMessage)
        .add("tags", tags)
        .add("userId", userId)
        .add("version", version)
        .toString();
  }
}
