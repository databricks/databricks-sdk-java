// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create dashboard schedule */
@Generated
class CreateScheduleRequestPb {
  @JsonIgnore private String dashboardId;

  @JsonProperty("schedule")
  private Schedule schedule;

  public CreateScheduleRequestPb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public CreateScheduleRequestPb setSchedule(Schedule schedule) {
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
    CreateScheduleRequestPb that = (CreateScheduleRequestPb) o;
    return Objects.equals(dashboardId, that.dashboardId) && Objects.equals(schedule, that.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, schedule);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateScheduleRequestPb.class)
        .add("dashboardId", dashboardId)
        .add("schedule", schedule)
        .toString();
  }
}
