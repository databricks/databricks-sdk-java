// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SqlTaskSqlFileOutput {
  /** The result of the executed SQL statement, if available. */
  @JsonProperty("query_result")
  private SqlStatementQueryResult queryResult;

  /** The text of the SQL query. */
  @JsonProperty("query_text")
  private String queryText;

  /** Information about SQL statements executed in the run. */
  @JsonProperty("sql_statements")
  private Collection<SqlStatementOutput> sqlStatements;

  /** The canonical identifier of the SQL warehouse. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public SqlTaskSqlFileOutput setQueryResult(SqlStatementQueryResult queryResult) {
    this.queryResult = queryResult;
    return this;
  }

  public SqlStatementQueryResult getQueryResult() {
    return queryResult;
  }

  public SqlTaskSqlFileOutput setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public SqlTaskSqlFileOutput setSqlStatements(Collection<SqlStatementOutput> sqlStatements) {
    this.sqlStatements = sqlStatements;
    return this;
  }

  public Collection<SqlStatementOutput> getSqlStatements() {
    return sqlStatements;
  }

  public SqlTaskSqlFileOutput setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlTaskSqlFileOutput that = (SqlTaskSqlFileOutput) o;
    return Objects.equals(queryResult, that.queryResult)
        && Objects.equals(queryText, that.queryText)
        && Objects.equals(sqlStatements, that.sqlStatements)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryResult, queryText, sqlStatements, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTaskSqlFileOutput.class)
        .add("queryResult", queryResult)
        .add("queryText", queryText)
        .add("sqlStatements", sqlStatements)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
