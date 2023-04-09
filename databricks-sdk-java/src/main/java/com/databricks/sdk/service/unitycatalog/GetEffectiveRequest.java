// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get effective permissions */
public class GetEffectiveRequest {
  /** Full name of securable. */
  private String fullName;

  /**
   * If provided, only the effective permissions for the specified principal (user or group) are
   * returned.
   */
  @QueryParam("principal")
  private String principal;

  /** Type of securable. */
  private SecurableType securableType;

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
