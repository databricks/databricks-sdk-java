// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

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

  public SqlTask setAlert(SqlTaskAlert alert) {
    this.alert = alert;
    return this;
  }

  public SqlTaskAlert getAlert() {
    return alert;
  }

  public SqlTask setDashboard(SqlTaskDashboard dashboard) {
    this.dashboard = dashboard;
    return this;
  }

  public SqlTaskDashboard getDashboard() {
    return dashboard;
  }

  public SqlTask setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Map<String, String> getParameters() {
    return parameters;
  }

  public SqlTask setQuery(SqlTaskQuery query) {
    this.query = query;
    return this;
  }

  public SqlTaskQuery getQuery() {
    return query;
  }

  public SqlTask setWarehouseId(String warehouseId) {
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
    SqlTask that = (SqlTask) o;
    return Objects.equals(alert, that.alert)
        && Objects.equals(dashboard, that.dashboard)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(query, that.query)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert, dashboard, parameters, query, warehouseId);
  }

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
