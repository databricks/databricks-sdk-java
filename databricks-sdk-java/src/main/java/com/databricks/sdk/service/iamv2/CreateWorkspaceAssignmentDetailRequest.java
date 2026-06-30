// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateWorkspaceAssignmentDetailRequest {
  /** Required. Workspace assignment detail to be created in <Databricks>. */
  @JsonProperty("workspace_assignment_detail")
  private WorkspaceAssignmentDetail workspaceAssignmentDetail;

  /** Required. The workspace ID for which the workspace assignment detail is being created. */
  @JsonIgnore private Long workspaceId;

  public CreateWorkspaceAssignmentDetailRequest setWorkspaceAssignmentDetail(
      WorkspaceAssignmentDetail workspaceAssignmentDetail) {
    this.workspaceAssignmentDetail = workspaceAssignmentDetail;
    return this;
  }

  public WorkspaceAssignmentDetail getWorkspaceAssignmentDetail() {
    return workspaceAssignmentDetail;
  }

  public CreateWorkspaceAssignmentDetailRequest setWorkspaceId(Long workspaceId) {
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
    CreateWorkspaceAssignmentDetailRequest that = (CreateWorkspaceAssignmentDetailRequest) o;
    return Objects.equals(workspaceAssignmentDetail, that.workspaceAssignmentDetail)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceAssignmentDetail, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWorkspaceAssignmentDetailRequest.class)
        .add("workspaceAssignmentDetail", workspaceAssignmentDetail)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
