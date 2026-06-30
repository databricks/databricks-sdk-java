// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A LoggedModelInfo includes logged model attributes, tags, and registration info. */
@Generated
public class LoggedModelInfo {
  /** The URI of the directory where model artifacts are stored. */
  @JsonProperty("artifact_uri")
  private String artifactUri;

  /** The timestamp when the model was created in milliseconds since the UNIX epoch. */
  @JsonProperty("creation_timestamp_ms")
  private Long creationTimestampMs;

  /** The ID of the user or principal that created the model. */
  @JsonProperty("creator_id")
  private Long creatorId;

  /** The ID of the experiment that owns the model. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /** The timestamp when the model was last updated in milliseconds since the UNIX epoch. */
  @JsonProperty("last_updated_timestamp_ms")
  private Long lastUpdatedTimestampMs;

  /** The unique identifier for the logged model. */
  @JsonProperty("model_id")
  private String modelId;

  /** The type of model, such as ``"Agent"``, ``"Classifier"``, ``"LLM"``. */
  @JsonProperty("model_type")
  private String modelType;

  /** The name of the model. */
  @JsonProperty("name")
  private String name;

  /** The ID of the run that created the model. */
  @JsonProperty("source_run_id")
  private String sourceRunId;

  /** The status of whether or not the model is ready for use. */
  @JsonProperty("status")
  private LoggedModelStatus status;

  /** Details on the current model status. */
  @JsonProperty("status_message")
  private String statusMessage;

  /** Mutable string key-value pairs set on the model. */
  @JsonProperty("tags")
  private Collection<LoggedModelTag> tags;

  public LoggedModelInfo setArtifactUri(String artifactUri) {
    this.artifactUri = artifactUri;
    return this;
  }

  public String getArtifactUri() {
    return artifactUri;
  }

  public LoggedModelInfo setCreationTimestampMs(Long creationTimestampMs) {
    this.creationTimestampMs = creationTimestampMs;
    return this;
  }

  public Long getCreationTimestampMs() {
    return creationTimestampMs;
  }

  public LoggedModelInfo setCreatorId(Long creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  public Long getCreatorId() {
    return creatorId;
  }

  public LoggedModelInfo setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public LoggedModelInfo setLastUpdatedTimestampMs(Long lastUpdatedTimestampMs) {
    this.lastUpdatedTimestampMs = lastUpdatedTimestampMs;
    return this;
  }

  public Long getLastUpdatedTimestampMs() {
    return lastUpdatedTimestampMs;
  }

  public LoggedModelInfo setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public LoggedModelInfo setModelType(String modelType) {
    this.modelType = modelType;
    return this;
  }

  public String getModelType() {
    return modelType;
  }

  public LoggedModelInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public LoggedModelInfo setSourceRunId(String sourceRunId) {
    this.sourceRunId = sourceRunId;
    return this;
  }

  public String getSourceRunId() {
    return sourceRunId;
  }

  public LoggedModelInfo setStatus(LoggedModelStatus status) {
    this.status = status;
    return this;
  }

  public LoggedModelStatus getStatus() {
    return status;
  }

  public LoggedModelInfo setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  public LoggedModelInfo setTags(Collection<LoggedModelTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<LoggedModelTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LoggedModelInfo that = (LoggedModelInfo) o;
    return Objects.equals(artifactUri, that.artifactUri)
        && Objects.equals(creationTimestampMs, that.creationTimestampMs)
        && Objects.equals(creatorId, that.creatorId)
        && Objects.equals(experimentId, that.experimentId)
        && Objects.equals(lastUpdatedTimestampMs, that.lastUpdatedTimestampMs)
        && Objects.equals(modelId, that.modelId)
        && Objects.equals(modelType, that.modelType)
        && Objects.equals(name, that.name)
        && Objects.equals(sourceRunId, that.sourceRunId)
        && Objects.equals(status, that.status)
        && Objects.equals(statusMessage, that.statusMessage)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        artifactUri,
        creationTimestampMs,
        creatorId,
        experimentId,
        lastUpdatedTimestampMs,
        modelId,
        modelType,
        name,
        sourceRunId,
        status,
        statusMessage,
        tags);
  }

  @Override
  public String toString() {
    return new ToStringer(LoggedModelInfo.class)
        .add("artifactUri", artifactUri)
        .add("creationTimestampMs", creationTimestampMs)
        .add("creatorId", creatorId)
        .add("experimentId", experimentId)
        .add("lastUpdatedTimestampMs", lastUpdatedTimestampMs)
        .add("modelId", modelId)
        .add("modelType", modelType)
        .add("name", name)
        .add("sourceRunId", sourceRunId)
        .add("status", status)
        .add("statusMessage", statusMessage)
        .add("tags", tags)
        .toString();
  }
}
