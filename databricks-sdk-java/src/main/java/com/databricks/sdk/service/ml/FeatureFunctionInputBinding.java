// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Binds one parameter of the UDF to a feature. */
@Generated
public class FeatureFunctionInputBinding {
  /** Name of the feature bound to the parameter. */
  @JsonProperty("bound_feature")
  private String boundFeature;

  /** Name of the UDF parameter. */
  @JsonProperty("parameter")
  private String parameter;

  public FeatureFunctionInputBinding setBoundFeature(String boundFeature) {
    this.boundFeature = boundFeature;
    return this;
  }

  public String getBoundFeature() {
    return boundFeature;
  }

  public FeatureFunctionInputBinding setParameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

  public String getParameter() {
    return parameter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FeatureFunctionInputBinding that = (FeatureFunctionInputBinding) o;
    return Objects.equals(boundFeature, that.boundFeature)
        && Objects.equals(parameter, that.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundFeature, parameter);
  }

  @Override
  public String toString() {
    return new ToStringer(FeatureFunctionInputBinding.class)
        .add("boundFeature", boundFeature)
        .add("parameter", parameter)
        .toString();
  }
}
