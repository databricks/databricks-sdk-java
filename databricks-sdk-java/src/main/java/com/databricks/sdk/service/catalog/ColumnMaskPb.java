// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ColumnMaskPb {
  @JsonProperty("function_name")
  private String functionName;

  @JsonProperty("using_column_names")
  private Collection<String> usingColumnNames;

  public ColumnMaskPb setFunctionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

  public String getFunctionName() {
    return functionName;
  }

  public ColumnMaskPb setUsingColumnNames(Collection<String> usingColumnNames) {
    this.usingColumnNames = usingColumnNames;
    return this;
  }

  public Collection<String> getUsingColumnNames() {
    return usingColumnNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ColumnMaskPb that = (ColumnMaskPb) o;
    return Objects.equals(functionName, that.functionName)
        && Objects.equals(usingColumnNames, that.usingColumnNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionName, usingColumnNames);
  }

  @Override
  public String toString() {
    return new ToStringer(ColumnMaskPb.class)
        .add("functionName", functionName)
        .add("usingColumnNames", usingColumnNames)
        .toString();
  }
}
