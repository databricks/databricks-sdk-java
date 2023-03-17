// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class GetSharePermissionsResponse {
    /**
     * Note to self (acain): Unfortunately, neither json_inline nor json_map
     * work here.
     */
    @JsonProperty("privilege_assignments")
    private java.util.List<PrivilegeAssignment> privilegeAssignments;
    
    public GetSharePermissionsResponse setPrivilegeAssignments(java.util.List<PrivilegeAssignment> privilegeAssignments) {
        this.privilegeAssignments = privilegeAssignments;
        return this;
    }

    public java.util.List<PrivilegeAssignment> getPrivilegeAssignments() {
        return privilegeAssignments;
    }
    
}
