// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ShareToPrivilegeAssignment class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ShareToPrivilegeAssignment {
  /** The privileges assigned to the principal. */
  @JsonProperty("privilege_assignments")
  private Collection<PrivilegeAssignment> privilegeAssignments;

  /** The share name. */
  @JsonProperty("share_name")
  private String shareName;

  /**
   * <p>Setter for the field <code>privilegeAssignments</code>.</p>
   *
   * @param privilegeAssignments a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sharing.ShareToPrivilegeAssignment} object
   */
  public ShareToPrivilegeAssignment setPrivilegeAssignments(
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

  /**
   * <p>Setter for the field <code>shareName</code>.</p>
   *
   * @param shareName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.ShareToPrivilegeAssignment} object
   */
  public ShareToPrivilegeAssignment setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  /**
   * <p>Getter for the field <code>shareName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getShareName() {
    return shareName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShareToPrivilegeAssignment that = (ShareToPrivilegeAssignment) o;
    return Objects.equals(privilegeAssignments, that.privilegeAssignments)
        && Objects.equals(shareName, that.shareName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(privilegeAssignments, shareName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ShareToPrivilegeAssignment.class)
        .add("privilegeAssignments", privilegeAssignments)
        .add("shareName", shareName)
        .toString();
  }
}
