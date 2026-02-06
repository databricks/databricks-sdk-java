// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/** Configures the Lakeview Dashboard job task type. */
@Generated
public class DashboardTask {
  /** The identifier of the dashboard to refresh. */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /**
   * Dashboard task parameters. Used to apply dashboard filter values during dashboard task
   * execution. Parameter values get applied to any dashboard filters that have a matching URL
   * identifier as the parameter key. The parameter value format is dependent on the filter type: -
   * For text and single-select filters, provide a single value (e.g. `"value"`) - For date and
   * datetime filters, provide the value in ISO 8601 format (e.g. `"2000-01-01T00:00:00"`) - For
   * multi-select filters, provide a JSON array of values (e.g. `"[\"value1\",\"value2\"]"`) - For
   * range and date range filters, provide a JSON object with `start` and `end` (e.g.
   * `"{\"start\":\"1\",\"end\":\"10\"}"`)
   */
  @JsonProperty("filters")
  private Map<String, String> filters;

  /** Optional: subscription configuration for sending the dashboard snapshot. */
  @JsonProperty("subscription")
  private Subscription subscription;

  /**
   * Optional: The warehouse id to execute the dashboard with for the schedule. If not specified,
   * the default warehouse of the dashboard will be used.
   */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public DashboardTask setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public DashboardTask setFilters(Map<String, String> filters) {
    this.filters = filters;
    return this;
  }

  public Map<String, String> getFilters() {
    return filters;
  }

  public DashboardTask setSubscription(Subscription subscription) {
    this.subscription = subscription;
    return this;
  }

  public Subscription getSubscription() {
    return subscription;
  }

  public DashboardTask setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardTask that = (DashboardTask) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(filters, that.filters)
        && Objects.equals(subscription, that.subscription)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, filters, subscription, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardTask.class)
        .add("dashboardId", dashboardId)
        .add("filters", filters)
        .add("subscription", subscription)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
