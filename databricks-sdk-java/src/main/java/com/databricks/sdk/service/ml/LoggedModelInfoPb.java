// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A LoggedModelInfo includes logged model attributes, tags, and registration info. */
@Generated
class LoggedModelInfoPb {
  @JsonProperty("artifact_uri")
  private String artifactUri;

  @JsonProperty("creation_timestamp_ms")
  private Long creationTimestampMs;

  @JsonProperty("creator_id")
  private Long creatorId;

  @JsonProperty("experiment_id")
  private String experimentId;

  @JsonProperty("last_updated_timestamp_ms")
  private Long lastUpdatedTimestampMs;

  @JsonProperty("model_id")
  private String modelId;

  @JsonProperty("model_type")
  private String modelType;

  @JsonProperty("name")
  private String name;

  @JsonProperty("source_run_id")
  private String sourceRunId;

  @JsonProperty("status")
  private LoggedModelStatus status;

  @JsonProperty("status_message")
  private String statusMessage;

  @JsonProperty("tags")
  private Collection<LoggedModelTag> tags;

  public LoggedModelInfoPb setArtifactUri(String artifactUri) {
    this.artifactUri = artifactUri;
    return this;
  }

  public String getArtifactUri() {
    return artifactUri;
  }

  public LoggedModelInfoPb setCreationTimestampMs(Long creationTimestampMs) {
    this.creationTimestampMs = creationTimestampMs;
    return this;
  }

  public Long getCreationTimestampMs() {
    return creationTimestampMs;
  }

  public LoggedModelInfoPb setCreatorId(Long creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  public Long getCreatorId() {
    return creatorId;
  }

  public LoggedModelInfoPb setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public LoggedModelInfoPb setLastUpdatedTimestampMs(Long lastUpdatedTimestampMs) {
    this.lastUpdatedTimestampMs = lastUpdatedTimestampMs;
    return this;
  }

  public Long getLastUpdatedTimestampMs() {
    return lastUpdatedTimestampMs;
  }

  public LoggedModelInfoPb setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public LoggedModelInfoPb setModelType(String modelType) {
    this.modelType = modelType;
    return this;
  }

  public String getModelType() {
    return modelType;
  }

  public LoggedModelInfoPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public LoggedModelInfoPb setSourceRunId(String sourceRunId) {
    this.sourceRunId = sourceRunId;
    return this;
  }

  public String getSourceRunId() {
    return sourceRunId;
  }

  public LoggedModelInfoPb setStatus(LoggedModelStatus status) {
    this.status = status;
    return this;
  }

  public LoggedModelStatus getStatus() {
    return status;
  }

  public LoggedModelInfoPb setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  public LoggedModelInfoPb setTags(Collection<LoggedModelTag> tags) {
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
    LoggedModelInfoPb that = (LoggedModelInfoPb) o;
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
    return new ToStringer(LoggedModelInfoPb.class)
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
