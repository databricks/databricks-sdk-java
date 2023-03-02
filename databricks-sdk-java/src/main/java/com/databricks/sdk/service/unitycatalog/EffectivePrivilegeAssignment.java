// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class EffectivePrivilegeAssignment {
    /**
     * The principal (user email address or group name).
     */
    @JsonProperty("principal")
    private String principal;
    
    /**
     * The privileges conveyed to the principal (either directly or via
     * inheritance).
     */
    @JsonProperty("privileges")
    private java.util.List<EffectivePrivilege> privileges;
    
    public EffectivePrivilegeAssignment setPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    public String getPrincipal() {
        return principal;
    }
    
    public EffectivePrivilegeAssignment setPrivileges(java.util.List<EffectivePrivilege> privileges) {
        this.privileges = privileges;
        return this;
    }

    public java.util.List<EffectivePrivilege> getPrivileges() {
        return privileges;
    }
    
}
