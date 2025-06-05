// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AclItemPb {
  @JsonProperty("permission")
  private AclPermission permission;

  @JsonProperty("principal")
  private String principal;

  public AclItemPb setPermission(AclPermission permission) {
    this.permission = permission;
    return this;
  }

  public AclPermission getPermission() {
    return permission;
  }

  public AclItemPb setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AclItemPb that = (AclItemPb) o;
    return Objects.equals(permission, that.permission) && Objects.equals(principal, that.principal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, principal);
  }

  @Override
  public String toString() {
    return new ToStringer(AclItemPb.class)
        .add("permission", permission)
        .add("principal", principal)
        .toString();
  }
}
