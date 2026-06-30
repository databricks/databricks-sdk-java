// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * AiRuntimeTaskOutput: output identifiers for an AiRuntimeTask run — the MLflow experiment and run
 * IDs the task wrote to.
 *
 * <p>Run lifecycle and termination status are not on this message; they live on the surrounding
 * `RunTask.status` field (see `runs.proto:RunTask.status`).
 */
@Generated
public class AiRuntimeTaskOutput {
  /**
   * MLflow experiment ID the run was logged to. Use it to look up the experiment in MLflow APIs or
   * the workspace MLflow UI.
   */
  @JsonProperty("mlflow_experiment_id")
  private String mlflowExperimentId;

  /**
   * MLflow run ID for this task execution. Use it to look up the run in MLflow APIs or the
   * workspace MLflow UI.
   */
  @JsonProperty("mlflow_run_id")
  private String mlflowRunId;

  public AiRuntimeTaskOutput setMlflowExperimentId(String mlflowExperimentId) {
    this.mlflowExperimentId = mlflowExperimentId;
    return this;
  }

  public String getMlflowExperimentId() {
    return mlflowExperimentId;
  }

  public AiRuntimeTaskOutput setMlflowRunId(String mlflowRunId) {
    this.mlflowRunId = mlflowRunId;
    return this;
  }

  public String getMlflowRunId() {
    return mlflowRunId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiRuntimeTaskOutput that = (AiRuntimeTaskOutput) o;
    return Objects.equals(mlflowExperimentId, that.mlflowExperimentId)
        && Objects.equals(mlflowRunId, that.mlflowRunId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mlflowExperimentId, mlflowRunId);
  }

  @Override
  public String toString() {
    return new ToStringer(AiRuntimeTaskOutput.class)
        .add("mlflowExperimentId", mlflowExperimentId)
        .add("mlflowRunId", mlflowRunId)
        .toString();
  }
}
