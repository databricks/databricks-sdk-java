// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Returns the last N values, ordered by the feature's timeseries column. */
@Generated
public class LastNFunction {
  /** The input column from which the last N values are returned. */
  @JsonProperty("input")
  private String input;

  /** The number of values to return. */
  @JsonProperty("n")
  private Long n;

  public LastNFunction setInput(String input) {
    this.input = input;
    return this;
  }

  public String getInput() {
    return input;
  }

  public LastNFunction setN(Long n) {
    this.n = n;
    return this;
  }

  public Long getN() {
    return n;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LastNFunction that = (LastNFunction) o;
    return Objects.equals(input, that.input) && Objects.equals(n, that.n);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, n);
  }

  @Override
  public String toString() {
    return new ToStringer(LastNFunction.class).add("input", input).add("n", n).toString();
  }
}
