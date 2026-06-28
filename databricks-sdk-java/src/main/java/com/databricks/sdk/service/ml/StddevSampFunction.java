// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Computes the sample standard deviation. */
@Generated
public class StddevSampFunction {
  /** The input column from which the sample standard deviation is computed. */
  @JsonProperty("input")
  private String input;

  public StddevSampFunction setInput(String input) {
    this.input = input;
    return this;
  }

  public String getInput() {
    return input;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StddevSampFunction that = (StddevSampFunction) o;
    return Objects.equals(input, that.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input);
  }

  @Override
  public String toString() {
    return new ToStringer(StddevSampFunction.class).add("input", input).toString();
  }
}
