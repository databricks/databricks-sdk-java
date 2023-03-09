// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class DeleteRun {
    /**
     * ID of the run to delete.
     */
    @JsonProperty("run_id")
    private String runId;
    
    public DeleteRun setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getRunId() {
        return runId;
    }
    
}
