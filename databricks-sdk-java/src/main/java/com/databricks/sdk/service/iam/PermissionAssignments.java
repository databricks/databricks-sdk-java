// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>PermissionAssignments class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PermissionAssignments {
  /** Array of permissions assignments defined for a workspace. */
  @JsonProperty("permission_assignments")
  private Collection<PermissionAssignment> permissionAssignments;

  /**
   * <p>Setter for the field <code>permissionAssignments</code>.</p>
   *
   * @param permissionAssignments a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.PermissionAssignments} object
   */
  public PermissionAssignments setPermissionAssignments(
      Collection<PermissionAssignment> permissionAssignments) {
    this.permissionAssignments = permissionAssignments;
    return this;
  }

  /**
   * <p>Getter for the field <code>permissionAssignments</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<PermissionAssignment> getPermissionAssignments() {
    return permissionAssignments;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionAssignments that = (PermissionAssignments) o;
    return Objects.equals(permissionAssignments, that.permissionAssignments);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(permissionAssignments);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PermissionAssignments.class)
        .add("permissionAssignments", permissionAssignments)
        .toString();
  }
}
