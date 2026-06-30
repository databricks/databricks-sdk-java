// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.environments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateWorkspaceBaseEnvironmentRequest {
  /** */
  @JsonIgnore private String name;

  /**
   * Required. The workspace base environment with updated fields. The name field is used to
   * identify the environment to update.
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
