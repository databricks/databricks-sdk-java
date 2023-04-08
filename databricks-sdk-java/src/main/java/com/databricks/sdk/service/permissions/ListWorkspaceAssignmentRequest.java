// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

/** Get permission assignments */
public class ListWorkspaceAssignmentRequest {
  /** The workspace ID for the account. */
  private Long workspaceId;

  public ListWorkspaceAssignmentRequest setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }
}
