// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class IngestionConfigPb {
  @JsonProperty("report")
  private ReportSpec report;

  @JsonProperty("schema")
  private SchemaSpec schema;

  @JsonProperty("table")
  private TableSpec table;

  public IngestionConfigPb setReport(ReportSpec report) {
    this.report = report;
    return this;
  }

  public ReportSpec getReport() {
    return report;
  }

  public IngestionConfigPb setSchema(SchemaSpec schema) {
    this.schema = schema;
    return this;
  }

  public SchemaSpec getSchema() {
    return schema;
  }

  public IngestionConfigPb setTable(TableSpec table) {
    this.table = table;
    return this;
  }

  public TableSpec getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IngestionConfigPb that = (IngestionConfigPb) o;
    return Objects.equals(report, that.report)
        && Objects.equals(schema, that.schema)
        && Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(report, schema, table);
  }

  @Override
  public String toString() {
    return new ToStringer(IngestionConfigPb.class)
        .add("report", report)
        .add("schema", schema)
        .add("table", table)
        .toString();
  }
}
