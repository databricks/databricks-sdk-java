// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ServerLogsResponse {
    /**
     * The most recent log lines of the model server processing invocation
     * requests.
     */
    @JsonProperty("logs")
    private String logs;
    
    public ServerLogsResponse setLogs(String logs) {
        this.logs = logs;
        return this;
    }

    public String getLogs() {
        return logs;
    }
    
}
