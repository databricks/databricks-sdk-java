// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FinalizeLoggedModelResponse {
  /** The updated logged model. */
  @JsonProperty("model")
  private LoggedModel model;

  public FinalizeLoggedModelResponse setModel(LoggedModel model) {
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
    FinalizeLoggedModelResponse that = (FinalizeLoggedModelResponse) o;
    return Objects.equals(model, that.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model);
  }

  @Override
  public String toString() {
    return new ToStringer(FinalizeLoggedModelResponse.class).add("model", model).toString();
  }
}
