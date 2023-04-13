// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAccountMetastoreAssignmentRequest that = (GetAccountMetastoreAssignmentRequest) o;
    return Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAccountMetastoreAssignmentRequest.class)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
