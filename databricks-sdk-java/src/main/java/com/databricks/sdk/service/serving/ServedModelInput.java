// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ServedModelInput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ServedModelInput {
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

  /**
   * <p>Setter for the field <code>modelName</code>.</p>
   *
   * @param modelName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.ServedModelInput} object
   */
  public ServedModelInput setModelName(String modelName) {
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
   * @return a {@link com.databricks.sdk.service.serving.ServedModelInput} object
   */
  public ServedModelInput setModelVersion(String modelVersion) {
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
   * @return a {@link com.databricks.sdk.service.serving.ServedModelInput} object
   */
  public ServedModelInput setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.serving.ServedModelInput} object
   */
  public ServedModelInput setScaleToZeroEnabled(Boolean scaleToZeroEnabled) {
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
   * <p>Setter for the field <code>workloadSize</code>.</p>
   *
   * @param workloadSize a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.ServedModelInput} object
   */
  public ServedModelInput setWorkloadSize(String workloadSize) {
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
    ServedModelInput that = (ServedModelInput) o;
    return Objects.equals(modelName, that.modelName)
        && Objects.equals(modelVersion, that.modelVersion)
        && Objects.equals(name, that.name)
        && Objects.equals(scaleToZeroEnabled, that.scaleToZeroEnabled)
        && Objects.equals(workloadSize, that.workloadSize);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(modelName, modelVersion, name, scaleToZeroEnabled, workloadSize);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ServedModelInput.class)
        .add("modelName", modelName)
        .add("modelVersion", modelVersion)
        .add("name", name)
        .add("scaleToZeroEnabled", scaleToZeroEnabled)
        .add("workloadSize", workloadSize)
        .toString();
  }
}
