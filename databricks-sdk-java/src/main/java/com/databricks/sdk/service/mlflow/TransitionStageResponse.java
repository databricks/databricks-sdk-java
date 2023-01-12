// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class TransitionStageResponse {
    /**
     
     */
    @JsonProperty("model_version")
    private ModelVersionDatabricks modelVersion;
    
    public TransitionStageResponse setModelVersion(ModelVersionDatabricks modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    public ModelVersionDatabricks getModelVersion() {
        return modelVersion;
    }
    
}
