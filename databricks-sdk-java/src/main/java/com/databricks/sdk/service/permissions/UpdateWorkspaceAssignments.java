// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class UpdateWorkspaceAssignments {
  /** Array of permissions assignments to update on the workspace. */
  @JsonProperty("permissions")
  private Collection<WorkspacePermission> permissions;

  /** The ID of the user, service principal, or group. */
  private Long principalId;

  /** The workspace ID. */
  private Long workspaceId;

  public UpdateWorkspaceAssignments setPermissions(Collection<WorkspacePermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Collection<WorkspacePermission> getPermissions() {
    return permissions;
  }

  public UpdateWorkspaceAssignments setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public UpdateWorkspaceAssignments setWorkspaceId(Long workspaceId) {
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
    UpdateWorkspaceAssignments that = (UpdateWorkspaceAssignments) o;
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
    return new ToStringer(UpdateWorkspaceAssignments.class)
        .add("permissions", permissions)
        .add("principalId", principalId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
