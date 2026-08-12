// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Per-trigger runtime state for the multi-trigger surface. Mirrors `TriggerConfiguration`'s
 * trigger-type variants 1:1; each entry sets exactly one variant matching the corresponding
 * trigger's type. Variants with no runtime state today (`schedule`, `model`) are emitted as empty
 * messages.
 */
@Generated
public class PerTriggerState {
  /** */
  @JsonProperty("continuous")
  private ContinuousTriggerState continuous;

  /** */
  @JsonProperty("file_arrival")
  private FileArrivalTriggerState fileArrival;

  /** */
  @JsonProperty("model")
  private ModelTriggerState model;

  /** Whether this trigger is paused or not. Mirrors the configured pause_status. */
  @JsonProperty("pause_status")
  private PauseStatus pauseStatus;

  /** */
  @JsonProperty("periodic")
  private PeriodicTriggerState periodic;

  /** */
  @JsonProperty("schedule")
  private ScheduleTriggerState schedule;

  /** State for SQL condition evaluation, can coexist with other trigger states. */
  @JsonProperty("sql_condition")
  private SqlConditionState sqlCondition;

  /** */
  @JsonProperty("table_update")
  private TableTriggerState tableUpdate;

  public PerTriggerState setContinuous(ContinuousTriggerState continuous) {
    this.continuous = continuous;
    return this;
  }

  public ContinuousTriggerState getContinuous() {
    return continuous;
  }

  public PerTriggerState setFileArrival(FileArrivalTriggerState fileArrival) {
    this.fileArrival = fileArrival;
    return this;
  }

  public FileArrivalTriggerState getFileArrival() {
    return fileArrival;
  }

  public PerTriggerState setModel(ModelTriggerState model) {
    this.model = model;
    return this;
  }

  public ModelTriggerState getModel() {
    return model;
  }

  public PerTriggerState setPauseStatus(PauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public PauseStatus getPauseStatus() {
    return pauseStatus;
  }

  public PerTriggerState setPeriodic(PeriodicTriggerState periodic) {
    this.periodic = periodic;
    return this;
  }

  public PeriodicTriggerState getPeriodic() {
    return periodic;
  }

  public PerTriggerState setSchedule(ScheduleTriggerState schedule) {
    this.schedule = schedule;
    return this;
  }

  public ScheduleTriggerState getSchedule() {
    return schedule;
  }

  public PerTriggerState setSqlCondition(SqlConditionState sqlCondition) {
    this.sqlCondition = sqlCondition;
    return this;
  }

  public SqlConditionState getSqlCondition() {
    return sqlCondition;
  }

  public PerTriggerState setTableUpdate(TableTriggerState tableUpdate) {
    this.tableUpdate = tableUpdate;
    return this;
  }

  public TableTriggerState getTableUpdate() {
    return tableUpdate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PerTriggerState that = (PerTriggerState) o;
    return Objects.equals(continuous, that.continuous)
        && Objects.equals(fileArrival, that.fileArrival)
        && Objects.equals(model, that.model)
        && Objects.equals(pauseStatus, that.pauseStatus)
        && Objects.equals(periodic, that.periodic)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(sqlCondition, that.sqlCondition)
        && Objects.equals(tableUpdate, that.tableUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        continuous, fileArrival, model, pauseStatus, periodic, schedule, sqlCondition, tableUpdate);
  }

  @Override
  public String toString() {
    return new ToStringer(PerTriggerState.class)
        .add("continuous", continuous)
        .add("fileArrival", fileArrival)
        .add("model", model)
        .add("pauseStatus", pauseStatus)
        .add("periodic", periodic)
        .add("schedule", schedule)
        .add("sqlCondition", sqlCondition)
        .add("tableUpdate", tableUpdate)
        .toString();
  }
}
