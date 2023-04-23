// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class PutAcl {
  /** The permission level applied to the principal. */
  @JsonProperty("permission")
  private AclPermission permission;

  /** The principal in which the permission is applied. */
  @JsonProperty("principal")
  private String principal;

  /** The name of the scope to apply permissions to. */
  @JsonProperty("scope")
  private String scope;

  public PutAcl setPermission(AclPermission permission) {
    this.permission = permission;
    return this;
  }

  public AclPermission getPermission() {
    return permission;
  }

  public PutAcl setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public PutAcl setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PutAcl that = (PutAcl) o;
    return Objects.equals(permission, that.permission)
        && Objects.equals(principal, that.principal)
        && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, principal, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(PutAcl.class)
        .add("permission", permission)
        .add("principal", principal)
        .add("scope", scope)
        .toString();
  }
}
