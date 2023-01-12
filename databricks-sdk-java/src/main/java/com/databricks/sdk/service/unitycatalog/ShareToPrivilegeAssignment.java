// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ShareToPrivilegeAssignment {
    /**
     * The privileges assigned to the principal.
     */
    @JsonProperty("privilege_assignments")
    private java.util.List<PrivilegeAssignment> privilegeAssignments;
    
    /**
     * The share name.
     */
    @JsonProperty("share_name")
    private String shareName;
    
    public ShareToPrivilegeAssignment setPrivilegeAssignments(java.util.List<PrivilegeAssignment> privilegeAssignments) {
        this.privilegeAssignments = privilegeAssignments;
        return this;
    }

    public java.util.List<PrivilegeAssignment> getPrivilegeAssignments() {
        return privilegeAssignments;
    }
    
    public ShareToPrivilegeAssignment setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }

    public String getShareName() {
        return shareName;
    }
    
}
