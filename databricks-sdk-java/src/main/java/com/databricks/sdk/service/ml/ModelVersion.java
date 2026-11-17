// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * A version of a registered model in the Workspace Model Registry. Each version points to the model
 * artifacts it was registered from and moves through the stages `None`, `Staging`, `Production` and
 * `Archived`.
 */
@Generated
public class ModelVersion {
  /** Time when the model version was created, as a Unix timestamp in milliseconds. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /**
   * Current stage of the model version. Valid values are `None`, `Staging`, `Production` and
   * `Archived`. A new model version starts in `None`.
   */
  @JsonProperty("current_stage")
  private String currentStage;

  /** User-provided description of the model version. */
  @JsonProperty("description")
  private String description;

  /**
   * Time when the metadata of the model version was last updated, as a Unix timestamp in
   * milliseconds.
   */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** Name of the registered model that the version belongs to. */
  @JsonProperty("name")
  private String name;

  /**
   * ID of the MLflow run that produced the model artifacts, if `source` comes from a run in the
   * MLflow tracking server.
   */
  @JsonProperty("run_id")
  private String runId;

  /**
   * URL of the MLflow run that generated the model version, as given in the create request. It is
   * typically set when the run is hosted on a different tracking server than the registry.
   */
  @JsonProperty("run_link")
  private String runLink;

  /**
   * URI of the model artifacts that the model version was registered from, as given in the create
   * request.
   */
  @JsonProperty("source")
  private String source;

  /**
   * Registration status of the model version. The version can be used once the status is `READY`.
   */
  @JsonProperty("status")
  private ModelVersionStatus status;

  /** Details on the current `status`, such as the reason why registration failed. */
  @JsonProperty("status_message")
  private String statusMessage;

  /** Key-value tags attached to the model version. */
  @JsonProperty("tags")
  private Collection<ModelVersionTag> tags;

  /** User that created this `model_version`. */
  @JsonProperty("user_id")
  private String userId;

  /**
   * Version number of the model version, as a string. Version numbers start at 1 for each
   * registered model.
   */
  @JsonProperty("version")
  private String version;

  public ModelVersion setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ModelVersion setCurrentStage(String currentStage) {
    this.currentStage = currentStage;
    return this;
  }

  public String getCurrentStage() {
    return currentStage;
  }

  public ModelVersion setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ModelVersion setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public ModelVersion setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ModelVersion setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public ModelVersion setRunLink(String runLink) {
    this.runLink = runLink;
    return this;
  }

  public String getRunLink() {
    return runLink;
  }

  public ModelVersion setSource(String source) {
    this.source = source;
    return this;
  }

  public String getSource() {
    return source;
  }

  public ModelVersion setStatus(ModelVersionStatus status) {
    this.status = status;
    return this;
  }

  public ModelVersionStatus getStatus() {
    return status;
  }

  public ModelVersion setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  public ModelVersion setTags(Collection<ModelVersionTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ModelVersionTag> getTags() {
    return tags;
  }

  public ModelVersion setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  public ModelVersion setVersion(String version) {
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
    ModelVersion that = (ModelVersion) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(currentStage, that.currentStage)
        && Objects.equals(description, that.description)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(name, that.name)
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
    return new ToStringer(ModelVersion.class)
        .add("creationTimestamp", creationTimestamp)
        .add("currentStage", currentStage)
        .add("description", description)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("name", name)
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
