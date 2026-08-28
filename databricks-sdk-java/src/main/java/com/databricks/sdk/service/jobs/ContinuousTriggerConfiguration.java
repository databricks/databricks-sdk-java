// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Continuous trigger. Stripped-down counterpart to `ContinuousSettings`: `pause_status` is owned by
 * the enclosing `TriggerConfiguration` and intentionally omitted here.
 */
@Generated
public class ContinuousTriggerConfiguration {
  /**
   * Defines when platform-initiated maintenance may run for this trigger. If unspecified,
   * maintenance may run at any time.
   */
  @JsonProperty("maintenance_window")
  private MaintenanceWindow maintenanceWindow;

  /** Whether the continuous job applies task-level retries. Defaults to NEVER. */
  @JsonProperty("task_retry_mode")
  private TaskRetryMode taskRetryMode;

  public ContinuousTriggerConfiguration setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

  public MaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }

  public ContinuousTriggerConfiguration setTaskRetryMode(TaskRetryMode taskRetryMode) {
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
    ContinuousTriggerConfiguration that = (ContinuousTriggerConfiguration) o;
    return Objects.equals(maintenanceWindow, that.maintenanceWindow)
        && Objects.equals(taskRetryMode, that.taskRetryMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenanceWindow, taskRetryMode);
  }

  @Override
  public String toString() {
    return new ToStringer(ContinuousTriggerConfiguration.class)
        .add("maintenanceWindow", maintenanceWindow)
        .add("taskRetryMode", taskRetryMode)
        .toString();
  }
}
