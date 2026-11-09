// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * A principal's direct assignment to a workspace, and the entitlements it grants there.
 *
 * <p>Only principals assigned directly to the workspace have an assignment. A principal that gets
 * access only through a group doesn't. Creating an assignment gives the principal access to the
 * workspace, and deleting it removes that direct access. These APIs replace managing workspace
 * assignments through SCIM and the permission assignment APIs. They require a workspace with
 * identity federation enabled. You can't assign, change, or unassign principals that Databricks
 * manages.
 *
 * <p>`entitlements` is the only field you set. `effective_entitlements` also includes the
 * entitlements the principal gets through its groups. An assignment must grant at least one
 * entitlement. To remove a principal's direct access, delete the assignment.
 */
@Generated
public class WorkspaceAssignment {
  /** The ID of the account that contains the workspace. */
  @JsonProperty("account_id")
  private String accountId;

  /**
   * Every entitlement the principal has in the workspace, granted directly or through a group. List
   * responses leave it empty.
   */
  @JsonProperty("effective_entitlements")
  private Collection<Entitlement> effectiveEntitlements;

  /**
   * The entitlements granted directly by this assignment. Create and update set exactly this list,
   * even if the principal also gets some of these entitlements through a group. List responses
   * leave it empty.
   */
  @JsonProperty("entitlements")
  private Collection<Entitlement> entitlements;

  /**
   * The resource name of the assignment, in one of these formats: - Account APIs:
   * `accounts/{account_id}/workspaces/{workspace_id}/workspace-assignments/{principal_id}` -
   * Workspace APIs: `workspace-assignments/{principal_id}`
   */
  @JsonProperty("name")
  private String name;

  /**
   * The resource name of the workspace, in the format
   * `accounts/{account_id}/workspaces/{workspace_id}`. Workspace APIs return the same format.
   */
  @JsonProperty("parent")
  private String parent;

  /**
   * The Databricks ID of the assigned user, service principal, or group. It can't be changed after
   * the assignment is created.
   */
  @JsonProperty("principal_id")
  private Long principalId;

  /** Whether the assigned principal is a user, service principal, or group. */
  @JsonProperty("principal_type")
  private PrincipalType principalType;

  /** The ID of the workspace. */
  @JsonProperty("workspace_id")
  private Long workspaceId;

  public WorkspaceAssignment setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public WorkspaceAssignment setEffectiveEntitlements(
      Collection<Entitlement> effectiveEntitlements) {
    this.effectiveEntitlements = effectiveEntitlements;
    return this;
  }

  public Collection<Entitlement> getEffectiveEntitlements() {
    return effectiveEntitlements;
  }

  public WorkspaceAssignment setEntitlements(Collection<Entitlement> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public Collection<Entitlement> getEntitlements() {
    return entitlements;
  }

  public WorkspaceAssignment setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public WorkspaceAssignment setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public WorkspaceAssignment setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public WorkspaceAssignment setPrincipalType(PrincipalType principalType) {
    this.principalType = principalType;
    return this;
  }

  public PrincipalType getPrincipalType() {
    return principalType;
  }

  public WorkspaceAssignment setWorkspaceId(Long workspaceId) {
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
    WorkspaceAssignment that = (WorkspaceAssignment) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(effectiveEntitlements, that.effectiveEntitlements)
        && Objects.equals(entitlements, that.entitlements)
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(principalId, that.principalId)
        && Objects.equals(principalType, that.principalType)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        effectiveEntitlements,
        entitlements,
        name,
        parent,
        principalId,
        principalType,
        workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceAssignment.class)
        .add("accountId", accountId)
        .add("effectiveEntitlements", effectiveEntitlements)
        .add("entitlements", entitlements)
        .add("name", name)
        .add("parent", parent)
        .add("principalId", principalId)
        .add("principalType", principalType)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
