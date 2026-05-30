// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response message for listing workspace assignment details. */
@Generated
public class ListWorkspaceAssignmentDetailsResponse {
  /**
   * A token, which can be sent as page_token to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("workspace_assignment_details")
  private Collection<WorkspaceAssignmentDetail> workspaceAssignmentDetails;

  public ListWorkspaceAssignmentDetailsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListWorkspaceAssignmentDetailsResponse setWorkspaceAssignmentDetails(
      Collection<WorkspaceAssignmentDetail> workspaceAssignmentDetails) {
    this.workspaceAssignmentDetails = workspaceAssignmentDetails;
    return this;
  }

  public Collection<WorkspaceAssignmentDetail> getWorkspaceAssignmentDetails() {
    return workspaceAssignmentDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWorkspaceAssignmentDetailsResponse that = (ListWorkspaceAssignmentDetailsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(workspaceAssignmentDetails, that.workspaceAssignmentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, workspaceAssignmentDetails);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWorkspaceAssignmentDetailsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("workspaceAssignmentDetails", workspaceAssignmentDetails)
        .toString();
  }
}
