// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Gets the metastore assignment for a workspace */
public class GetAccountMetastoreAssignmentRequest {
  /** Workspace ID. */
  private Long workspaceId;

  public GetAccountMetastoreAssignmentRequest setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }
}
