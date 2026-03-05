// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Generates a credential that can be used to access database instances */
@Generated
public class GenerateDatabaseCredentialRequest {
  /**
   * A set of UC permissions to add to the credential. We verify that the caller has the necessary
   * permissions in UC and include a reference in the token. Postgres uses that token to give the
   * connecting user additional grants to the Postgres resources that correspond to the UC
   * resources. The UC resources need to be something that have a Postgres counterpart. For example,
   * a synced table or a table in a UC database catalog.
   */
  @JsonProperty("claims")
  private Collection<RequestedClaims> claims;

  /**
   * Instances to request a credential for. At least one of instance_names or claims must be
   * specified.
   */
  @JsonProperty("instance_names")
  private Collection<String> instanceNames;

  /** */
  @JsonProperty("request_id")
  private String requestId;

  public GenerateDatabaseCredentialRequest setClaims(Collection<RequestedClaims> claims) {
    this.claims = claims;
    return this;
  }

  public Collection<RequestedClaims> getClaims() {
    return claims;
  }

  public GenerateDatabaseCredentialRequest setInstanceNames(Collection<String> instanceNames) {
    this.instanceNames = instanceNames;
    return this;
  }

  public Collection<String> getInstanceNames() {
    return instanceNames;
  }

  public GenerateDatabaseCredentialRequest setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateDatabaseCredentialRequest that = (GenerateDatabaseCredentialRequest) o;
    return Objects.equals(claims, that.claims)
        && Objects.equals(instanceNames, that.instanceNames)
        && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claims, instanceNames, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateDatabaseCredentialRequest.class)
        .add("claims", claims)
        .add("instanceNames", instanceNames)
        .add("requestId", requestId)
        .toString();
  }
}
