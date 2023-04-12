// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class SqlAlertOutput {
  /**
   * The state of the SQL alert.
   *
   * <p>* UNKNOWN: alert yet to be evaluated * OK: alert evaluated and did not fulfill trigger
   * conditions * TRIGGERED: alert evaluated and fulfilled trigger conditions
   */
  @JsonProperty("alert_state")
  private SqlAlertState alertState;

  /** The link to find the output results. */
  @JsonProperty("output_link")
  private String outputLink;

  /**
   * The text of the SQL query. Can Run permission of the SQL query associated with the SQL alert is
   * required to view this field.
   */
  @JsonProperty("query_text")
  private String queryText;

  /** Information about SQL statements executed in the run. */
  @JsonProperty("sql_statements")
  private Collection<SqlStatementOutput> sqlStatements;

  /** The canonical identifier of the SQL warehouse. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public SqlAlertOutput setAlertState(SqlAlertState alertState) {
    this.alertState = alertState;
    return this;
  }

  public SqlAlertState getAlertState() {
    return alertState;
  }

  public SqlAlertOutput setOutputLink(String outputLink) {
    this.outputLink = outputLink;
    return this;
  }

  public String getOutputLink() {
    return outputLink;
  }

  public SqlAlertOutput setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public SqlAlertOutput setSqlStatements(Collection<SqlStatementOutput> sqlStatements) {
    this.sqlStatements = sqlStatements;
    return this;
  }

  public Collection<SqlStatementOutput> getSqlStatements() {
    return sqlStatements;
  }

  public SqlAlertOutput setWarehouseId(String warehouseId) {
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
    SqlAlertOutput that = (SqlAlertOutput) o;
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
    return new ToStringer(SqlAlertOutput.class)
        .add("alertState", alertState)
        .add("outputLink", outputLink)
        .add("queryText", queryText)
        .add("sqlStatements", sqlStatements)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
