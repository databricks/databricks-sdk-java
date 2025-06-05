// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class RepairHistoryItemPb {
  @JsonProperty("effective_performance_target")
  private PerformanceTarget effectivePerformanceTarget;

  @JsonProperty("end_time")
  private Long endTime;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("start_time")
  private Long startTime;

  @JsonProperty("state")
  private RunState state;

  @JsonProperty("status")
  private RunStatus status;

  @JsonProperty("task_run_ids")
  private Collection<Long> taskRunIds;

  @JsonProperty("type")
  private RepairHistoryItemType typeValue;

  public RepairHistoryItemPb setEffectivePerformanceTarget(
      PerformanceTarget effectivePerformanceTarget) {
    this.effectivePerformanceTarget = effectivePerformanceTarget;
    return this;
  }

  public PerformanceTarget getEffectivePerformanceTarget() {
    return effectivePerformanceTarget;
  }

  public RepairHistoryItemPb setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public RepairHistoryItemPb setId(Long id) {
    this.id = id;
    return this;
  }

  public Long getId() {
    return id;
  }

  public RepairHistoryItemPb setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public RepairHistoryItemPb setState(RunState state) {
    this.state = state;
    return this;
  }

  public RunState getState() {
    return state;
  }

  public RepairHistoryItemPb setStatus(RunStatus status) {
    this.status = status;
    return this;
  }

  public RunStatus getStatus() {
    return status;
  }

  public RepairHistoryItemPb setTaskRunIds(Collection<Long> taskRunIds) {
    this.taskRunIds = taskRunIds;
    return this;
  }

  public Collection<Long> getTaskRunIds() {
    return taskRunIds;
  }

  public RepairHistoryItemPb setType(RepairHistoryItemType typeValue) {
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
    RepairHistoryItemPb that = (RepairHistoryItemPb) o;
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
    return new ToStringer(RepairHistoryItemPb.class)
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
