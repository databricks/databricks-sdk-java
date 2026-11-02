// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListWorkspaceAssignmentsProxyRequest {
  /**
   * The maximum number of workspace assignments to return. The service may return fewer than this
   * value. If not provided, defaults to 1000, which is also the maximum allowed. Requests for more
   * than the maximum are clamped to 1000.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** A page token from a previous list call. Provide this to retrieve the subsequent page. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * The resource name of the workspace to list assignments of,
   * `accounts/{account_id}/workspaces/{workspace_id}`. Optional: defaults to the calling workspace,
   * and any other workspace is rejected.
   */
  @JsonIgnore
  @QueryParam("parent")
  private String parent;

  public ListWorkspaceAssignmentsProxyRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListWorkspaceAssignmentsProxyRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListWorkspaceAssignmentsProxyRequest setParent(String parent) {
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
    ListWorkspaceAssignmentsProxyRequest that = (ListWorkspaceAssignmentsProxyRequest) o;
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
    return new ToStringer(ListWorkspaceAssignmentsProxyRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
