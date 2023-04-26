// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>RepairHistoryItem class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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
  private Collection<Long> taskRunIds;

  /** The repair history item type. Indicates whether a run is the original run or a repair run. */
  @JsonProperty("type")
  private RepairHistoryItemType typeValue;

  /**
   * <p>Setter for the field <code>endTime</code>.</p>
   *
   * @param endTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairHistoryItem} object
   */
  public RepairHistoryItem setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>endTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getEndTime() {
    return endTime;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairHistoryItem} object
   */
  public RepairHistoryItem setId(Long id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>startTime</code>.</p>
   *
   * @param startTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairHistoryItem} object
   */
  public RepairHistoryItem setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>startTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartTime() {
    return startTime;
  }

  /**
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link com.databricks.sdk.service.jobs.RunState} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairHistoryItem} object
   */
  public RepairHistoryItem setState(RunState state) {
    this.state = state;
    return this;
  }

  /**
   * <p>Getter for the field <code>state</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.RunState} object
   */
  public RunState getState() {
    return state;
  }

  /**
   * <p>Setter for the field <code>taskRunIds</code>.</p>
   *
   * @param taskRunIds a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairHistoryItem} object
   */
  public RepairHistoryItem setTaskRunIds(Collection<Long> taskRunIds) {
    this.taskRunIds = taskRunIds;
    return this;
  }

  /**
   * <p>Getter for the field <code>taskRunIds</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Long> getTaskRunIds() {
    return taskRunIds;
  }

  /**
   * <p>setType.</p>
   *
   * @param typeValue a {@link com.databricks.sdk.service.jobs.RepairHistoryItemType} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairHistoryItem} object
   */
  public RepairHistoryItem setType(RepairHistoryItemType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  /**
   * <p>getType.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.RepairHistoryItemType} object
   */
  public RepairHistoryItemType getType() {
    return typeValue;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepairHistoryItem that = (RepairHistoryItem) o;
    return Objects.equals(endTime, that.endTime)
        && Objects.equals(id, that.id)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(state, that.state)
        && Objects.equals(taskRunIds, that.taskRunIds)
        && Objects.equals(typeValue, that.typeValue);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(endTime, id, startTime, state, taskRunIds, typeValue);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RepairHistoryItem.class)
        .add("endTime", endTime)
        .add("id", id)
        .add("startTime", startTime)
        .add("state", state)
        .add("taskRunIds", taskRunIds)
        .add("typeValue", typeValue)
        .toString();
  }
}
