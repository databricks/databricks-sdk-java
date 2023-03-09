// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class TransitionModelVersionStageResponse {
    /**
     * Updated model version
     */
    @JsonProperty("model_version")
    private ModelVersion modelVersion;
    
    public TransitionModelVersionStageResponse setModelVersion(ModelVersion modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    public ModelVersion getModelVersion() {
        return modelVersion;
    }
    
}
