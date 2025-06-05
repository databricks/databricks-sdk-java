// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Stores information about a single task run. */
@Generated
class CleanRoomNotebookTaskRunPb {
  @JsonProperty("collaborator_job_run_info")
  private CollaboratorJobRunInfo collaboratorJobRunInfo;

  @JsonProperty("notebook_etag")
  private String notebookEtag;

  @JsonProperty("notebook_job_run_state")
  private com.databricks.sdk.service.jobs.CleanRoomTaskRunState notebookJobRunState;

  @JsonProperty("notebook_name")
  private String notebookName;

  @JsonProperty("notebook_updated_at")
  private Long notebookUpdatedAt;

  @JsonProperty("output_schema_expiration_time")
  private Long outputSchemaExpirationTime;

  @JsonProperty("output_schema_name")
  private String outputSchemaName;

  @JsonProperty("run_duration")
  private Long runDuration;

  @JsonProperty("start_time")
  private Long startTime;

  public CleanRoomNotebookTaskRunPb setCollaboratorJobRunInfo(
      CollaboratorJobRunInfo collaboratorJobRunInfo) {
    this.collaboratorJobRunInfo = collaboratorJobRunInfo;
    return this;
  }

  public CollaboratorJobRunInfo getCollaboratorJobRunInfo() {
    return collaboratorJobRunInfo;
  }

  public CleanRoomNotebookTaskRunPb setNotebookEtag(String notebookEtag) {
    this.notebookEtag = notebookEtag;
    return this;
  }

  public String getNotebookEtag() {
    return notebookEtag;
  }

  public CleanRoomNotebookTaskRunPb setNotebookJobRunState(
      com.databricks.sdk.service.jobs.CleanRoomTaskRunState notebookJobRunState) {
    this.notebookJobRunState = notebookJobRunState;
    return this;
  }

  public com.databricks.sdk.service.jobs.CleanRoomTaskRunState getNotebookJobRunState() {
    return notebookJobRunState;
  }

  public CleanRoomNotebookTaskRunPb setNotebookName(String notebookName) {
    this.notebookName = notebookName;
    return this;
  }

  public String getNotebookName() {
    return notebookName;
  }

  public CleanRoomNotebookTaskRunPb setNotebookUpdatedAt(Long notebookUpdatedAt) {
    this.notebookUpdatedAt = notebookUpdatedAt;
    return this;
  }

  public Long getNotebookUpdatedAt() {
    return notebookUpdatedAt;
  }

  public CleanRoomNotebookTaskRunPb setOutputSchemaExpirationTime(Long outputSchemaExpirationTime) {
    this.outputSchemaExpirationTime = outputSchemaExpirationTime;
    return this;
  }

  public Long getOutputSchemaExpirationTime() {
    return outputSchemaExpirationTime;
  }

  public CleanRoomNotebookTaskRunPb setOutputSchemaName(String outputSchemaName) {
    this.outputSchemaName = outputSchemaName;
    return this;
  }

  public String getOutputSchemaName() {
    return outputSchemaName;
  }

  public CleanRoomNotebookTaskRunPb setRunDuration(Long runDuration) {
    this.runDuration = runDuration;
    return this;
  }

  public Long getRunDuration() {
    return runDuration;
  }

  public CleanRoomNotebookTaskRunPb setStartTime(Long startTime) {
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
    CleanRoomNotebookTaskRunPb that = (CleanRoomNotebookTaskRunPb) o;
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
    return new ToStringer(CleanRoomNotebookTaskRunPb.class)
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
}
