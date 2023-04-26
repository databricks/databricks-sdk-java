// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>PermissionsList class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PermissionsList {
  /** The privileges assigned to each principal */
  @JsonProperty("privilege_assignments")
  private Collection<PrivilegeAssignment> privilegeAssignments;

  /**
   * <p>Setter for the field <code>privilegeAssignments</code>.</p>
   *
   * @param privilegeAssignments a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.PermissionsList} object
   */
  public PermissionsList setPrivilegeAssignments(
      Collection<PrivilegeAssignment> privilegeAssignments) {
    this.privilegeAssignments = privilegeAssignments;
    return this;
  }

  /**
   * <p>Getter for the field <code>privilegeAssignments</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<PrivilegeAssignment> getPrivilegeAssignments() {
    return privilegeAssignments;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionsList that = (PermissionsList) o;
    return Objects.equals(privilegeAssignments, that.privilegeAssignments);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(privilegeAssignments);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PermissionsList.class)
        .add("privilegeAssignments", privilegeAssignments)
        .toString();
  }
}
