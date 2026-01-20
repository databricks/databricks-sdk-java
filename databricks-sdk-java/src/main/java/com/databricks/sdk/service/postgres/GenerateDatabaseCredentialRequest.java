// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GenerateDatabaseCredentialRequest {
  /** The returned token will be scoped to UC tables with the specified permissions. */
  @JsonProperty("claims")
  private Collection<RequestedClaims> claims;

  /**
   * This field is not yet supported. The endpoint for which this credential will be generated.
   * Format: projects/{project_id}/branches/{branch_id}/endpoints/{endpoint_id}
   */
  @JsonProperty("endpoint")
  private String endpoint;

  public GenerateDatabaseCredentialRequest setClaims(Collection<RequestedClaims> claims) {
    this.claims = claims;
    return this;
  }

  public Collection<RequestedClaims> getClaims() {
    return claims;
  }

  public GenerateDatabaseCredentialRequest setEndpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public String getEndpoint() {
    return endpoint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateDatabaseCredentialRequest that = (GenerateDatabaseCredentialRequest) o;
    return Objects.equals(claims, that.claims) && Objects.equals(endpoint, that.endpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claims, endpoint);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateDatabaseCredentialRequest.class)
        .add("claims", claims)
        .add("endpoint", endpoint)
        .toString();
  }
}
