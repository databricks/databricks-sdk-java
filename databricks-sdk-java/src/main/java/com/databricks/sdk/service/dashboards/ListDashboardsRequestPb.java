// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List dashboards */
@Generated
class ListDashboardsRequestPb {
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  @JsonIgnore
  @QueryParam("show_trashed")
  private Boolean showTrashed;

  @JsonIgnore
  @QueryParam("view")
  private DashboardView view;

  public ListDashboardsRequestPb setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDashboardsRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListDashboardsRequestPb setShowTrashed(Boolean showTrashed) {
    this.showTrashed = showTrashed;
    return this;
  }

  public Boolean getShowTrashed() {
    return showTrashed;
  }

  public ListDashboardsRequestPb setView(DashboardView view) {
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
    ListDashboardsRequestPb that = (ListDashboardsRequestPb) o;
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
    return new ToStringer(ListDashboardsRequestPb.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("showTrashed", showTrashed)
        .add("view", view)
        .toString();
  }
}
