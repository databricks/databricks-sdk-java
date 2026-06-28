// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteWorkspaceAssignmentDetailRequest {
  /** Required. ID of the principal in Databricks to delete workspace assignment for. */
  @JsonIgnore private Long principalId;

  /** The workspace ID where the principal has access. */
  @JsonIgnore private Long workspaceId;

  public DeleteWorkspaceAssignmentDetailRequest setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public DeleteWorkspaceAssignmentDetailRequest setWorkspaceId(Long workspaceId) {
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
    DeleteWorkspaceAssignmentDetailRequest that = (DeleteWorkspaceAssignmentDetailRequest) o;
    return Objects.equals(principalId, that.principalId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteWorkspaceAssignmentDetailRequest.class)
        .add("principalId", principalId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
