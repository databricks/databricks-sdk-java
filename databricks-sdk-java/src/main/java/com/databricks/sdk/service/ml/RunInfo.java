// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RunInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RunInfo {
  /**
   * URI of the directory where artifacts should be uploaded. This can be a local path (starting
   * with "/"), or a distributed file system (DFS) path, like `s3://bucket/directory` or
   * `dbfs:/my/directory`. If not set, the local `./mlruns` directory is chosen.
   */
  @JsonProperty("artifact_uri")
  private String artifactUri;

  /** Unix timestamp of when the run ended in milliseconds. */
  @JsonProperty("end_time")
  private Long endTime;

  /** The experiment ID. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /** Current life cycle stage of the experiment : OneOf("active", "deleted") */
  @JsonProperty("lifecycle_stage")
  private String lifecycleStage;

  /** Unique identifier for the run. */
  @JsonProperty("run_id")
  private String runId;

  /**
   * [Deprecated, use run_id instead] Unique identifier for the run. This field will be removed in a
   * future MLflow version.
   */
  @JsonProperty("run_uuid")
  private String runUuid;

  /** Unix timestamp of when the run started in milliseconds. */
  @JsonProperty("start_time")
  private Long startTime;

  /** Current status of the run. */
  @JsonProperty("status")
  private RunInfoStatus status;

  /**
   * User who initiated the run. This field is deprecated as of MLflow 1.0, and will be removed in a
   * future MLflow release. Use 'mlflow.user' tag instead.
   */
  @JsonProperty("user_id")
  private String userId;

  /**
   * <p>Setter for the field <code>artifactUri</code>.</p>
   *
   * @param artifactUri a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.RunInfo} object
   */
  public RunInfo setArtifactUri(String artifactUri) {
    this.artifactUri = artifactUri;
    return this;
  }

  /**
   * <p>Getter for the field <code>artifactUri</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getArtifactUri() {
    return artifactUri;
  }

  /**
   * <p>Setter for the field <code>endTime</code>.</p>
   *
   * @param endTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.RunInfo} object
   */
  public RunInfo setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>endTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getEndTime() {
    return endTime;
  }

  /**
   * <p>Setter for the field <code>experimentId</code>.</p>
   *
   * @param experimentId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.RunInfo} object
   */
  public RunInfo setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  /**
   * <p>Getter for the field <code>experimentId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExperimentId() {
    return experimentId;
  }

  /**
   * <p>Setter for the field <code>lifecycleStage</code>.</p>
   *
   * @param lifecycleStage a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.RunInfo} object
   */
  public RunInfo setLifecycleStage(String lifecycleStage) {
    this.lifecycleStage = lifecycleStage;
    return this;
  }

  /**
   * <p>Getter for the field <code>lifecycleStage</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLifecycleStage() {
    return lifecycleStage;
  }

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.RunInfo} object
   */
  public RunInfo setRunId(String runId) {
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
   * <p>Setter for the field <code>runUuid</code>.</p>
   *
   * @param runUuid a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.RunInfo} object
   */
  public RunInfo setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  /**
   * <p>Getter for the field <code>runUuid</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunUuid() {
    return runUuid;
  }

  /**
   * <p>Setter for the field <code>startTime</code>.</p>
   *
   * @param startTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.RunInfo} object
   */
  public RunInfo setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>startTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartTime() {
    return startTime;
  }

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.databricks.sdk.service.ml.RunInfoStatus} object
   * @return a {@link com.databricks.sdk.service.ml.RunInfo} object
   */
  public RunInfo setStatus(RunInfoStatus status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.RunInfoStatus} object
   */
  public RunInfoStatus getStatus() {
    return status;
  }

  /**
   * <p>Setter for the field <code>userId</code>.</p>
   *
   * @param userId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.RunInfo} object
   */
  public RunInfo setUserId(String userId) {
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
    RunInfo that = (RunInfo) o;
    return Objects.equals(artifactUri, that.artifactUri)
        && Objects.equals(endTime, that.endTime)
        && Objects.equals(experimentId, that.experimentId)
        && Objects.equals(lifecycleStage, that.lifecycleStage)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runUuid, that.runUuid)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(status, that.status)
        && Objects.equals(userId, that.userId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        artifactUri,
        endTime,
        experimentId,
        lifecycleStage,
        runId,
        runUuid,
        startTime,
        status,
        userId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RunInfo.class)
        .add("artifactUri", artifactUri)
        .add("endTime", endTime)
        .add("experimentId", experimentId)
        .add("lifecycleStage", lifecycleStage)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .add("startTime", startTime)
        .add("status", status)
        .add("userId", userId)
        .toString();
  }
}
