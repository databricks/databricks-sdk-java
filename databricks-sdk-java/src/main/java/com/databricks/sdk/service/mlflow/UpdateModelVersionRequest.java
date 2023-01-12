// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateModelVersionRequest {
    /**
     * If provided, updates the description for this `registered_model`.
     */
    @JsonProperty("description")
    private String description;
    
    /**
     * Name of the registered model
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Model version number
     */
    @JsonProperty("version")
    private String version;
    
    public UpdateModelVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }
    
    public UpdateModelVersionRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public UpdateModelVersionRequest setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return version;
    }
    
}
