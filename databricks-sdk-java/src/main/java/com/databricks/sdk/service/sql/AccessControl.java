// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class AccessControl {
    /**
     
     */
    @JsonProperty("group_name")
    private String groupName;
    
    /**
     * This describes an enum
     */
    @JsonProperty("permission_level")
    private PermissionLevel permissionLevel;
    
    /**
     
     */
    @JsonProperty("user_name")
    private String userName;
    
    public AccessControl setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }
    
    public AccessControl setPermissionLevel(PermissionLevel permissionLevel) {
        this.permissionLevel = permissionLevel;
        return this;
    }

    public PermissionLevel getPermissionLevel() {
        return permissionLevel;
    }
    
    public AccessControl setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return userName;
    }
    
}
