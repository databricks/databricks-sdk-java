// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GetModelResponsePb {
  @JsonProperty("registered_model_databricks")
  private ModelDatabricks registeredModelDatabricks;

  public GetModelResponsePb setRegisteredModelDatabricks(
      ModelDatabricks registeredModelDatabricks) {
    this.registeredModelDatabricks = registeredModelDatabricks;
    return this;
  }

  public ModelDatabricks getRegisteredModelDatabricks() {
    return registeredModelDatabricks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelResponsePb that = (GetModelResponsePb) o;
    return Objects.equals(registeredModelDatabricks, that.registeredModelDatabricks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredModelDatabricks);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelResponsePb.class)
        .add("registeredModelDatabricks", registeredModelDatabricks)
        .toString();
  }
}
