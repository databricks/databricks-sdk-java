// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class AccessControlRequest {
    /**
     * name of the group
     */
    @JsonProperty("group_name")
    private String groupName;
    
    /**
     * Permission level
     */
    @JsonProperty("permission_level")
    private PermissionLevel permissionLevel;
    
    /**
     * name of the service principal
     */
    @JsonProperty("service_principal_name")
    private String servicePrincipalName;
    
    /**
     * name of the user
     */
    @JsonProperty("user_name")
    private String userName;
    
    public AccessControlRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }
    
    public AccessControlRequest setPermissionLevel(PermissionLevel permissionLevel) {
        this.permissionLevel = permissionLevel;
        return this;
    }

    public PermissionLevel getPermissionLevel() {
        return permissionLevel;
    }
    
    public AccessControlRequest setServicePrincipalName(String servicePrincipalName) {
        this.servicePrincipalName = servicePrincipalName;
        return this;
    }

    public String getServicePrincipalName() {
        return servicePrincipalName;
    }
    
    public AccessControlRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return userName;
    }
    
}
