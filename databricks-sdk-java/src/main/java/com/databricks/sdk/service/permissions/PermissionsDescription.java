// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class PermissionsDescription {
    /**
     
     */
    @JsonProperty("description")
    private String description;
    
    /**
     * Permission level
     */
    @JsonProperty("permission_level")
    private PermissionLevel permissionLevel;
    
    public PermissionsDescription setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }
    
    public PermissionsDescription setPermissionLevel(PermissionLevel permissionLevel) {
        this.permissionLevel = permissionLevel;
        return this;
    }

    public PermissionLevel getPermissionLevel() {
        return permissionLevel;
    }
    
}
