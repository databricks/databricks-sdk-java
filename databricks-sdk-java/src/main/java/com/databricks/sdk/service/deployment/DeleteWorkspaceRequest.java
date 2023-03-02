// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a workspace
 */
@Generated("databricks-sdk-generator")
public class DeleteWorkspaceRequest {
    /**
     * Workspace ID.
     */
    
    private Long workspaceId;
    
    public DeleteWorkspaceRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    public Long getWorkspaceId() {
        return workspaceId;
    }
    
}
