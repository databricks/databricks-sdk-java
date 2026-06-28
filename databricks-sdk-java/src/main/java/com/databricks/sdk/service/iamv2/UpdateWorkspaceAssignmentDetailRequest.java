// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateWorkspaceAssignmentDetailRequest {
  /** Required. ID of the principal in Databricks. */
  @JsonIgnore private Long principalId;

  /** Required. The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  /** Required. Workspace assignment detail to be updated in <Databricks>. */
  @JsonProperty("workspace_assignment_detail")
  private WorkspaceAssignmentDetail workspaceAssignmentDetail;

  /** Required. The workspace ID for which the workspace assignment detail is being updated. */
  @JsonIgnore private Long workspaceId;

  public UpdateWorkspaceAssignmentDetailRequest setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public UpdateWorkspaceAssignmentDetailRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  public UpdateWorkspaceAssignmentDetailRequest setWorkspaceAssignmentDetail(
      WorkspaceAssignmentDetail workspaceAssignmentDetail) {
    this.workspaceAssignmentDetail = workspaceAssignmentDetail;
    return this;
  }

  public WorkspaceAssignmentDetail getWorkspaceAssignmentDetail() {
    return workspaceAssignmentDetail;
  }

  public UpdateWorkspaceAssignmentDetailRequest setWorkspaceId(Long workspaceId) {
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
    UpdateWorkspaceAssignmentDetailRequest that = (UpdateWorkspaceAssignmentDetailRequest) o;
    return Objects.equals(principalId, that.principalId)
        && Objects.equals(updateMask, that.updateMask)
        && Objects.equals(workspaceAssignmentDetail, that.workspaceAssignmentDetail)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId, updateMask, workspaceAssignmentDetail, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceAssignmentDetailRequest.class)
        .add("principalId", principalId)
        .add("updateMask", updateMask)
        .add("workspaceAssignmentDetail", workspaceAssignmentDetail)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
