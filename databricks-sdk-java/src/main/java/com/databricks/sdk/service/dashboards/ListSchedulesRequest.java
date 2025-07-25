// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListSchedulesRequest {
  /** UUID identifying the dashboard to which the schedules belongs. */
  @JsonIgnore private String dashboardId;

  /** The number of schedules to return per page. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous `ListSchedules` call. Use this to retrieve the
   * subsequent page.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListSchedulesRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public ListSchedulesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListSchedulesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSchedulesRequest that = (ListSchedulesRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSchedulesRequest.class)
        .add("dashboardId", dashboardId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
