// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class PrivilegeAssignment {
    /**
     * The principal (user email address or group name).
     */
    @JsonProperty("principal")
    private String principal;
    
    /**
     * The privileges assigned to the principal.
     */
    @JsonProperty("privileges")
    private java.util.List<Privilege> privileges;
    
    public PrivilegeAssignment setPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    public String getPrincipal() {
        return principal;
    }
    
    public PrivilegeAssignment setPrivileges(java.util.List<Privilege> privileges) {
        this.privileges = privileges;
        return this;
    }

    public java.util.List<Privilege> getPrivileges() {
        return privileges;
    }
    
}
