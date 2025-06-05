// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class SqlTaskPb {
  @JsonProperty("alert")
  private SqlTaskAlert alert;

  @JsonProperty("dashboard")
  private SqlTaskDashboard dashboard;

  @JsonProperty("file")
  private SqlTaskFile file;

  @JsonProperty("parameters")
  private Map<String, String> parameters;

  @JsonProperty("query")
  private SqlTaskQuery query;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public SqlTaskPb setAlert(SqlTaskAlert alert) {
    this.alert = alert;
    return this;
  }

  public SqlTaskAlert getAlert() {
    return alert;
  }

  public SqlTaskPb setDashboard(SqlTaskDashboard dashboard) {
    this.dashboard = dashboard;
    return this;
  }

  public SqlTaskDashboard getDashboard() {
    return dashboard;
  }

  public SqlTaskPb setFile(SqlTaskFile file) {
    this.file = file;
    return this;
  }

  public SqlTaskFile getFile() {
    return file;
  }

  public SqlTaskPb setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Map<String, String> getParameters() {
    return parameters;
  }

  public SqlTaskPb setQuery(SqlTaskQuery query) {
    this.query = query;
    return this;
  }

  public SqlTaskQuery getQuery() {
    return query;
  }

  public SqlTaskPb setWarehouseId(String warehouseId) {
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
    SqlTaskPb that = (SqlTaskPb) o;
    return Objects.equals(alert, that.alert)
        && Objects.equals(dashboard, that.dashboard)
        && Objects.equals(file, that.file)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(query, that.query)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert, dashboard, file, parameters, query, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTaskPb.class)
        .add("alert", alert)
        .add("dashboard", dashboard)
        .add("file", file)
        .add("parameters", parameters)
        .add("query", query)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
