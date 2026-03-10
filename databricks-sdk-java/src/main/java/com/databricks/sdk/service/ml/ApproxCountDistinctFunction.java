// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Computes the approximate count of distinct values. */
@Generated
public class ApproxCountDistinctFunction {
  /** The input column from which the approximate count of distinct values is computed. */
  @JsonProperty("input")
  private String input;

  /** The maximum relative standard deviation allowed (default defined by Spark). */
  @JsonProperty("relative_sd")
  private Double relativeSd;

  public ApproxCountDistinctFunction setInput(String input) {
    this.input = input;
    return this;
  }

  public String getInput() {
    return input;
  }

  public ApproxCountDistinctFunction setRelativeSd(Double relativeSd) {
    this.relativeSd = relativeSd;
    return this;
  }

  public Double getRelativeSd() {
    return relativeSd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApproxCountDistinctFunction that = (ApproxCountDistinctFunction) o;
    return Objects.equals(input, that.input) && Objects.equals(relativeSd, that.relativeSd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, relativeSd);
  }

  @Override
  public String toString() {
    return new ToStringer(ApproxCountDistinctFunction.class)
        .add("input", input)
        .add("relativeSd", relativeSd)
        .toString();
  }
}
