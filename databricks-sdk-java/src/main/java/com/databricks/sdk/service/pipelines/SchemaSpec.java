// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SchemaSpec {
  /** Required. Destination catalog to store tables. */
  @JsonProperty("destination_catalog")
  private String destinationCatalog;

  /**
   * Required. Destination schema to store tables in. Tables with the same name as the source tables
   * are created in this destination schema. The pipeline fails If a table with the same name
   * already exists.
   */
  @JsonProperty("destination_schema")
  private String destinationSchema;

  /** The source catalog name. Might be optional depending on the type of source. */
  @JsonProperty("source_catalog")
  private String sourceCatalog;

  /** Required. Schema name in the source database. */
  @JsonProperty("source_schema")
  private String sourceSchema;

  /**
   * Configuration settings to control the ingestion of tables. These settings are applied to all
   * tables in this schema and override the table_configuration defined in the
   * ManagedIngestionPipelineDefinition object.
   */
  @JsonProperty("table_configuration")
  private TableSpecificConfig tableConfiguration;

  public SchemaSpec setDestinationCatalog(String destinationCatalog) {
    this.destinationCatalog = destinationCatalog;
    return this;
  }

  public String getDestinationCatalog() {
    return destinationCatalog;
  }

  public SchemaSpec setDestinationSchema(String destinationSchema) {
    this.destinationSchema = destinationSchema;
    return this;
  }

  public String getDestinationSchema() {
    return destinationSchema;
  }

  public SchemaSpec setSourceCatalog(String sourceCatalog) {
    this.sourceCatalog = sourceCatalog;
    return this;
  }

  public String getSourceCatalog() {
    return sourceCatalog;
  }

  public SchemaSpec setSourceSchema(String sourceSchema) {
    this.sourceSchema = sourceSchema;
    return this;
  }

  public String getSourceSchema() {
    return sourceSchema;
  }

  public SchemaSpec setTableConfiguration(TableSpecificConfig tableConfiguration) {
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
    SchemaSpec that = (SchemaSpec) o;
    return Objects.equals(destinationCatalog, that.destinationCatalog)
        && Objects.equals(destinationSchema, that.destinationSchema)
        && Objects.equals(sourceCatalog, that.sourceCatalog)
        && Objects.equals(sourceSchema, that.sourceSchema)
        && Objects.equals(tableConfiguration, that.tableConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        destinationCatalog, destinationSchema, sourceCatalog, sourceSchema, tableConfiguration);
  }

  @Override
  public String toString() {
    return new ToStringer(SchemaSpec.class)
        .add("destinationCatalog", destinationCatalog)
        .add("destinationSchema", destinationSchema)
        .add("sourceCatalog", sourceCatalog)
        .add("sourceSchema", sourceSchema)
        .add("tableConfiguration", tableConfiguration)
        .toString();
  }
}
