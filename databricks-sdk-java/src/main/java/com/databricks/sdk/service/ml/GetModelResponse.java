// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class GetModelResponse {
  /** */
  @JsonProperty("registered_model")
  private ModelDatabricks registeredModel;

  public GetModelResponse setRegisteredModel(ModelDatabricks registeredModel) {
    this.registeredModel = registeredModel;
    return this;
  }

  public ModelDatabricks getRegisteredModel() {
    return registeredModel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelResponse that = (GetModelResponse) o;
    return Objects.equals(registeredModel, that.registeredModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredModel);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelResponse.class)
        .add("registeredModel", registeredModel)
        .toString();
  }
}
