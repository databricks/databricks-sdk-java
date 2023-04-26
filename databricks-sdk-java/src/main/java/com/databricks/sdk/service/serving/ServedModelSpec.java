// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ServedModelSpec class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ServedModelSpec {
  /** The name of the model in Databricks Model Registry. */
  @JsonProperty("model_name")
  private String modelName;

  /** The version of the model in Databricks Model Registry. */
  @JsonProperty("model_version")
  private String modelVersion;

  /** The name of the served model. */
  @JsonProperty("name")
  private String name;

  /**
   * <p>Setter for the field <code>modelName</code>.</p>
   *
   * @param modelName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.ServedModelSpec} object
   */
  public ServedModelSpec setModelName(String modelName) {
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
   * @return a {@link com.databricks.sdk.service.serving.ServedModelSpec} object
   */
  public ServedModelSpec setModelVersion(String modelVersion) {
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
   * @return a {@link com.databricks.sdk.service.serving.ServedModelSpec} object
   */
  public ServedModelSpec setName(String name) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServedModelSpec that = (ServedModelSpec) o;
    return Objects.equals(modelName, that.modelName)
        && Objects.equals(modelVersion, that.modelVersion)
        && Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(modelName, modelVersion, name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ServedModelSpec.class)
        .add("modelName", modelName)
        .add("modelVersion", modelVersion)
        .add("name", name)
        .toString();
  }
}
