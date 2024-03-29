// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ServedModelSpec {
  /**
   * The name of the model in Databricks Model Registry or the full name of the model in Unity
   * Catalog.
   */
  @JsonProperty("model_name")
  private String modelName;

  /** The version of the model in Databricks Model Registry or Unity Catalog to be served. */
  @JsonProperty("model_version")
  private String modelVersion;

  /** The name of the served model. */
  @JsonProperty("name")
  private String name;

  public ServedModelSpec setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public ServedModelSpec setModelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  public String getModelVersion() {
    return modelVersion;
  }

  public ServedModelSpec setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServedModelSpec that = (ServedModelSpec) o;
    return Objects.equals(modelName, that.modelName)
        && Objects.equals(modelVersion, that.modelVersion)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelName, modelVersion, name);
  }

  @Override
  public String toString() {
    return new ToStringer(ServedModelSpec.class)
        .add("modelName", modelName)
        .add("modelVersion", modelVersion)
        .add("name", name)
        .toString();
  }
}
