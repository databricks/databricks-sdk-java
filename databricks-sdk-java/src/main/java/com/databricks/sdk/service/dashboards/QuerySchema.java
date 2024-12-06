// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class QuerySchema {
  /** */
  @JsonProperty("columns")
  private Collection<QuerySchemaColumn> columns;

  /**
   * Used to determine if the stored query schema is compatible with the latest run. The service
   * should always clear the schema when the query is re-executed.
   */
  @JsonProperty("statement_id")
  private String statementId;

  public QuerySchema setColumns(Collection<QuerySchemaColumn> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<QuerySchemaColumn> getColumns() {
    return columns;
  }

  public QuerySchema setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public String getStatementId() {
    return statementId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuerySchema that = (QuerySchema) o;
    return Objects.equals(columns, that.columns) && Objects.equals(statementId, that.statementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, statementId);
  }

  @Override
  public String toString() {
    return new ToStringer(QuerySchema.class)
        .add("columns", columns)
        .add("statementId", statementId)
        .toString();
  }
}
