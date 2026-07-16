// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Stores information about a single task run. */
@Generated
public class CleanRoomTaskRun {
  /** Information about the analysis run (etag, updated at) */
  @JsonProperty("analysis_details")
  private CleanRoomTaskRunCleanRoomTaskAnalysisDetails analysisDetails;

  /**
   * Job run info of the task in the runner's local workspace. This field is only included in the
   * LIST API if the task was run within the same workspace the API is being called. If the task run
   * was in a different workspace under the same metastore, only the workspace_id is included.
   */
  @JsonProperty("collaborator_job_run_info")
  private CollaboratorJobRunInfo collaboratorJobRunInfo;

  /** Name of the executable. */
  @JsonProperty("name")
  private String name;

  /** Information about run output */
  @JsonProperty("output_info")
  private CleanRoomTaskRunOutputInfo outputInfo;

  /** Duration of the task run, in milliseconds. */
  @JsonProperty("run_duration")
  private Long runDuration;

  /**
   * Information about shared output accessible by all collaborators. This field is only populated
   * when enable_shared_output is true.
   */
  @JsonProperty("shared_output_info")
  private CleanRoomTaskRunOutputInfo sharedOutputInfo;

  /** When the task run started, in epoch milliseconds. */
  @JsonProperty("start_time")
  private Long startTime;

  /** State of the task run. */
  @JsonProperty("task_run_state")
  private com.databricks.sdk.service.jobs.CleanRoomTaskRunState taskRunState;

  /** The type of Clean Room task. */
  @JsonProperty("task_type")
  private CleanRoomTaskType taskType;

  public CleanRoomTaskRun setAnalysisDetails(
      CleanRoomTaskRunCleanRoomTaskAnalysisDetails analysisDetails) {
    this.analysisDetails = analysisDetails;
    return this;
  }

  public CleanRoomTaskRunCleanRoomTaskAnalysisDetails getAnalysisDetails() {
    return analysisDetails;
  }

  public CleanRoomTaskRun setCollaboratorJobRunInfo(CollaboratorJobRunInfo collaboratorJobRunInfo) {
    this.collaboratorJobRunInfo = collaboratorJobRunInfo;
    return this;
  }

  public CollaboratorJobRunInfo getCollaboratorJobRunInfo() {
    return collaboratorJobRunInfo;
  }

  public CleanRoomTaskRun setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CleanRoomTaskRun setOutputInfo(CleanRoomTaskRunOutputInfo outputInfo) {
    this.outputInfo = outputInfo;
    return this;
  }

  public CleanRoomTaskRunOutputInfo getOutputInfo() {
    return outputInfo;
  }

  public CleanRoomTaskRun setRunDuration(Long runDuration) {
    this.runDuration = runDuration;
    return this;
  }

  public Long getRunDuration() {
    return runDuration;
  }

  public CleanRoomTaskRun setSharedOutputInfo(CleanRoomTaskRunOutputInfo sharedOutputInfo) {
    this.sharedOutputInfo = sharedOutputInfo;
    return this;
  }

  public CleanRoomTaskRunOutputInfo getSharedOutputInfo() {
    return sharedOutputInfo;
  }

  public CleanRoomTaskRun setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public CleanRoomTaskRun setTaskRunState(
      com.databricks.sdk.service.jobs.CleanRoomTaskRunState taskRunState) {
    this.taskRunState = taskRunState;
    return this;
  }

  public com.databricks.sdk.service.jobs.CleanRoomTaskRunState getTaskRunState() {
    return taskRunState;
  }

  public CleanRoomTaskRun setTaskType(CleanRoomTaskType taskType) {
    this.taskType = taskType;
    return this;
  }

  public CleanRoomTaskType getTaskType() {
    return taskType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomTaskRun that = (CleanRoomTaskRun) o;
    return Objects.equals(analysisDetails, that.analysisDetails)
        && Objects.equals(collaboratorJobRunInfo, that.collaboratorJobRunInfo)
        && Objects.equals(name, that.name)
        && Objects.equals(outputInfo, that.outputInfo)
        && Objects.equals(runDuration, that.runDuration)
        && Objects.equals(sharedOutputInfo, that.sharedOutputInfo)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(taskRunState, that.taskRunState)
        && Objects.equals(taskType, that.taskType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        analysisDetails,
        collaboratorJobRunInfo,
        name,
        outputInfo,
        runDuration,
        sharedOutputInfo,
        startTime,
        taskRunState,
        taskType);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomTaskRun.class)
        .add("analysisDetails", analysisDetails)
        .add("collaboratorJobRunInfo", collaboratorJobRunInfo)
        .add("name", name)
        .add("outputInfo", outputInfo)
        .add("runDuration", runDuration)
        .add("sharedOutputInfo", sharedOutputInfo)
        .add("startTime", startTime)
        .add("taskRunState", taskRunState)
        .add("taskType", taskType)
        .toString();
  }
}
