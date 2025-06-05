// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class TriggerSettingsPb {
  @JsonProperty("file_arrival")
  private FileArrivalTriggerConfiguration fileArrival;

  @JsonProperty("pause_status")
  private PauseStatus pauseStatus;

  @JsonProperty("periodic")
  private PeriodicTriggerConfiguration periodic;

  @JsonProperty("table")
  private TableUpdateTriggerConfiguration table;

  @JsonProperty("table_update")
  private TableUpdateTriggerConfiguration tableUpdate;

  public TriggerSettingsPb setFileArrival(FileArrivalTriggerConfiguration fileArrival) {
    this.fileArrival = fileArrival;
    return this;
  }

  public FileArrivalTriggerConfiguration getFileArrival() {
    return fileArrival;
  }

  public TriggerSettingsPb setPauseStatus(PauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public PauseStatus getPauseStatus() {
    return pauseStatus;
  }

  public TriggerSettingsPb setPeriodic(PeriodicTriggerConfiguration periodic) {
    this.periodic = periodic;
    return this;
  }

  public PeriodicTriggerConfiguration getPeriodic() {
    return periodic;
  }

  public TriggerSettingsPb setTable(TableUpdateTriggerConfiguration table) {
    this.table = table;
    return this;
  }

  public TableUpdateTriggerConfiguration getTable() {
    return table;
  }

  public TriggerSettingsPb setTableUpdate(TableUpdateTriggerConfiguration tableUpdate) {
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
    TriggerSettingsPb that = (TriggerSettingsPb) o;
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
    return new ToStringer(TriggerSettingsPb.class)
        .add("fileArrival", fileArrival)
        .add("pauseStatus", pauseStatus)
        .add("periodic", periodic)
        .add("table", table)
        .add("tableUpdate", tableUpdate)
        .toString();
  }
}
