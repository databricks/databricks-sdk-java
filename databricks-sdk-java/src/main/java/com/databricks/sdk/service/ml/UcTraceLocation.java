// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A Unity Catalog trace storage location. Traces are stored as Delta tables in the specified
 * catalog and schema.
 */
@Generated
public class UcTraceLocation {
  /** The name of the Unity Catalog catalog. */
  @JsonProperty("catalog")
  private String catalog;

  /** The name of the Unity Catalog schema within `catalog`. */
  @JsonProperty("schema")
  private String schema;

  /**
   * The prefix for the trace tables, which are named `{catalog}.{schema}.{table_prefix}_otel_*`.
   * May only contain letters, digits, and underscores, and may be at most 238 characters. When
   * unset, a server-generated prefix derived from the experiment ID is used.
   */
  @JsonProperty("table_prefix")
  private String tablePrefix;

  public UcTraceLocation setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public UcTraceLocation setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public UcTraceLocation setTablePrefix(String tablePrefix) {
    this.tablePrefix = tablePrefix;
    return this;
  }

  public String getTablePrefix() {
    return tablePrefix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UcTraceLocation that = (UcTraceLocation) o;
    return Objects.equals(catalog, that.catalog)
        && Objects.equals(schema, that.schema)
        && Objects.equals(tablePrefix, that.tablePrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, schema, tablePrefix);
  }

  @Override
  public String toString() {
    return new ToStringer(UcTraceLocation.class)
        .add("catalog", catalog)
        .add("schema", schema)
        .add("tablePrefix", tablePrefix)
        .toString();
  }
}
