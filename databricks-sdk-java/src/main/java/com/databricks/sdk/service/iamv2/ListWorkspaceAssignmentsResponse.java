// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A page of workspace assignments. */
@Generated
public class ListWorkspaceAssignmentsResponse {
  /** The token for the next page. Not set on the last page. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The assignments on this page. */
  @JsonProperty("workspace_assignments")
  private Collection<WorkspaceAssignment> workspaceAssignments;

  public ListWorkspaceAssignmentsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListWorkspaceAssignmentsResponse setWorkspaceAssignments(
      Collection<WorkspaceAssignment> workspaceAssignments) {
    this.workspaceAssignments = workspaceAssignments;
    return this;
  }

  public Collection<WorkspaceAssignment> getWorkspaceAssignments() {
    return workspaceAssignments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWorkspaceAssignmentsResponse that = (ListWorkspaceAssignmentsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(workspaceAssignments, that.workspaceAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, workspaceAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWorkspaceAssignmentsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("workspaceAssignments", workspaceAssignments)
        .toString();
  }
}
