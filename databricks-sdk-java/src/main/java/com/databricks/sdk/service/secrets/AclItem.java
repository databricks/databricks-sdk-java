// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AclItem {
  /** The permission level applied to the principal. */
  @JsonProperty("permission")
  private AclPermission permission;

  /** The principal in which the permission is applied. */
  @JsonProperty("principal")
  private String principal;

  public AclItem setPermission(AclPermission permission) {
    this.permission = permission;
    return this;
  }

  public AclPermission getPermission() {
    return permission;
  }

  public AclItem setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }
}
