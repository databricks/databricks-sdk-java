// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PutAclPb {
  @JsonProperty("permission")
  private AclPermission permission;

  @JsonProperty("principal")
  private String principal;

  @JsonProperty("scope")
  private String scope;

  public PutAclPb setPermission(AclPermission permission) {
    this.permission = permission;
    return this;
  }

  public AclPermission getPermission() {
    return permission;
  }

  public PutAclPb setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public PutAclPb setScope(String scope) {
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
    PutAclPb that = (PutAclPb) o;
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
    return new ToStringer(PutAclPb.class)
        .add("permission", permission)
        .add("principal", principal)
        .add("scope", scope)
        .toString();
  }
}
