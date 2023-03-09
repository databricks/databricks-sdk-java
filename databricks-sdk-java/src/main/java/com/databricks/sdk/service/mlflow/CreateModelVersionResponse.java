// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateModelVersionResponse {
    /**
     * Return new version number generated for this model in registry.
     */
    @JsonProperty("model_version")
    private ModelVersion modelVersion;
    
    public CreateModelVersionResponse setModelVersion(ModelVersion modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    public ModelVersion getModelVersion() {
        return modelVersion;
    }
    
}
