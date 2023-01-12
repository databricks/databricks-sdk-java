// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdatePermissions {
    /**
     * Array of permissions change objects.
     */
    @JsonProperty("changes")
    private java.util.List<PermissionsChange> changes;
    
    /**
     * Required. Unique identifier (full name) of Securable (from URL).
     */
    
    private String fullName;
    
    /**
     * Optional. List permissions granted to this principal.
     */
    @QueryParam("principal")
    private String principal;
    
    /**
     * Required. Type of Securable (from URL).
     */
    
    private String securableType;
    
    public UpdatePermissions setChanges(java.util.List<PermissionsChange> changes) {
        this.changes = changes;
        return this;
    }

    public java.util.List<PermissionsChange> getChanges() {
        return changes;
    }
    
    public UpdatePermissions setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }
    
    public UpdatePermissions setPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    public String getPrincipal() {
        return principal;
    }
    
    public UpdatePermissions setSecurableType(String securableType) {
        this.securableType = securableType;
        return this;
    }

    public String getSecurableType() {
        return securableType;
    }
    
}
