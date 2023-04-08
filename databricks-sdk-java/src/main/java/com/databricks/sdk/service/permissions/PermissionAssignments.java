// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class PermissionAssignments {
  /** Array of permissions assignments defined for a workspace. */
  @JsonProperty("permission_assignments")
  private Collection<PermissionAssignment> permissionAssignments;

  public PermissionAssignments setPermissionAssignments(
      Collection<PermissionAssignment> permissionAssignments) {
    this.permissionAssignments = permissionAssignments;
    return this;
  }

  public Collection<PermissionAssignment> getPermissionAssignments() {
    return permissionAssignments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionAssignments that = (PermissionAssignments) o;
    return Objects.equals(permissionAssignments, that.permissionAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionAssignments.class)
        .add("permissionAssignments", permissionAssignments)
        .toString();
  }
}
