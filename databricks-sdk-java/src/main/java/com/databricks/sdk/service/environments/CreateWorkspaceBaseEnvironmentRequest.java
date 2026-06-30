// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.environments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateWorkspaceBaseEnvironmentRequest {
  /**
   * A unique identifier for this request. A random UUID is recommended. This request is only
   * idempotent if a request_id is provided.
   */
  @JsonIgnore
  @QueryParam("request_id")
  private String requestId;

  /** Required. The workspace base environment to create. */
  @JsonProperty("workspace_base_environment")
  private WorkspaceBaseEnvironment workspaceBaseEnvironment;

  /**
   * The ID to use for the workspace base environment, which will become the final component of the
   * resource name. This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/.
   */
  @JsonIgnore
  @QueryParam("workspace_base_environment_id")
  private String workspaceBaseEnvironmentId;

  public CreateWorkspaceBaseEnvironmentRequest setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  public CreateWorkspaceBaseEnvironmentRequest setWorkspaceBaseEnvironment(
      WorkspaceBaseEnvironment workspaceBaseEnvironment) {
    this.workspaceBaseEnvironment = workspaceBaseEnvironment;
    return this;
  }

  public WorkspaceBaseEnvironment getWorkspaceBaseEnvironment() {
    return workspaceBaseEnvironment;
  }

  public CreateWorkspaceBaseEnvironmentRequest setWorkspaceBaseEnvironmentId(
      String workspaceBaseEnvironmentId) {
    this.workspaceBaseEnvironmentId = workspaceBaseEnvironmentId;
    return this;
  }

  public String getWorkspaceBaseEnvironmentId() {
    return workspaceBaseEnvironmentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateWorkspaceBaseEnvironmentRequest that = (CreateWorkspaceBaseEnvironmentRequest) o;
    return Objects.equals(requestId, that.requestId)
        && Objects.equals(workspaceBaseEnvironment, that.workspaceBaseEnvironment)
        && Objects.equals(workspaceBaseEnvironmentId, that.workspaceBaseEnvironmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, workspaceBaseEnvironment, workspaceBaseEnvironmentId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWorkspaceBaseEnvironmentRequest.class)
        .add("requestId", requestId)
        .add("workspaceBaseEnvironment", workspaceBaseEnvironment)
        .add("workspaceBaseEnvironmentId", workspaceBaseEnvironmentId)
        .toString();
  }
}
