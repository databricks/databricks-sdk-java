// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get dashboard schedule */
@Generated
public class GetScheduleRequest {
  /** UUID identifying the dashboard to which the schedule belongs. */
  private String dashboardId;

  /** UUID identifying the schedule. */
  private String scheduleId;

  public GetScheduleRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public GetScheduleRequest setScheduleId(String scheduleId) {
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
    GetScheduleRequest that = (GetScheduleRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(scheduleId, that.scheduleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, scheduleId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetScheduleRequest.class)
        .add("dashboardId", dashboardId)
        .add("scheduleId", scheduleId)
        .toString();
  }
}
