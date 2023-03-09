// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get metadata
 */
public class GetByNameRequest {
    /**
     * Name of the associated experiment.
     */
    @QueryParam("experiment_name")
    private String experimentName;
    
    public GetByNameRequest setExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    public String getExperimentName() {
        return experimentName;
    }
    
}
