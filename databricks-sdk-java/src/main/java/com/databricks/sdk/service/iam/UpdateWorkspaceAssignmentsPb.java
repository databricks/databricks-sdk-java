// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class UpdateWorkspaceAssignmentsPb {
  @JsonProperty("permissions")
  private Collection<WorkspacePermission> permissions;

  @JsonIgnore private Long principalId;

  @JsonIgnore private Long workspaceId;

  public UpdateWorkspaceAssignmentsPb setPermissions(Collection<WorkspacePermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Collection<WorkspacePermission> getPermissions() {
    return permissions;
  }

  public UpdateWorkspaceAssignmentsPb setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public UpdateWorkspaceAssignmentsPb setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceAssignmentsPb that = (UpdateWorkspaceAssignmentsPb) o;
    return Objects.equals(permissions, that.permissions)
        && Objects.equals(principalId, that.principalId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, principalId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceAssignmentsPb.class)
        .add("permissions", permissions)
        .add("principalId", principalId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
