// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetSharePermissionsResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The privileges assigned to each principal */
  @JsonProperty("privilege_assignments")
  private Collection<PrivilegeAssignment> privilegeAssignments;

  public GetSharePermissionsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public GetSharePermissionsResponse setPrivilegeAssignments(
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
    GetSharePermissionsResponse that = (GetSharePermissionsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(privilegeAssignments, that.privilegeAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, privilegeAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSharePermissionsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("privilegeAssignments", privilegeAssignments)
        .toString();
  }
}
