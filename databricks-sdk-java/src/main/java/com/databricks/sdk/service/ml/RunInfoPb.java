// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Metadata of a single run. */
@Generated
class RunInfoPb {
  @JsonProperty("artifact_uri")
  private String artifactUri;

  @JsonProperty("end_time")
  private Long endTime;

  @JsonProperty("experiment_id")
  private String experimentId;

  @JsonProperty("lifecycle_stage")
  private String lifecycleStage;

  @JsonProperty("run_id")
  private String runId;

  @JsonProperty("run_name")
  private String runName;

  @JsonProperty("run_uuid")
  private String runUuid;

  @JsonProperty("start_time")
  private Long startTime;

  @JsonProperty("status")
  private RunInfoStatus status;

  @JsonProperty("user_id")
  private String userId;

  public RunInfoPb setArtifactUri(String artifactUri) {
    this.artifactUri = artifactUri;
    return this;
  }

  public String getArtifactUri() {
    return artifactUri;
  }

  public RunInfoPb setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public RunInfoPb setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public RunInfoPb setLifecycleStage(String lifecycleStage) {
    this.lifecycleStage = lifecycleStage;
    return this;
  }

  public String getLifecycleStage() {
    return lifecycleStage;
  }

  public RunInfoPb setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public RunInfoPb setRunName(String runName) {
    this.runName = runName;
    return this;
  }

  public String getRunName() {
    return runName;
  }

  public RunInfoPb setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  public String getRunUuid() {
    return runUuid;
  }

  public RunInfoPb setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public RunInfoPb setStatus(RunInfoStatus status) {
    this.status = status;
    return this;
  }

  public RunInfoStatus getStatus() {
    return status;
  }

  public RunInfoPb setUserId(String userId) {
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
    RunInfoPb that = (RunInfoPb) o;
    return Objects.equals(artifactUri, that.artifactUri)
        && Objects.equals(endTime, that.endTime)
        && Objects.equals(experimentId, that.experimentId)
        && Objects.equals(lifecycleStage, that.lifecycleStage)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runName, that.runName)
        && Objects.equals(runUuid, that.runUuid)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(status, that.status)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        artifactUri,
        endTime,
        experimentId,
        lifecycleStage,
        runId,
        runName,
        runUuid,
        startTime,
        status,
        userId);
  }

  @Override
  public String toString() {
    return new ToStringer(RunInfoPb.class)
        .add("artifactUri", artifactUri)
        .add("endTime", endTime)
        .add("experimentId", experimentId)
        .add("lifecycleStage", lifecycleStage)
        .add("runId", runId)
        .add("runName", runName)
        .add("runUuid", runUuid)
        .add("startTime", startTime)
        .add("status", status)
        .add("userId", userId)
        .toString();
  }
}
