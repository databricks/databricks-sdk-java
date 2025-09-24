// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteWorkspaceAccessDetailLocalRequest {
  /** Required. ID of the principal in Databricks. */
  @JsonIgnore private Long principalId;

  public DeleteWorkspaceAccessDetailLocalRequest setPrincipalId(Long principalId) {
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
    DeleteWorkspaceAccessDetailLocalRequest that = (DeleteWorkspaceAccessDetailLocalRequest) o;
    return Objects.equals(principalId, that.principalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteWorkspaceAccessDetailLocalRequest.class)
        .add("principalId", principalId)
        .toString();
  }
}
