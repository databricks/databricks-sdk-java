// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Returns the first value. */
@Generated
public class FirstFunction {
  /** The input column from which the first value is returned. */
  @JsonProperty("input")
  private String input;

  public FirstFunction setInput(String input) {
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
    FirstFunction that = (FirstFunction) o;
    return Objects.equals(input, that.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input);
  }

  @Override
  public String toString() {
    return new ToStringer(FirstFunction.class).add("input", input).toString();
  }
}
