// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Retrieve the most recent log lines associated with a given serving endpoint's
 * served model
 */
public class LogsRequest {
    /**
     * The name of the serving endpoint that the served model belongs to. This
     * field is required.
     */
    
    private String name;
    
    /**
     * The name of the served model that logs will be retrieved for. This field
     * is required.
     */
    
    private String servedModelName;
    
    public LogsRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public LogsRequest setServedModelName(String servedModelName) {
        this.servedModelName = servedModelName;
        return this;
    }

    public String getServedModelName() {
        return servedModelName;
    }
    
}
