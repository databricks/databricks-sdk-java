// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class TableRowFilter {
  /** The full name of the row filter SQL UDF. */
  @JsonProperty("function_name")
  private String functionName;

  /**
   * The list of table columns to be passed as input to the row filter function. The column types
   * should match the types of the filter function arguments.
   */
  @JsonProperty("input_column_names")
  private Collection<String> inputColumnNames;

  public TableRowFilter setFunctionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

  public String getFunctionName() {
    return functionName;
  }

  public TableRowFilter setInputColumnNames(Collection<String> inputColumnNames) {
    this.inputColumnNames = inputColumnNames;
    return this;
  }

  public Collection<String> getInputColumnNames() {
    return inputColumnNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableRowFilter that = (TableRowFilter) o;
    return Objects.equals(functionName, that.functionName)
        && Objects.equals(inputColumnNames, that.inputColumnNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionName, inputColumnNames);
  }

  @Override
  public String toString() {
    return new ToStringer(TableRowFilter.class)
        .add("functionName", functionName)
        .add("inputColumnNames", inputColumnNames)
        .toString();
  }
}
