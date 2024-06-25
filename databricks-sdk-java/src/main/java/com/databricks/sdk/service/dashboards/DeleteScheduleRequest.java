// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete dashboard schedule */
@Generated
public class DeleteScheduleRequest {
  /** UUID identifying the dashboard to which the schedule belongs. */
  private String dashboardId;

  /**
   * The etag for the schedule. Optionally, it can be provided to verify that the schedule has not
   * been modified from its last retrieval.
   */
  @QueryParam("etag")
  private String etag;

  /** UUID identifying the schedule. */
  private String scheduleId;

  public DeleteScheduleRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public DeleteScheduleRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DeleteScheduleRequest setScheduleId(String scheduleId) {
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
    DeleteScheduleRequest that = (DeleteScheduleRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(etag, that.etag)
        && Objects.equals(scheduleId, that.scheduleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, etag, scheduleId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteScheduleRequest.class)
        .add("dashboardId", dashboardId)
        .add("etag", etag)
        .add("scheduleId", scheduleId)
        .toString();
  }
}
