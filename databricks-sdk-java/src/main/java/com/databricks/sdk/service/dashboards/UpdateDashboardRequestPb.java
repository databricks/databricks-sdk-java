// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update dashboard */
@Generated
class UpdateDashboardRequestPb {
  @JsonProperty("dashboard")
  private Dashboard dashboard;

  @JsonIgnore private String dashboardId;

  public UpdateDashboardRequestPb setDashboard(Dashboard dashboard) {
    this.dashboard = dashboard;
    return this;
  }

  public Dashboard getDashboard() {
    return dashboard;
  }

  public UpdateDashboardRequestPb setDashboardId(String dashboardId) {
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
    UpdateDashboardRequestPb that = (UpdateDashboardRequestPb) o;
    return Objects.equals(dashboard, that.dashboard)
        && Objects.equals(dashboardId, that.dashboardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboard, dashboardId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDashboardRequestPb.class)
        .add("dashboard", dashboard)
        .add("dashboardId", dashboardId)
        .toString();
  }
}
