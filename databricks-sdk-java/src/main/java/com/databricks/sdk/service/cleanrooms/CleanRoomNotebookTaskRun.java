// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

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

/** Stores information about a single task run. */
@Generated
@JsonSerialize(using = CleanRoomNotebookTaskRun.CleanRoomNotebookTaskRunSerializer.class)
@JsonDeserialize(using = CleanRoomNotebookTaskRun.CleanRoomNotebookTaskRunDeserializer.class)
public class CleanRoomNotebookTaskRun {
  /**
   * Job run info of the task in the runner's local workspace. This field is only included in the
   * LIST API. if the task was run within the same workspace the API is being called. If the task
   * run was in a different workspace under the same metastore, only the workspace_id is included.
   */
  private CollaboratorJobRunInfo collaboratorJobRunInfo;

  /** Etag of the notebook executed in this task run, used to identify the notebook version. */
  private String notebookEtag;

  /** State of the task run. */
  private com.databricks.sdk.service.jobs.CleanRoomTaskRunState notebookJobRunState;

  /** Asset name of the notebook executed in this task run. */
  private String notebookName;

  /** The timestamp of when the notebook was last updated. */
  private Long notebookUpdatedAt;

  /** Expiration time of the output schema of the task run (if any), in epoch milliseconds. */
  private Long outputSchemaExpirationTime;

  /** Name of the output schema associated with the clean rooms notebook task run. */
  private String outputSchemaName;

  /** Duration of the task run, in milliseconds. */
  private Long runDuration;

  /** When the task run started, in epoch milliseconds. */
  private Long startTime;

  public CleanRoomNotebookTaskRun setCollaboratorJobRunInfo(
      CollaboratorJobRunInfo collaboratorJobRunInfo) {
    this.collaboratorJobRunInfo = collaboratorJobRunInfo;
    return this;
  }

  public CollaboratorJobRunInfo getCollaboratorJobRunInfo() {
    return collaboratorJobRunInfo;
  }

  public CleanRoomNotebookTaskRun setNotebookEtag(String notebookEtag) {
    this.notebookEtag = notebookEtag;
    return this;
  }

  public String getNotebookEtag() {
    return notebookEtag;
  }

  public CleanRoomNotebookTaskRun setNotebookJobRunState(
      com.databricks.sdk.service.jobs.CleanRoomTaskRunState notebookJobRunState) {
    this.notebookJobRunState = notebookJobRunState;
    return this;
  }

  public com.databricks.sdk.service.jobs.CleanRoomTaskRunState getNotebookJobRunState() {
    return notebookJobRunState;
  }

  public CleanRoomNotebookTaskRun setNotebookName(String notebookName) {
    this.notebookName = notebookName;
    return this;
  }

  public String getNotebookName() {
    return notebookName;
  }

  public CleanRoomNotebookTaskRun setNotebookUpdatedAt(Long notebookUpdatedAt) {
    this.notebookUpdatedAt = notebookUpdatedAt;
    return this;
  }

  public Long getNotebookUpdatedAt() {
    return notebookUpdatedAt;
  }

  public CleanRoomNotebookTaskRun setOutputSchemaExpirationTime(Long outputSchemaExpirationTime) {
    this.outputSchemaExpirationTime = outputSchemaExpirationTime;
    return this;
  }

  public Long getOutputSchemaExpirationTime() {
    return outputSchemaExpirationTime;
  }

  public CleanRoomNotebookTaskRun setOutputSchemaName(String outputSchemaName) {
    this.outputSchemaName = outputSchemaName;
    return this;
  }

  public String getOutputSchemaName() {
    return outputSchemaName;
  }

  public CleanRoomNotebookTaskRun setRunDuration(Long runDuration) {
    this.runDuration = runDuration;
    return this;
  }

  public Long getRunDuration() {
    return runDuration;
  }

  public CleanRoomNotebookTaskRun setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomNotebookTaskRun that = (CleanRoomNotebookTaskRun) o;
    return Objects.equals(collaboratorJobRunInfo, that.collaboratorJobRunInfo)
        && Objects.equals(notebookEtag, that.notebookEtag)
        && Objects.equals(notebookJobRunState, that.notebookJobRunState)
        && Objects.equals(notebookName, that.notebookName)
        && Objects.equals(notebookUpdatedAt, that.notebookUpdatedAt)
        && Objects.equals(outputSchemaExpirationTime, that.outputSchemaExpirationTime)
        && Objects.equals(outputSchemaName, that.outputSchemaName)
        && Objects.equals(runDuration, that.runDuration)
        && Objects.equals(startTime, that.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        collaboratorJobRunInfo,
        notebookEtag,
        notebookJobRunState,
        notebookName,
        notebookUpdatedAt,
        outputSchemaExpirationTime,
        outputSchemaName,
        runDuration,
        startTime);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomNotebookTaskRun.class)
        .add("collaboratorJobRunInfo", collaboratorJobRunInfo)
        .add("notebookEtag", notebookEtag)
        .add("notebookJobRunState", notebookJobRunState)
        .add("notebookName", notebookName)
        .add("notebookUpdatedAt", notebookUpdatedAt)
        .add("outputSchemaExpirationTime", outputSchemaExpirationTime)
        .add("outputSchemaName", outputSchemaName)
        .add("runDuration", runDuration)
        .add("startTime", startTime)
        .toString();
  }

  CleanRoomNotebookTaskRunPb toPb() {
    CleanRoomNotebookTaskRunPb pb = new CleanRoomNotebookTaskRunPb();
    pb.setCollaboratorJobRunInfo(collaboratorJobRunInfo);
    pb.setNotebookEtag(notebookEtag);
    pb.setNotebookJobRunState(notebookJobRunState);
    pb.setNotebookName(notebookName);
    pb.setNotebookUpdatedAt(notebookUpdatedAt);
    pb.setOutputSchemaExpirationTime(outputSchemaExpirationTime);
    pb.setOutputSchemaName(outputSchemaName);
    pb.setRunDuration(runDuration);
    pb.setStartTime(startTime);

    return pb;
  }

  static CleanRoomNotebookTaskRun fromPb(CleanRoomNotebookTaskRunPb pb) {
    CleanRoomNotebookTaskRun model = new CleanRoomNotebookTaskRun();
    model.setCollaboratorJobRunInfo(pb.getCollaboratorJobRunInfo());
    model.setNotebookEtag(pb.getNotebookEtag());
    model.setNotebookJobRunState(pb.getNotebookJobRunState());
    model.setNotebookName(pb.getNotebookName());
    model.setNotebookUpdatedAt(pb.getNotebookUpdatedAt());
    model.setOutputSchemaExpirationTime(pb.getOutputSchemaExpirationTime());
    model.setOutputSchemaName(pb.getOutputSchemaName());
    model.setRunDuration(pb.getRunDuration());
    model.setStartTime(pb.getStartTime());

    return model;
  }

  public static class CleanRoomNotebookTaskRunSerializer
      extends JsonSerializer<CleanRoomNotebookTaskRun> {
    @Override
    public void serialize(
        CleanRoomNotebookTaskRun value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomNotebookTaskRunPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomNotebookTaskRunDeserializer
      extends JsonDeserializer<CleanRoomNotebookTaskRun> {
    @Override
    public CleanRoomNotebookTaskRun deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomNotebookTaskRunPb pb = mapper.readValue(p, CleanRoomNotebookTaskRunPb.class);
      return CleanRoomNotebookTaskRun.fromPb(pb);
    }
  }
}
