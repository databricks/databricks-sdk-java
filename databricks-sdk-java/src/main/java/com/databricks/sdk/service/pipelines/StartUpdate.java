// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class StartUpdate {
    /**
     
     */
    @JsonProperty("cause")
    private StartUpdateCause cause;
    
    /**
     * If true, this update will reset all tables before running.
     */
    @JsonProperty("full_refresh")
    private Boolean fullRefresh;
    
    /**
     * A list of tables to update with fullRefresh. If both refresh_selection
     * and full_refresh_selection are empty, this is a full graph update. Full
     * Refresh on a table means that the states of the table will be reset
     * before the refresh.
     */
    @JsonProperty("full_refresh_selection")
    private java.util.List<String> fullRefreshSelection;
    
    /**
     
     */
    
    private String pipelineId;
    
    /**
     * A list of tables to update without fullRefresh. If both refresh_selection
     * and full_refresh_selection are empty, this is a full graph update. Full
     * Refresh on a table means that the states of the table will be reset
     * before the refresh.
     */
    @JsonProperty("refresh_selection")
    private java.util.List<String> refreshSelection;
    
    public StartUpdate setCause(StartUpdateCause cause) {
        this.cause = cause;
        return this;
    }

    public StartUpdateCause getCause() {
        return cause;
    }
    
    public StartUpdate setFullRefresh(Boolean fullRefresh) {
        this.fullRefresh = fullRefresh;
        return this;
    }

    public Boolean getFullRefresh() {
        return fullRefresh;
    }
    
    public StartUpdate setFullRefreshSelection(java.util.List<String> fullRefreshSelection) {
        this.fullRefreshSelection = fullRefreshSelection;
        return this;
    }

    public java.util.List<String> getFullRefreshSelection() {
        return fullRefreshSelection;
    }
    
    public StartUpdate setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    public String getPipelineId() {
        return pipelineId;
    }
    
    public StartUpdate setRefreshSelection(java.util.List<String> refreshSelection) {
        this.refreshSelection = refreshSelection;
        return this;
    }

    public java.util.List<String> getRefreshSelection() {
        return refreshSelection;
    }
    
}
