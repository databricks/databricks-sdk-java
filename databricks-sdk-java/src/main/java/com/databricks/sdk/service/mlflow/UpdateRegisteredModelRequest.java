// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateRegisteredModelRequest {
  /** If provided, updates the description for this `registered_model`. */
  @JsonProperty("description")
  private String description;

  /** Registered model unique name identifier. */
  @JsonProperty("name")
  private String name;

  public UpdateRegisteredModelRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public UpdateRegisteredModelRequest setName(String name) {
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
    UpdateRegisteredModelRequest that = (UpdateRegisteredModelRequest) o;
    return Objects.equals(description, that.description) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRegisteredModelRequest.class)
        .add("description", description)
        .add("name", name)
        .toString();
  }
}
