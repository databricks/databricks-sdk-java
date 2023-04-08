// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class EffectivePermissionsList {
  /** The privileges conveyed to each principal (either directly or via inheritance) */
  @JsonProperty("privilege_assignments")
  private Collection<EffectivePrivilegeAssignment> privilegeAssignments;

  public EffectivePermissionsList setPrivilegeAssignments(
      Collection<EffectivePrivilegeAssignment> privilegeAssignments) {
    this.privilegeAssignments = privilegeAssignments;
    return this;
  }

  public Collection<EffectivePrivilegeAssignment> getPrivilegeAssignments() {
    return privilegeAssignments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EffectivePermissionsList that = (EffectivePermissionsList) o;
    return Objects.equals(privilegeAssignments, that.privilegeAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(EffectivePermissionsList.class)
        .add("privilegeAssignments", privilegeAssignments)
        .toString();
  }
}
