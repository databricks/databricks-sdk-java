// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class PermissionAssignments {
    /**
     * Array of permissions assignments defined for a workspace.
     */
    @JsonProperty("permission_assignments")
    private java.util.List<PermissionAssignment> permissionAssignments;
    
    public PermissionAssignments setPermissionAssignments(java.util.List<PermissionAssignment> permissionAssignments) {
        this.permissionAssignments = permissionAssignments;
        return this;
    }

    public java.util.List<PermissionAssignment> getPermissionAssignments() {
        return permissionAssignments;
    }
    
}
