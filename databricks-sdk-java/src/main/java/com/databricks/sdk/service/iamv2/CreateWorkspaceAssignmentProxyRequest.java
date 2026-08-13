// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateWorkspaceAssignmentProxyRequest {
  /** Required. Workspace assignment to be created in <Databricks>. */
  @JsonProperty("workspace_assignment")
  private WorkspaceAssignment workspaceAssignment;

  public CreateWorkspaceAssignmentProxyRequest setWorkspaceAssignment(
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
    CreateWorkspaceAssignmentProxyRequest that = (CreateWorkspaceAssignmentProxyRequest) o;
    return Objects.equals(workspaceAssignment, that.workspaceAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceAssignment);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWorkspaceAssignmentProxyRequest.class)
        .add("workspaceAssignment", workspaceAssignment)
        .toString();
  }
}
