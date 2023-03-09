// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SqlDashboardWidgetOutput {
    /**
     * Time (in epoch milliseconds) when execution of the SQL widget ends.
     */
    @JsonProperty("end_time")
    private Long endTime;
    
    /**
     * The information about the error when execution fails.
     */
    @JsonProperty("error")
    private SqlOutputError error;
    
    /**
     * The link to find the output results.
     */
    @JsonProperty("output_link")
    private String outputLink;
    
    /**
     * Time (in epoch milliseconds) when execution of the SQL widget starts.
     */
    @JsonProperty("start_time")
    private Long startTime;
    
    /**
     * The execution status of the SQL widget.
     */
    @JsonProperty("status")
    private SqlDashboardWidgetOutputStatus status;
    
    /**
     * The canonical identifier of the SQL widget.
     */
    @JsonProperty("widget_id")
    private String widgetId;
    
    /**
     * The title of the SQL widget.
     */
    @JsonProperty("widget_title")
    private String widgetTitle;
    
    public SqlDashboardWidgetOutput setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    public Long getEndTime() {
        return endTime;
    }
    
    public SqlDashboardWidgetOutput setError(SqlOutputError error) {
        this.error = error;
        return this;
    }

    public SqlOutputError getError() {
        return error;
    }
    
    public SqlDashboardWidgetOutput setOutputLink(String outputLink) {
        this.outputLink = outputLink;
        return this;
    }

    public String getOutputLink() {
        return outputLink;
    }
    
    public SqlDashboardWidgetOutput setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    public Long getStartTime() {
        return startTime;
    }
    
    public SqlDashboardWidgetOutput setStatus(SqlDashboardWidgetOutputStatus status) {
        this.status = status;
        return this;
    }

    public SqlDashboardWidgetOutputStatus getStatus() {
        return status;
    }
    
    public SqlDashboardWidgetOutput setWidgetId(String widgetId) {
        this.widgetId = widgetId;
        return this;
    }

    public String getWidgetId() {
        return widgetId;
    }
    
    public SqlDashboardWidgetOutput setWidgetTitle(String widgetTitle) {
        this.widgetTitle = widgetTitle;
        return this;
    }

    public String getWidgetTitle() {
        return widgetTitle;
    }
    
}
