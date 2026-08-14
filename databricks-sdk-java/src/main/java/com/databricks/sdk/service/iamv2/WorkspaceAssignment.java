// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * The direct assignment of a provisioned account-level principal (user, service principal, or
 * group) to a workspace, together with the entitlements that assignment grants in the workspace.
 *
 * <p>This resource covers only principals assigned directly to the workspace. Principals that
 * inherit workspace access through a group are not represented here. See WorkspaceAccessDetail and
 * WorkspaceIdentityDetail for the effective, direct-or-indirect view. Creating the resource assigns
 * the principal to the workspace, and deleting it removes the assignment.
 *
 * <p>`entitlements` is the only client-settable field. It holds the entitlements granted directly
 * on this assignment, including any the principal also holds through a group.
 * `effective_entitlements` is the read-only union of those and any granted through group
 * membership.
 *
 * <p>A direct assignment always carries at least one directly-assigned entitlement, because the
 * assignment is what grants it. Create and update both reject an empty `entitlements` set. To
 * remove a principal's assignment entirely, delete the resource.
 *
 * <p>This resource replaces workspace assignment previously managed through the workspace SCIM and
 * permission-assignment APIs, and is intended for account and workspace admins.
 */
@Generated
public class WorkspaceAssignment {
  /** The account ID parent of the workspace where the principal is assigned */
  @JsonProperty("account_id")
  private String accountId;

  /**
   * Every entitlement the principal holds in this workspace, whether granted directly or through
   * group membership. Get responses populate this field. List responses leave it empty.
   */
  @JsonProperty("effective_entitlements")
  private Collection<Entitlement> effectiveEntitlements;

  /**
   * Entitlements granted directly to the principal on this workspace. This is the only
   * client-settable field. Create and update manage exactly this set, including entitlements the
   * principal also holds through a group. List responses leave this field empty. Get a single
   * principal to read its entitlements.
   */
  @JsonProperty("entitlements")
  private Collection<Entitlement> entitlements;

  /** The internal ID of the principal (user/sp/group) in Databricks. */
  @JsonProperty("principal_id")
  private Long principalId;

  /** The type of the principal (user/service principal/group) that is assigned. */
  @JsonProperty("principal_type")
  private PrincipalType principalType;

  /** The workspace ID where the principal is assigned. */
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
        && Objects.equals(principalId, that.principalId)
        && Objects.equals(principalType, that.principalType)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, effectiveEntitlements, entitlements, principalId, principalType, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceAssignment.class)
        .add("accountId", accountId)
        .add("effectiveEntitlements", effectiveEntitlements)
        .add("entitlements", entitlements)
        .add("principalId", principalId)
        .add("principalType", principalType)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
