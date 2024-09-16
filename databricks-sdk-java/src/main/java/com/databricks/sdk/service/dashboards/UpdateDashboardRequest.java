// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateDashboardRequest {
  /** UUID identifying the dashboard. */
  @JsonIgnore private String dashboardId;

  /** The display name of the dashboard. */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * The etag for the dashboard. Can be optionally provided on updates to ensure that the dashboard
   * has not been modified since the last read. This field is excluded in List Dashboards responses.
   */
  @JsonProperty("etag")
  private String etag;

  /**
   * The contents of the dashboard in serialized string form. This field is excluded in List
   * Dashboards responses.
   */
  @JsonProperty("serialized_dashboard")
  private String serializedDashboard;

  /** The warehouse ID used to run the dashboard. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public UpdateDashboardRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public UpdateDashboardRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public UpdateDashboardRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public UpdateDashboardRequest setSerializedDashboard(String serializedDashboard) {
    this.serializedDashboard = serializedDashboard;
    return this;
  }

  public String getSerializedDashboard() {
    return serializedDashboard;
  }

  public UpdateDashboardRequest setWarehouseId(String warehouseId) {
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
    UpdateDashboardRequest that = (UpdateDashboardRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(etag, that.etag)
        && Objects.equals(serializedDashboard, that.serializedDashboard)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, displayName, etag, serializedDashboard, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDashboardRequest.class)
        .add("dashboardId", dashboardId)
        .add("displayName", displayName)
        .add("etag", etag)
        .add("serializedDashboard", serializedDashboard)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
