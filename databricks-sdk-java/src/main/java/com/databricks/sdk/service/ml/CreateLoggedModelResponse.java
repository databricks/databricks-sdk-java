// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateLoggedModelResponse {
  /** The newly created logged model. */
  @JsonProperty("model")
  private LoggedModel model;

  public CreateLoggedModelResponse setModel(LoggedModel model) {
    this.model = model;
    return this;
  }

  public LoggedModel getModel() {
    return model;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateLoggedModelResponse that = (CreateLoggedModelResponse) o;
    return Objects.equals(model, that.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateLoggedModelResponse.class).add("model", model).toString();
  }
}
