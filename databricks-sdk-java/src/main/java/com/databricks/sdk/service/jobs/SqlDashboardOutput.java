// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class SqlDashboardOutput {
    /**
     * Widgets executed in the run. Only SQL query based widgets are listed.
     */
    @JsonProperty("widgets")
    private SqlDashboardWidgetOutput widgets;
    
    public SqlDashboardOutput setWidgets(SqlDashboardWidgetOutput widgets) {
        this.widgets = widgets;
        return this;
    }

    public SqlDashboardWidgetOutput getWidgets() {
        return widgets;
    }
    
}
