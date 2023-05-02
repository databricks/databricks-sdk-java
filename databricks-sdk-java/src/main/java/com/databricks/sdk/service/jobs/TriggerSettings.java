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
  private FileArrivalTriggerSettings fileArrival;

  /** Whether this trigger is paused or not. */
  @JsonProperty("pause_status")
  private TriggerSettingsPauseStatus pauseStatus;

  public TriggerSettings setFileArrival(FileArrivalTriggerSettings fileArrival) {
    this.fileArrival = fileArrival;
    return this;
  }

  public FileArrivalTriggerSettings getFileArrival() {
    return fileArrival;
  }

  public TriggerSettings setPauseStatus(TriggerSettingsPauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public TriggerSettingsPauseStatus getPauseStatus() {
    return pauseStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TriggerSettings that = (TriggerSettings) o;
    return Objects.equals(fileArrival, that.fileArrival)
        && Objects.equals(pauseStatus, that.pauseStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileArrival, pauseStatus);
  }

  @Override
  public String toString() {
    return new ToStringer(TriggerSettings.class)
        .add("fileArrival", fileArrival)
        .add("pauseStatus", pauseStatus)
        .toString();
  }
}
