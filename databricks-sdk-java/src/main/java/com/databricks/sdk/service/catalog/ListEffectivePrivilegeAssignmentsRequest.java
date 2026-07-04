// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListEffectivePrivilegeAssignmentsRequest {
  /** Full name of securable. */
  @JsonIgnore private String fullName;

  /**
   * Specifies the maximum number of privilege assignments to return (page length). Every
   * EffectivePrivilegeAssignment present in a single page response is guaranteed to contain all the
   * effective privileges granted on (or inherited by) the requested Securable for the respective
   * principal.
   *
   * <p>If not set, a server-configured default is used. If set to - lesser than 0: invalid
   * parameter error - 0: page length is set to a server configured value - lesser than 150 but
   * greater than 0: invalid parameter error (this is to ensure that server is able to return at
   * least one complete EffectivePrivilegeAssignment in a single page response) - greater than (or
   * equal to) 150: page length is the minimum of this value and a server configured value
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Opaque pagination token to go to next page based on previous query. */
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

  public ListEffectivePrivilegeAssignmentsRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public ListEffectivePrivilegeAssignmentsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListEffectivePrivilegeAssignmentsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListEffectivePrivilegeAssignmentsRequest setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public ListEffectivePrivilegeAssignmentsRequest setSecurableType(String securableType) {
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
    ListEffectivePrivilegeAssignmentsRequest that = (ListEffectivePrivilegeAssignmentsRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(principal, that.principal)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, pageSize, pageToken, principal, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(ListEffectivePrivilegeAssignmentsRequest.class)
        .add("fullName", fullName)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("principal", principal)
        .add("securableType", securableType)
        .toString();
  }
}
