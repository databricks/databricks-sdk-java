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
   * Unity Catalog permissions to embed in the credential. Databricks verifies that the caller holds
   * each permission in Unity Catalog and records a reference to it in the token. When the user
   * connects, Postgres grants them the matching privileges on the Postgres objects that back those
   * Unity Catalog resources. Each resource must have a Postgres counterpart, such as a synced table
   * or a table in a database catalog.
   */
  @JsonProperty("claims")
  private Collection<RequestedClaims> claims;

  /**
   * Names of the database instances to connect to with the credential. Every named instance must
   * exist in the workspace, or the request fails. At least one of instance_names or claims must be
   * specified.
   */
  @JsonProperty("instance_names")
  private Collection<String> instanceNames;

  /**
   * A client-generated identifier for this request, such as a UUID. The request fails when it is
   * omitted.
   */
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
