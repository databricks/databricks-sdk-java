// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a workspace
 */
public class GetWorkspaceRequest {
    /**
     * Workspace ID.
     */
    
    private Long workspaceId;
    
    public GetWorkspaceRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    public Long getWorkspaceId() {
        return workspaceId;
    }
    
}
