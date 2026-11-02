// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateWorkspaceAssignmentRequest {
  /**
   * The parent resource name of the workspace to assign the principal to. Format:
   * accounts/{account_id}/workspaces/{workspace_id}
   */
  @JsonIgnore private String parent;

  /** Required. Workspace assignment to be created in Databricks. */
  @JsonProperty("workspace_assignment")
  private WorkspaceAssignment workspaceAssignment;

  public CreateWorkspaceAssignmentRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateWorkspaceAssignmentRequest setWorkspaceAssignment(
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
    CreateWorkspaceAssignmentRequest that = (CreateWorkspaceAssignmentRequest) o;
    return Objects.equals(parent, that.parent)
        && Objects.equals(workspaceAssignment, that.workspaceAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, workspaceAssignment);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWorkspaceAssignmentRequest.class)
        .add("parent", parent)
        .add("workspaceAssignment", workspaceAssignment)
        .toString();
  }
}
