// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A Python UDF that computes a feature. */
@Generated
public class FeatureFunction {
  /** Bindings of the UDF's parameters to features. */
  @JsonProperty("input_bindings")
  private Collection<FeatureFunctionInputBinding> inputBindings;

  /** Output name of the feature that the UDF computes. */
  @JsonProperty("output")
  private String output;

  /** Three-part name of the Python UDF. */
  @JsonProperty("udf")
  private String udf;

  public FeatureFunction setInputBindings(Collection<FeatureFunctionInputBinding> inputBindings) {
    this.inputBindings = inputBindings;
    return this;
  }

  public Collection<FeatureFunctionInputBinding> getInputBindings() {
    return inputBindings;
  }

  public FeatureFunction setOutput(String output) {
    this.output = output;
    return this;
  }

  public String getOutput() {
    return output;
  }

  public FeatureFunction setUdf(String udf) {
    this.udf = udf;
    return this;
  }

  public String getUdf() {
    return udf;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FeatureFunction that = (FeatureFunction) o;
    return Objects.equals(inputBindings, that.inputBindings)
        && Objects.equals(output, that.output)
        && Objects.equals(udf, that.udf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputBindings, output, udf);
  }

  @Override
  public String toString() {
    return new ToStringer(FeatureFunction.class)
        .add("inputBindings", inputBindings)
        .add("output", output)
        .add("udf", udf)
        .toString();
  }
}
