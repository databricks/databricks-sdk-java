// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class GetResponse {
  /** */
  @JsonProperty("registered_model")
  private RegisteredModelDatabricks registeredModel;

  public GetResponse setRegisteredModel(RegisteredModelDatabricks registeredModel) {
    this.registeredModel = registeredModel;
    return this;
  }

  public RegisteredModelDatabricks getRegisteredModel() {
    return registeredModel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetResponse that = (GetResponse) o;
    return Objects.equals(registeredModel, that.registeredModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredModel);
  }

  @Override
  public String toString() {
    return new ToStringer(GetResponse.class).add("registeredModel", registeredModel).toString();
  }
}
