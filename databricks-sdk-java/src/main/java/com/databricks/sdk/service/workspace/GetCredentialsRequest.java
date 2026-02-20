// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetCredentialsRequest {
  /** The ID for the corresponding credential to access. */
  @JsonIgnore private Long credentialId;

  /**
   * The ID of the service principal whose credentials will be modified. Only service principal
   * managers can perform this action.
   */
  @JsonIgnore
  @QueryParam("principal_id")
  private Long principalId;

  public GetCredentialsRequest setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public Long getCredentialId() {
    return credentialId;
  }

  public GetCredentialsRequest setPrincipalId(Long principalId) {
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
    GetCredentialsRequest that = (GetCredentialsRequest) o;
    return Objects.equals(credentialId, that.credentialId)
        && Objects.equals(principalId, that.principalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId, principalId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCredentialsRequest.class)
        .add("credentialId", credentialId)
        .add("principalId", principalId)
        .toString();
  }
}
