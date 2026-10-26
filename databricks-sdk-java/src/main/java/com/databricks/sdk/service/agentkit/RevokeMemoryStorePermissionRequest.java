// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Request to revoke all explicit access to a memory store. Only the owner or a workspace admin may
 * revoke permissions.
 */
@Generated
public class RevokeMemoryStorePermissionRequest {
  /** Resource name in the form `memory-stores/{managed_memory_store_id}`. */
  @JsonIgnore private String name;

  /** Principal whose READ and WRITE grants will be removed. */
  @JsonProperty("principal")
  private StorePrincipal principal;

  public RevokeMemoryStorePermissionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RevokeMemoryStorePermissionRequest setPrincipal(StorePrincipal principal) {
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
    RevokeMemoryStorePermissionRequest that = (RevokeMemoryStorePermissionRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(principal, that.principal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, principal);
  }

  @Override
  public String toString() {
    return new ToStringer(RevokeMemoryStorePermissionRequest.class)
        .add("name", name)
        .add("principal", principal)
        .toString();
  }
}
