// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a model
 */
@Generated("databricks-sdk-generator")
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
