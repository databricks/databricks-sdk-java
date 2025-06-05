// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class WorkspacePermissionsPb {
  @JsonProperty("permissions")
  private Collection<PermissionOutput> permissions;

  public WorkspacePermissionsPb setPermissions(Collection<PermissionOutput> permissions) {
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
    WorkspacePermissionsPb that = (WorkspacePermissionsPb) o;
    return Objects.equals(permissions, that.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspacePermissionsPb.class).add("permissions", permissions).toString();
  }
}
