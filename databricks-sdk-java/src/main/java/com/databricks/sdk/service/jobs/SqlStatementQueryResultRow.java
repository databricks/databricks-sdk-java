// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SqlStatementQueryResultRow {
  /** The values in the row, ordered to match the columns. */
  @JsonProperty("values")
  private Collection<SqlStatementQueryResultRowRowValue> values;

  public SqlStatementQueryResultRow setValues(
      Collection<SqlStatementQueryResultRowRowValue> values) {
    this.values = values;
    return this;
  }

  public Collection<SqlStatementQueryResultRowRowValue> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlStatementQueryResultRow that = (SqlStatementQueryResultRow) o;
    return Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlStatementQueryResultRow.class).add("values", values).toString();
  }
}
