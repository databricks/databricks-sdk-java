// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Retrieve the logs associated with building the model's environment for a
 * given serving endpoint's served model.
 */
public class BuildLogsRequest {
    /**
     * The name of the serving endpoint that the served model belongs to. This
     * field is required.
     */
    
    private String name;
    
    /**
     * The name of the served model that build logs will be retrieved for. This
     * field is required.
     */
    
    private String servedModelName;
    
    public BuildLogsRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public BuildLogsRequest setServedModelName(String servedModelName) {
        this.servedModelName = servedModelName;
        return this;
    }

    public String getServedModelName() {
        return servedModelName;
    }
    
}
