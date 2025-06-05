// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ReportSpecPb {
  @JsonProperty("destination_catalog")
  private String destinationCatalog;

  @JsonProperty("destination_schema")
  private String destinationSchema;

  @JsonProperty("destination_table")
  private String destinationTable;

  @JsonProperty("source_url")
  private String sourceUrl;

  @JsonProperty("table_configuration")
  private TableSpecificConfig tableConfiguration;

  public ReportSpecPb setDestinationCatalog(String destinationCatalog) {
    this.destinationCatalog = destinationCatalog;
    return this;
  }

  public String getDestinationCatalog() {
    return destinationCatalog;
  }

  public ReportSpecPb setDestinationSchema(String destinationSchema) {
    this.destinationSchema = destinationSchema;
    return this;
  }

  public String getDestinationSchema() {
    return destinationSchema;
  }

  public ReportSpecPb setDestinationTable(String destinationTable) {
    this.destinationTable = destinationTable;
    return this;
  }

  public String getDestinationTable() {
    return destinationTable;
  }

  public ReportSpecPb setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  public String getSourceUrl() {
    return sourceUrl;
  }

  public ReportSpecPb setTableConfiguration(TableSpecificConfig tableConfiguration) {
    this.tableConfiguration = tableConfiguration;
    return this;
  }

  public TableSpecificConfig getTableConfiguration() {
    return tableConfiguration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReportSpecPb that = (ReportSpecPb) o;
    return Objects.equals(destinationCatalog, that.destinationCatalog)
        && Objects.equals(destinationSchema, that.destinationSchema)
        && Objects.equals(destinationTable, that.destinationTable)
        && Objects.equals(sourceUrl, that.sourceUrl)
        && Objects.equals(tableConfiguration, that.tableConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        destinationCatalog, destinationSchema, destinationTable, sourceUrl, tableConfiguration);
  }

  @Override
  public String toString() {
    return new ToStringer(ReportSpecPb.class)
        .add("destinationCatalog", destinationCatalog)
        .add("destinationSchema", destinationSchema)
        .add("destinationTable", destinationTable)
        .add("sourceUrl", sourceUrl)
        .add("tableConfiguration", tableConfiguration)
        .toString();
  }
}
