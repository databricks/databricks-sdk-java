// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PermissionMigrationRequest {
  /** The name of the workspace group that permissions will be migrated from. */
  @JsonProperty("from_workspace_group_name")
  private String fromWorkspaceGroupName;

  /** The maximum number of permissions that will be migrated. */
  @JsonProperty("size")
  private Long size;

  /** The name of the account group that permissions will be migrated to. */
  @JsonProperty("to_account_group_name")
  private String toAccountGroupName;

  /**
   * WorkspaceId of the associated workspace where the permission migration will occur. Both
   * workspace group and account group must be in this workspace.
   */
  @JsonProperty("workspace_id")
  private Long workspaceId;

  public PermissionMigrationRequest setFromWorkspaceGroupName(String fromWorkspaceGroupName) {
    this.fromWorkspaceGroupName = fromWorkspaceGroupName;
    return this;
  }

  public String getFromWorkspaceGroupName() {
    return fromWorkspaceGroupName;
  }

  public PermissionMigrationRequest setSize(Long size) {
    this.size = size;
    return this;
  }

  public Long getSize() {
    return size;
  }

  public PermissionMigrationRequest setToAccountGroupName(String toAccountGroupName) {
    this.toAccountGroupName = toAccountGroupName;
    return this;
  }

  public String getToAccountGroupName() {
    return toAccountGroupName;
  }

  public PermissionMigrationRequest setWorkspaceId(Long workspaceId) {
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
    PermissionMigrationRequest that = (PermissionMigrationRequest) o;
    return Objects.equals(fromWorkspaceGroupName, that.fromWorkspaceGroupName)
        && Objects.equals(size, that.size)
        && Objects.equals(toAccountGroupName, that.toAccountGroupName)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromWorkspaceGroupName, size, toAccountGroupName, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionMigrationRequest.class)
        .add("fromWorkspaceGroupName", fromWorkspaceGroupName)
        .add("size", size)
        .add("toAccountGroupName", toAccountGroupName)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
