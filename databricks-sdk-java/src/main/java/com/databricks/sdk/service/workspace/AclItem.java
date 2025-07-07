// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * An item representing an ACL rule applied to the given principal (user or group) on the associated
 * scope point.
 */
@Generated
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AclItem that = (AclItem) o;
    return Objects.equals(permission, that.permission) && Objects.equals(principal, that.principal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, principal);
  }

  @Override
  public String toString() {
    return new ToStringer(AclItem.class)
        .add("permission", permission)
        .add("principal", principal)
        .toString();
  }
}
