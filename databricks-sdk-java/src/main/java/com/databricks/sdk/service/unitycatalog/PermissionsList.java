// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PermissionsList {
  /** The privileges assigned to each principal */
  @JsonProperty("privilege_assignments")
  private java.util.List<PrivilegeAssignment> privilegeAssignments;

  public PermissionsList setPrivilegeAssignments(
      java.util.List<PrivilegeAssignment> privilegeAssignments) {
    this.privilegeAssignments = privilegeAssignments;
    return this;
  }

  public java.util.List<PrivilegeAssignment> getPrivilegeAssignments() {
    return privilegeAssignments;
  }
}
