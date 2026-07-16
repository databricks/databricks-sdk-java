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
   * Workspace path of the script to run on each node in this deployment. Upload the script to this
   * path and supply the path here. When the task runs, the file at this path is run on each node;
   * if it fails, the task fails with its exit code.
   *
   * <p>Example script contents:
   *
   * <p># Plain Python: python train.py --epochs 10
   *
   * <p># Multi-GPU via accelerate: accelerate launch train.py --config config.yaml
   *
   * <p># Distributed via torchrun: torchrun --nproc_per_node=8 train.py
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
