// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class TriggerEvaluation {
    /**
     * Human-readable description of the the trigger evaluation result. Explains
     * why the trigger evaluation triggered or did not trigger a run, or failed.
     */
    @JsonProperty("description")
    private String description;
    
    /**
     * The ID of the run that was triggered by the trigger evaluation. Only
     * returned if a run was triggered.
     */
    @JsonProperty("run_id")
    private Long runId;
    
    /**
     * Timestamp at which the trigger was evaluated.
     */
    @JsonProperty("timestamp")
    private Long timestamp;
    
    public TriggerEvaluation setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }
    
    public TriggerEvaluation setRunId(Long runId) {
        this.runId = runId;
        return this;
    }

    public Long getRunId() {
        return runId;
    }
    
    public TriggerEvaluation setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Long getTimestamp() {
        return timestamp;
    }
    
}
