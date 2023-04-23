// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateModelVersionRequest {
  /** If provided, updates the description for this `registered_model`. */
  @JsonProperty("description")
  private String description;

  /** Name of the registered model */
  @JsonProperty("name")
  private String name;

  /** Model version number */
  @JsonProperty("version")
  private String version;

  public UpdateModelVersionRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public UpdateModelVersionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateModelVersionRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateModelVersionRequest that = (UpdateModelVersionRequest) o;
    return Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateModelVersionRequest.class)
        .add("description", description)
        .add("name", name)
        .add("version", version)
        .toString();
  }
}
