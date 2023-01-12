// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class AccessControlResponse {
    /**
     * All permissions.
     */
    @JsonProperty("all_permissions")
    private java.util.List<Permission> allPermissions;
    
    /**
     * name of the group
     */
    @JsonProperty("group_name")
    private String groupName;
    
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
    
    public AccessControlResponse setAllPermissions(java.util.List<Permission> allPermissions) {
        this.allPermissions = allPermissions;
        return this;
    }

    public java.util.List<Permission> getAllPermissions() {
        return allPermissions;
    }
    
    public AccessControlResponse setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }
    
    public AccessControlResponse setServicePrincipalName(String servicePrincipalName) {
        this.servicePrincipalName = servicePrincipalName;
        return this;
    }

    public String getServicePrincipalName() {
        return servicePrincipalName;
    }
    
    public AccessControlResponse setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return userName;
    }
    
}
