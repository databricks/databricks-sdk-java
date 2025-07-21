// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Execute query request for published Dashboards. Since published dashboards have the option of
 * running as the publisher, the datasets, warehouse_id are excluded from the request and instead
 * read from the source (lakeview-config) via the additional parameters (dashboardName and
 * dashboardRevisionId)
 */
@Generated
public class ExecutePublishedDashboardQueryRequest {
  /**
   * Dashboard name and revision_id is required to retrieve PublishedDatasetDataModel which contains
   * the list of datasets, warehouse_id, and embedded_credentials
   */
  @JsonProperty("dashboard_name")
  private String dashboardName;

  /** */
  @JsonProperty("dashboard_revision_id")
  private String dashboardRevisionId;

  /**
   * A dashboard schedule can override the warehouse used as compute for processing the published
   * dashboard queries
   */
  @JsonProperty("override_warehouse_id")
  private String overrideWarehouseId;

  public ExecutePublishedDashboardQueryRequest setDashboardName(String dashboardName) {
    this.dashboardName = dashboardName;
    return this;
  }

  public String getDashboardName() {
    return dashboardName;
  }

  public ExecutePublishedDashboardQueryRequest setDashboardRevisionId(String dashboardRevisionId) {
    this.dashboardRevisionId = dashboardRevisionId;
    return this;
  }

  public String getDashboardRevisionId() {
    return dashboardRevisionId;
  }

  public ExecutePublishedDashboardQueryRequest setOverrideWarehouseId(String overrideWarehouseId) {
    this.overrideWarehouseId = overrideWarehouseId;
    return this;
  }

  public String getOverrideWarehouseId() {
    return overrideWarehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExecutePublishedDashboardQueryRequest that = (ExecutePublishedDashboardQueryRequest) o;
    return Objects.equals(dashboardName, that.dashboardName)
        && Objects.equals(dashboardRevisionId, that.dashboardRevisionId)
        && Objects.equals(overrideWarehouseId, that.overrideWarehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardName, dashboardRevisionId, overrideWarehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(ExecutePublishedDashboardQueryRequest.class)
        .add("dashboardName", dashboardName)
        .add("dashboardRevisionId", dashboardRevisionId)
        .add("overrideWarehouseId", overrideWarehouseId)
        .toString();
  }
}
