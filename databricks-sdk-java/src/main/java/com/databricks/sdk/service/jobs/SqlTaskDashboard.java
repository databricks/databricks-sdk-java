// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class SqlTaskDashboard {
    /**
     * The canonical identifier of the SQL dashboard.
     */
    @JsonProperty("dashboard_id")
    private String dashboardId;
    
    public SqlTaskDashboard setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    public String getDashboardId() {
        return dashboardId;
    }
    
}
