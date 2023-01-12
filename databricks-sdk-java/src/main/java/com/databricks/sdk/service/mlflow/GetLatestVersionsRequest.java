// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GetLatestVersionsRequest {
    /**
     * Registered model unique name identifier.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * List of stages.
     */
    @JsonProperty("stages")
    private java.util.List<String> stages;
    
    public GetLatestVersionsRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public GetLatestVersionsRequest setStages(java.util.List<String> stages) {
        this.stages = stages;
        return this;
    }

    public java.util.List<String> getStages() {
        return stages;
    }
    
}
