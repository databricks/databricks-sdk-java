// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ServedModelInput {
  /**
   * An object containing a set of optional, user-specified environment variable key-value pairs
   * used for serving this model. Note: this is an experimental feature and subject to change.
   * Example model environment variables that refer to Databricks secrets: `{"OPENAI_API_KEY":
   * "{{secrets/my_scope/my_key}}", "DATABRICKS_TOKEN": "{{secrets/my_scope2/my_key2}}"}`
   */
  @JsonProperty("environment_vars")
  private Object environmentVars;

  /** The name of the model in Databricks Model Registry to be served. */
  @JsonProperty("model_name")
  private String modelName;

  /** The version of the model in Databricks Model Registry to be served. */
  @JsonProperty("model_version")
  private String modelVersion;

  /**
   * The name of a served model. It must be unique across an endpoint. If not specified, this field
   * will default to <model-name>-<model-version>. A served model name can consist of alphanumeric
   * characters, dashes, and underscores.
   */
  @JsonProperty("name")
  private String name;

  /** Whether the compute resources for the served model should scale down to zero. */
  @JsonProperty("scale_to_zero_enabled")
  private Boolean scaleToZeroEnabled;

  /**
   * The workload size of the served model. The workload size corresponds to a range of provisioned
   * concurrency that the compute will autoscale between. A single unit of provisioned concurrency
   * can process one request at a time. Valid workload sizes are "Small" (4 - 4 provisioned
   * concurrency), "Medium" (8 - 16 provisioned concurrency), and "Large" (16 - 64 provisioned
   * concurrency). If scale-to-zero is enabled, the lower bound of the provisioned concurrency for
   * each workload size will be 0.
   */
  @JsonProperty("workload_size")
  private String workloadSize;

  public ServedModelInput setEnvironmentVars(Object environmentVars) {
    this.environmentVars = environmentVars;
    return this;
  }

  public Object getEnvironmentVars() {
    return environmentVars;
  }

  public ServedModelInput setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public ServedModelInput setModelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  public String getModelVersion() {
    return modelVersion;
  }

  public ServedModelInput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ServedModelInput setScaleToZeroEnabled(Boolean scaleToZeroEnabled) {
    this.scaleToZeroEnabled = scaleToZeroEnabled;
    return this;
  }

  public Boolean getScaleToZeroEnabled() {
    return scaleToZeroEnabled;
  }

  public ServedModelInput setWorkloadSize(String workloadSize) {
    this.workloadSize = workloadSize;
    return this;
  }

  public String getWorkloadSize() {
    return workloadSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServedModelInput that = (ServedModelInput) o;
    return Objects.equals(environmentVars, that.environmentVars)
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(modelVersion, that.modelVersion)
        && Objects.equals(name, that.name)
        && Objects.equals(scaleToZeroEnabled, that.scaleToZeroEnabled)
        && Objects.equals(workloadSize, that.workloadSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        environmentVars, modelName, modelVersion, name, scaleToZeroEnabled, workloadSize);
  }

  @Override
  public String toString() {
    return new ToStringer(ServedModelInput.class)
        .add("environmentVars", environmentVars)
        .add("modelName", modelName)
        .add("modelVersion", modelVersion)
        .add("name", name)
        .add("scaleToZeroEnabled", scaleToZeroEnabled)
        .add("workloadSize", workloadSize)
        .toString();
  }
}
