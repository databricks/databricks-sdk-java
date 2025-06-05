// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CollaboratorJobRunInfoPb {
  @JsonProperty("collaborator_alias")
  private String collaboratorAlias;

  @JsonProperty("collaborator_job_id")
  private Long collaboratorJobId;

  @JsonProperty("collaborator_job_run_id")
  private Long collaboratorJobRunId;

  @JsonProperty("collaborator_task_run_id")
  private Long collaboratorTaskRunId;

  @JsonProperty("collaborator_workspace_id")
  private Long collaboratorWorkspaceId;

  public CollaboratorJobRunInfoPb setCollaboratorAlias(String collaboratorAlias) {
    this.collaboratorAlias = collaboratorAlias;
    return this;
  }

  public String getCollaboratorAlias() {
    return collaboratorAlias;
  }

  public CollaboratorJobRunInfoPb setCollaboratorJobId(Long collaboratorJobId) {
    this.collaboratorJobId = collaboratorJobId;
    return this;
  }

  public Long getCollaboratorJobId() {
    return collaboratorJobId;
  }

  public CollaboratorJobRunInfoPb setCollaboratorJobRunId(Long collaboratorJobRunId) {
    this.collaboratorJobRunId = collaboratorJobRunId;
    return this;
  }

  public Long getCollaboratorJobRunId() {
    return collaboratorJobRunId;
  }

  public CollaboratorJobRunInfoPb setCollaboratorTaskRunId(Long collaboratorTaskRunId) {
    this.collaboratorTaskRunId = collaboratorTaskRunId;
    return this;
  }

  public Long getCollaboratorTaskRunId() {
    return collaboratorTaskRunId;
  }

  public CollaboratorJobRunInfoPb setCollaboratorWorkspaceId(Long collaboratorWorkspaceId) {
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
    CollaboratorJobRunInfoPb that = (CollaboratorJobRunInfoPb) o;
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
    return new ToStringer(CollaboratorJobRunInfoPb.class)
        .add("collaboratorAlias", collaboratorAlias)
        .add("collaboratorJobId", collaboratorJobId)
        .add("collaboratorJobRunId", collaboratorJobRunId)
        .add("collaboratorTaskRunId", collaboratorTaskRunId)
        .add("collaboratorWorkspaceId", collaboratorWorkspaceId)
        .toString();
  }
}
