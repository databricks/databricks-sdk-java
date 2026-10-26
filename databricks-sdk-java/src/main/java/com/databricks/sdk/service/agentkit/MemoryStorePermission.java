// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A principal's permission on a memory store. */
@Generated
public class MemoryStorePermission {
  /**
   * The permission level. WRITE includes READ; PERMISSION_LEVEL_UNSPECIFIED means neither is
   * available.
   */
  @JsonProperty("permission")
  private PermissionLevel permission;

  /** The principal whose permission is reported. */
  @JsonProperty("principal")
  private StorePrincipal principal;

  public MemoryStorePermission setPermission(PermissionLevel permission) {
    this.permission = permission;
    return this;
  }

  public PermissionLevel getPermission() {
    return permission;
  }

  public MemoryStorePermission setPrincipal(StorePrincipal principal) {
    this.principal = principal;
    return this;
  }

  public StorePrincipal getPrincipal() {
    return principal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MemoryStorePermission that = (MemoryStorePermission) o;
    return Objects.equals(permission, that.permission) && Objects.equals(principal, that.principal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, principal);
  }

  @Override
  public String toString() {
    return new ToStringer(MemoryStorePermission.class)
        .add("permission", permission)
        .add("principal", principal)
        .toString();
  }
}
