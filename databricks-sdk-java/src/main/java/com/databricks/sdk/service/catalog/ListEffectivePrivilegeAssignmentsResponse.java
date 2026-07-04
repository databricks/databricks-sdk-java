// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListEffectivePrivilegeAssignmentsResponse {
  /** The effective privilege assignments for the securable (and optional principal). */
  @JsonProperty("effective_privilege_assignments")
  private Collection<EffectivePrivilegeAssignment> effectivePrivilegeAssignments;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListEffectivePrivilegeAssignmentsResponse setEffectivePrivilegeAssignments(
      Collection<EffectivePrivilegeAssignment> effectivePrivilegeAssignments) {
    this.effectivePrivilegeAssignments = effectivePrivilegeAssignments;
    return this;
  }

  public Collection<EffectivePrivilegeAssignment> getEffectivePrivilegeAssignments() {
    return effectivePrivilegeAssignments;
  }

  public ListEffectivePrivilegeAssignmentsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListEffectivePrivilegeAssignmentsResponse that = (ListEffectivePrivilegeAssignmentsResponse) o;
    return Objects.equals(effectivePrivilegeAssignments, that.effectivePrivilegeAssignments)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectivePrivilegeAssignments, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListEffectivePrivilegeAssignmentsResponse.class)
        .add("effectivePrivilegeAssignments", effectivePrivilegeAssignments)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
