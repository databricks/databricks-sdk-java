// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
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
