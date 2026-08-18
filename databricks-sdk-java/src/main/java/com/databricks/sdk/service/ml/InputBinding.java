// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Binds a single UC function parameter to a source column. */
@Generated
public class InputBinding {
  /** Source column whose value is passed for this parameter at execution time. */
  @JsonProperty("column")
  private String column;

  /** Name of the UC function parameter. */
  @JsonProperty("parameter")
  private String parameter;

  public InputBinding setColumn(String column) {
    this.column = column;
    return this;
  }

  public String getColumn() {
    return column;
  }

  public InputBinding setParameter(String parameter) {
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
    InputBinding that = (InputBinding) o;
    return Objects.equals(column, that.column) && Objects.equals(parameter, that.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, parameter);
  }

  @Override
  public String toString() {
    return new ToStringer(InputBinding.class)
        .add("column", column)
        .add("parameter", parameter)
        .toString();
  }
}
