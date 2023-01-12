// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a pipeline update
 */
@Generated("databricks-sdk-generator")
public class GetUpdate {
    /**
     * The ID of the pipeline.
     */
    
    private String pipelineId;
    
    /**
     * The ID of the update.
     */
    
    private String updateId;
    
    public GetUpdate setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    public String getPipelineId() {
        return pipelineId;
    }
    
    public GetUpdate setUpdateId(String updateId) {
        this.updateId = updateId;
        return this;
    }

    public String getUpdateId() {
        return updateId;
    }
    
}
