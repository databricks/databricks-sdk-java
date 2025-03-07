// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Next field: 9 */
@Generated
public class GenAiComputeTask {
  /** Command launcher to run the actual script, e.g. bash, python etc. */
  @JsonProperty("command")
  private String command;

  /** Next field: 4 */
  @JsonProperty("compute")
  private ComputeConfig compute;

  /** Runtime image */
  @JsonProperty("dl_runtime_image")
  private String dlRuntimeImage;

  /**
   * Optional string containing the name of the MLflow experiment to log the run to. If name is not
   * found, backend will create the mlflow experiment using the name.
   */
  @JsonProperty("mlflow_experiment_name")
  private String mlflowExperimentName;

  /**
   * Optional location type of the training script. When set to `WORKSPACE`, the script will be
   * retrieved from the local Databricks workspace. When set to `GIT`, the script will be retrieved
   * from a Git repository defined in `git_source`. If the value is empty, the task will use `GIT`
   * if `git_source` is defined and `WORKSPACE` otherwise. * `WORKSPACE`: Script is located in
   * Databricks workspace. * `GIT`: Script is located in cloud Git provider.
   */
  @JsonProperty("source")
  private Source source;

  /**
   * The training script file path to be executed. Cloud file URIs (such as dbfs:/, s3:/, adls:/,
   * gcs:/) and workspace paths are supported. For python files stored in the Databricks workspace,
   * the path must be absolute and begin with `/`. For files stored in a remote repository, the path
   * must be relative. This field is required.
   */
  @JsonProperty("training_script_path")
  private String trainingScriptPath;

  /**
   * Optional string containing model parameters passed to the training script in yaml format. If
   * present, then the content in yaml_parameters_file_path will be ignored.
   */
  @JsonProperty("yaml_parameters")
  private String yamlParameters;

  /** Optional path to a YAML file containing model parameters passed to the training script. */
  @JsonProperty("yaml_parameters_file_path")
  private String yamlParametersFilePath;

  public GenAiComputeTask setCommand(String command) {
    this.command = command;
    return this;
  }

  public String getCommand() {
    return command;
  }

  public GenAiComputeTask setCompute(ComputeConfig compute) {
    this.compute = compute;
    return this;
  }

  public ComputeConfig getCompute() {
    return compute;
  }

  public GenAiComputeTask setDlRuntimeImage(String dlRuntimeImage) {
    this.dlRuntimeImage = dlRuntimeImage;
    return this;
  }

  public String getDlRuntimeImage() {
    return dlRuntimeImage;
  }

  public GenAiComputeTask setMlflowExperimentName(String mlflowExperimentName) {
    this.mlflowExperimentName = mlflowExperimentName;
    return this;
  }

  public String getMlflowExperimentName() {
    return mlflowExperimentName;
  }

  public GenAiComputeTask setSource(Source source) {
    this.source = source;
    return this;
  }

  public Source getSource() {
    return source;
  }

  public GenAiComputeTask setTrainingScriptPath(String trainingScriptPath) {
    this.trainingScriptPath = trainingScriptPath;
    return this;
  }

  public String getTrainingScriptPath() {
    return trainingScriptPath;
  }

  public GenAiComputeTask setYamlParameters(String yamlParameters) {
    this.yamlParameters = yamlParameters;
    return this;
  }

  public String getYamlParameters() {
    return yamlParameters;
  }

  public GenAiComputeTask setYamlParametersFilePath(String yamlParametersFilePath) {
    this.yamlParametersFilePath = yamlParametersFilePath;
    return this;
  }

  public String getYamlParametersFilePath() {
    return yamlParametersFilePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenAiComputeTask that = (GenAiComputeTask) o;
    return Objects.equals(command, that.command)
        && Objects.equals(compute, that.compute)
        && Objects.equals(dlRuntimeImage, that.dlRuntimeImage)
        && Objects.equals(mlflowExperimentName, that.mlflowExperimentName)
        && Objects.equals(source, that.source)
        && Objects.equals(trainingScriptPath, that.trainingScriptPath)
        && Objects.equals(yamlParameters, that.yamlParameters)
        && Objects.equals(yamlParametersFilePath, that.yamlParametersFilePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        command,
        compute,
        dlRuntimeImage,
        mlflowExperimentName,
        source,
        trainingScriptPath,
        yamlParameters,
        yamlParametersFilePath);
  }

  @Override
  public String toString() {
    return new ToStringer(GenAiComputeTask.class)
        .add("command", command)
        .add("compute", compute)
        .add("dlRuntimeImage", dlRuntimeImage)
        .add("mlflowExperimentName", mlflowExperimentName)
        .add("source", source)
        .add("trainingScriptPath", trainingScriptPath)
        .add("yamlParameters", yamlParameters)
        .add("yamlParametersFilePath", yamlParametersFilePath)
        .toString();
  }
}
