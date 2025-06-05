// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * The output format for existing workspace PermissionAssignment records, which contains some info
 * for user consumption.
 */
@Generated
class PermissionAssignmentPb {
  @JsonProperty("error")
  private String error;

  @JsonProperty("permissions")
  private Collection<WorkspacePermission> permissions;

  @JsonProperty("principal")
  private PrincipalOutput principal;

  public PermissionAssignmentPb setError(String error) {
    this.error = error;
    return this;
  }

  public String getError() {
    return error;
  }

  public PermissionAssignmentPb setPermissions(Collection<WorkspacePermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Collection<WorkspacePermission> getPermissions() {
    return permissions;
  }

  public PermissionAssignmentPb setPrincipal(PrincipalOutput principal) {
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
    PermissionAssignmentPb that = (PermissionAssignmentPb) o;
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
    return new ToStringer(PermissionAssignmentPb.class)
        .add("error", error)
        .add("permissions", permissions)
        .add("principal", principal)
        .toString();
  }
}
