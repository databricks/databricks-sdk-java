// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateExperiment {
    /**
     * ID of the associated experiment.
     */
    @JsonProperty("experiment_id")
    private String experimentId;
    
    /**
     * If provided, the experiment's name is changed to the new name. The new
     * name must be unique.
     */
    @JsonProperty("new_name")
    private String newName;
    
    public UpdateExperiment setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }

    public String getExperimentId() {
        return experimentId;
    }
    
    public UpdateExperiment setNewName(String newName) {
        this.newName = newName;
        return this;
    }

    public String getNewName() {
        return newName;
    }
    
}
