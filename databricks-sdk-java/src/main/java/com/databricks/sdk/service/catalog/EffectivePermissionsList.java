// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EffectivePermissionsList {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The privileges conveyed to each principal (either directly or via inheritance) */
  @JsonProperty("privilege_assignments")
  private Collection<EffectivePrivilegeAssignment> privilegeAssignments;

  public EffectivePermissionsList setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

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
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(privilegeAssignments, that.privilegeAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, privilegeAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(EffectivePermissionsList.class)
        .add("nextPageToken", nextPageToken)
        .add("privilegeAssignments", privilegeAssignments)
        .toString();
  }
}
