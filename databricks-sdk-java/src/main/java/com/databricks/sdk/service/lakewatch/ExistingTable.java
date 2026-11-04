// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Uses an existing Unity Catalog Delta table or view as the datasource's source. Mutually exclusive
 * with `autoloader` and `unity_catalog_connection`.
 */
@Generated
public class ExistingTable {
  /**
   * Name of the catalog the existing table lives in. Optional on create and defaults to the
   * datasource's own catalog. Cannot be changed. Reads return the value as supplied; the catalog in
   * use is reported in `effective_catalog`.
   */
  @JsonProperty("catalog")
  private String catalog;

  /**
   * Current Unity Catalog catalog name of the source table, resolved from its stable table ID, so a
   * rename of the source table is reported here without changing `catalog`.
   */
  @JsonProperty("effective_catalog")
  private String effectiveCatalog;

  /** Current Unity Catalog name of the source table, resolved from its stable table ID. */
  @JsonProperty("effective_name")
  private String effectiveName;

  /** Current Unity Catalog schema name of the source table, resolved from its stable table ID. */
  @JsonProperty("effective_schema")
  private String effectiveSchema;

  /**
   * Whether to ingest the rows already present in the source table when ingestion first starts. Set
   * true to ingest the existing rows and then every new commit. Set false, or leave unset, to
   * ingest only rows written after the datasource starts. Defaults to false, and must be true for a
   * Delta Sharing source table. Takes effect only at first start and cannot be changed. Reads
   * return the value as supplied.
   */
  @JsonProperty("include_existing_rows")
  private Boolean includeExistingRows;

  /**
   * Name of the source table or view. Required on create and cannot be changed. Reads return the
   * value as supplied; the table's current name is reported in `effective_name`.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Name of the schema the existing table lives in. Optional, but required when `catalog` is set;
   * supplying `catalog` without `schema` is rejected. Defaults to the datasource's own schema.
   * Cannot be changed. Reads return the value as supplied; the schema in use is reported in
   * `effective_schema`.
   */
  @JsonProperty("schema")
  private String schema;

  public ExistingTable setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public ExistingTable setEffectiveCatalog(String effectiveCatalog) {
    this.effectiveCatalog = effectiveCatalog;
    return this;
  }

  public String getEffectiveCatalog() {
    return effectiveCatalog;
  }

  public ExistingTable setEffectiveName(String effectiveName) {
    this.effectiveName = effectiveName;
    return this;
  }

  public String getEffectiveName() {
    return effectiveName;
  }

  public ExistingTable setEffectiveSchema(String effectiveSchema) {
    this.effectiveSchema = effectiveSchema;
    return this;
  }

  public String getEffectiveSchema() {
    return effectiveSchema;
  }

  public ExistingTable setIncludeExistingRows(Boolean includeExistingRows) {
    this.includeExistingRows = includeExistingRows;
    return this;
  }

  public Boolean getIncludeExistingRows() {
    return includeExistingRows;
  }

  public ExistingTable setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ExistingTable setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExistingTable that = (ExistingTable) o;
    return Objects.equals(catalog, that.catalog)
        && Objects.equals(effectiveCatalog, that.effectiveCatalog)
        && Objects.equals(effectiveName, that.effectiveName)
        && Objects.equals(effectiveSchema, that.effectiveSchema)
        && Objects.equals(includeExistingRows, that.includeExistingRows)
        && Objects.equals(name, that.name)
        && Objects.equals(schema, that.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catalog,
        effectiveCatalog,
        effectiveName,
        effectiveSchema,
        includeExistingRows,
        name,
        schema);
  }

  @Override
  public String toString() {
    return new ToStringer(ExistingTable.class)
        .add("catalog", catalog)
        .add("effectiveCatalog", effectiveCatalog)
        .add("effectiveName", effectiveName)
        .add("effectiveSchema", effectiveSchema)
        .add("includeExistingRows", includeExistingRows)
        .add("name", name)
        .add("schema", schema)
        .toString();
  }
}
