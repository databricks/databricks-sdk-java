// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List dashboards */
@Generated
public class ListDashboardsRequest {
  /** The number of dashboards to return per page. */
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous `ListDashboards` call. This token can be used to
   * retrieve the subsequent page.
   */
  @QueryParam("page_token")
  private String pageToken;

  /**
   * The flag to include dashboards located in the trash. If unspecified, only active dashboards
   * will be returned.
   */
  @QueryParam("show_trashed")
  private Boolean showTrashed;

  /**
   * Indicates whether to include all metadata from the dashboard in the response. If unset, the
   * response defaults to `DASHBOARD_VIEW_BASIC` which only includes summary metadata from the
   * dashboard.
   */
  @QueryParam("view")
  private DashboardView view;

  public ListDashboardsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDashboardsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListDashboardsRequest setShowTrashed(Boolean showTrashed) {
    this.showTrashed = showTrashed;
    return this;
  }

  public Boolean getShowTrashed() {
    return showTrashed;
  }

  public ListDashboardsRequest setView(DashboardView view) {
    this.view = view;
    return this;
  }

  public DashboardView getView() {
    return view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDashboardsRequest that = (ListDashboardsRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(showTrashed, that.showTrashed)
        && Objects.equals(view, that.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, showTrashed, view);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDashboardsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("showTrashed", showTrashed)
        .add("view", view)
        .toString();
  }
}
