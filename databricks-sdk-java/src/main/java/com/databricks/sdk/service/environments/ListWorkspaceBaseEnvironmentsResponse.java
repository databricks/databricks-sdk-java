// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.environments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response message for ListWorkspaceBaseEnvironments. */
@Generated
public class ListWorkspaceBaseEnvironmentsResponse {
  /** Token to retrieve the next page of results. Empty if there are no more results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The list of workspace base environments. */
  @JsonProperty("workspace_base_environments")
  private Collection<WorkspaceBaseEnvironment> workspaceBaseEnvironments;

  public ListWorkspaceBaseEnvironmentsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListWorkspaceBaseEnvironmentsResponse setWorkspaceBaseEnvironments(
      Collection<WorkspaceBaseEnvironment> workspaceBaseEnvironments) {
    this.workspaceBaseEnvironments = workspaceBaseEnvironments;
    return this;
  }

  public Collection<WorkspaceBaseEnvironment> getWorkspaceBaseEnvironments() {
    return workspaceBaseEnvironments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWorkspaceBaseEnvironmentsResponse that = (ListWorkspaceBaseEnvironmentsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(workspaceBaseEnvironments, that.workspaceBaseEnvironments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, workspaceBaseEnvironments);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWorkspaceBaseEnvironmentsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("workspaceBaseEnvironments", workspaceBaseEnvironments)
        .toString();
  }
}
