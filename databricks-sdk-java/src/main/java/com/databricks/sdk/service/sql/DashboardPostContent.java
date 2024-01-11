// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class DashboardPostContent {
  /** Indicates whether the dashboard filters are enabled */
  @JsonProperty("dashboard_filters_enabled")
  private Boolean dashboardFiltersEnabled;

  /** Indicates whether this dashboard object should appear in the current user's favorites list. */
  @JsonProperty("is_favorite")
  private Boolean isFavorite;

  /**
   * The title of this dashboard that appears in list views and at the top of the dashboard page.
   */
  @JsonProperty("name")
  private String name;

  /** The identifier of the workspace folder containing the object. */
  @JsonProperty("parent")
  private String parent;

  /**
   * Sets the **Run as** role for the object. Must be set to one of `"viewer"` (signifying "run as
   * viewer" behavior) or `"owner"` (signifying "run as owner" behavior)
   */
  @JsonProperty("run_as_role")
  private RunAsRole runAsRole;

  /** */
  @JsonProperty("tags")
  private Collection<String> tags;

  public DashboardPostContent setDashboardFiltersEnabled(Boolean dashboardFiltersEnabled) {
    this.dashboardFiltersEnabled = dashboardFiltersEnabled;
    return this;
  }

  public Boolean getDashboardFiltersEnabled() {
    return dashboardFiltersEnabled;
  }

  public DashboardPostContent setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

  public Boolean getIsFavorite() {
    return isFavorite;
  }

  public DashboardPostContent setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DashboardPostContent setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public DashboardPostContent setRunAsRole(RunAsRole runAsRole) {
    this.runAsRole = runAsRole;
    return this;
  }

  public RunAsRole getRunAsRole() {
    return runAsRole;
  }

  public DashboardPostContent setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardPostContent that = (DashboardPostContent) o;
    return Objects.equals(dashboardFiltersEnabled, that.dashboardFiltersEnabled)
        && Objects.equals(isFavorite, that.isFavorite)
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(runAsRole, that.runAsRole)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardFiltersEnabled, isFavorite, name, parent, runAsRole, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardPostContent.class)
        .add("dashboardFiltersEnabled", dashboardFiltersEnabled)
        .add("isFavorite", isFavorite)
        .add("name", name)
        .add("parent", parent)
        .add("runAsRole", runAsRole)
        .add("tags", tags)
        .toString();
  }
}
