// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class DeleteTag {
    /**
     * Name of the tag. Maximum size is 255 bytes. Must be provided.
     */
    @JsonProperty("key")
    private String key;
    
    /**
     * ID of the run that the tag was logged under. Must be provided.
     */
    @JsonProperty("run_id")
    private String runId;
    
    public DeleteTag setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return key;
    }
    
    public DeleteTag setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getRunId() {
        return runId;
    }
    
}
