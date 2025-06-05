// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class DashboardEditContentPb {
  @JsonIgnore private String dashboardId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("run_as_role")
  private RunAsRole runAsRole;

  @JsonProperty("tags")
  private Collection<String> tags;

  public DashboardEditContentPb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public DashboardEditContentPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DashboardEditContentPb setRunAsRole(RunAsRole runAsRole) {
    this.runAsRole = runAsRole;
    return this;
  }

  public RunAsRole getRunAsRole() {
    return runAsRole;
  }

  public DashboardEditContentPb setTags(Collection<String> tags) {
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
    DashboardEditContentPb that = (DashboardEditContentPb) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(name, that.name)
        && Objects.equals(runAsRole, that.runAsRole)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, name, runAsRole, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardEditContentPb.class)
        .add("dashboardId", dashboardId)
        .add("name", name)
        .add("runAsRole", runAsRole)
        .add("tags", tags)
        .toString();
  }
}
