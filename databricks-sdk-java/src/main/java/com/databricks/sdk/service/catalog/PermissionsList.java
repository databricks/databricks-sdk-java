// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class PermissionsList {
  /** The privileges assigned to each principal */
  @JsonProperty("privilege_assignments")
  private Collection<PrivilegeAssignment> privilegeAssignments;

  public PermissionsList setPrivilegeAssignments(
      Collection<PrivilegeAssignment> privilegeAssignments) {
    this.privilegeAssignments = privilegeAssignments;
    return this;
  }

  public Collection<PrivilegeAssignment> getPrivilegeAssignments() {
    return privilegeAssignments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionsList that = (PermissionsList) o;
    return Objects.equals(privilegeAssignments, that.privilegeAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionsList.class)
        .add("privilegeAssignments", privilegeAssignments)
        .toString();
  }
}
