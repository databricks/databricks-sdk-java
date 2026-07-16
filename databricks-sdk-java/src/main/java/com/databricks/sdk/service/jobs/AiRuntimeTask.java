// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * AiRuntimeTask: multi-node GPU compute task definition for Databricks AI Runtime workloads.
 *
 * <p>Jobs-framework-level concepts (retries, per-task timeout, idempotency token, usage/budget
 * policy, permissions) live on the surrounding TaskSettings / run-submit request and are
 * intentionally NOT duplicated here. Users compose `ai_runtime_task` with the standard Jobs/DABs
 * task wrapper to get those.
 */
@Generated
public class AiRuntimeTask {
  /**
   * Deployment specs for this task. Exactly one deployment is currently supported (a single entry
   * where every node runs the same command); this is a current-Preview constraint. Role-split
   * workloads (driver + worker, parameter server, separate eval node, etc.) with multiple entries
   * are the eventual intent but not yet supported.
   */
  @JsonProperty("deployments")
  private Collection<DeploymentSpec> deployments;

  /**
   * MLflow experiment name for this run. If an experiment with this name already exists under the
   * calling user, the run is appended to it; otherwise a new experiment is created. To target a
   * specific MLflow storage location (for example, when running as a service principal), set
   * `mlflow_experiment_directory`.
   */
  @JsonProperty("experiment")
  private String experiment;

  /**
   * Optional workspace directory under which the MLflow experiment named in `experiment` is
   * created. Must start with `/Workspace`. Set this when running as a service principal that has no
   * default user directory; for regular users the experiment defaults to the user's home directory.
   */
  @JsonProperty("mlflow_experiment_directory")
  private String mlflowExperimentDirectory;

  /**
   * Optional display name for the MLflow run created under `experiment`. If omitted, MLflow
   * generates a default name.
   */
  @JsonProperty("mlflow_run")
  private String mlflowRun;

  public AiRuntimeTask setDeployments(Collection<DeploymentSpec> deployments) {
    this.deployments = deployments;
    return this;
  }

  public Collection<DeploymentSpec> getDeployments() {
    return deployments;
  }

  public AiRuntimeTask setExperiment(String experiment) {
    this.experiment = experiment;
    return this;
  }

  public String getExperiment() {
    return experiment;
  }

  public AiRuntimeTask setMlflowExperimentDirectory(String mlflowExperimentDirectory) {
    this.mlflowExperimentDirectory = mlflowExperimentDirectory;
    return this;
  }

  public String getMlflowExperimentDirectory() {
    return mlflowExperimentDirectory;
  }

  public AiRuntimeTask setMlflowRun(String mlflowRun) {
    this.mlflowRun = mlflowRun;
    return this;
  }

  public String getMlflowRun() {
    return mlflowRun;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiRuntimeTask that = (AiRuntimeTask) o;
    return Objects.equals(deployments, that.deployments)
        && Objects.equals(experiment, that.experiment)
        && Objects.equals(mlflowExperimentDirectory, that.mlflowExperimentDirectory)
        && Objects.equals(mlflowRun, that.mlflowRun);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployments, experiment, mlflowExperimentDirectory, mlflowRun);
  }

  @Override
  public String toString() {
    return new ToStringer(AiRuntimeTask.class)
        .add("deployments", deployments)
        .add("experiment", experiment)
        .add("mlflowExperimentDirectory", mlflowExperimentDirectory)
        .add("mlflowRun", mlflowRun)
        .toString();
  }
}
