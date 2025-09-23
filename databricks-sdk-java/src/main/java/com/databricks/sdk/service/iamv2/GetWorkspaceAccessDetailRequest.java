// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetWorkspaceAccessDetailRequest {
  /**
   * Required. The internal ID of the principal (user/sp/group) for which the access details are
   * being requested.
   */
  @JsonIgnore private Long principalId;

  /** Controls what fields are returned. */
  @JsonIgnore
  @QueryParam("view")
  private WorkspaceAccessDetailView view;

  /** Required. The workspace ID for which the access details are being requested. */
  @JsonIgnore private Long workspaceId;

  public GetWorkspaceAccessDetailRequest setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public GetWorkspaceAccessDetailRequest setView(WorkspaceAccessDetailView view) {
    this.view = view;
    return this;
  }

  public WorkspaceAccessDetailView getView() {
    return view;
  }

  public GetWorkspaceAccessDetailRequest setWorkspaceId(Long workspaceId) {
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
    GetWorkspaceAccessDetailRequest that = (GetWorkspaceAccessDetailRequest) o;
    return Objects.equals(principalId, that.principalId)
        && Objects.equals(view, that.view)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId, view, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceAccessDetailRequest.class)
        .add("principalId", principalId)
        .add("view", view)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
