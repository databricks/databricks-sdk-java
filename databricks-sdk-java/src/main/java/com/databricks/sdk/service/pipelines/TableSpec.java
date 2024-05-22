// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TableSpec {
  /** Required. Destination catalog to store table. */
  @JsonProperty("destination_catalog")
  private String destinationCatalog;

  /** Required. Destination schema to store table. */
  @JsonProperty("destination_schema")
  private String destinationSchema;

  /**
   * Optional. Destination table name. The pipeline fails If a table with that name already exists.
   * If not set, the source table name is used.
   */
  @JsonProperty("destination_table")
  private String destinationTable;

  /** Source catalog name. Might be optional depending on the type of source. */
  @JsonProperty("source_catalog")
  private String sourceCatalog;

  /** Schema name in the source database. Might be optional depending on the type of source. */
  @JsonProperty("source_schema")
  private String sourceSchema;

  /** Required. Table name in the source database. */
  @JsonProperty("source_table")
  private String sourceTable;

  /**
   * Configuration settings to control the ingestion of tables. These settings override the
   * table_configuration defined in the ManagedIngestionPipelineDefinition object and the
   * SchemaSpec.
   */
  @JsonProperty("table_configuration")
  private TableSpecificConfig tableConfiguration;

  public TableSpec setDestinationCatalog(String destinationCatalog) {
    this.destinationCatalog = destinationCatalog;
    return this;
  }

  public String getDestinationCatalog() {
    return destinationCatalog;
  }

  public TableSpec setDestinationSchema(String destinationSchema) {
    this.destinationSchema = destinationSchema;
    return this;
  }

  public String getDestinationSchema() {
    return destinationSchema;
  }

  public TableSpec setDestinationTable(String destinationTable) {
    this.destinationTable = destinationTable;
    return this;
  }

  public String getDestinationTable() {
    return destinationTable;
  }

  public TableSpec setSourceCatalog(String sourceCatalog) {
    this.sourceCatalog = sourceCatalog;
    return this;
  }

  public String getSourceCatalog() {
    return sourceCatalog;
  }

  public TableSpec setSourceSchema(String sourceSchema) {
    this.sourceSchema = sourceSchema;
    return this;
  }

  public String getSourceSchema() {
    return sourceSchema;
  }

  public TableSpec setSourceTable(String sourceTable) {
    this.sourceTable = sourceTable;
    return this;
  }

  public String getSourceTable() {
    return sourceTable;
  }

  public TableSpec setTableConfiguration(TableSpecificConfig tableConfiguration) {
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
    TableSpec that = (TableSpec) o;
    return Objects.equals(destinationCatalog, that.destinationCatalog)
        && Objects.equals(destinationSchema, that.destinationSchema)
        && Objects.equals(destinationTable, that.destinationTable)
        && Objects.equals(sourceCatalog, that.sourceCatalog)
        && Objects.equals(sourceSchema, that.sourceSchema)
        && Objects.equals(sourceTable, that.sourceTable)
        && Objects.equals(tableConfiguration, that.tableConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        destinationCatalog,
        destinationSchema,
        destinationTable,
        sourceCatalog,
        sourceSchema,
        sourceTable,
        tableConfiguration);
  }

  @Override
  public String toString() {
    return new ToStringer(TableSpec.class)
        .add("destinationCatalog", destinationCatalog)
        .add("destinationSchema", destinationSchema)
        .add("destinationTable", destinationTable)
        .add("sourceCatalog", sourceCatalog)
        .add("sourceSchema", sourceSchema)
        .add("sourceTable", sourceTable)
        .add("tableConfiguration", tableConfiguration)
        .toString();
  }
}
