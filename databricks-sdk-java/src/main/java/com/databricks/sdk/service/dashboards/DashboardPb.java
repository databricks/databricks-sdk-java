// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DashboardPb {
  @JsonProperty("create_time")
  private String createTime;

  @JsonProperty("dashboard_id")
  private String dashboardId;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("lifecycle_state")
  private LifecycleState lifecycleState;

  @JsonProperty("parent_path")
  private String parentPath;

  @JsonProperty("path")
  private String path;

  @JsonProperty("serialized_dashboard")
  private String serializedDashboard;

  @JsonProperty("update_time")
  private String updateTime;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public DashboardPb setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public DashboardPb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public DashboardPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public DashboardPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DashboardPb setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public DashboardPb setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public DashboardPb setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public DashboardPb setSerializedDashboard(String serializedDashboard) {
    this.serializedDashboard = serializedDashboard;
    return this;
  }

  public String getSerializedDashboard() {
    return serializedDashboard;
  }

  public DashboardPb setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public DashboardPb setWarehouseId(String warehouseId) {
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
    DashboardPb that = (DashboardPb) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(etag, that.etag)
        && Objects.equals(lifecycleState, that.lifecycleState)
        && Objects.equals(parentPath, that.parentPath)
        && Objects.equals(path, that.path)
        && Objects.equals(serializedDashboard, that.serializedDashboard)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        dashboardId,
        displayName,
        etag,
        lifecycleState,
        parentPath,
        path,
        serializedDashboard,
        updateTime,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardPb.class)
        .add("createTime", createTime)
        .add("dashboardId", dashboardId)
        .add("displayName", displayName)
        .add("etag", etag)
        .add("lifecycleState", lifecycleState)
        .add("parentPath", parentPath)
        .add("path", path)
        .add("serializedDashboard", serializedDashboard)
        .add("updateTime", updateTime)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
