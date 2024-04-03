// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DashboardEditContent {
  /** */
  private String dashboardId;

  /**
   * The title of this dashboard that appears in list views and at the top of the dashboard page.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Sets the **Run as** role for the object. Must be set to one of `"viewer"` (signifying "run as
   * viewer" behavior) or `"owner"` (signifying "run as owner" behavior)
   */
  @JsonProperty("run_as_role")
  private RunAsRole runAsRole;

  public DashboardEditContent setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public DashboardEditContent setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DashboardEditContent setRunAsRole(RunAsRole runAsRole) {
    this.runAsRole = runAsRole;
    return this;
  }

  public RunAsRole getRunAsRole() {
    return runAsRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardEditContent that = (DashboardEditContent) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(name, that.name)
        && Objects.equals(runAsRole, that.runAsRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, name, runAsRole);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardEditContent.class)
        .add("dashboardId", dashboardId)
        .add("name", name)
        .add("runAsRole", runAsRole)
        .toString();
  }
}
