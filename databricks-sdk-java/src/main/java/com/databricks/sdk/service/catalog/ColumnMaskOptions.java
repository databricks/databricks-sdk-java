// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ColumnMaskOptions {
  /**
   * The fully qualified name of the column mask function. The function is called on each row of the
   * target table. The function's first argument and its return type should match the type of the
   * masked column. Required on create and update.
   */
  @JsonProperty("function_name")
  private String functionName;

  /**
   * The alias of the column to be masked. The alias must refer to one of matched columns. The
   * values of the column is passed to the column mask function as the first argument. Required on
   * create and update.
   */
  @JsonProperty("on_column")
  private String onColumn;

  /**
   * Optional list of column aliases or constant literals to be passed as additional arguments to
   * the column mask function. The type of each column should match the positional argument of the
   * column mask function.
   */
  @JsonProperty("using")
  private Collection<FunctionArgument> using;

  public ColumnMaskOptions setFunctionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

  public String getFunctionName() {
    return functionName;
  }

  public ColumnMaskOptions setOnColumn(String onColumn) {
    this.onColumn = onColumn;
    return this;
  }

  public String getOnColumn() {
    return onColumn;
  }

  public ColumnMaskOptions setUsing(Collection<FunctionArgument> using) {
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
    ColumnMaskOptions that = (ColumnMaskOptions) o;
    return Objects.equals(functionName, that.functionName)
        && Objects.equals(onColumn, that.onColumn)
        && Objects.equals(using, that.using);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionName, onColumn, using);
  }

  @Override
  public String toString() {
    return new ToStringer(ColumnMaskOptions.class)
        .add("functionName", functionName)
        .add("onColumn", onColumn)
        .add("using", using)
        .toString();
  }
}
