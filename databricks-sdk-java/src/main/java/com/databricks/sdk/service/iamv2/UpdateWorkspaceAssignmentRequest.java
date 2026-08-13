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
public class UpdateWorkspaceAssignmentRequest {
  /** Required. ID of the principal in Databricks. */
  @JsonIgnore private Long principalId;

  /** Required. The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  /** Required. Workspace assignment to be updated in <Databricks>. */
  @JsonProperty("workspace_assignment")
  private WorkspaceAssignment workspaceAssignment;

  /** Required. The workspace ID for which the workspace assignment is being updated. */
  @JsonIgnore private Long workspaceId;

  public UpdateWorkspaceAssignmentRequest setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public UpdateWorkspaceAssignmentRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  public UpdateWorkspaceAssignmentRequest setWorkspaceAssignment(
      WorkspaceAssignment workspaceAssignment) {
    this.workspaceAssignment = workspaceAssignment;
    return this;
  }

  public WorkspaceAssignment getWorkspaceAssignment() {
    return workspaceAssignment;
  }

  public UpdateWorkspaceAssignmentRequest setWorkspaceId(Long workspaceId) {
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
    UpdateWorkspaceAssignmentRequest that = (UpdateWorkspaceAssignmentRequest) o;
    return Objects.equals(principalId, that.principalId)
        && Objects.equals(updateMask, that.updateMask)
        && Objects.equals(workspaceAssignment, that.workspaceAssignment)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId, updateMask, workspaceAssignment, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceAssignmentRequest.class)
        .add("principalId", principalId)
        .add("updateMask", updateMask)
        .add("workspaceAssignment", workspaceAssignment)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
