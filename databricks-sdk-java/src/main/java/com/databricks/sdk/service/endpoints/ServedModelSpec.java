// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ServedModelSpec {
    /**
     * The name of the model in Databricks Model Registry.
     */
    @JsonProperty("model_name")
    private String modelName;
    
    /**
     * The version of the model in Databricks Model Registry.
     */
    @JsonProperty("model_version")
    private String modelVersion;
    
    /**
     * The name of the served model.
     */
    @JsonProperty("name")
    private String name;
    
    public ServedModelSpec setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public String getModelName() {
        return modelName;
    }
    
    public ServedModelSpec setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    public String getModelVersion() {
        return modelVersion;
    }
    
    public ServedModelSpec setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
