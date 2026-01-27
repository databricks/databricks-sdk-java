// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListCredentialsRequest {
  /**
   * The ID of the service principal whose credentials will be modified. Only service principal
   * managers can perform this action.
   */
  @JsonIgnore
  @QueryParam("principal_id")
  private Long principalId;

  public ListCredentialsRequest setPrincipalId(Long principalId) {
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
    ListCredentialsRequest that = (ListCredentialsRequest) o;
    return Objects.equals(principalId, that.principalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCredentialsRequest.class).add("principalId", principalId).toString();
  }
}
