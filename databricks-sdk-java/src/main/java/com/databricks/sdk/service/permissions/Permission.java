// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class Permission {
    /**
     
     */
    @JsonProperty("inherited")
    private Boolean inherited;
    
    /**
     
     */
    @JsonProperty("inherited_from_object")
    private java.util.List<String> inheritedFromObject;
    
    /**
     * Permission level
     */
    @JsonProperty("permission_level")
    private PermissionLevel permissionLevel;
    
    public Permission setInherited(Boolean inherited) {
        this.inherited = inherited;
        return this;
    }

    public Boolean getInherited() {
        return inherited;
    }
    
    public Permission setInheritedFromObject(java.util.List<String> inheritedFromObject) {
        this.inheritedFromObject = inheritedFromObject;
        return this;
    }

    public java.util.List<String> getInheritedFromObject() {
        return inheritedFromObject;
    }
    
    public Permission setPermissionLevel(PermissionLevel permissionLevel) {
        this.permissionLevel = permissionLevel;
        return this;
    }

    public PermissionLevel getPermissionLevel() {
        return permissionLevel;
    }
    
}
