// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>TriggerSettings class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TriggerSettings {
  /** File arrival trigger settings. */
  @JsonProperty("file_arrival")
  private FileArrivalTriggerSettings fileArrival;

  /** Whether this trigger is paused or not. */
  @JsonProperty("pause_status")
  private TriggerSettingsPauseStatus pauseStatus;

  /**
   * <p>Setter for the field <code>fileArrival</code>.</p>
   *
   * @param fileArrival a {@link com.databricks.sdk.service.jobs.FileArrivalTriggerSettings} object
   * @return a {@link com.databricks.sdk.service.jobs.TriggerSettings} object
   */
  public TriggerSettings setFileArrival(FileArrivalTriggerSettings fileArrival) {
    this.fileArrival = fileArrival;
    return this;
  }

  /**
   * <p>Getter for the field <code>fileArrival</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.FileArrivalTriggerSettings} object
   */
  public FileArrivalTriggerSettings getFileArrival() {
    return fileArrival;
  }

  /**
   * <p>Setter for the field <code>pauseStatus</code>.</p>
   *
   * @param pauseStatus a {@link com.databricks.sdk.service.jobs.TriggerSettingsPauseStatus} object
   * @return a {@link com.databricks.sdk.service.jobs.TriggerSettings} object
   */
  public TriggerSettings setPauseStatus(TriggerSettingsPauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  /**
   * <p>Getter for the field <code>pauseStatus</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.TriggerSettingsPauseStatus} object
   */
  public TriggerSettingsPauseStatus getPauseStatus() {
    return pauseStatus;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TriggerSettings that = (TriggerSettings) o;
    return Objects.equals(fileArrival, that.fileArrival)
        && Objects.equals(pauseStatus, that.pauseStatus);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(fileArrival, pauseStatus);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TriggerSettings.class)
        .add("fileArrival", fileArrival)
        .add("pauseStatus", pauseStatus)
        .toString();
  }
}
