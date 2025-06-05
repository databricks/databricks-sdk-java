// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = GenAiComputeTask.GenAiComputeTaskSerializer.class)
@JsonDeserialize(using = GenAiComputeTask.GenAiComputeTaskDeserializer.class)
public class GenAiComputeTask {
  /** Command launcher to run the actual script, e.g. bash, python etc. */
  private String command;

  /** */
  private ComputeConfig compute;

  /** Runtime image */
  private String dlRuntimeImage;

  /**
   * Optional string containing the name of the MLflow experiment to log the run to. If name is not
   * found, backend will create the mlflow experiment using the name.
   */
  private String mlflowExperimentName;

  /**
   * Optional location type of the training script. When set to `WORKSPACE`, the script will be
   * retrieved from the local Databricks workspace. When set to `GIT`, the script will be retrieved
   * from a Git repository defined in `git_source`. If the value is empty, the task will use `GIT`
   * if `git_source` is defined and `WORKSPACE` otherwise. * `WORKSPACE`: Script is located in
   * Databricks workspace. * `GIT`: Script is located in cloud Git provider.
   */
  private Source source;

  /**
   * The training script file path to be executed. Cloud file URIs (such as dbfs:/, s3:/, adls:/,
   * gcs:/) and workspace paths are supported. For python files stored in the Databricks workspace,
   * the path must be absolute and begin with `/`. For files stored in a remote repository, the path
   * must be relative. This field is required.
   */
  private String trainingScriptPath;

  /**
   * Optional string containing model parameters passed to the training script in yaml format. If
   * present, then the content in yaml_parameters_file_path will be ignored.
   */
  private String yamlParameters;

  /** Optional path to a YAML file containing model parameters passed to the training script. */
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

  GenAiComputeTaskPb toPb() {
    GenAiComputeTaskPb pb = new GenAiComputeTaskPb();
    pb.setCommand(command);
    pb.setCompute(compute);
    pb.setDlRuntimeImage(dlRuntimeImage);
    pb.setMlflowExperimentName(mlflowExperimentName);
    pb.setSource(source);
    pb.setTrainingScriptPath(trainingScriptPath);
    pb.setYamlParameters(yamlParameters);
    pb.setYamlParametersFilePath(yamlParametersFilePath);

    return pb;
  }

  static GenAiComputeTask fromPb(GenAiComputeTaskPb pb) {
    GenAiComputeTask model = new GenAiComputeTask();
    model.setCommand(pb.getCommand());
    model.setCompute(pb.getCompute());
    model.setDlRuntimeImage(pb.getDlRuntimeImage());
    model.setMlflowExperimentName(pb.getMlflowExperimentName());
    model.setSource(pb.getSource());
    model.setTrainingScriptPath(pb.getTrainingScriptPath());
    model.setYamlParameters(pb.getYamlParameters());
    model.setYamlParametersFilePath(pb.getYamlParametersFilePath());

    return model;
  }

  public static class GenAiComputeTaskSerializer extends JsonSerializer<GenAiComputeTask> {
    @Override
    public void serialize(GenAiComputeTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenAiComputeTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenAiComputeTaskDeserializer extends JsonDeserializer<GenAiComputeTask> {
    @Override
    public GenAiComputeTask deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenAiComputeTaskPb pb = mapper.readValue(p, GenAiComputeTaskPb.class);
      return GenAiComputeTask.fromPb(pb);
    }
  }
}
