// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema is an ordered list of column descriptions. */
public class ResultSchema {
  /** */
  @JsonProperty("column_count")
  private Long columnCount;

  /** */
  @JsonProperty("columns")
  private java.util.List<ColumnInfo> columns;

  public ResultSchema setColumnCount(Long columnCount) {
    this.columnCount = columnCount;
    return this;
  }

  public Long getColumnCount() {
    return columnCount;
  }

  public ResultSchema setColumns(java.util.List<ColumnInfo> columns) {
    this.columns = columns;
    return this;
  }

  public java.util.List<ColumnInfo> getColumns() {
    return columns;
  }
}
