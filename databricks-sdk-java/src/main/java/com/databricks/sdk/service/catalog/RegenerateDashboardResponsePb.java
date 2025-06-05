// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RegenerateDashboardResponsePb {
  @JsonProperty("dashboard_id")
  private String dashboardId;

  @JsonProperty("parent_folder")
  private String parentFolder;

  public RegenerateDashboardResponsePb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public RegenerateDashboardResponsePb setParentFolder(String parentFolder) {
    this.parentFolder = parentFolder;
    return this;
  }

  public String getParentFolder() {
    return parentFolder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegenerateDashboardResponsePb that = (RegenerateDashboardResponsePb) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(parentFolder, that.parentFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, parentFolder);
  }

  @Override
  public String toString() {
    return new ToStringer(RegenerateDashboardResponsePb.class)
        .add("dashboardId", dashboardId)
        .add("parentFolder", parentFolder)
        .toString();
  }
}
