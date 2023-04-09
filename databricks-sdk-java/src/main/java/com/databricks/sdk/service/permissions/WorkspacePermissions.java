// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class WorkspacePermissions {
  /** Array of permissions defined for a workspace. */
  @JsonProperty("permissions")
  private Collection<PermissionOutput> permissions;

  public WorkspacePermissions setPermissions(Collection<PermissionOutput> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Collection<PermissionOutput> getPermissions() {
    return permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspacePermissions that = (WorkspacePermissions) o;
    return Objects.equals(permissions, that.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspacePermissions.class).add("permissions", permissions).toString();
  }
}
