// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class PermissionAssignment {
  /** Error response associated with a workspace permission assignment, if any. */
  @JsonProperty("error")
  private String error;

  /** The permissions level of the principal. */
  @JsonProperty("permissions")
  private Collection<WorkspacePermission> permissions;

  /** Information about the principal assigned to the workspace. */
  @JsonProperty("principal")
  private PrincipalOutput principal;

  public PermissionAssignment setError(String error) {
    this.error = error;
    return this;
  }

  public String getError() {
    return error;
  }

  public PermissionAssignment setPermissions(Collection<WorkspacePermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Collection<WorkspacePermission> getPermissions() {
    return permissions;
  }

  public PermissionAssignment setPrincipal(PrincipalOutput principal) {
    this.principal = principal;
    return this;
  }

  public PrincipalOutput getPrincipal() {
    return principal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionAssignment that = (PermissionAssignment) o;
    return Objects.equals(error, that.error)
        && Objects.equals(permissions, that.permissions)
        && Objects.equals(principal, that.principal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, permissions, principal);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionAssignment.class)
        .add("error", error)
        .add("permissions", permissions)
        .add("principal", principal)
        .toString();
  }
}
