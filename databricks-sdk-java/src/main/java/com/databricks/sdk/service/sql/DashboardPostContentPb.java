// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class DashboardPostContentPb {
  @JsonProperty("dashboard_filters_enabled")
  private Boolean dashboardFiltersEnabled;

  @JsonProperty("is_favorite")
  private Boolean isFavorite;

  @JsonProperty("name")
  private String name;

  @JsonProperty("parent")
  private String parent;

  @JsonProperty("run_as_role")
  private RunAsRole runAsRole;

  @JsonProperty("tags")
  private Collection<String> tags;

  public DashboardPostContentPb setDashboardFiltersEnabled(Boolean dashboardFiltersEnabled) {
    this.dashboardFiltersEnabled = dashboardFiltersEnabled;
    return this;
  }

  public Boolean getDashboardFiltersEnabled() {
    return dashboardFiltersEnabled;
  }

  public DashboardPostContentPb setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

  public Boolean getIsFavorite() {
    return isFavorite;
  }

  public DashboardPostContentPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DashboardPostContentPb setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public DashboardPostContentPb setRunAsRole(RunAsRole runAsRole) {
    this.runAsRole = runAsRole;
    return this;
  }

  public RunAsRole getRunAsRole() {
    return runAsRole;
  }

  public DashboardPostContentPb setTags(Collection<String> tags) {
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
    DashboardPostContentPb that = (DashboardPostContentPb) o;
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
    return new ToStringer(DashboardPostContentPb.class)
        .add("dashboardFiltersEnabled", dashboardFiltersEnabled)
        .add("isFavorite", isFavorite)
        .add("name", name)
        .add("parent", parent)
        .add("runAsRole", runAsRole)
        .add("tags", tags)
        .toString();
  }
}
