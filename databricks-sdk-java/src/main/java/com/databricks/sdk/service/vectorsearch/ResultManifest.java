// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Metadata about the result set. */
@Generated
public class ResultManifest {
  /** Number of columns in the result set. */
  @JsonProperty("column_count")
  private Long columnCount;

  /** Information about each column in the result set. */
  @JsonProperty("columns")
  private Collection<ColumnInfo> columns;

  public ResultManifest setColumnCount(Long columnCount) {
    this.columnCount = columnCount;
    return this;
  }

  public Long getColumnCount() {
    return columnCount;
  }

  public ResultManifest setColumns(Collection<ColumnInfo> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<ColumnInfo> getColumns() {
    return columns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResultManifest that = (ResultManifest) o;
    return Objects.equals(columnCount, that.columnCount) && Objects.equals(columns, that.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnCount, columns);
  }

  @Override
  public String toString() {
    return new ToStringer(ResultManifest.class)
        .add("columnCount", columnCount)
        .add("columns", columns)
        .toString();
  }
}
