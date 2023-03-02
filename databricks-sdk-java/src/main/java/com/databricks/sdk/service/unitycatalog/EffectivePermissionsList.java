// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class EffectivePermissionsList {
    /**
     * The privileges conveyed to each principal (either directly or via
     * inheritance)
     */
    @JsonProperty("privilege_assignments")
    private java.util.List<EffectivePrivilegeAssignment> privilegeAssignments;
    
    public EffectivePermissionsList setPrivilegeAssignments(java.util.List<EffectivePrivilegeAssignment> privilegeAssignments) {
        this.privilegeAssignments = privilegeAssignments;
        return this;
    }

    public java.util.List<EffectivePrivilegeAssignment> getPrivilegeAssignments() {
        return privilegeAssignments;
    }
    
}
