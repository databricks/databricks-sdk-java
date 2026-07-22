// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The details of a principal's assignment to a workspace. */
@Generated
public class WorkspaceAssignmentDetail {
  /** The account ID parent of the workspace where the principal is assigned */
  @JsonProperty("account_id")
  private String accountId;

  /**
   * The principal's full effective entitlements granted in this workspace: every entitlement it
   * holds whether granted directly or via group membership. Populated on Get; empty on List.
   */
  @JsonProperty("effective_entitlements")
  private Collection<Entitlement> effectiveEntitlements;

  /**
   * Entitlements granted directly to the principal on this workspace. The only client-settable
   * field: create and update manage exactly this set (including entitlements the principal also
   * holds via a group). Not populated by ListWorkspaceAssignmentDetails (omitted for scalability);
   * call GetWorkspaceAssignmentDetail to read the entitlements for a single principal.
   */
  @JsonProperty("entitlements")
  private Collection<Entitlement> entitlements;

  /** The internal ID of the principal (user/sp/group) in Databricks. */
  @JsonProperty("principal_id")
  private Long principalId;

  /** */
  @JsonProperty("principal_type")
  private PrincipalType principalType;

  /** The workspace ID where the principal is assigned */
  @JsonProperty("workspace_id")
  private Long workspaceId;

  public WorkspaceAssignmentDetail setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public WorkspaceAssignmentDetail setEffectiveEntitlements(
      Collection<Entitlement> effectiveEntitlements) {
    this.effectiveEntitlements = effectiveEntitlements;
    return this;
  }

  public Collection<Entitlement> getEffectiveEntitlements() {
    return effectiveEntitlements;
  }

  public WorkspaceAssignmentDetail setEntitlements(Collection<Entitlement> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public Collection<Entitlement> getEntitlements() {
    return entitlements;
  }

  public WorkspaceAssignmentDetail setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public WorkspaceAssignmentDetail setPrincipalType(PrincipalType principalType) {
    this.principalType = principalType;
    return this;
  }

  public PrincipalType getPrincipalType() {
    return principalType;
  }

  public WorkspaceAssignmentDetail setWorkspaceId(Long workspaceId) {
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
    WorkspaceAssignmentDetail that = (WorkspaceAssignmentDetail) o;
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
    return new ToStringer(WorkspaceAssignmentDetail.class)
        .add("accountId", accountId)
        .add("effectiveEntitlements", effectiveEntitlements)
        .add("entitlements", entitlements)
        .add("principalId", principalId)
        .add("principalType", principalType)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
