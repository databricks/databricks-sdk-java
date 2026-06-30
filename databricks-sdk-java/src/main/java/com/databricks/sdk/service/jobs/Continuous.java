// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Continuous {
  /**
   * Indicate whether the continuous execution of the job is paused or not. Defaults to UNPAUSED.
   */
  @JsonProperty("pause_status")
  private PauseStatus pauseStatus;

  /**
   * Indicate whether the continuous job is applying task level retries or not. Defaults to NEVER.
   */
  @JsonProperty("task_retry_mode")
  private TaskRetryMode taskRetryMode;

  public Continuous setPauseStatus(PauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public PauseStatus getPauseStatus() {
    return pauseStatus;
  }

  public Continuous setTaskRetryMode(TaskRetryMode taskRetryMode) {
    this.taskRetryMode = taskRetryMode;
    return this;
  }

  public TaskRetryMode getTaskRetryMode() {
    return taskRetryMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Continuous that = (Continuous) o;
    return Objects.equals(pauseStatus, that.pauseStatus)
        && Objects.equals(taskRetryMode, that.taskRetryMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pauseStatus, taskRetryMode);
  }

  @Override
  public String toString() {
    return new ToStringer(Continuous.class)
        .add("pauseStatus", pauseStatus)
        .add("taskRetryMode", taskRetryMode)
        .toString();
  }
}
