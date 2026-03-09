// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Unity Catalog Destinations for OTEL telemetry export. */
@Generated
public class UnityCatalog {
  /** Unity Catalog table for OTEL logs. */
  @JsonProperty("logs_table")
  private String logsTable;

  /** Unity Catalog table for OTEL metrics. */
  @JsonProperty("metrics_table")
  private String metricsTable;

  /** Unity Catalog table for OTEL traces (spans). */
  @JsonProperty("traces_table")
  private String tracesTable;

  public UnityCatalog setLogsTable(String logsTable) {
    this.logsTable = logsTable;
    return this;
  }

  public String getLogsTable() {
    return logsTable;
  }

  public UnityCatalog setMetricsTable(String metricsTable) {
    this.metricsTable = metricsTable;
    return this;
  }

  public String getMetricsTable() {
    return metricsTable;
  }

  public UnityCatalog setTracesTable(String tracesTable) {
    this.tracesTable = tracesTable;
    return this;
  }

  public String getTracesTable() {
    return tracesTable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UnityCatalog that = (UnityCatalog) o;
    return Objects.equals(logsTable, that.logsTable)
        && Objects.equals(metricsTable, that.metricsTable)
        && Objects.equals(tracesTable, that.tracesTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logsTable, metricsTable, tracesTable);
  }

  @Override
  public String toString() {
    return new ToStringer(UnityCatalog.class)
        .add("logsTable", logsTable)
        .add("metricsTable", metricsTable)
        .add("tracesTable", tracesTable)
        .toString();
  }
}
