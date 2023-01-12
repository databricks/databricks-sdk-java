// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Retrieve a definition
 */
@Generated("databricks-sdk-generator")
public class GetDashboardRequest {
    /**
     
     */
    
    private String dashboardId;
    
    public GetDashboardRequest setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    public String getDashboardId() {
        return dashboardId;
    }
    
}
