// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.annotation.QueryParam;

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
}
