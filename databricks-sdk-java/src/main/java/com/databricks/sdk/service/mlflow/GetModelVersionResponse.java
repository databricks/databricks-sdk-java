// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class GetModelVersionResponse {
    /**
     
     */
    @JsonProperty("model_version")
    private ModelVersion modelVersion;
    
    public GetModelVersionResponse setModelVersion(ModelVersion modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    public ModelVersion getModelVersion() {
        return modelVersion;
    }
    
}
