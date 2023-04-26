// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 * <p>SqlTask class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SqlTask {
  /** If alert, indicates that this job must refresh a SQL alert. */
  @JsonProperty("alert")
  private SqlTaskAlert alert;

  /** If dashboard, indicates that this job must refresh a SQL dashboard. */
  @JsonProperty("dashboard")
  private SqlTaskDashboard dashboard;

  /**
   * Parameters to be used for each run of this job. The SQL alert task does not support custom
   * parameters.
   */
  @JsonProperty("parameters")
  private Map<String, String> parameters;

  /** If query, indicates that this job must execute a SQL query. */
  @JsonProperty("query")
  private SqlTaskQuery query;

  /**
   * The canonical identifier of the SQL warehouse. Only serverless and pro SQL warehouses are
   * supported.
   */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  /**
   * <p>Setter for the field <code>alert</code>.</p>
   *
   * @param alert a {@link com.databricks.sdk.service.jobs.SqlTaskAlert} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlTask} object
   */
  public SqlTask setAlert(SqlTaskAlert alert) {
    this.alert = alert;
    return this;
  }

  /**
   * <p>Getter for the field <code>alert</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SqlTaskAlert} object
   */
  public SqlTaskAlert getAlert() {
    return alert;
  }

  /**
   * <p>Setter for the field <code>dashboard</code>.</p>
   *
   * @param dashboard a {@link com.databricks.sdk.service.jobs.SqlTaskDashboard} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlTask} object
   */
  public SqlTask setDashboard(SqlTaskDashboard dashboard) {
    this.dashboard = dashboard;
    return this;
  }

  /**
   * <p>Getter for the field <code>dashboard</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SqlTaskDashboard} object
   */
  public SqlTaskDashboard getDashboard() {
    return dashboard;
  }

  /**
   * <p>Setter for the field <code>parameters</code>.</p>
   *
   * @param parameters a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlTask} object
   */
  public SqlTask setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * <p>Getter for the field <code>parameters</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getParameters() {
    return parameters;
  }

  /**
   * <p>Setter for the field <code>query</code>.</p>
   *
   * @param query a {@link com.databricks.sdk.service.jobs.SqlTaskQuery} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlTask} object
   */
  public SqlTask setQuery(SqlTaskQuery query) {
    this.query = query;
    return this;
  }

  /**
   * <p>Getter for the field <code>query</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SqlTaskQuery} object
   */
  public SqlTaskQuery getQuery() {
    return query;
  }

  /**
   * <p>Setter for the field <code>warehouseId</code>.</p>
   *
   * @param warehouseId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlTask} object
   */
  public SqlTask setWarehouseId(String warehouseId) {
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
    SqlTask that = (SqlTask) o;
    return Objects.equals(alert, that.alert)
        && Objects.equals(dashboard, that.dashboard)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(query, that.query)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(alert, dashboard, parameters, query, warehouseId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SqlTask.class)
        .add("alert", alert)
        .add("dashboard", dashboard)
        .add("parameters", parameters)
        .add("query", query)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
