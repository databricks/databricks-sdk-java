// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDashboardRequest {
  /** The display name of the dashboard. */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * The workspace path of the folder containing the dashboard. Includes leading slash and no
   * trailing slash. This field is excluded in List Dashboards responses.
   */
  @JsonProperty("parent_path")
  private String parentPath;

  /**
   * The contents of the dashboard in serialized string form. This field is excluded in List
   * Dashboards responses. Use the [get dashboard API] to retrieve an example response, which
   * includes the `serialized_dashboard` field. This field provides the structure of the JSON string
   * that represents the dashboard's layout and components.
   *
   * <p>[get dashboard API]: https://docs.databricks.com/api/workspace/lakeview/get
   */
  @JsonProperty("serialized_dashboard")
  private String serializedDashboard;

  /** The warehouse ID used to run the dashboard. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public CreateDashboardRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateDashboardRequest setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public CreateDashboardRequest setSerializedDashboard(String serializedDashboard) {
    this.serializedDashboard = serializedDashboard;
    return this;
  }

  public String getSerializedDashboard() {
    return serializedDashboard;
  }

  public CreateDashboardRequest setWarehouseId(String warehouseId) {
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
    CreateDashboardRequest that = (CreateDashboardRequest) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(parentPath, that.parentPath)
        && Objects.equals(serializedDashboard, that.serializedDashboard)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, parentPath, serializedDashboard, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDashboardRequest.class)
        .add("displayName", displayName)
        .add("parentPath", parentPath)
        .add("serializedDashboard", serializedDashboard)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
