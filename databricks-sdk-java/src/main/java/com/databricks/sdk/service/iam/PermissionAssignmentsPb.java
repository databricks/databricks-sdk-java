// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class PermissionAssignmentsPb {
  @JsonProperty("permission_assignments")
  private Collection<PermissionAssignment> permissionAssignments;

  public PermissionAssignmentsPb setPermissionAssignments(
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
    PermissionAssignmentsPb that = (PermissionAssignmentsPb) o;
    return Objects.equals(permissionAssignments, that.permissionAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionAssignmentsPb.class)
        .add("permissionAssignments", permissionAssignments)
        .toString();
  }
}
