// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetWorkspaceAssignmentProxyRequest {
  /**
   * Required. The internal ID of the principal (user/sp/group) for which the assignment is being
   * requested.
   */
  @JsonIgnore private Long principalId;

  public GetWorkspaceAssignmentProxyRequest setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetWorkspaceAssignmentProxyRequest that = (GetWorkspaceAssignmentProxyRequest) o;
    return Objects.equals(principalId, that.principalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceAssignmentProxyRequest.class)
        .add("principalId", principalId)
        .toString();
  }
}
