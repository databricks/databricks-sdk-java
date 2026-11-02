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
  /**
   * The resource name of the workspace assignment. The format depends on the API that returned it:
   * - Account-scoped:
   * accounts/{account_id}/workspaces/{workspace_id}/workspace-assignments/{principal_id} -
   * Workspace-scoped: workspace-assignments/{principal_id}
   */
  @JsonIgnore private String name;

  /** Required. The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  /** Required. Workspace assignment to be updated in Databricks. */
  @JsonProperty("workspace_assignment")
  private WorkspaceAssignment workspaceAssignment;

  public UpdateWorkspaceAssignmentRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceAssignmentRequest that = (UpdateWorkspaceAssignmentRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask)
        && Objects.equals(workspaceAssignment, that.workspaceAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, updateMask, workspaceAssignment);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceAssignmentRequest.class)
        .add("name", name)
        .add("updateMask", updateMask)
        .add("workspaceAssignment", workspaceAssignment)
        .toString();
  }
}
