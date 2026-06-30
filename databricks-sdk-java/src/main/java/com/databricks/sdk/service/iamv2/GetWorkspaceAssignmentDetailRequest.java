// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetWorkspaceAssignmentDetailRequest {
  /**
   * Required. The internal ID of the principal (user/sp/group) for which the assignment details are
   * being requested.
   */
  @JsonIgnore private Long principalId;

  /** Required. The workspace ID for which the assignment details are being requested. */
  @JsonIgnore private Long workspaceId;

  public GetWorkspaceAssignmentDetailRequest setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public GetWorkspaceAssignmentDetailRequest setWorkspaceId(Long workspaceId) {
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
    GetWorkspaceAssignmentDetailRequest that = (GetWorkspaceAssignmentDetailRequest) o;
    return Objects.equals(principalId, that.principalId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceAssignmentDetailRequest.class)
        .add("principalId", principalId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
