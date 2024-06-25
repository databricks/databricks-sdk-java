// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TriggerSettings {
  /** File arrival trigger settings. */
  @JsonProperty("file_arrival")
  private FileArrivalTriggerConfiguration fileArrival;

  /** Whether this trigger is paused or not. */
  @JsonProperty("pause_status")
  private PauseStatus pauseStatus;

  /** Periodic trigger settings. */
  @JsonProperty("periodic")
  private PeriodicTriggerConfiguration periodic;

  /** Old table trigger settings name. Deprecated in favor of `table_update`. */
  @JsonProperty("table")
  private TableUpdateTriggerConfiguration table;

  /** */
  @JsonProperty("table_update")
  private TableUpdateTriggerConfiguration tableUpdate;

  public TriggerSettings setFileArrival(FileArrivalTriggerConfiguration fileArrival) {
    this.fileArrival = fileArrival;
    return this;
  }

  public FileArrivalTriggerConfiguration getFileArrival() {
    return fileArrival;
  }

  public TriggerSettings setPauseStatus(PauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public PauseStatus getPauseStatus() {
    return pauseStatus;
  }

  public TriggerSettings setPeriodic(PeriodicTriggerConfiguration periodic) {
    this.periodic = periodic;
    return this;
  }

  public PeriodicTriggerConfiguration getPeriodic() {
    return periodic;
  }

  public TriggerSettings setTable(TableUpdateTriggerConfiguration table) {
    this.table = table;
    return this;
  }

  public TableUpdateTriggerConfiguration getTable() {
    return table;
  }

  public TriggerSettings setTableUpdate(TableUpdateTriggerConfiguration tableUpdate) {
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
    TriggerSettings that = (TriggerSettings) o;
    return Objects.equals(fileArrival, that.fileArrival)
        && Objects.equals(pauseStatus, that.pauseStatus)
        && Objects.equals(periodic, that.periodic)
        && Objects.equals(table, that.table)
        && Objects.equals(tableUpdate, that.tableUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileArrival, pauseStatus, periodic, table, tableUpdate);
  }

  @Override
  public String toString() {
    return new ToStringer(TriggerSettings.class)
        .add("fileArrival", fileArrival)
        .add("pauseStatus", pauseStatus)
        .add("periodic", periodic)
        .add("table", table)
        .add("tableUpdate", tableUpdate)
        .toString();
  }
}
