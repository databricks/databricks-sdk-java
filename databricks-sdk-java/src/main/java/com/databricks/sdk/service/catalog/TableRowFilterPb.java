// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class TableRowFilterPb {
  @JsonProperty("function_name")
  private String functionName;

  @JsonProperty("input_column_names")
  private Collection<String> inputColumnNames;

  public TableRowFilterPb setFunctionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

  public String getFunctionName() {
    return functionName;
  }

  public TableRowFilterPb setInputColumnNames(Collection<String> inputColumnNames) {
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
    TableRowFilterPb that = (TableRowFilterPb) o;
    return Objects.equals(functionName, that.functionName)
        && Objects.equals(inputColumnNames, that.inputColumnNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionName, inputColumnNames);
  }

  @Override
  public String toString() {
    return new ToStringer(TableRowFilterPb.class)
        .add("functionName", functionName)
        .add("inputColumnNames", inputColumnNames)
        .toString();
  }
}
