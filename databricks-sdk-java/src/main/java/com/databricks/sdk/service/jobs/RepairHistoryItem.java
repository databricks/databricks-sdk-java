// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RepairHistoryItem {
  /** The end time of the (repaired) run. */
  @JsonProperty("end_time")
  private Long endTime;

  /**
   * The ID of the repair. Only returned for the items that represent a repair in `repair_history`.
   */
  @JsonProperty("id")
  private Long id;

  /** The start time of the (repaired) run. */
  @JsonProperty("start_time")
  private Long startTime;

  /** The result and lifecycle state of the run. */
  @JsonProperty("state")
  private RunState state;

  /** The run IDs of the task runs that ran as part of this repair history item. */
  @JsonProperty("task_run_ids")
  private java.util.List<Long> taskRunIds;

  /** The repair history item type. Indicates whether a run is the original run or a repair run. */
  @JsonProperty("type")
  private RepairHistoryItemType typeValue;

  public RepairHistoryItem setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public RepairHistoryItem setId(Long id) {
    this.id = id;
    return this;
  }

  public Long getId() {
    return id;
  }

  public RepairHistoryItem setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public RepairHistoryItem setState(RunState state) {
    this.state = state;
    return this;
  }

  public RunState getState() {
    return state;
  }

  public RepairHistoryItem setTaskRunIds(java.util.List<Long> taskRunIds) {
    this.taskRunIds = taskRunIds;
    return this;
  }

  public java.util.List<Long> getTaskRunIds() {
    return taskRunIds;
  }

  public RepairHistoryItem setType(RepairHistoryItemType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public RepairHistoryItemType getType() {
    return typeValue;
  }
}
