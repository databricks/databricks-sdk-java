// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ClusterAutoRestartMessageMaintenanceWindow {
  /** */
  @JsonProperty("week_day_based_schedule")
  private ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule weekDayBasedSchedule;

  public ClusterAutoRestartMessageMaintenanceWindow setWeekDayBasedSchedule(
      ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule weekDayBasedSchedule) {
    this.weekDayBasedSchedule = weekDayBasedSchedule;
    return this;
  }

  public ClusterAutoRestartMessageMaintenanceWindowWeekDayBasedSchedule getWeekDayBasedSchedule() {
    return weekDayBasedSchedule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterAutoRestartMessageMaintenanceWindow that =
        (ClusterAutoRestartMessageMaintenanceWindow) o;
    return Objects.equals(weekDayBasedSchedule, that.weekDayBasedSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekDayBasedSchedule);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterAutoRestartMessageMaintenanceWindow.class)
        .add("weekDayBasedSchedule", weekDayBasedSchedule)
        .toString();
  }
}
