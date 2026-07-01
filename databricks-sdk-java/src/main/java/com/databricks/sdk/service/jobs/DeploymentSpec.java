// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * DeploymentSpec: configuration for one deployment within an AiRuntimeTask. Each entry in
 * `AiRuntimeTask.deployments` describes a group of nodes that share the same command and compute.
 * Many single-program training algorithms use a single entry where every node runs the same
 * command; role-split workloads (driver + worker, parameter server, separate eval node, etc.) use
 * multiple entries.
 */
@Generated
public class DeploymentSpec {
  /**
   * Workspace path of the bash script to execute on each node in this deployment. The CLI uploads
   * the user's script and populates this. Customers calling the Jobs API directly should upload
   * their script to the workspace first and supply the resulting path here.
   */
  @JsonProperty("command_path")
  private String commandPath;

  /** Compute resources allocated to each node in this deployment. */
  @JsonProperty("compute")
  private ComputeSpec compute;

  /**
   * Optional human-readable name for this deployment (for example, `driver`, `worker`,
   * `param_server`). Used for log and UI display. Distinct names are recommended so deployments can
   * be told apart, but uniqueness is not enforced.
   */
  @JsonProperty("name")
  private String name;

  public DeploymentSpec setCommandPath(String commandPath) {
    this.commandPath = commandPath;
    return this;
  }

  public String getCommandPath() {
    return commandPath;
  }

  public DeploymentSpec setCompute(ComputeSpec compute) {
    this.compute = compute;
    return this;
  }

  public ComputeSpec getCompute() {
    return compute;
  }

  public DeploymentSpec setName(String name) {
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
    DeploymentSpec that = (DeploymentSpec) o;
    return Objects.equals(commandPath, that.commandPath)
        && Objects.equals(compute, that.compute)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandPath, compute, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeploymentSpec.class)
        .add("commandPath", commandPath)
        .add("compute", compute)
        .add("name", name)
        .toString();
  }
}
