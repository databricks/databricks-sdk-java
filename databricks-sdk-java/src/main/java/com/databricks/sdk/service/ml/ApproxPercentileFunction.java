// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Computes the approximate percentile of values. */
@Generated
public class ApproxPercentileFunction {
  /**
   * The accuracy parameter (higher is more accurate but slower). Deprecated: use relative_error.
   * When relative_error is set, reads return ceil(1 / relative_error) here for clients that don't
   * have relative_error, and a request may only send that value.
   */
  @JsonProperty("accuracy")
  private Long accuracy;

  /** The input column from which the approximate percentile is computed. */
  @JsonProperty("input")
  private String input;

  /** The percentile value to compute (between 0 and 1). */
  @JsonProperty("percentile")
  private Double percentile;

  /**
   * The error the user accepts, as a fraction of rank, between 0.01 (by default) and 0.3. The
   * result is within this rank error with 99% confidence: at 0.01, the value returned for p95 is
   * between the true p94 and p96 at least 99% of the time. Feature Store picks the sketch size that
   * gives this error. If neither relative_error nor accuracy is set, 0.01 is default chosen at
   * feature creation.
   */
  @JsonProperty("relative_error")
  private Double relativeError;

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

  public ApproxPercentileFunction setRelativeError(Double relativeError) {
    this.relativeError = relativeError;
    return this;
  }

  public Double getRelativeError() {
    return relativeError;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApproxPercentileFunction that = (ApproxPercentileFunction) o;
    return Objects.equals(accuracy, that.accuracy)
        && Objects.equals(input, that.input)
        && Objects.equals(percentile, that.percentile)
        && Objects.equals(relativeError, that.relativeError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accuracy, input, percentile, relativeError);
  }

  @Override
  public String toString() {
    return new ToStringer(ApproxPercentileFunction.class)
        .add("accuracy", accuracy)
        .add("input", input)
        .add("percentile", percentile)
        .add("relativeError", relativeError)
        .toString();
  }
}
