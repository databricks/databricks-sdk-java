// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a model
 */
public class DeleteRegisteredModelRequest {
    /**
     * Registered model unique name identifier.
     */
    @QueryParam("name")
    private String name;
    
    public DeleteRegisteredModelRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
