// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get all artifacts
 */
public class ListArtifactsRequest {
    /**
     * Token indicating the page of artifact results to fetch
     */
    @QueryParam("page_token")
    private String pageToken;
    
    /**
     * Filter artifacts matching this path (a relative path from the root
     * artifact directory).
     */
    @QueryParam("path")
    private String path;
    
    /**
     * ID of the run whose artifacts to list. Must be provided.
     */
    @QueryParam("run_id")
    private String runId;
    
    /**
     * [Deprecated, use run_id instead] ID of the run whose artifacts to list.
     * This field will be removed in a future MLflow version.
     */
    @QueryParam("run_uuid")
    private String runUuid;
    
    public ListArtifactsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public String getPageToken() {
        return pageToken;
    }
    
    public ListArtifactsRequest setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return path;
    }
    
    public ListArtifactsRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getRunId() {
        return runId;
    }
    
    public ListArtifactsRequest setRunUuid(String runUuid) {
        this.runUuid = runUuid;
        return this;
    }

    public String getRunUuid() {
        return runUuid;
    }
    
}
