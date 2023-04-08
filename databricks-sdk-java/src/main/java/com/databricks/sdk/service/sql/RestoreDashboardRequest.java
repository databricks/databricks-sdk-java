// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

/** Restore a dashboard */
public class RestoreDashboardRequest {
  /** */
  private String dashboardId;

  public RestoreDashboardRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }
}
