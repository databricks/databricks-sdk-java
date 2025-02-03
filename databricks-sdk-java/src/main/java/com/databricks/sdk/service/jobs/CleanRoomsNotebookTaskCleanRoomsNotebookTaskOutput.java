// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput {
  /** The run state of the clean rooms notebook task. */
  @JsonProperty("clean_room_job_run_state")
  private CleanRoomTaskRunState cleanRoomJobRunState;

  /** The notebook output for the clean room run */
  @JsonProperty("notebook_output")
  private NotebookOutput notebookOutput;

  /** Information on how to access the output schema for the clean room run */
  @JsonProperty("output_schema_info")
  private OutputSchemaInfo outputSchemaInfo;

  public CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput setCleanRoomJobRunState(
      CleanRoomTaskRunState cleanRoomJobRunState) {
    this.cleanRoomJobRunState = cleanRoomJobRunState;
    return this;
  }

  public CleanRoomTaskRunState getCleanRoomJobRunState() {
    return cleanRoomJobRunState;
  }

  public CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput setNotebookOutput(
      NotebookOutput notebookOutput) {
    this.notebookOutput = notebookOutput;
    return this;
  }

  public NotebookOutput getNotebookOutput() {
    return notebookOutput;
  }

  public CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput setOutputSchemaInfo(
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
    CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput that =
        (CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput) o;
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
    return new ToStringer(CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput.class)
        .add("cleanRoomJobRunState", cleanRoomJobRunState)
        .add("notebookOutput", notebookOutput)
        .add("outputSchemaInfo", outputSchemaInfo)
        .toString();
  }
}
