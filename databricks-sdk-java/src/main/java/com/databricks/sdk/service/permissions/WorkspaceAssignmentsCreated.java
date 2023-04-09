// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WorkspaceAssignmentsCreated {
  /** Array of permissions assignments applied to a workspace. */
  @JsonProperty("permission_assignments")
  private java.util.List<PermissionAssignment> permissionAssignments;

  public WorkspaceAssignmentsCreated setPermissionAssignments(
      java.util.List<PermissionAssignment> permissionAssignments) {
    this.permissionAssignments = permissionAssignments;
    return this;
  }

  public java.util.List<PermissionAssignment> getPermissionAssignments() {
    return permissionAssignments;
  }
}
