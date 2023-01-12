// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GetExperimentByNameResponse {
    /**
     * Experiment details.
     */
    @JsonProperty("experiment")
    private Experiment experiment;
    
    public GetExperimentByNameResponse setExperiment(Experiment experiment) {
        this.experiment = experiment;
        return this;
    }

    public Experiment getExperiment() {
        return experiment;
    }
    
}
