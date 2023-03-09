// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class LogAnalyticsInfo {
    /**
     * <needs content added>
     */
    @JsonProperty("log_analytics_primary_key")
    private String logAnalyticsPrimaryKey;
    
    /**
     * <needs content added>
     */
    @JsonProperty("log_analytics_workspace_id")
    private String logAnalyticsWorkspaceId;
    
    public LogAnalyticsInfo setLogAnalyticsPrimaryKey(String logAnalyticsPrimaryKey) {
        this.logAnalyticsPrimaryKey = logAnalyticsPrimaryKey;
        return this;
    }

    public String getLogAnalyticsPrimaryKey() {
        return logAnalyticsPrimaryKey;
    }
    
    public LogAnalyticsInfo setLogAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
        this.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
        return this;
    }

    public String getLogAnalyticsWorkspaceId() {
        return logAnalyticsWorkspaceId;
    }
    
}
