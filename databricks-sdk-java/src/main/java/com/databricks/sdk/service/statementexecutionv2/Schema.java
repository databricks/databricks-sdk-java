// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.statementexecutionv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The schema is an ordered list of column descriptions. */
@Generated
public class Schema {
  /** The number of columns in the result set. */
  @JsonProperty("column_count")
  private Long columnCount;

  /** The column descriptions, in result set order. */
  @JsonProperty("columns")
  private Collection<ColumnInfo> columns;

  public Schema setColumnCount(Long columnCount) {
    this.columnCount = columnCount;
    return this;
  }

  public Long getColumnCount() {
    return columnCount;
  }

  public Schema setColumns(Collection<ColumnInfo> columns) {
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
    Schema that = (Schema) o;
    return Objects.equals(columnCount, that.columnCount) && Objects.equals(columns, that.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnCount, columns);
  }

  @Override
  public String toString() {
    return new ToStringer(Schema.class)
        .add("columnCount", columnCount)
        .add("columns", columns)
        .toString();
  }
}
