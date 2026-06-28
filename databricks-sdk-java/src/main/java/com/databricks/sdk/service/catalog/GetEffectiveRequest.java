// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetEffectiveRequest {
  /** Full name of securable. */
  @JsonIgnore private String fullName;

  /**
   * Specifies the maximum number of privileges to return (page length). Every
   * EffectivePrivilegeAssignment present in a single page response is guaranteed to contain all the
   * effective privileges granted on (or inherited by) the requested Securable for the respective
   * principal.
   *
   * <p>If not set, all the effective permissions are returned. If set to - lesser than 0: invalid
   * parameter error - 0: page length is set to a server configured value - lesser than 150 but
   * greater than 0: invalid parameter error (this is to ensure that server is able to return at
   * least one complete EffectivePrivilegeAssignment in a single page response) - greater than (or
   * equal to) 150: page length is the minimum of this value and a server configured value
   */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /** Opaque token for the next page of results (pagination). */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * If provided, only the effective permissions for the specified principal (user or group) are
   * returned.
   */
  @JsonIgnore
  @QueryParam("principal")
  private String principal;

  /** Type of securable. */
  @JsonIgnore private String securableType;

  public GetEffectiveRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetEffectiveRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public GetEffectiveRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GetEffectiveRequest setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public GetEffectiveRequest setSecurableType(String securableType) {
    this.securableType = securableType;
    return this;
  }

  public String getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetEffectiveRequest that = (GetEffectiveRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(principal, that.principal)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, maxResults, pageToken, principal, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetEffectiveRequest.class)
        .add("fullName", fullName)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .add("principal", principal)
        .add("securableType", securableType)
        .toString();
  }
}
