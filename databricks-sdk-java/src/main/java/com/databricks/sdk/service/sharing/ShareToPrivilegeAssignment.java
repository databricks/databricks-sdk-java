// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ShareToPrivilegeAssignment {
  /** The privileges assigned to the principal. */
  @JsonProperty("privilege_assignments")
  private Collection<PrivilegeAssignment> privilegeAssignments;

  /** The share name. */
  @JsonProperty("share_name")
  private String shareName;

  public ShareToPrivilegeAssignment setPrivilegeAssignments(
      Collection<PrivilegeAssignment> privilegeAssignments) {
    this.privilegeAssignments = privilegeAssignments;
    return this;
  }

  public Collection<PrivilegeAssignment> getPrivilegeAssignments() {
    return privilegeAssignments;
  }

  public ShareToPrivilegeAssignment setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  public String getShareName() {
    return shareName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShareToPrivilegeAssignment that = (ShareToPrivilegeAssignment) o;
    return Objects.equals(privilegeAssignments, that.privilegeAssignments)
        && Objects.equals(shareName, that.shareName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeAssignments, shareName);
  }

  @Override
  public String toString() {
    return new ToStringer(ShareToPrivilegeAssignment.class)
        .add("privilegeAssignments", privilegeAssignments)
        .add("shareName", shareName)
        .toString();
  }
}
