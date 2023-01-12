// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GetPermissionsResponse {
    /**
     
     */
    @JsonProperty("privilege_assignments")
    private java.util.List<PrivilegeAssignment> privilegeAssignments;
    
    public GetPermissionsResponse setPrivilegeAssignments(java.util.List<PrivilegeAssignment> privilegeAssignments) {
        this.privilegeAssignments = privilegeAssignments;
        return this;
    }

    public java.util.List<PrivilegeAssignment> getPrivilegeAssignments() {
        return privilegeAssignments;
    }
    
}
