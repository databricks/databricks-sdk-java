// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a pipeline
 */
public class Delete {
    /**
     
     */
    
    private String pipelineId;
    
    public Delete setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    public String getPipelineId() {
        return pipelineId;
    }
    
}
