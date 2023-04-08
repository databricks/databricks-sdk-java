// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

/** Delete permissions assignment */
public class DeleteWorkspaceAssignmentRequest {
  /** The ID of the user, service principal, or group. */
  private Long principalId;

  /** The workspace ID. */
  private Long workspaceId;

  public DeleteWorkspaceAssignmentRequest setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public DeleteWorkspaceAssignmentRequest setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }
}
