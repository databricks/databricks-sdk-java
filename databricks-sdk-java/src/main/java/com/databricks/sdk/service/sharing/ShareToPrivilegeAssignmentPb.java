// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ShareToPrivilegeAssignmentPb {
  @JsonProperty("privilege_assignments")
  private Collection<PrivilegeAssignment> privilegeAssignments;

  @JsonProperty("share_name")
  private String shareName;

  public ShareToPrivilegeAssignmentPb setPrivilegeAssignments(
      Collection<PrivilegeAssignment> privilegeAssignments) {
    this.privilegeAssignments = privilegeAssignments;
    return this;
  }

  public Collection<PrivilegeAssignment> getPrivilegeAssignments() {
    return privilegeAssignments;
  }

  public ShareToPrivilegeAssignmentPb setShareName(String shareName) {
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
    ShareToPrivilegeAssignmentPb that = (ShareToPrivilegeAssignmentPb) o;
    return Objects.equals(privilegeAssignments, that.privilegeAssignments)
        && Objects.equals(shareName, that.shareName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeAssignments, shareName);
  }

  @Override
  public String toString() {
    return new ToStringer(ShareToPrivilegeAssignmentPb.class)
        .add("privilegeAssignments", privilegeAssignments)
        .add("shareName", shareName)
        .toString();
  }
}
