// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class UpdateWorkspaceAssignments {
    /**
     * Array of permissions assignments to update on the workspace.
     */
    @JsonProperty("permissions")
    private java.util.List<WorkspacePermission> permissions;
    
    /**
     * The ID of the user, service principal, or group.
     */
    
    private Long principalId;
    
    /**
     * The workspace ID.
     */
    
    private Long workspaceId;
    
    public UpdateWorkspaceAssignments setPermissions(java.util.List<WorkspacePermission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public java.util.List<WorkspacePermission> getPermissions() {
        return permissions;
    }
    
    public UpdateWorkspaceAssignments setPrincipalId(Long principalId) {
        this.principalId = principalId;
        return this;
    }

    public Long getPrincipalId() {
        return principalId;
    }
    
    public UpdateWorkspaceAssignments setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    public Long getWorkspaceId() {
        return workspaceId;
    }
    
}
