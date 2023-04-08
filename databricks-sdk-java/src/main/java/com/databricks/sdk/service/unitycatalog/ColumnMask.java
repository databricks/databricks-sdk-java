// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

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
  private java.util.List<String> usingColumnNames;

  public ColumnMask setFunctionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

  public String getFunctionName() {
    return functionName;
  }

  public ColumnMask setUsingColumnNames(java.util.List<String> usingColumnNames) {
    this.usingColumnNames = usingColumnNames;
    return this;
  }

  public java.util.List<String> getUsingColumnNames() {
    return usingColumnNames;
  }
}
