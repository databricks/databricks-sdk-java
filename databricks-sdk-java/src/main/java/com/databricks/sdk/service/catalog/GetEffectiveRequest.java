// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get effective permissions */
@Generated
public class GetEffectiveRequest {
  /** Full name of securable. */
  @JsonIgnore private String fullName;

  /**
   * If provided, only the effective permissions for the specified principal (user or group) are
   * returned.
   */
  @JsonIgnore
  @QueryParam("principal")
  private String principal;

  /** Type of securable. */
  @JsonIgnore private SecurableType securableType;

  public GetEffectiveRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetEffectiveRequest setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public GetEffectiveRequest setSecurableType(SecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public SecurableType getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetEffectiveRequest that = (GetEffectiveRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(principal, that.principal)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, principal, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetEffectiveRequest.class)
        .add("fullName", fullName)
        .add("principal", principal)
        .add("securableType", securableType)
        .toString();
  }
}
