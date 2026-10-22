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

  /**
   * The error the user accepts, as a fraction of the count, between 0.02 (by default) and 0.3. This
   * is one standard error of the estimate, the same meaning as Spark's relativeSD: 0.02 means the
   * result is within ±2% of the true count about 68% of the time (one standard deviation covers 68%
   * of the region). Feature Store picks the sketch size that gives this relative error. If neither
   * relative_error nor relative_sd is set, 0.02 is default chosen at feature creation.
   */
  @JsonProperty("relative_error")
  private Double relativeError;

  /**
   * The maximum relative standard deviation allowed (default defined by Spark). Deprecated: use
   * relative_error. When relative_error is set, reads return the same value here for clients that
   * don't have relative_error, and a request may only send that value.
   */
  @JsonProperty("relative_sd")
  private Double relativeSd;

  public ApproxCountDistinctFunction setInput(String input) {
    this.input = input;
    return this;
  }

  public String getInput() {
    return input;
  }

  public ApproxCountDistinctFunction setRelativeError(Double relativeError) {
    this.relativeError = relativeError;
    return this;
  }

  public Double getRelativeError() {
    return relativeError;
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
    return Objects.equals(input, that.input)
        && Objects.equals(relativeError, that.relativeError)
        && Objects.equals(relativeSd, that.relativeSd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, relativeError, relativeSd);
  }

  @Override
  public String toString() {
    return new ToStringer(ApproxCountDistinctFunction.class)
        .add("input", input)
        .add("relativeError", relativeError)
        .add("relativeSd", relativeSd)
        .toString();
  }
}
