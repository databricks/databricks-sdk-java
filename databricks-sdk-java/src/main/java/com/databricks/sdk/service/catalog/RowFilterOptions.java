// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class RowFilterOptions {
  /**
   * The fully qualified name of the row filter function. The function is called on each row of the
   * target table. It should return a boolean value indicating whether the row should be visible to
   * the user. Required on create and update.
   */
  @JsonProperty("function_name")
  private String functionName;

  /**
   * Optional list of column aliases or constant literals to be passed as arguments to the row
   * filter function. The type of each column should match the positional argument of the row filter
   * function.
   */
  @JsonProperty("using")
  private Collection<FunctionArgument> using;

  public RowFilterOptions setFunctionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

  public String getFunctionName() {
    return functionName;
  }

  public RowFilterOptions setUsing(Collection<FunctionArgument> using) {
    this.using = using;
    return this;
  }

  public Collection<FunctionArgument> getUsing() {
    return using;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RowFilterOptions that = (RowFilterOptions) o;
    return Objects.equals(functionName, that.functionName) && Objects.equals(using, that.using);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionName, using);
  }

  @Override
  public String toString() {
    return new ToStringer(RowFilterOptions.class)
        .add("functionName", functionName)
        .add("using", using)
        .toString();
  }
}
