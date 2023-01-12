// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateWorkspaceAssignments {
    /**
     * Array of permissions assignments to apply to a workspace.
     */
    @JsonProperty("permission_assignments")
    private java.util.List<PermissionAssignmentInput> permissionAssignments;
    
    /**
     * The workspace ID for the account.
     */
    
    private Long workspaceId;
    
    public CreateWorkspaceAssignments setPermissionAssignments(java.util.List<PermissionAssignmentInput> permissionAssignments) {
        this.permissionAssignments = permissionAssignments;
        return this;
    }

    public java.util.List<PermissionAssignmentInput> getPermissionAssignments() {
        return permissionAssignments;
    }
    
    public CreateWorkspaceAssignments setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    public Long getWorkspaceId() {
        return workspaceId;
    }
    
}
