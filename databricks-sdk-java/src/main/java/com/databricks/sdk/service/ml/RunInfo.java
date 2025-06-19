// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

/** Metadata of a single run. */
@Generated
@JsonSerialize(using = RunInfo.RunInfoSerializer.class)
@JsonDeserialize(using = RunInfo.RunInfoDeserializer.class)
public class RunInfo {
  /**
   * URI of the directory where artifacts should be uploaded. This can be a local path (starting
   * with "/"), or a distributed file system (DFS) path, like ``s3://bucket/directory`` or
   * ``dbfs:/my/directory``. If not set, the local ``./mlruns`` directory is chosen.
   */
  private String artifactUri;

  /** Unix timestamp of when the run ended in milliseconds. */
  private Long endTime;

  /** The experiment ID. */
  private String experimentId;

  /** Current life cycle stage of the experiment : OneOf("active", "deleted") */
  private String lifecycleStage;

  /** Unique identifier for the run. */
  private String runId;

  /** The name of the run. */
  private String runName;

  /**
   * [Deprecated, use run_id instead] Unique identifier for the run. This field will be removed in a
   * future MLflow version.
   */
  private String runUuid;

  /** Unix timestamp of when the run started in milliseconds. */
  private Long startTime;

  /** Current status of the run. */
  private RunInfoStatus status;

  /**
   * User who initiated the run. This field is deprecated as of MLflow 1.0, and will be removed in a
   * future MLflow release. Use 'mlflow.user' tag instead.
   */
  private String userId;

  public RunInfo setArtifactUri(String artifactUri) {
    this.artifactUri = artifactUri;
    return this;
  }

  public String getArtifactUri() {
    return artifactUri;
  }

  public RunInfo setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public RunInfo setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public RunInfo setLifecycleStage(String lifecycleStage) {
    this.lifecycleStage = lifecycleStage;
    return this;
  }

  public String getLifecycleStage() {
    return lifecycleStage;
  }

  public RunInfo setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public RunInfo setRunName(String runName) {
    this.runName = runName;
    return this;
  }

  public String getRunName() {
    return runName;
  }

  public RunInfo setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  public String getRunUuid() {
    return runUuid;
  }

  public RunInfo setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public RunInfo setStatus(RunInfoStatus status) {
    this.status = status;
    return this;
  }

  public RunInfoStatus getStatus() {
    return status;
  }

  public RunInfo setUserId(String userId) {
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
    RunInfo that = (RunInfo) o;
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
    return new ToStringer(RunInfo.class)
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

  RunInfoPb toPb() {
    RunInfoPb pb = new RunInfoPb();
    pb.setArtifactUri(artifactUri);
    pb.setEndTime(endTime);
    pb.setExperimentId(experimentId);
    pb.setLifecycleStage(lifecycleStage);
    pb.setRunId(runId);
    pb.setRunName(runName);
    pb.setRunUuid(runUuid);
    pb.setStartTime(startTime);
    pb.setStatus(status);
    pb.setUserId(userId);

    return pb;
  }

  static RunInfo fromPb(RunInfoPb pb) {
    RunInfo model = new RunInfo();
    model.setArtifactUri(pb.getArtifactUri());
    model.setEndTime(pb.getEndTime());
    model.setExperimentId(pb.getExperimentId());
    model.setLifecycleStage(pb.getLifecycleStage());
    model.setRunId(pb.getRunId());
    model.setRunName(pb.getRunName());
    model.setRunUuid(pb.getRunUuid());
    model.setStartTime(pb.getStartTime());
    model.setStatus(pb.getStatus());
    model.setUserId(pb.getUserId());

    return model;
  }

  public static class RunInfoSerializer extends JsonSerializer<RunInfo> {
    @Override
    public void serialize(RunInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RunInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RunInfoDeserializer extends JsonDeserializer<RunInfo> {
    @Override
    public RunInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RunInfoPb pb = mapper.readValue(p, RunInfoPb.class);
      return RunInfo.fromPb(pb);
    }
  }
}
