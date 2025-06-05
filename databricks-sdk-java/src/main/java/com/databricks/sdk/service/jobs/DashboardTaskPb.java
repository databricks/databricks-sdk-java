// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Configures the Lakeview Dashboard job task type. */
@Generated
class DashboardTaskPb {
  @JsonProperty("dashboard_id")
  private String dashboardId;

  @JsonProperty("subscription")
  private Subscription subscription;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public DashboardTaskPb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public DashboardTaskPb setSubscription(Subscription subscription) {
    this.subscription = subscription;
    return this;
  }

  public Subscription getSubscription() {
    return subscription;
  }

  public DashboardTaskPb setWarehouseId(String warehouseId) {
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
    DashboardTaskPb that = (DashboardTaskPb) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(subscription, that.subscription)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, subscription, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardTaskPb.class)
        .add("dashboardId", dashboardId)
        .add("subscription", subscription)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
