// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** List workspace permissions */
public class GetWorkspaceAssignmentRequest {
  /** The workspace ID. */
  private Long workspaceId;

  public GetWorkspaceAssignmentRequest setWorkspaceId(Long workspaceId) {
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
    GetWorkspaceAssignmentRequest that = (GetWorkspaceAssignmentRequest) o;
    return Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceAssignmentRequest.class)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
