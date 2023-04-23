// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteWorkspaceAssignmentRequest that = (DeleteWorkspaceAssignmentRequest) o;
    return Objects.equals(principalId, that.principalId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteWorkspaceAssignmentRequest.class)
        .add("principalId", principalId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
