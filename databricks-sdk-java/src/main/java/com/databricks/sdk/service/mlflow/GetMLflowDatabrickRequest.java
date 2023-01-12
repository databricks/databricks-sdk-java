// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get model
 */
@Generated("databricks-sdk-generator")
public class GetMLflowDatabrickRequest {
    /**
     * Name of the model.
     */
    @QueryParam("name")
    private String name;
    
    public GetMLflowDatabrickRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
