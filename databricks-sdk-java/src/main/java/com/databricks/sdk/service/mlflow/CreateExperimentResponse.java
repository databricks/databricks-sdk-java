// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateExperimentResponse {
    /**
     * Unique identifier for the experiment.
     */
    @JsonProperty("experiment_id")
    private String experimentId;
    
    public CreateExperimentResponse setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }

    public String getExperimentId() {
        return experimentId;
    }
    
}
