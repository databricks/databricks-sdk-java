// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateWorkspaceAssignmentDetailProxyRequest {
  /** Required. Workspace assignment detail to be created in <Databricks>. */
  @JsonProperty("workspace_assignment_detail")
  private WorkspaceAssignmentDetail workspaceAssignmentDetail;

  public CreateWorkspaceAssignmentDetailProxyRequest setWorkspaceAssignmentDetail(
      WorkspaceAssignmentDetail workspaceAssignmentDetail) {
    this.workspaceAssignmentDetail = workspaceAssignmentDetail;
    return this;
  }

  public WorkspaceAssignmentDetail getWorkspaceAssignmentDetail() {
    return workspaceAssignmentDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateWorkspaceAssignmentDetailProxyRequest that =
        (CreateWorkspaceAssignmentDetailProxyRequest) o;
    return Objects.equals(workspaceAssignmentDetail, that.workspaceAssignmentDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceAssignmentDetail);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWorkspaceAssignmentDetailProxyRequest.class)
        .add("workspaceAssignmentDetail", workspaceAssignmentDetail)
        .toString();
  }
}
