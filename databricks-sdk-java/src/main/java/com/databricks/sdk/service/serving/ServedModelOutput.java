// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ServedModelOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>creationTimestamp</code>.</p>
   *
   * @param creationTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.serving.ServedModelOutput} object
   */
  public ServedModelOutput setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>creationTimestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * <p>Setter for the field <code>creator</code>.</p>
   *
   * @param creator a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.ServedModelOutput} object
   */
  public ServedModelOutput setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * <p>Getter for the field <code>creator</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreator() {
    return creator;
  }

  /**
   * <p>Setter for the field <code>modelName</code>.</p>
   *
   * @param modelName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.ServedModelOutput} object
   */
  public ServedModelOutput setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * <p>Getter for the field <code>modelName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getModelName() {
    return modelName;
  }

  /**
   * <p>Setter for the field <code>modelVersion</code>.</p>
   *
   * @param modelVersion a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.ServedModelOutput} object
   */
  public ServedModelOutput setModelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  /**
   * <p>Getter for the field <code>modelVersion</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getModelVersion() {
    return modelVersion;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.ServedModelOutput} object
   */
  public ServedModelOutput setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>scaleToZeroEnabled</code>.</p>
   *
   * @param scaleToZeroEnabled a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.serving.ServedModelOutput} object
   */
  public ServedModelOutput setScaleToZeroEnabled(Boolean scaleToZeroEnabled) {
    this.scaleToZeroEnabled = scaleToZeroEnabled;
    return this;
  }

  /**
   * <p>Getter for the field <code>scaleToZeroEnabled</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getScaleToZeroEnabled() {
    return scaleToZeroEnabled;
  }

  /**
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link com.databricks.sdk.service.serving.ServedModelState} object
   * @return a {@link com.databricks.sdk.service.serving.ServedModelOutput} object
   */
  public ServedModelOutput setState(ServedModelState state) {
    this.state = state;
    return this;
  }

  /**
   * <p>Getter for the field <code>state</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.serving.ServedModelState} object
   */
  public ServedModelState getState() {
    return state;
  }

  /**
   * <p>Setter for the field <code>workloadSize</code>.</p>
   *
   * @param workloadSize a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.ServedModelOutput} object
   */
  public ServedModelOutput setWorkloadSize(String workloadSize) {
    this.workloadSize = workloadSize;
    return this;
  }

  /**
   * <p>Getter for the field <code>workloadSize</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWorkloadSize() {
    return workloadSize;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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
