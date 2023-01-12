// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GetPermissionLevelsResponse {
    /**
     * Specific permission levels
     */
    @JsonProperty("permission_levels")
    private java.util.List<PermissionsDescription> permissionLevels;
    
    public GetPermissionLevelsResponse setPermissionLevels(java.util.List<PermissionsDescription> permissionLevels) {
        this.permissionLevels = permissionLevels;
        return this;
    }

    public java.util.List<PermissionsDescription> getPermissionLevels() {
        return permissionLevels;
    }
    
}
