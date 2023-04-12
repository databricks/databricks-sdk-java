// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateRegisteredModelResponse {
  /** */
  @JsonProperty("registered_model")
  private RegisteredModel registeredModel;

  public CreateRegisteredModelResponse setRegisteredModel(RegisteredModel registeredModel) {
    this.registeredModel = registeredModel;
    return this;
  }

  public RegisteredModel getRegisteredModel() {
    return registeredModel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateRegisteredModelResponse that = (CreateRegisteredModelResponse) o;
    return Objects.equals(registeredModel, that.registeredModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredModel);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRegisteredModelResponse.class)
        .add("registeredModel", registeredModel)
        .toString();
  }
}
