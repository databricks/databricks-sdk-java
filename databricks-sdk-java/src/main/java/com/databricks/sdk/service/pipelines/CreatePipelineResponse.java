// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreatePipelineResponse {
    /**
     * Only returned when dry_run is true
     */
    @JsonProperty("effective_settings")
    private PipelineSpec effectiveSettings;
    
    /**
     * Only returned when dry_run is false
     */
    @JsonProperty("pipeline_id")
    private String pipelineId;
    
    public CreatePipelineResponse setEffectiveSettings(PipelineSpec effectiveSettings) {
        this.effectiveSettings = effectiveSettings;
        return this;
    }

    public PipelineSpec getEffectiveSettings() {
        return effectiveSettings;
    }
    
    public CreatePipelineResponse setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    public String getPipelineId() {
        return pipelineId;
    }
    
}
