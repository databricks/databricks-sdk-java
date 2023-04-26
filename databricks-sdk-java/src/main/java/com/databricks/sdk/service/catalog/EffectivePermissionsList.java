// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>EffectivePermissionsList class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class EffectivePermissionsList {
  /** The privileges conveyed to each principal (either directly or via inheritance) */
  @JsonProperty("privilege_assignments")
  private Collection<EffectivePrivilegeAssignment> privilegeAssignments;

  /**
   * <p>Setter for the field <code>privilegeAssignments</code>.</p>
   *
   * @param privilegeAssignments a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.EffectivePermissionsList} object
   */
  public EffectivePermissionsList setPrivilegeAssignments(
      Collection<EffectivePrivilegeAssignment> privilegeAssignments) {
    this.privilegeAssignments = privilegeAssignments;
    return this;
  }

  /**
   * <p>Getter for the field <code>privilegeAssignments</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<EffectivePrivilegeAssignment> getPrivilegeAssignments() {
    return privilegeAssignments;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EffectivePermissionsList that = (EffectivePermissionsList) o;
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
    return new ToStringer(EffectivePermissionsList.class)
        .add("privilegeAssignments", privilegeAssignments)
        .toString();
  }
}
