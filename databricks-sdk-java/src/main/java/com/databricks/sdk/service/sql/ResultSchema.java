// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Schema is an ordered list of column descriptions.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ResultSchema {
  /** */
  @JsonProperty("column_count")
  private Long columnCount;

  /** */
  @JsonProperty("columns")
  private Collection<ColumnInfo> columns;

  /**
   * <p>Setter for the field <code>columnCount</code>.</p>
   *
   * @param columnCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.ResultSchema} object
   */
  public ResultSchema setColumnCount(Long columnCount) {
    this.columnCount = columnCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>columnCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getColumnCount() {
    return columnCount;
  }

  /**
   * <p>Setter for the field <code>columns</code>.</p>
   *
   * @param columns a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.ResultSchema} object
   */
  public ResultSchema setColumns(Collection<ColumnInfo> columns) {
    this.columns = columns;
    return this;
  }

  /**
   * <p>Getter for the field <code>columns</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ColumnInfo> getColumns() {
    return columns;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResultSchema that = (ResultSchema) o;
    return Objects.equals(columnCount, that.columnCount) && Objects.equals(columns, that.columns);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(columnCount, columns);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ResultSchema.class)
        .add("columnCount", columnCount)
        .add("columns", columns)
        .toString();
  }
}
