// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ServedModelOutput {
  /** The creation timestamp of the served model in Unix time. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /** The email of the user who created the served model. */
  @JsonProperty("creator")
  private String creator;

  /** The name of the model in Databricks Model Registry. */
  @JsonProperty("model_name")
  private String modelName;

  /** The version of the model in Databricks Model Registry. */
  @JsonProperty("model_version")
  private String modelVersion;

  /** The name of the served model. */
  @JsonProperty("name")
  private String name;

  /** Whether the compute resources for the Served Model should scale down to zero. */
  @JsonProperty("scale_to_zero_enabled")
  private Boolean scaleToZeroEnabled;

  /** Information corresponding to the state of the Served Model. */
  @JsonProperty("state")
  private ServedModelState state;

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

  public ServedModelOutput setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ServedModelOutput setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public ServedModelOutput setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public ServedModelOutput setModelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  public String getModelVersion() {
    return modelVersion;
  }

  public ServedModelOutput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ServedModelOutput setScaleToZeroEnabled(Boolean scaleToZeroEnabled) {
    this.scaleToZeroEnabled = scaleToZeroEnabled;
    return this;
  }

  public Boolean getScaleToZeroEnabled() {
    return scaleToZeroEnabled;
  }

  public ServedModelOutput setState(ServedModelState state) {
    this.state = state;
    return this;
  }

  public ServedModelState getState() {
    return state;
  }

  public ServedModelOutput setWorkloadSize(String workloadSize) {
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
    ServedModelOutput that = (ServedModelOutput) o;
    return Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(creator, that.creator)
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(modelVersion, that.modelVersion)
        && Objects.equals(name, that.name)
        && Objects.equals(scaleToZeroEnabled, that.scaleToZeroEnabled)
        && Objects.equals(state, that.state)
        && Objects.equals(workloadSize, that.workloadSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp,
        creator,
        modelName,
        modelVersion,
        name,
        scaleToZeroEnabled,
        state,
        workloadSize);
  }

  @Override
  public String toString() {
    return new ToStringer(ServedModelOutput.class)
        .add("creationTimestamp", creationTimestamp)
        .add("creator", creator)
        .add("modelName", modelName)
        .add("modelVersion", modelVersion)
        .add("name", name)
        .add("scaleToZeroEnabled", scaleToZeroEnabled)
        .add("state", state)
        .add("workloadSize", workloadSize)
        .toString();
  }
}
