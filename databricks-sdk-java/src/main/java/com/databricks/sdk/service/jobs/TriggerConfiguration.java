// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A single trigger attached to a job via `JobSettings.triggers`. Exactly one of the trigger-type
 * fields (`periodic`, `schedule`, `continuous`, `file_arrival`, `table_update`, `model`,
 * `job_completion`) must be set; mutual exclusivity is enforced in the API handler rather than via
 * `oneof` so that codegen, validation, and JSON serialization across SDKs and Terraform behave
 * consistently.
 */
@Generated
public class TriggerConfiguration {
  /** Continuous trigger configuration. */
  @JsonProperty("continuous")
  private ContinuousTriggerConfiguration continuous;

  /** File arrival trigger configuration. */
  @JsonProperty("file_arrival")
  private FileArrivalTriggerConfiguration fileArrival;

  /** Model trigger configuration. */
  @JsonProperty("model")
  private ModelTriggerConfiguration model;

  /**
   * Whether this trigger is paused. Defaults to UNPAUSED when unset; the server always returns an
   * explicit value on read.
   */
  @JsonProperty("pause_status")
  private PauseStatus pauseStatus;

  /**
   * Trigger type: exactly one must be set; mutual exclusivity is enforced in the API handler
   * Periodic trigger configuration.
   */
  @JsonProperty("periodic")
  private PeriodicTriggerConfiguration periodic;

  /** Cron schedule trigger configuration. */
  @JsonProperty("schedule")
  private CronTriggerConfiguration schedule;

  /** Optional SQL condition that gates whether this trigger fires. */
  @JsonProperty("sql_condition")
  private SqlConditionConfiguration sqlCondition;

  /** Table update trigger configuration. */
  @JsonProperty("table_update")
  private TableUpdateTriggerConfiguration tableUpdate;

  public TriggerConfiguration setContinuous(ContinuousTriggerConfiguration continuous) {
    this.continuous = continuous;
    return this;
  }

  public ContinuousTriggerConfiguration getContinuous() {
    return continuous;
  }

  public TriggerConfiguration setFileArrival(FileArrivalTriggerConfiguration fileArrival) {
    this.fileArrival = fileArrival;
    return this;
  }

  public FileArrivalTriggerConfiguration getFileArrival() {
    return fileArrival;
  }

  public TriggerConfiguration setModel(ModelTriggerConfiguration model) {
    this.model = model;
    return this;
  }

  public ModelTriggerConfiguration getModel() {
    return model;
  }

  public TriggerConfiguration setPauseStatus(PauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public PauseStatus getPauseStatus() {
    return pauseStatus;
  }

  public TriggerConfiguration setPeriodic(PeriodicTriggerConfiguration periodic) {
    this.periodic = periodic;
    return this;
  }

  public PeriodicTriggerConfiguration getPeriodic() {
    return periodic;
  }

  public TriggerConfiguration setSchedule(CronTriggerConfiguration schedule) {
    this.schedule = schedule;
    return this;
  }

  public CronTriggerConfiguration getSchedule() {
    return schedule;
  }

  public TriggerConfiguration setSqlCondition(SqlConditionConfiguration sqlCondition) {
    this.sqlCondition = sqlCondition;
    return this;
  }

  public SqlConditionConfiguration getSqlCondition() {
    return sqlCondition;
  }

  public TriggerConfiguration setTableUpdate(TableUpdateTriggerConfiguration tableUpdate) {
    this.tableUpdate = tableUpdate;
    return this;
  }

  public TableUpdateTriggerConfiguration getTableUpdate() {
    return tableUpdate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TriggerConfiguration that = (TriggerConfiguration) o;
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
    return new ToStringer(TriggerConfiguration.class)
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
