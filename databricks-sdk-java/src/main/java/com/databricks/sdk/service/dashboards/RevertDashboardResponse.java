// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Response to revert a dashboard draft to its last published state. */
@Generated
public class RevertDashboardResponse {
  /** The reverted dashboard. */
  @JsonProperty("dashboard")
  private Dashboard dashboard;

  public RevertDashboardResponse setDashboard(Dashboard dashboard) {
    this.dashboard = dashboard;
    return this;
  }

  public Dashboard getDashboard() {
    return dashboard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RevertDashboardResponse that = (RevertDashboardResponse) o;
    return Objects.equals(dashboard, that.dashboard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboard);
  }

  @Override
  public String toString() {
    return new ToStringer(RevertDashboardResponse.class).add("dashboard", dashboard).toString();
  }
}
