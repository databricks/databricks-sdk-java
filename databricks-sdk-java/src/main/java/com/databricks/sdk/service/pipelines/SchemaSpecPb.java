// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SchemaSpecPb {
  @JsonProperty("destination_catalog")
  private String destinationCatalog;

  @JsonProperty("destination_schema")
  private String destinationSchema;

  @JsonProperty("source_catalog")
  private String sourceCatalog;

  @JsonProperty("source_schema")
  private String sourceSchema;

  @JsonProperty("table_configuration")
  private TableSpecificConfig tableConfiguration;

  public SchemaSpecPb setDestinationCatalog(String destinationCatalog) {
    this.destinationCatalog = destinationCatalog;
    return this;
  }

  public String getDestinationCatalog() {
    return destinationCatalog;
  }

  public SchemaSpecPb setDestinationSchema(String destinationSchema) {
    this.destinationSchema = destinationSchema;
    return this;
  }

  public String getDestinationSchema() {
    return destinationSchema;
  }

  public SchemaSpecPb setSourceCatalog(String sourceCatalog) {
    this.sourceCatalog = sourceCatalog;
    return this;
  }

  public String getSourceCatalog() {
    return sourceCatalog;
  }

  public SchemaSpecPb setSourceSchema(String sourceSchema) {
    this.sourceSchema = sourceSchema;
    return this;
  }

  public String getSourceSchema() {
    return sourceSchema;
  }

  public SchemaSpecPb setTableConfiguration(TableSpecificConfig tableConfiguration) {
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
    SchemaSpecPb that = (SchemaSpecPb) o;
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
    return new ToStringer(SchemaSpecPb.class)
        .add("destinationCatalog", destinationCatalog)
        .add("destinationSchema", destinationSchema)
        .add("sourceCatalog", sourceCatalog)
        .add("sourceSchema", sourceSchema)
        .add("tableConfiguration", tableConfiguration)
        .toString();
  }
}
