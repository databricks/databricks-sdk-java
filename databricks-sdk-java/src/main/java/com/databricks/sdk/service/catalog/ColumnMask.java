// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ColumnMask {
  /** The full name of the column maks SQL UDF. */
  @JsonProperty("function_name")
  private String functionName;

  /**
   * The list of additional table columns to be passed as input to the column mask function. The
   * first arg of the mask function should be of the type of the column being masked and the types
   * of the rest of the args should match the types of columns in 'using_column_names'.
   */
  @JsonProperty("using_column_names")
  private Collection<String> usingColumnNames;

  public ColumnMask setFunctionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

  public String getFunctionName() {
    return functionName;
  }

  public ColumnMask setUsingColumnNames(Collection<String> usingColumnNames) {
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
    ColumnMask that = (ColumnMask) o;
    return Objects.equals(functionName, that.functionName)
        && Objects.equals(usingColumnNames, that.usingColumnNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionName, usingColumnNames);
  }

  @Override
  public String toString() {
    return new ToStringer(ColumnMask.class)
        .add("functionName", functionName)
        .add("usingColumnNames", usingColumnNames)
        .toString();
  }
}
