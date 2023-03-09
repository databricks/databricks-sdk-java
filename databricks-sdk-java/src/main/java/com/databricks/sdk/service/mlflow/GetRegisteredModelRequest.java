// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a model
 */
public class GetRegisteredModelRequest {
    /**
     * Registered model unique name identifier.
     */
    @QueryParam("name")
    private String name;
    
    public GetRegisteredModelRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
