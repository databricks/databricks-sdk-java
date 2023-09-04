// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Create a dashboard object */
@Generated
public class CreateDashboardRequest {
  /** Indicates whether the dashboard filters are enabled */
  @JsonProperty("dashboard_filters_enabled")
  private Boolean dashboardFiltersEnabled;

  /**
   * Indicates whether this query object should appear in the current user's favorites list. The
   * application uses this flag to determine whether or not the "favorite star " should selected.
   */
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

  /** Run as role */
  @JsonProperty("run_as_role")
  private RunAsRole runAsRole;

  /** */
  @JsonProperty("tags")
  private Collection<String> tags;

  public CreateDashboardRequest setDashboardFiltersEnabled(Boolean dashboardFiltersEnabled) {
    this.dashboardFiltersEnabled = dashboardFiltersEnabled;
    return this;
  }

  public Boolean getDashboardFiltersEnabled() {
    return dashboardFiltersEnabled;
  }

  public CreateDashboardRequest setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

  public Boolean getIsFavorite() {
    return isFavorite;
  }

  public CreateDashboardRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateDashboardRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateDashboardRequest setRunAsRole(RunAsRole runAsRole) {
    this.runAsRole = runAsRole;
    return this;
  }

  public RunAsRole getRunAsRole() {
    return runAsRole;
  }

  public CreateDashboardRequest setTags(Collection<String> tags) {
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
    CreateDashboardRequest that = (CreateDashboardRequest) o;
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
    return new ToStringer(CreateDashboardRequest.class)
        .add("dashboardFiltersEnabled", dashboardFiltersEnabled)
        .add("isFavorite", isFavorite)
        .add("name", name)
        .add("parent", parent)
        .add("runAsRole", runAsRole)
        .add("tags", tags)
        .toString();
  }
}
