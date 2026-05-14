// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListWorkspaceAssignmentDetailsRequest {
  /**
   * The maximum number of workspace assignment details to return. The service may return fewer than
   * this value.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous ListWorkspaceAssignmentDetails call. Provide this to
   * retrieve the subsequent page.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** Required. The workspace ID for which the workspace assignment details are being fetched. */
  @JsonIgnore private Long workspaceId;

  public ListWorkspaceAssignmentDetailsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListWorkspaceAssignmentDetailsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListWorkspaceAssignmentDetailsRequest setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWorkspaceAssignmentDetailsRequest that = (ListWorkspaceAssignmentDetailsRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWorkspaceAssignmentDetailsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
