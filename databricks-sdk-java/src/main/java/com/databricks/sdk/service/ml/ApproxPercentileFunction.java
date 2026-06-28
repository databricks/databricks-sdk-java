// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Computes the approximate percentile of values. */
@Generated
public class ApproxPercentileFunction {
  /** The accuracy parameter (higher is more accurate but slower). */
  @JsonProperty("accuracy")
  private Long accuracy;

  /** The input column from which the approximate percentile is computed. */
  @JsonProperty("input")
  private String input;

  /** The percentile value to compute (between 0 and 1). */
  @JsonProperty("percentile")
  private Double percentile;

  public ApproxPercentileFunction setAccuracy(Long accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  public Long getAccuracy() {
    return accuracy;
  }

  public ApproxPercentileFunction setInput(String input) {
    this.input = input;
    return this;
  }

  public String getInput() {
    return input;
  }

  public ApproxPercentileFunction setPercentile(Double percentile) {
    this.percentile = percentile;
    return this;
  }

  public Double getPercentile() {
    return percentile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApproxPercentileFunction that = (ApproxPercentileFunction) o;
    return Objects.equals(accuracy, that.accuracy)
        && Objects.equals(input, that.input)
        && Objects.equals(percentile, that.percentile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accuracy, input, percentile);
  }

  @Override
  public String toString() {
    return new ToStringer(ApproxPercentileFunction.class)
        .add("accuracy", accuracy)
        .add("input", input)
        .add("percentile", percentile)
        .toString();
  }
}
