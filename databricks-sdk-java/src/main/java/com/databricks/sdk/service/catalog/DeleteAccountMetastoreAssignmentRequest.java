// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteAccountMetastoreAssignmentRequest that = (DeleteAccountMetastoreAssignmentRequest) o;
    return Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAccountMetastoreAssignmentRequest.class)
        .add("metastoreId", metastoreId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
