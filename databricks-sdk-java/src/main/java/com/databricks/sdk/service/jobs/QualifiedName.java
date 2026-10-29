// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A three-level Unity Catalog name (catalog.schema.table); any level may be unset. */
@Generated
public class QualifiedName {
  /** Unity Catalog catalog. */
  @JsonProperty("catalog")
  private String catalog;

  /** Unity Catalog schema, within the catalog. */
  @JsonProperty("schema")
  private String schema;

  /** Table, within the catalog and schema. */
  @JsonProperty("table")
  private String table;

  public QualifiedName setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public QualifiedName setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public QualifiedName setTable(String table) {
    this.table = table;
    return this;
  }

  public String getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QualifiedName that = (QualifiedName) o;
    return Objects.equals(catalog, that.catalog)
        && Objects.equals(schema, that.schema)
        && Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, schema, table);
  }

  @Override
  public String toString() {
    return new ToStringer(QualifiedName.class)
        .add("catalog", catalog)
        .add("schema", schema)
        .add("table", table)
        .toString();
  }
}
