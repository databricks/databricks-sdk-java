// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RerankerConfigPb {
  @JsonProperty("model")
  private String model;

  @JsonProperty("parameters")
  private RerankerConfigRerankerParameters parameters;

  public RerankerConfigPb setModel(String model) {
    this.model = model;
    return this;
  }

  public String getModel() {
    return model;
  }

  public RerankerConfigPb setParameters(RerankerConfigRerankerParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  public RerankerConfigRerankerParameters getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RerankerConfigPb that = (RerankerConfigPb) o;
    return Objects.equals(model, that.model) && Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(RerankerConfigPb.class)
        .add("model", model)
        .add("parameters", parameters)
        .toString();
  }
}
