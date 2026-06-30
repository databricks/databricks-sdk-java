// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Configuration for offline store destination. */
@Generated
public class OfflineStoreConfig {
  /** The Unity Catalog catalog name. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The Unity Catalog schema name. */
  @JsonProperty("schema_name")
  private String schemaName;

  /**
   * Prefix for Unity Catalog table name. The materialized feature will be stored in a table with
   * this prefix and a generated postfix.
   */
  @JsonProperty("table_name_prefix")
  private String tableNamePrefix;

  public OfflineStoreConfig setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public OfflineStoreConfig setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public OfflineStoreConfig setTableNamePrefix(String tableNamePrefix) {
    this.tableNamePrefix = tableNamePrefix;
    return this;
  }

  public String getTableNamePrefix() {
    return tableNamePrefix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OfflineStoreConfig that = (OfflineStoreConfig) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(tableNamePrefix, that.tableNamePrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, schemaName, tableNamePrefix);
  }

  @Override
  public String toString() {
    return new ToStringer(OfflineStoreConfig.class)
        .add("catalogName", catalogName)
        .add("schemaName", schemaName)
        .add("tableNamePrefix", tableNamePrefix)
        .toString();
  }
}
