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
   * Workspace or UC volume path of the code-source archive, unpacked on each node and exposed
   * through `$CODE_SOURCE`. Set by first-party tooling; not for direct callers.
   */
  @JsonProperty("code_source_path")
  private String codeSourcePath;

  /**
   * Deployment specs for this task. Exactly one deployment is currently supported (a single entry
   * where every node runs the same command); this is a current-Preview constraint. Role-split
   * workloads (driver + worker, parameter server, separate eval node, etc.) with multiple entries
   * are the eventual intent but not yet supported.
   */
  @JsonProperty("deployments")
  private Collection<DeploymentSpec> deployments;

  /**
   * Optional Docker image URL for a custom container image. When set, the task runs on the
   * specified container image instead of the default Databricks client image. Format:
   * `{organization}/{repository}:{tag}`
   */
  @JsonProperty("docker_image_url")
  private String dockerImageUrl;

  /**
   * MLflow experiment name for this run. If an experiment with this name already exists under the
   * calling user, the run is appended to it; otherwise a new experiment is created. To target a
   * specific MLflow storage location (for example, when running as a service principal), set
   * `mlflow_experiment_directory`.
   */
  @JsonProperty("experiment")
  private String experiment;

  /**
   * Optional root location for MLflow artifacts logged by the run. If this field isn't specified
   * the default artifact location will be in dbfs i.e.
   * `dbfs:/databricks/mlflow-tracking/<experiment_id>/...` If dbfs access is restricted or UC is
   * preferred this can be a custom location in UC: `dbfs:/Volumes/<catalog>/<schema>/<volume>/...`
   * The location should be unique for each experiment.
   */
  @JsonProperty("mlflow_artifact_location")
  private String mlflowArtifactLocation;

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

  public AiRuntimeTask setCodeSourcePath(String codeSourcePath) {
    this.codeSourcePath = codeSourcePath;
    return this;
  }

  public String getCodeSourcePath() {
    return codeSourcePath;
  }

  public AiRuntimeTask setDeployments(Collection<DeploymentSpec> deployments) {
    this.deployments = deployments;
    return this;
  }

  public Collection<DeploymentSpec> getDeployments() {
    return deployments;
  }

  public AiRuntimeTask setDockerImageUrl(String dockerImageUrl) {
    this.dockerImageUrl = dockerImageUrl;
    return this;
  }

  public String getDockerImageUrl() {
    return dockerImageUrl;
  }

  public AiRuntimeTask setExperiment(String experiment) {
    this.experiment = experiment;
    return this;
  }

  public String getExperiment() {
    return experiment;
  }

  public AiRuntimeTask setMlflowArtifactLocation(String mlflowArtifactLocation) {
    this.mlflowArtifactLocation = mlflowArtifactLocation;
    return this;
  }

  public String getMlflowArtifactLocation() {
    return mlflowArtifactLocation;
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
    return Objects.equals(codeSourcePath, that.codeSourcePath)
        && Objects.equals(deployments, that.deployments)
        && Objects.equals(dockerImageUrl, that.dockerImageUrl)
        && Objects.equals(experiment, that.experiment)
        && Objects.equals(mlflowArtifactLocation, that.mlflowArtifactLocation)
        && Objects.equals(mlflowExperimentDirectory, that.mlflowExperimentDirectory)
        && Objects.equals(mlflowRun, that.mlflowRun);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        codeSourcePath,
        deployments,
        dockerImageUrl,
        experiment,
        mlflowArtifactLocation,
        mlflowExperimentDirectory,
        mlflowRun);
  }

  @Override
  public String toString() {
    return new ToStringer(AiRuntimeTask.class)
        .add("codeSourcePath", codeSourcePath)
        .add("deployments", deployments)
        .add("dockerImageUrl", dockerImageUrl)
        .add("experiment", experiment)
        .add("mlflowArtifactLocation", mlflowArtifactLocation)
        .add("mlflowExperimentDirectory", mlflowExperimentDirectory)
        .add("mlflowRun", mlflowRun)
        .toString();
  }
}
