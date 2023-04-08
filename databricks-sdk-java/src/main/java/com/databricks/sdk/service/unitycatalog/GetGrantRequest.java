// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.annotation.QueryParam;

/** Get permissions */
public class GetGrantRequest {
  /** Full name of securable. */
  private String fullName;

  /** If provided, only the permissions for the specified principal (user or group) are returned. */
  @QueryParam("principal")
  private String principal;

  /** Type of securable. */
  private SecurableType securableType;

  public GetGrantRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetGrantRequest setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public GetGrantRequest setSecurableType(SecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public SecurableType getSecurableType() {
    return securableType;
  }
}
