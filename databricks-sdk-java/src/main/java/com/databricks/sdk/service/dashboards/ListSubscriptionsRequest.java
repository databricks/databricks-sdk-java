// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List schedule subscriptions */
@Generated
public class ListSubscriptionsRequest {
  /** UUID identifying the dashboard to which the subscription belongs. */
  private String dashboardId;

  /** The number of subscriptions to return per page. */
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous `ListSubscriptions` call. Use this to retrieve the
   * subsequent page.
   */
  @QueryParam("page_token")
  private String pageToken;

  /** UUID identifying the schedule to which the subscription belongs. */
  private String scheduleId;

  public ListSubscriptionsRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public ListSubscriptionsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListSubscriptionsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListSubscriptionsRequest setScheduleId(String scheduleId) {
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
    ListSubscriptionsRequest that = (ListSubscriptionsRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(scheduleId, that.scheduleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, pageSize, pageToken, scheduleId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSubscriptionsRequest.class)
        .add("dashboardId", dashboardId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("scheduleId", scheduleId)
        .toString();
  }
}
