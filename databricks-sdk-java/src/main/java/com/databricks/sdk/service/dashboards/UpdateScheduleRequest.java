// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateScheduleRequest {
  /** UUID identifying the dashboard to which the schedule belongs. */
  @JsonIgnore private String dashboardId;

  /** */
  @JsonProperty("schedule")
  private Schedule schedule;

  /** UUID identifying the schedule. */
  @JsonIgnore private String scheduleId;

  public UpdateScheduleRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public UpdateScheduleRequest setSchedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public Schedule getSchedule() {
    return schedule;
  }

  public UpdateScheduleRequest setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateScheduleRequest that = (UpdateScheduleRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(scheduleId, that.scheduleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, schedule, scheduleId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateScheduleRequest.class)
        .add("dashboardId", dashboardId)
        .add("schedule", schedule)
        .add("scheduleId", scheduleId)
        .toString();
  }
}
