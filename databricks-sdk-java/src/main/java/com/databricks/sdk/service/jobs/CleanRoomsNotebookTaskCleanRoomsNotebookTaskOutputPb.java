// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputPb {
  @JsonProperty("clean_room_job_run_state")
  private CleanRoomTaskRunState cleanRoomJobRunState;

  @JsonProperty("notebook_output")
  private NotebookOutput notebookOutput;

  @JsonProperty("output_schema_info")
  private OutputSchemaInfo outputSchemaInfo;

  public CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputPb setCleanRoomJobRunState(
      CleanRoomTaskRunState cleanRoomJobRunState) {
    this.cleanRoomJobRunState = cleanRoomJobRunState;
    return this;
  }

  public CleanRoomTaskRunState getCleanRoomJobRunState() {
    return cleanRoomJobRunState;
  }

  public CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputPb setNotebookOutput(
      NotebookOutput notebookOutput) {
    this.notebookOutput = notebookOutput;
    return this;
  }

  public NotebookOutput getNotebookOutput() {
    return notebookOutput;
  }

  public CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputPb setOutputSchemaInfo(
      OutputSchemaInfo outputSchemaInfo) {
    this.outputSchemaInfo = outputSchemaInfo;
    return this;
  }

  public OutputSchemaInfo getOutputSchemaInfo() {
    return outputSchemaInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputPb that =
        (CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputPb) o;
    return Objects.equals(cleanRoomJobRunState, that.cleanRoomJobRunState)
        && Objects.equals(notebookOutput, that.notebookOutput)
        && Objects.equals(outputSchemaInfo, that.outputSchemaInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoomJobRunState, notebookOutput, outputSchemaInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutputPb.class)
        .add("cleanRoomJobRunState", cleanRoomJobRunState)
        .add("notebookOutput", notebookOutput)
        .add("outputSchemaInfo", outputSchemaInfo)
        .toString();
  }
}
