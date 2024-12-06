// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CollaboratorJobRunInfo {
  /** Alias of the collaborator that triggered the task run. */
  @JsonProperty("collaborator_alias")
  private String collaboratorAlias;

  /** Job ID of the task run in the collaborator's workspace. */
  @JsonProperty("collaborator_job_id")
  private Long collaboratorJobId;

  /** Job run ID of the task run in the collaborator's workspace. */
  @JsonProperty("collaborator_job_run_id")
  private Long collaboratorJobRunId;

  /** Task run ID of the task run in the collaborator's workspace. */
  @JsonProperty("collaborator_task_run_id")
  private Long collaboratorTaskRunId;

  /** ID of the collaborator's workspace that triggered the task run. */
  @JsonProperty("collaborator_workspace_id")
  private Long collaboratorWorkspaceId;

  public CollaboratorJobRunInfo setCollaboratorAlias(String collaboratorAlias) {
    this.collaboratorAlias = collaboratorAlias;
    return this;
  }

  public String getCollaboratorAlias() {
    return collaboratorAlias;
  }

  public CollaboratorJobRunInfo setCollaboratorJobId(Long collaboratorJobId) {
    this.collaboratorJobId = collaboratorJobId;
    return this;
  }

  public Long getCollaboratorJobId() {
    return collaboratorJobId;
  }

  public CollaboratorJobRunInfo setCollaboratorJobRunId(Long collaboratorJobRunId) {
    this.collaboratorJobRunId = collaboratorJobRunId;
    return this;
  }

  public Long getCollaboratorJobRunId() {
    return collaboratorJobRunId;
  }

  public CollaboratorJobRunInfo setCollaboratorTaskRunId(Long collaboratorTaskRunId) {
    this.collaboratorTaskRunId = collaboratorTaskRunId;
    return this;
  }

  public Long getCollaboratorTaskRunId() {
    return collaboratorTaskRunId;
  }

  public CollaboratorJobRunInfo setCollaboratorWorkspaceId(Long collaboratorWorkspaceId) {
    this.collaboratorWorkspaceId = collaboratorWorkspaceId;
    return this;
  }

  public Long getCollaboratorWorkspaceId() {
    return collaboratorWorkspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollaboratorJobRunInfo that = (CollaboratorJobRunInfo) o;
    return Objects.equals(collaboratorAlias, that.collaboratorAlias)
        && Objects.equals(collaboratorJobId, that.collaboratorJobId)
        && Objects.equals(collaboratorJobRunId, that.collaboratorJobRunId)
        && Objects.equals(collaboratorTaskRunId, that.collaboratorTaskRunId)
        && Objects.equals(collaboratorWorkspaceId, that.collaboratorWorkspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        collaboratorAlias,
        collaboratorJobId,
        collaboratorJobRunId,
        collaboratorTaskRunId,
        collaboratorWorkspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(CollaboratorJobRunInfo.class)
        .add("collaboratorAlias", collaboratorAlias)
        .add("collaboratorJobId", collaboratorJobId)
        .add("collaboratorJobRunId", collaboratorJobRunId)
        .add("collaboratorTaskRunId", collaboratorTaskRunId)
        .add("collaboratorWorkspaceId", collaboratorWorkspaceId)
        .toString();
  }
}
