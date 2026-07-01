// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GenerateDatabaseCredentialRequest {
  /** The returned token will be scoped to UC tables with the specified permissions. */
  @JsonProperty("claims")
  private Collection<RequestedClaims> claims;

  /**
   * The endpoint resource name for which this credential will be generated. Format:
   * projects/{project_id}/branches/{branch_id}/endpoints/{endpoint_id}
   */
  @JsonProperty("endpoint")
  private String endpoint;

  /**
   * Timestamp in UTC of when this credential should expire. Must be at least 300 seconds (5
   * minutes) and at most 1 hour from the current time.
   */
  @JsonProperty("expire_time")
  private Timestamp expireTime;

  /**
   * Databricks workspace group name. When provided, credentials are generated with permissions
   * scoped to this group.
   */
  @JsonProperty("group_name")
  private String groupName;

  /**
   * The requested time-to-live for the generated credential token. Must be at least 300 seconds (5
   * minutes) and at most 3600 seconds (1 hour).
   */
  @JsonProperty("ttl")
  private Duration ttl;

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

  public GenerateDatabaseCredentialRequest setExpireTime(Timestamp expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public Timestamp getExpireTime() {
    return expireTime;
  }

  public GenerateDatabaseCredentialRequest setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public GenerateDatabaseCredentialRequest setTtl(Duration ttl) {
    this.ttl = ttl;
    return this;
  }

  public Duration getTtl() {
    return ttl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateDatabaseCredentialRequest that = (GenerateDatabaseCredentialRequest) o;
    return Objects.equals(claims, that.claims)
        && Objects.equals(endpoint, that.endpoint)
        && Objects.equals(expireTime, that.expireTime)
        && Objects.equals(groupName, that.groupName)
        && Objects.equals(ttl, that.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claims, endpoint, expireTime, groupName, ttl);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateDatabaseCredentialRequest.class)
        .add("claims", claims)
        .add("endpoint", endpoint)
        .add("expireTime", expireTime)
        .add("groupName", groupName)
        .add("ttl", ttl)
        .toString();
  }
}
