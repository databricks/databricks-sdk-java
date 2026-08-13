// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The details of a directly or indirectly assigned principal's details in a workspace. */
@Generated
public class WorkspaceIdentityDetail {
  /** The type of assignment the principal has to the workspace (direct or indirect). */
  @JsonProperty("assignment_type")
  private WorkspaceIdentityDetailAssignmentType assignmentType;

  /** The internal ID of the principal (user/sp/group) in Databricks. */
  @JsonProperty("principal_id")
  private Long principalId;

  /** The type of the principal (user/service principal/group). */
  @JsonProperty("principal_type")
  private PrincipalType principalType;

  /** The activity status of an identity in a Databricks workspace. */
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
        && Objects.equals(principalId, that.principalId)
        && Objects.equals(principalType, that.principalType)
        && Objects.equals(workspaceIdentityStatus, that.workspaceIdentityStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentType, principalId, principalType, workspaceIdentityStatus);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceIdentityDetail.class)
        .add("assignmentType", assignmentType)
        .add("principalId", principalId)
        .add("principalType", principalType)
        .add("workspaceIdentityStatus", workspaceIdentityStatus)
        .toString();
  }
}
