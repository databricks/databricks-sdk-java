// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class SqlAlertOutputPb {
  @JsonProperty("alert_state")
  private SqlAlertState alertState;

  @JsonProperty("output_link")
  private String outputLink;

  @JsonProperty("query_text")
  private String queryText;

  @JsonProperty("sql_statements")
  private Collection<SqlStatementOutput> sqlStatements;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public SqlAlertOutputPb setAlertState(SqlAlertState alertState) {
    this.alertState = alertState;
    return this;
  }

  public SqlAlertState getAlertState() {
    return alertState;
  }

  public SqlAlertOutputPb setOutputLink(String outputLink) {
    this.outputLink = outputLink;
    return this;
  }

  public String getOutputLink() {
    return outputLink;
  }

  public SqlAlertOutputPb setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public SqlAlertOutputPb setSqlStatements(Collection<SqlStatementOutput> sqlStatements) {
    this.sqlStatements = sqlStatements;
    return this;
  }

  public Collection<SqlStatementOutput> getSqlStatements() {
    return sqlStatements;
  }

  public SqlAlertOutputPb setWarehouseId(String warehouseId) {
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
    SqlAlertOutputPb that = (SqlAlertOutputPb) o;
    return Objects.equals(alertState, that.alertState)
        && Objects.equals(outputLink, that.outputLink)
        && Objects.equals(queryText, that.queryText)
        && Objects.equals(sqlStatements, that.sqlStatements)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertState, outputLink, queryText, sqlStatements, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlAlertOutputPb.class)
        .add("alertState", alertState)
        .add("outputLink", outputLink)
        .add("queryText", queryText)
        .add("sqlStatements", sqlStatements)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
