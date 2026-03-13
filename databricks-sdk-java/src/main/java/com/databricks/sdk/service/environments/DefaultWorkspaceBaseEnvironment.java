// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.environments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A singleton resource representing the default workspace base environment configuration. This
 * resource contains the workspace base environments that are used as defaults for serverless
 * notebooks and jobs in the workspace, for both CPU and GPU compute types.
 */
@Generated
public class DefaultWorkspaceBaseEnvironment {
  /**
   * The default workspace base environment for CPU compute. Format:
   * workspace-base-environments/{workspace_base_environment}
   */
  @JsonProperty("cpu_workspace_base_environment")
  private String cpuWorkspaceBaseEnvironment;

  /**
   * The default workspace base environment for GPU compute. Format:
   * workspace-base-environments/{workspace_base_environment}
   */
  @JsonProperty("gpu_workspace_base_environment")
  private String gpuWorkspaceBaseEnvironment;

  /** The resource name of this singleton resource. Format: default-workspace-base-environment */
  @JsonProperty("name")
  private String name;

  public DefaultWorkspaceBaseEnvironment setCpuWorkspaceBaseEnvironment(
      String cpuWorkspaceBaseEnvironment) {
    this.cpuWorkspaceBaseEnvironment = cpuWorkspaceBaseEnvironment;
    return this;
  }

  public String getCpuWorkspaceBaseEnvironment() {
    return cpuWorkspaceBaseEnvironment;
  }

  public DefaultWorkspaceBaseEnvironment setGpuWorkspaceBaseEnvironment(
      String gpuWorkspaceBaseEnvironment) {
    this.gpuWorkspaceBaseEnvironment = gpuWorkspaceBaseEnvironment;
    return this;
  }

  public String getGpuWorkspaceBaseEnvironment() {
    return gpuWorkspaceBaseEnvironment;
  }

  public DefaultWorkspaceBaseEnvironment setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DefaultWorkspaceBaseEnvironment that = (DefaultWorkspaceBaseEnvironment) o;
    return Objects.equals(cpuWorkspaceBaseEnvironment, that.cpuWorkspaceBaseEnvironment)
        && Objects.equals(gpuWorkspaceBaseEnvironment, that.gpuWorkspaceBaseEnvironment)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuWorkspaceBaseEnvironment, gpuWorkspaceBaseEnvironment, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DefaultWorkspaceBaseEnvironment.class)
        .add("cpuWorkspaceBaseEnvironment", cpuWorkspaceBaseEnvironment)
        .add("gpuWorkspaceBaseEnvironment", gpuWorkspaceBaseEnvironment)
        .add("name", name)
        .toString();
  }
}
