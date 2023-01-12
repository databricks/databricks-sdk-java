// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class PermissionAssignmentInput {
    /**
     * The group name for the service principal.
     */
    @JsonProperty("group_name")
    private String groupName;
    
    /**
     * Array of permissions to apply to the workspace for the service principal.
     */
    @JsonProperty("permissions")
    private java.util.List<WorkspacePermission> permissions;
    
    /**
     * The name of the service principal.
     */
    @JsonProperty("service_principal_name")
    private String servicePrincipalName;
    
    /**
     * The username of the owner of the service principal.
     */
    @JsonProperty("user_name")
    private String userName;
    
    public PermissionAssignmentInput setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }
    
    public PermissionAssignmentInput setPermissions(java.util.List<WorkspacePermission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public java.util.List<WorkspacePermission> getPermissions() {
        return permissions;
    }
    
    public PermissionAssignmentInput setServicePrincipalName(String servicePrincipalName) {
        this.servicePrincipalName = servicePrincipalName;
        return this;
    }

    public String getServicePrincipalName() {
        return servicePrincipalName;
    }
    
    public PermissionAssignmentInput setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return userName;
    }
    
}
