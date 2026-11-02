// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListWorkspaceAssignmentsRequest {
  /**
   * The maximum number of workspace assignments to return. The service may return fewer than this
   * value. If not provided, defaults to 1000, which is also the maximum allowed. Requests for more
   * than the maximum are clamped to 1000.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous ListWorkspaceAssignments call. Provide this to retrieve
   * the subsequent page.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * The parent resource name of the workspace whose assignments to list. Format:
   * accounts/{account_id}/workspaces/{workspace_id}
   */
  @JsonIgnore private String parent;

  public ListWorkspaceAssignmentsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListWorkspaceAssignmentsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListWorkspaceAssignmentsRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWorkspaceAssignmentsRequest that = (ListWorkspaceAssignmentsRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWorkspaceAssignmentsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
