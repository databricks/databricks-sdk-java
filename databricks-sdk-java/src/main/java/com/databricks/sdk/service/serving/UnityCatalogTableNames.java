// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UnityCatalogTableNames {
  /**
   * The full three-level Unity Catalog name (catalog.schema.table) of the table that receives
   * exported annotations.
   */
  @JsonProperty("annotations_table")
  private String annotationsTable;

  /**
   * The full three-level Unity Catalog name (catalog.schema.table) of the table that receives
   * exported logs.
   */
  @JsonProperty("logs_table")
  private String logsTable;

  /**
   * The full three-level Unity Catalog name (catalog.schema.table) of the table that receives
   * exported metrics.
   */
  @JsonProperty("metrics_table")
  private String metricsTable;

  /**
   * The full three-level Unity Catalog name (catalog.schema.table) of the table that receives
   * exported traces (spans).
   */
  @JsonProperty("traces_table")
  private String tracesTable;

  public UnityCatalogTableNames setAnnotationsTable(String annotationsTable) {
    this.annotationsTable = annotationsTable;
    return this;
  }

  public String getAnnotationsTable() {
    return annotationsTable;
  }

  public UnityCatalogTableNames setLogsTable(String logsTable) {
    this.logsTable = logsTable;
    return this;
  }

  public String getLogsTable() {
    return logsTable;
  }

  public UnityCatalogTableNames setMetricsTable(String metricsTable) {
    this.metricsTable = metricsTable;
    return this;
  }

  public String getMetricsTable() {
    return metricsTable;
  }

  public UnityCatalogTableNames setTracesTable(String tracesTable) {
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
    UnityCatalogTableNames that = (UnityCatalogTableNames) o;
    return Objects.equals(annotationsTable, that.annotationsTable)
        && Objects.equals(logsTable, that.logsTable)
        && Objects.equals(metricsTable, that.metricsTable)
        && Objects.equals(tracesTable, that.tracesTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationsTable, logsTable, metricsTable, tracesTable);
  }

  @Override
  public String toString() {
    return new ToStringer(UnityCatalogTableNames.class)
        .add("annotationsTable", annotationsTable)
        .add("logsTable", logsTable)
        .add("metricsTable", metricsTable)
        .add("tracesTable", tracesTable)
        .toString();
  }
}
