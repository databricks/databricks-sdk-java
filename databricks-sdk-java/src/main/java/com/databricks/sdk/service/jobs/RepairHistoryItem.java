// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class RepairHistoryItem {
  /**
   * The actual performance target used by the serverless run during execution. This can differ from
   * the client-set performance target on the request depending on whether the performance mode is
   * supported by the job type.
   *
   * <p>* `STANDARD`: Enables cost-efficient execution of serverless workloads. *
   * `PERFORMANCE_OPTIMIZED`: Prioritizes fast startup and execution times through rapid scaling and
   * optimized cluster performance.
   */
  @JsonProperty("effective_performance_target")
  private PerformanceTarget effectivePerformanceTarget;

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

  /** Deprecated. Please use the `status` field instead. */
  @JsonProperty("state")
  private RunState state;

  /** The current status of the run */
  @JsonProperty("status")
  private RunStatus status;

  /** The run IDs of the task runs that ran as part of this repair history item. */
  @JsonProperty("task_run_ids")
  private Collection<Long> taskRunIds;

  /** The repair history item type. Indicates whether a run is the original run or a repair run. */
  @JsonProperty("type")
  private RepairHistoryItemType typeValue;

  public RepairHistoryItem setEffectivePerformanceTarget(
      PerformanceTarget effectivePerformanceTarget) {
    this.effectivePerformanceTarget = effectivePerformanceTarget;
    return this;
  }

  public PerformanceTarget getEffectivePerformanceTarget() {
    return effectivePerformanceTarget;
  }

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

  public RepairHistoryItem setStatus(RunStatus status) {
    this.status = status;
    return this;
  }

  public RunStatus getStatus() {
    return status;
  }

  public RepairHistoryItem setTaskRunIds(Collection<Long> taskRunIds) {
    this.taskRunIds = taskRunIds;
    return this;
  }

  public Collection<Long> getTaskRunIds() {
    return taskRunIds;
  }

  public RepairHistoryItem setType(RepairHistoryItemType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public RepairHistoryItemType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepairHistoryItem that = (RepairHistoryItem) o;
    return Objects.equals(effectivePerformanceTarget, that.effectivePerformanceTarget)
        && Objects.equals(endTime, that.endTime)
        && Objects.equals(id, that.id)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(state, that.state)
        && Objects.equals(status, that.status)
        && Objects.equals(taskRunIds, that.taskRunIds)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        effectivePerformanceTarget, endTime, id, startTime, state, status, taskRunIds, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(RepairHistoryItem.class)
        .add("effectivePerformanceTarget", effectivePerformanceTarget)
        .add("endTime", endTime)
        .add("id", id)
        .add("startTime", startTime)
        .add("state", state)
        .add("status", status)
        .add("taskRunIds", taskRunIds)
        .add("typeValue", typeValue)
        .toString();
  }
}
