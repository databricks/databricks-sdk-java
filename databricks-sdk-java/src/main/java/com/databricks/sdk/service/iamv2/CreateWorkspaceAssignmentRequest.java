// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateWorkspaceAssignmentRequest {
  /** Required. Workspace assignment to be created in <Databricks>. */
  @JsonProperty("workspace_assignment")
  private WorkspaceAssignment workspaceAssignment;

  /** Required. The workspace ID for which the workspace assignment is being created. */
  @JsonIgnore private Long workspaceId;

  public CreateWorkspaceAssignmentRequest setWorkspaceAssignment(
      WorkspaceAssignment workspaceAssignment) {
    this.workspaceAssignment = workspaceAssignment;
    return this;
  }

  public WorkspaceAssignment getWorkspaceAssignment() {
    return workspaceAssignment;
  }

  public CreateWorkspaceAssignmentRequest setWorkspaceId(Long workspaceId) {
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
    CreateWorkspaceAssignmentRequest that = (CreateWorkspaceAssignmentRequest) o;
    return Objects.equals(workspaceAssignment, that.workspaceAssignment)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceAssignment, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWorkspaceAssignmentRequest.class)
        .add("workspaceAssignment", workspaceAssignment)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
