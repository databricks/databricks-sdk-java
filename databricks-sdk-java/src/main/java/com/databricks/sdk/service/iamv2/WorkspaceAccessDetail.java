// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The details of a principal's access to a workspace. */
@Generated
public class WorkspaceAccessDetail {
  /** */
  @JsonProperty("access_type")
  private WorkspaceAccessDetailAccessType accessType;

  /** The account ID parent of the workspace where the principal has access. */
  @JsonProperty("account_id")
  private String accountId;

  /** The permissions granted to the principal in the workspace. */
  @JsonProperty("permissions")
  private Collection<WorkspacePermission> permissions;

  /** The internal ID of the principal (user/sp/group) in Databricks. */
  @JsonProperty("principal_id")
  private Long principalId;

  /** */
  @JsonProperty("principal_type")
  private PrincipalType principalType;

  /**
   * The activity status of the principal in the workspace. Not applicable for groups at the moment.
   */
  @JsonProperty("status")
  private State status;

  /** The workspace ID where the principal has access. */
  @JsonProperty("workspace_id")
  private Long workspaceId;

  public WorkspaceAccessDetail setAccessType(WorkspaceAccessDetailAccessType accessType) {
    this.accessType = accessType;
    return this;
  }

  public WorkspaceAccessDetailAccessType getAccessType() {
    return accessType;
  }

  public WorkspaceAccessDetail setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public WorkspaceAccessDetail setPermissions(Collection<WorkspacePermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Collection<WorkspacePermission> getPermissions() {
    return permissions;
  }

  public WorkspaceAccessDetail setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public WorkspaceAccessDetail setPrincipalType(PrincipalType principalType) {
    this.principalType = principalType;
    return this;
  }

  public PrincipalType getPrincipalType() {
    return principalType;
  }

  public WorkspaceAccessDetail setStatus(State status) {
    this.status = status;
    return this;
  }

  public State getStatus() {
    return status;
  }

  public WorkspaceAccessDetail setWorkspaceId(Long workspaceId) {
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
    WorkspaceAccessDetail that = (WorkspaceAccessDetail) o;
    return Objects.equals(accessType, that.accessType)
        && Objects.equals(accountId, that.accountId)
        && Objects.equals(permissions, that.permissions)
        && Objects.equals(principalId, that.principalId)
        && Objects.equals(principalType, that.principalType)
        && Objects.equals(status, that.status)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessType, accountId, permissions, principalId, principalType, status, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceAccessDetail.class)
        .add("accessType", accessType)
        .add("accountId", accountId)
        .add("permissions", permissions)
        .add("principalId", principalId)
        .add("principalType", principalType)
        .add("status", status)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
