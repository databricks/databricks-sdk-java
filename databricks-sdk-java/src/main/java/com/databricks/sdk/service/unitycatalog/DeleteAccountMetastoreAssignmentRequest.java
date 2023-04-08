// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Delete a metastore assignment */
public class DeleteAccountMetastoreAssignmentRequest {
  /** Databricks Unity Catalog metastore ID */
  private String metastoreId;

  /** Workspace ID. */
  private Long workspaceId;

  public DeleteAccountMetastoreAssignmentRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public DeleteAccountMetastoreAssignmentRequest setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }
}
