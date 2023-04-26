// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>SqlAlertOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>alertState</code>.</p>
   *
   * @param alertState a {@link com.databricks.sdk.service.jobs.SqlAlertState} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlAlertOutput} object
   */
  public SqlAlertOutput setAlertState(SqlAlertState alertState) {
    this.alertState = alertState;
    return this;
  }

  /**
   * <p>Getter for the field <code>alertState</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SqlAlertState} object
   */
  public SqlAlertState getAlertState() {
    return alertState;
  }

  /**
   * <p>Setter for the field <code>outputLink</code>.</p>
   *
   * @param outputLink a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlAlertOutput} object
   */
  public SqlAlertOutput setOutputLink(String outputLink) {
    this.outputLink = outputLink;
    return this;
  }

  /**
   * <p>Getter for the field <code>outputLink</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getOutputLink() {
    return outputLink;
  }

  /**
   * <p>Setter for the field <code>queryText</code>.</p>
   *
   * @param queryText a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlAlertOutput} object
   */
  public SqlAlertOutput setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  /**
   * <p>Getter for the field <code>queryText</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getQueryText() {
    return queryText;
  }

  /**
   * <p>Setter for the field <code>sqlStatements</code>.</p>
   *
   * @param sqlStatements a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlAlertOutput} object
   */
  public SqlAlertOutput setSqlStatements(Collection<SqlStatementOutput> sqlStatements) {
    this.sqlStatements = sqlStatements;
    return this;
  }

  /**
   * <p>Getter for the field <code>sqlStatements</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<SqlStatementOutput> getSqlStatements() {
    return sqlStatements;
  }

  /**
   * <p>Setter for the field <code>warehouseId</code>.</p>
   *
   * @param warehouseId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlAlertOutput} object
   */
  public SqlAlertOutput setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  /**
   * <p>Getter for the field <code>warehouseId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWarehouseId() {
    return warehouseId;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(alertState, outputLink, queryText, sqlStatements, warehouseId);
  }

  /** {@inheritDoc} */
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
