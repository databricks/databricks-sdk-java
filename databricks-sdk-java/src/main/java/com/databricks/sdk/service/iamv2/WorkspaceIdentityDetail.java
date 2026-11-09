// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A user, service principal, or group's status in a workspace, and whether it has access to the
 * workspace directly or through a group. Update it to activate or deactivate a user or service
 * principal in the workspace.
 */
@Generated
public class WorkspaceIdentityDetail {
  /** Whether the principal is assigned to the workspace directly or has access through a group. */
  @JsonProperty("assignment_type")
  private WorkspaceIdentityDetailAssignmentType assignmentType;

  /**
   * The resource name of the workspace identity detail, in the format
   * `principals/{principal_id}/workspace-identity-detail`.
   */
  @JsonProperty("name")
  private String name;

  /** The Databricks ID of the user, service principal, or group. */
  @JsonProperty("principal_id")
  private Long principalId;

  /** Whether the principal is a user, service principal, or group. */
  @JsonProperty("principal_type")
  private PrincipalType principalType;

  /** Whether the principal is active in the workspace. Groups are always `ACTIVE`. */
  @JsonProperty("workspace_identity_status")
  private State workspaceIdentityStatus;

  public WorkspaceIdentityDetail setAssignmentType(
      WorkspaceIdentityDetailAssignmentType assignmentType) {
    this.assignmentType = assignmentType;
    return this;
  }

  public WorkspaceIdentityDetailAssignmentType getAssignmentType() {
    return assignmentType;
  }

  public WorkspaceIdentityDetail setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public WorkspaceIdentityDetail setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public WorkspaceIdentityDetail setPrincipalType(PrincipalType principalType) {
    this.principalType = principalType;
    return this;
  }

  public PrincipalType getPrincipalType() {
    return principalType;
  }

  public WorkspaceIdentityDetail setWorkspaceIdentityStatus(State workspaceIdentityStatus) {
    this.workspaceIdentityStatus = workspaceIdentityStatus;
    return this;
  }

  public State getWorkspaceIdentityStatus() {
    return workspaceIdentityStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceIdentityDetail that = (WorkspaceIdentityDetail) o;
    return Objects.equals(assignmentType, that.assignmentType)
        && Objects.equals(name, that.name)
        && Objects.equals(principalId, that.principalId)
        && Objects.equals(principalType, that.principalType)
        && Objects.equals(workspaceIdentityStatus, that.workspaceIdentityStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentType, name, principalId, principalType, workspaceIdentityStatus);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceIdentityDetail.class)
        .add("assignmentType", assignmentType)
        .add("name", name)
        .add("principalId", principalId)
        .add("principalType", principalType)
        .add("workspaceIdentityStatus", workspaceIdentityStatus)
        .toString();
  }
}
