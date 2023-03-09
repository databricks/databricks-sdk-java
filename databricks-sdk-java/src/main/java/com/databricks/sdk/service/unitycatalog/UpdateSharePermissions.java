// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class UpdateSharePermissions {
    /**
     * Array of permission changes.
     */
    @JsonProperty("changes")
    private java.util.List<PermissionsChange> changes;
    
    /**
     * The name of the share.
     */
    
    private String name;
    
    public UpdateSharePermissions setChanges(java.util.List<PermissionsChange> changes) {
        this.changes = changes;
        return this;
    }

    public java.util.List<PermissionsChange> getChanges() {
        return changes;
    }
    
    public UpdateSharePermissions setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
