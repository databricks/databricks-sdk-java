// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Create a dashboard object
 */
public class CreateDashboardRequest {
    /**
     * In the web application, query filters that share a name are coupled to a
     * single selection box if this value is true.
     */
    @JsonProperty("dashboard_filters_enabled")
    private Boolean dashboardFiltersEnabled;
    
    /**
     * Draft dashboards only appear in list views for their owners.
     */
    @JsonProperty("is_draft")
    private Boolean isDraft;
    
    /**
     * Indicates whether the dashboard is trashed. Trashed dashboards don't
     * appear in list views.
     */
    @JsonProperty("is_trashed")
    private Boolean isTrashed;
    
    /**
     * The title of this dashboard that appears in list views and at the top of
     * the dashboard page.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * The identifier of the workspace folder containing the dashboard. The
     * default is the user's home folder.
     */
    @JsonProperty("parent")
    private String parent;
    
    /**
     
     */
    @JsonProperty("tags")
    private java.util.List<String> tags;
    
    /**
     * An array of widget objects. A complete description of widget objects can
     * be found in the response to [Retrieve A Dashboard
     * Definition](#operation/sql-analytics-fetch-dashboard). Databricks does
     * not recommend creating new widgets via this API.
     */
    @JsonProperty("widgets")
    private java.util.List<Widget> widgets;
    
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
    
    public CreateDashboardRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    public java.util.List<String> getTags() {
        return tags;
    }
    
    public CreateDashboardRequest setWidgets(java.util.List<Widget> widgets) {
        this.widgets = widgets;
        return this;
    }

    public java.util.List<Widget> getWidgets() {
        return widgets;
    }
    
}
