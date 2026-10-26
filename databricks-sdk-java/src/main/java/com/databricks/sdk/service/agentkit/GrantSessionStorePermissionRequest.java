// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Request to grant a READ or WRITE permission on a session store to a principal. Only the store
 * owner or a workspace admin may grant permissions.
 */
@Generated
public class GrantSessionStorePermissionRequest {
  /** Resource name in the form `session-stores/{session_store_id}`. */
  @JsonIgnore private String name;

  /** Permission level to grant. */
  @JsonProperty("permission")
  private PermissionLevel permission;

  /** Principal to grant the permission to. */
  @JsonProperty("principal")
  private StorePrincipal principal;

  public GrantSessionStorePermissionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GrantSessionStorePermissionRequest setPermission(PermissionLevel permission) {
    this.permission = permission;
    return this;
  }

  public PermissionLevel getPermission() {
    return permission;
  }

  public GrantSessionStorePermissionRequest setPrincipal(StorePrincipal principal) {
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
    GrantSessionStorePermissionRequest that = (GrantSessionStorePermissionRequest) o;
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
    return new ToStringer(GrantSessionStorePermissionRequest.class)
        .add("name", name)
        .add("permission", permission)
        .add("principal", principal)
        .toString();
  }
}
