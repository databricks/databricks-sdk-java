// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListWorkspaceAssignmentRequest {
  /** The workspace ID for the account. */
  @JsonIgnore private Long workspaceId;

  public ListWorkspaceAssignmentRequest setWorkspaceId(Long workspaceId) {
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
    ListWorkspaceAssignmentRequest that = (ListWorkspaceAssignmentRequest) o;
    return Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWorkspaceAssignmentRequest.class)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
