// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.environments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateWorkspaceBaseEnvironmentRequest {
  /**
   * The resource name of the workspace base environment to update. Format:
   * workspace-base-environments/{workspace_base_environment}
   */
  @JsonIgnore private String name;

  /**
   * The workspace base environment with its new configuration. The `name` path parameter identifies
   * the environment to update. Set `display_name` and `filepath` on every update, even when they do
   * not change. An update keeps the stored `base_environment_type`, but the YAML file is validated
   * against the type in the request, which defaults to `CPU`, so also set it for a GPU environment.
   */
  @JsonProperty("workspace_base_environment")
  private WorkspaceBaseEnvironment workspaceBaseEnvironment;

  public UpdateWorkspaceBaseEnvironmentRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateWorkspaceBaseEnvironmentRequest setWorkspaceBaseEnvironment(
      WorkspaceBaseEnvironment workspaceBaseEnvironment) {
    this.workspaceBaseEnvironment = workspaceBaseEnvironment;
    return this;
  }

  public WorkspaceBaseEnvironment getWorkspaceBaseEnvironment() {
    return workspaceBaseEnvironment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateWorkspaceBaseEnvironmentRequest that = (UpdateWorkspaceBaseEnvironmentRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(workspaceBaseEnvironment, that.workspaceBaseEnvironment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, workspaceBaseEnvironment);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateWorkspaceBaseEnvironmentRequest.class)
        .add("name", name)
        .add("workspaceBaseEnvironment", workspaceBaseEnvironment)
        .toString();
  }
}
