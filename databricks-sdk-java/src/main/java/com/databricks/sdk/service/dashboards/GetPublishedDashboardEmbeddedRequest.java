// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Read a published dashboard in an embedded ui. */
@Generated
public class GetPublishedDashboardEmbeddedRequest {
  /** UUID identifying the published dashboard. */
  @JsonIgnore private String dashboardId;

  public GetPublishedDashboardEmbeddedRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPublishedDashboardEmbeddedRequest that = (GetPublishedDashboardEmbeddedRequest) o;
    return Objects.equals(dashboardId, that.dashboardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublishedDashboardEmbeddedRequest.class)
        .add("dashboardId", dashboardId)
        .toString();
  }
}
