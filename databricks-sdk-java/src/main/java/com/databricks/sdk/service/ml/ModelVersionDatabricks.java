// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
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

  public ModelVersionDatabricks setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ModelVersionDatabricks setCurrentStage(Stage currentStage) {
    this.currentStage = currentStage;
    return this;
  }

  public Stage getCurrentStage() {
    return currentStage;
  }

  public ModelVersionDatabricks setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ModelVersionDatabricks setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public ModelVersionDatabricks setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ModelVersionDatabricks setPermissionLevel(PermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public PermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public ModelVersionDatabricks setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public ModelVersionDatabricks setRunLink(String runLink) {
    this.runLink = runLink;
    return this;
  }

  public String getRunLink() {
    return runLink;
  }

  public ModelVersionDatabricks setSource(String source) {
    this.source = source;
    return this;
  }

  public String getSource() {
    return source;
  }

  public ModelVersionDatabricks setStatus(Status status) {
    this.status = status;
    return this;
  }

  public Status getStatus() {
    return status;
  }

  public ModelVersionDatabricks setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  public ModelVersionDatabricks setTags(Collection<ModelVersionTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ModelVersionTag> getTags() {
    return tags;
  }

  public ModelVersionDatabricks setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  public ModelVersionDatabricks setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

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
