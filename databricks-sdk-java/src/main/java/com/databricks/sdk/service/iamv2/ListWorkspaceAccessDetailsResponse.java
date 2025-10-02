// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** TODO: Write description later when this method is implemented */
@Generated
public class ListWorkspaceAccessDetailsResponse {
  /**
   * A token, which can be sent as page_token to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("workspace_access_details")
  private Collection<WorkspaceAccessDetail> workspaceAccessDetails;

  public ListWorkspaceAccessDetailsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListWorkspaceAccessDetailsResponse setWorkspaceAccessDetails(
      Collection<WorkspaceAccessDetail> workspaceAccessDetails) {
    this.workspaceAccessDetails = workspaceAccessDetails;
    return this;
  }

  public Collection<WorkspaceAccessDetail> getWorkspaceAccessDetails() {
    return workspaceAccessDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWorkspaceAccessDetailsResponse that = (ListWorkspaceAccessDetailsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(workspaceAccessDetails, that.workspaceAccessDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, workspaceAccessDetails);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWorkspaceAccessDetailsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("workspaceAccessDetails", workspaceAccessDetails)
        .toString();
  }
}
