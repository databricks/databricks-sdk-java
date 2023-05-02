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
  /**
   * In the web application, query filters that share a name are coupled to a single selection box
   * if this value is true.
   */
  @JsonProperty("dashboard_filters_enabled")
  private Boolean dashboardFiltersEnabled;

  /** Draft dashboards only appear in list views for their owners. */
  @JsonProperty("is_draft")
  private Boolean isDraft;

  /** Indicates whether the dashboard is trashed. Trashed dashboards don't appear in list views. */
  @JsonProperty("is_trashed")
  private Boolean isTrashed;

  /**
   * The title of this dashboard that appears in list views and at the top of the dashboard page.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The identifier of the workspace folder containing the dashboard. The default is the user's home
   * folder.
   */
  @JsonProperty("parent")
  private String parent;

  /** */
  @JsonProperty("tags")
  private Collection<String> tags;

  /**
   * An array of widget objects. A complete description of widget objects can be found in the
   * response to [Retrieve A Dashboard Definition](#operation/sql-analytics-fetch-dashboard).
   * Databricks does not recommend creating new widgets via this API.
   */
  @JsonProperty("widgets")
  private Collection<Widget> widgets;

  public CreateDashboardRequest setDashboardFiltersEnabled(Boolean dashboardFiltersEnabled) {
    this.dashboardFiltersEnabled = dashboardFiltersEnabled;
    return this;
  }

  public Boolean getDashboardFiltersEnabled() {
    return dashboardFiltersEnabled;
  }

  public CreateDashboardRequest setIsDraft(Boolean isDraft) {
    this.isDraft = isDraft;
    return this;
  }

  public Boolean getIsDraft() {
    return isDraft;
  }

  public CreateDashboardRequest setIsTrashed(Boolean isTrashed) {
    this.isTrashed = isTrashed;
    return this;
  }

  public Boolean getIsTrashed() {
    return isTrashed;
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

  public CreateDashboardRequest setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  public CreateDashboardRequest setWidgets(Collection<Widget> widgets) {
    this.widgets = widgets;
    return this;
  }

  public Collection<Widget> getWidgets() {
    return widgets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDashboardRequest that = (CreateDashboardRequest) o;
    return Objects.equals(dashboardFiltersEnabled, that.dashboardFiltersEnabled)
        && Objects.equals(isDraft, that.isDraft)
        && Objects.equals(isTrashed, that.isTrashed)
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(tags, that.tags)
        && Objects.equals(widgets, that.widgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardFiltersEnabled, isDraft, isTrashed, name, parent, tags, widgets);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDashboardRequest.class)
        .add("dashboardFiltersEnabled", dashboardFiltersEnabled)
        .add("isDraft", isDraft)
        .add("isTrashed", isTrashed)
        .add("name", name)
        .add("parent", parent)
        .add("tags", tags)
        .add("widgets", widgets)
        .toString();
  }
}
