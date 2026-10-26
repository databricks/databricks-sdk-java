// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SqlStatementQueryResult {
  /** The metadata for each column in the result set. */
  @JsonProperty("columns")
  private Collection<SqlStatementQueryResultColumn> columns;

  /** The rows returned by the query. */
  @JsonProperty("rows")
  private Collection<SqlStatementQueryResultRow> rows;

  /** Whether the result set was truncated. */
  @JsonProperty("truncated")
  private Boolean truncated;

  public SqlStatementQueryResult setColumns(Collection<SqlStatementQueryResultColumn> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<SqlStatementQueryResultColumn> getColumns() {
    return columns;
  }

  public SqlStatementQueryResult setRows(Collection<SqlStatementQueryResultRow> rows) {
    this.rows = rows;
    return this;
  }

  public Collection<SqlStatementQueryResultRow> getRows() {
    return rows;
  }

  public SqlStatementQueryResult setTruncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  public Boolean getTruncated() {
    return truncated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlStatementQueryResult that = (SqlStatementQueryResult) o;
    return Objects.equals(columns, that.columns)
        && Objects.equals(rows, that.rows)
        && Objects.equals(truncated, that.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, rows, truncated);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlStatementQueryResult.class)
        .add("columns", columns)
        .add("rows", rows)
        .add("truncated", truncated)
        .toString();
  }
}
