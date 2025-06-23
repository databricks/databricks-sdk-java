// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateScheduleRequest {
  /** UUID identifying the dashboard to which the schedule belongs. */
  @JsonIgnore private String dashboardId;

  /** */
  @JsonProperty("schedule")
  private Schedule schedule;

  public CreateScheduleRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public CreateScheduleRequest setSchedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public Schedule getSchedule() {
    return schedule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateScheduleRequest that = (CreateScheduleRequest) o;
    return Objects.equals(dashboardId, that.dashboardId) && Objects.equals(schedule, that.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, schedule);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateScheduleRequest.class)
        .add("dashboardId", dashboardId)
        .add("schedule", schedule)
        .toString();
  }
}
