// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class UpdateRegisteredModelRequest {
    /**
     * If provided, updates the description for this `registered_model`.
     */
    @JsonProperty("description")
    private String description;
    
    /**
     * Registered model unique name identifier.
     */
    @JsonProperty("name")
    private String name;
    
    public UpdateRegisteredModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }
    
    public UpdateRegisteredModelRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
