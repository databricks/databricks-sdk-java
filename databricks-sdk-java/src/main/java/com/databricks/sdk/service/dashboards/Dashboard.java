// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Dashboard {
  /** The timestamp of when the dashboard was created. */
  @JsonProperty("create_time")
  private String createTime;

  /** UUID identifying the dashboard. */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /** The display name of the dashboard. */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * The etag for the dashboard. Can be optionally provided on updates to ensure that the dashboard
   * has not been modified since the last read.
   */
  @JsonProperty("etag")
  private String etag;

  /** The state of the dashboard resource. Used for tracking trashed status. */
  @JsonProperty("lifecycle_state")
  private LifecycleState lifecycleState;

  /**
   * The workspace path of the folder containing the dashboard. Includes leading slash and no
   * trailing slash.
   */
  @JsonProperty("parent_path")
  private String parentPath;

  /** The workspace path of the dashboard asset, including the file name. */
  @JsonProperty("path")
  private String path;

  /** The contents of the dashboard in serialized string form. */
  @JsonProperty("serialized_dashboard")
  private String serializedDashboard;

  /** The timestamp of when the dashboard was last updated by the user. */
  @JsonProperty("update_time")
  private String updateTime;

  /** The warehouse ID used to run the dashboard. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public Dashboard setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public Dashboard setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public Dashboard setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Dashboard setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public Dashboard setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public Dashboard setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public Dashboard setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public Dashboard setSerializedDashboard(String serializedDashboard) {
    this.serializedDashboard = serializedDashboard;
    return this;
  }

  public String getSerializedDashboard() {
    return serializedDashboard;
  }

  public Dashboard setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public Dashboard setWarehouseId(String warehouseId) {
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
    Dashboard that = (Dashboard) o;
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
    return new ToStringer(Dashboard.class)
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
