// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A fully-qualified Unity Catalog table reference by catalog / schema / table name. */
@Generated
public class TableName {
  /** Name of the parent Unity Catalog catalog. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** Name of the parent Unity Catalog schema. */
  @JsonProperty("schema_name")
  private String schemaName;

  /** Unity Catalog table name. */
  @JsonProperty("table_name")
  private String tableName;

  public TableName setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public TableName setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public TableName setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableName that = (TableName) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, schemaName, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(TableName.class)
        .add("catalogName", catalogName)
        .add("schemaName", schemaName)
        .add("tableName", tableName)
        .toString();
  }
}
