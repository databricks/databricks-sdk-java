// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class PermissionAssignment {
    /**
     * Error response associated with a workspace permission assignment, if any.
     */
    @JsonProperty("error")
    private String error;
    
    /**
     * The permissions level of the principal.
     */
    @JsonProperty("permissions")
    private java.util.List<WorkspacePermission> permissions;
    
    /**
     * Information about the principal assigned to the workspace.
     */
    @JsonProperty("principal")
    private PrincipalOutput principal;
    
    public PermissionAssignment setError(String error) {
        this.error = error;
        return this;
    }

    public String getError() {
        return error;
    }
    
    public PermissionAssignment setPermissions(java.util.List<WorkspacePermission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public java.util.List<WorkspacePermission> getPermissions() {
        return permissions;
    }
    
    public PermissionAssignment setPrincipal(PrincipalOutput principal) {
        this.principal = principal;
        return this;
    }

    public PrincipalOutput getPrincipal() {
        return principal;
    }
    
}
