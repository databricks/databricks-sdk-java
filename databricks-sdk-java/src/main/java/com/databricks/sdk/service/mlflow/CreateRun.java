// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateRun {
    /**
     * ID of the associated experiment.
     */
    @JsonProperty("experiment_id")
    private String experimentId;
    
    /**
     * Unix timestamp in milliseconds of when the run started.
     */
    @JsonProperty("start_time")
    private Long startTime;
    
    /**
     * Additional metadata for run.
     */
    @JsonProperty("tags")
    private java.util.List<RunTag> tags;
    
    /**
     * ID of the user executing the run. This field is deprecated as of MLflow
     * 1.0, and will be removed in a future MLflow release. Use 'mlflow.user'
     * tag instead.
     */
    @JsonProperty("user_id")
    private String userId;
    
    public CreateRun setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }

    public String getExperimentId() {
        return experimentId;
    }
    
    public CreateRun setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    public Long getStartTime() {
        return startTime;
    }
    
    public CreateRun setTags(java.util.List<RunTag> tags) {
        this.tags = tags;
        return this;
    }

    public java.util.List<RunTag> getTags() {
        return tags;
    }
    
    public CreateRun setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return userId;
    }
    
}
