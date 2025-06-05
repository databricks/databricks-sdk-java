// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GenAiComputeTaskPb {
  @JsonProperty("command")
  private String command;

  @JsonProperty("compute")
  private ComputeConfig compute;

  @JsonProperty("dl_runtime_image")
  private String dlRuntimeImage;

  @JsonProperty("mlflow_experiment_name")
  private String mlflowExperimentName;

  @JsonProperty("source")
  private Source source;

  @JsonProperty("training_script_path")
  private String trainingScriptPath;

  @JsonProperty("yaml_parameters")
  private String yamlParameters;

  @JsonProperty("yaml_parameters_file_path")
  private String yamlParametersFilePath;

  public GenAiComputeTaskPb setCommand(String command) {
    this.command = command;
    return this;
  }

  public String getCommand() {
    return command;
  }

  public GenAiComputeTaskPb setCompute(ComputeConfig compute) {
    this.compute = compute;
    return this;
  }

  public ComputeConfig getCompute() {
    return compute;
  }

  public GenAiComputeTaskPb setDlRuntimeImage(String dlRuntimeImage) {
    this.dlRuntimeImage = dlRuntimeImage;
    return this;
  }

  public String getDlRuntimeImage() {
    return dlRuntimeImage;
  }

  public GenAiComputeTaskPb setMlflowExperimentName(String mlflowExperimentName) {
    this.mlflowExperimentName = mlflowExperimentName;
    return this;
  }

  public String getMlflowExperimentName() {
    return mlflowExperimentName;
  }

  public GenAiComputeTaskPb setSource(Source source) {
    this.source = source;
    return this;
  }

  public Source getSource() {
    return source;
  }

  public GenAiComputeTaskPb setTrainingScriptPath(String trainingScriptPath) {
    this.trainingScriptPath = trainingScriptPath;
    return this;
  }

  public String getTrainingScriptPath() {
    return trainingScriptPath;
  }

  public GenAiComputeTaskPb setYamlParameters(String yamlParameters) {
    this.yamlParameters = yamlParameters;
    return this;
  }

  public String getYamlParameters() {
    return yamlParameters;
  }

  public GenAiComputeTaskPb setYamlParametersFilePath(String yamlParametersFilePath) {
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
    GenAiComputeTaskPb that = (GenAiComputeTaskPb) o;
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
    return new ToStringer(GenAiComputeTaskPb.class)
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
