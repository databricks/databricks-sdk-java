// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

/** Retrieve a definition */
public class GetDashboardRequest {
  /** */
  private String dashboardId;

  public GetDashboardRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }
}
