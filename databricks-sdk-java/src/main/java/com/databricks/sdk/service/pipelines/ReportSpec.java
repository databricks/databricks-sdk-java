// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ReportSpec {
  /** Required. Destination catalog to store table. */
  @JsonProperty("destination_catalog")
  private String destinationCatalog;

  /** Required. Destination schema to store table. */
  @JsonProperty("destination_schema")
  private String destinationSchema;

  /**
   * Required. Destination table name. The pipeline fails if a table with that name already exists.
   */
  @JsonProperty("destination_table")
  private String destinationTable;

  /** Required. Report URL in the source system. */
  @JsonProperty("source_url")
  private String sourceUrl;

  /**
   * Configuration settings to control the ingestion of tables. These settings override the
   * table_configuration defined in the IngestionPipelineDefinition object.
   */
  @JsonProperty("table_configuration")
  private TableSpecificConfig tableConfiguration;

  public ReportSpec setDestinationCatalog(String destinationCatalog) {
    this.destinationCatalog = destinationCatalog;
    return this;
  }

  public String getDestinationCatalog() {
    return destinationCatalog;
  }

  public ReportSpec setDestinationSchema(String destinationSchema) {
    this.destinationSchema = destinationSchema;
    return this;
  }

  public String getDestinationSchema() {
    return destinationSchema;
  }

  public ReportSpec setDestinationTable(String destinationTable) {
    this.destinationTable = destinationTable;
    return this;
  }

  public String getDestinationTable() {
    return destinationTable;
  }

  public ReportSpec setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  public String getSourceUrl() {
    return sourceUrl;
  }

  public ReportSpec setTableConfiguration(TableSpecificConfig tableConfiguration) {
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
    ReportSpec that = (ReportSpec) o;
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
    return new ToStringer(ReportSpec.class)
        .add("destinationCatalog", destinationCatalog)
        .add("destinationSchema", destinationSchema)
        .add("destinationTable", destinationTable)
        .add("sourceUrl", sourceUrl)
        .add("tableConfiguration", tableConfiguration)
        .toString();
  }
}
