// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get an experiment
 */
@Generated("databricks-sdk-generator")
public class GetExperimentRequest {
    /**
     * ID of the associated experiment.
     */
    @QueryParam("experiment_id")
    private String experimentId;
    
    public GetExperimentRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }

    public String getExperimentId() {
        return experimentId;
    }
    
}
