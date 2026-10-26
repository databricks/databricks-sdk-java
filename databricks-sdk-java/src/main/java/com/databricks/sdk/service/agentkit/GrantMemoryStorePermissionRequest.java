// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Request to grant a READ or WRITE permission on a memory store to a principal. Only the store
 * owner or a workspace admin may grant permissions.
 */
@Generated
public class GrantMemoryStorePermissionRequest {
  /** Resource name in the form `memory-stores/{managed_memory_store_id}`. */
  @JsonIgnore private String name;

  /** Permission level to grant. */
  @JsonProperty("permission")
  private PermissionLevel permission;

  /** Principal to grant the permission to. */
  @JsonProperty("principal")
  private StorePrincipal principal;

  public GrantMemoryStorePermissionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GrantMemoryStorePermissionRequest setPermission(PermissionLevel permission) {
    this.permission = permission;
    return this;
  }

  public PermissionLevel getPermission() {
    return permission;
  }

  public GrantMemoryStorePermissionRequest setPrincipal(StorePrincipal principal) {
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
    GrantMemoryStorePermissionRequest that = (GrantMemoryStorePermissionRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(permission, that.permission)
        && Objects.equals(principal, that.principal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, permission, principal);
  }

  @Override
  public String toString() {
    return new ToStringer(GrantMemoryStorePermissionRequest.class)
        .add("name", name)
        .add("permission", permission)
        .add("principal", principal)
        .toString();
  }
}
