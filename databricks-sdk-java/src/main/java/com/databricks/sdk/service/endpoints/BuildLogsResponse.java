// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class BuildLogsResponse {
    /**
     * The logs associated with building the served model's environment.
     */
    @JsonProperty("logs")
    private String logs;
    
    public BuildLogsResponse setLogs(String logs) {
        this.logs = logs;
        return this;
    }

    public String getLogs() {
        return logs;
    }
    
}
