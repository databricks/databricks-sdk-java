// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Stores information about a single task run. */
@Generated
public class CleanRoomNotebookTaskRun {
  /**
   * Job run info of the task in the runner's local workspace. This field is only included in the
   * LIST API. if the task was run within the same workspace the API is being called. If the task
   * run was in a different workspace under the same metastore, only the workspace_id is included.
   */
  @JsonProperty("collaborator_job_run_info")
  private CollaboratorJobRunInfo collaboratorJobRunInfo;

  /** State of the task run. */
  @JsonProperty("notebook_job_run_state")
  private com.databricks.sdk.service.jobs.CleanRoomTaskRunState notebookJobRunState;

  /** Asset name of the notebook executed in this task run. */
  @JsonProperty("notebook_name")
  private String notebookName;

  /** Expiration time of the output schema of the task run (if any), in epoch milliseconds. */
  @JsonProperty("output_schema_expiration_time")
  private Long outputSchemaExpirationTime;

  /** Name of the output schema associated with the clean rooms notebook task run. */
  @JsonProperty("output_schema_name")
  private String outputSchemaName;

  /** Duration of the task run, in milliseconds. */
  @JsonProperty("run_duration")
  private Long runDuration;

  /** When the task run started, in epoch milliseconds. */
  @JsonProperty("start_time")
  private Long startTime;

  public CleanRoomNotebookTaskRun setCollaboratorJobRunInfo(
      CollaboratorJobRunInfo collaboratorJobRunInfo) {
    this.collaboratorJobRunInfo = collaboratorJobRunInfo;
    return this;
  }

  public CollaboratorJobRunInfo getCollaboratorJobRunInfo() {
    return collaboratorJobRunInfo;
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
        && Objects.equals(notebookJobRunState, that.notebookJobRunState)
        && Objects.equals(notebookName, that.notebookName)
        && Objects.equals(outputSchemaExpirationTime, that.outputSchemaExpirationTime)
        && Objects.equals(outputSchemaName, that.outputSchemaName)
        && Objects.equals(runDuration, that.runDuration)
        && Objects.equals(startTime, that.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        collaboratorJobRunInfo,
        notebookJobRunState,
        notebookName,
        outputSchemaExpirationTime,
        outputSchemaName,
        runDuration,
        startTime);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomNotebookTaskRun.class)
        .add("collaboratorJobRunInfo", collaboratorJobRunInfo)
        .add("notebookJobRunState", notebookJobRunState)
        .add("notebookName", notebookName)
        .add("outputSchemaExpirationTime", outputSchemaExpirationTime)
        .add("outputSchemaName", outputSchemaName)
        .add("runDuration", runDuration)
        .add("startTime", startTime)
        .toString();
  }
}
