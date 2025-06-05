// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedulePb {
  @JsonProperty("day_of_week")
  private ClusterAutoRestartMessageMaintenanceWindowDayOfWeek dayOfWeek;

  @JsonProperty("frequency")
  private ClusterAutoRestartMessageMaintenanceWindowWeekDayFrequency frequency;

  @JsonProperty("window_start_time")
  private ClusterAutoRestartMessageMaintenanceWindowWindowStartTime windowStartTime;

  public ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedulePb setDayOfWeek(
      ClusterAutoRestartMessageMaintenanceWindowDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  public ClusterAutoRestartMessageMaintenanceWindowDayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedulePb setFrequency(
      ClusterAutoRestartMessageMaintenanceWindowWeekDayFrequency frequency) {
    this.frequency = frequency;
    return this;
  }

  public ClusterAutoRestartMessageMaintenanceWindowWeekDayFrequency getFrequency() {
    return frequency;
  }

  public ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedulePb setWindowStartTime(
      ClusterAutoRestartMessageMaintenanceWindowWindowStartTime windowStartTime) {
    this.windowStartTime = windowStartTime;
    return this;
  }

  public ClusterAutoRestartMessageMaintenanceWindowWindowStartTime getWindowStartTime() {
    return windowStartTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedulePb that =
        (ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedulePb) o;
    return Objects.equals(dayOfWeek, that.dayOfWeek)
        && Objects.equals(frequency, that.frequency)
        && Objects.equals(windowStartTime, that.windowStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, frequency, windowStartTime);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedulePb.class)
        .add("dayOfWeek", dayOfWeek)
        .add("frequency", frequency)
        .add("windowStartTime", windowStartTime)
        .toString();
  }
}
