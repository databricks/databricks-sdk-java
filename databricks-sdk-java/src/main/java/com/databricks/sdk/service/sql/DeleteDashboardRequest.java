// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Remove a dashboard
 */
@Generated("databricks-sdk-generator")
public class DeleteDashboardRequest {
    /**
     
     */
    
    private String dashboardId;
    
    public DeleteDashboardRequest setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    public String getDashboardId() {
        return dashboardId;
    }
    
}
