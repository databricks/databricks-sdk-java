// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Configuration for online store destination. */
@Generated
public class OnlineStoreConfig {
  /**
   * The Unity Catalog catalog name. This name is also used as the Lakebase logical database name.
   */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The name of the target online store. */
  @JsonProperty("online_store_name")
  private String onlineStoreName;

  /** The Unity Catalog schema name. */
  @JsonProperty("schema_name")
  private String schemaName;

  /**
   * Prefix for Unity Catalog table name. The materialized feature will be stored in a Lakebase
   * table with this prefix and a generated postfix.
   */
  @JsonProperty("table_name_prefix")
  private String tableNamePrefix;

  public OnlineStoreConfig setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public OnlineStoreConfig setOnlineStoreName(String onlineStoreName) {
    this.onlineStoreName = onlineStoreName;
    return this;
  }

  public String getOnlineStoreName() {
    return onlineStoreName;
  }

  public OnlineStoreConfig setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public OnlineStoreConfig setTableNamePrefix(String tableNamePrefix) {
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
    OnlineStoreConfig that = (OnlineStoreConfig) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(onlineStoreName, that.onlineStoreName)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(tableNamePrefix, that.tableNamePrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, onlineStoreName, schemaName, tableNamePrefix);
  }

  @Override
  public String toString() {
    return new ToStringer(OnlineStoreConfig.class)
        .add("catalogName", catalogName)
        .add("onlineStoreName", onlineStoreName)
        .add("schemaName", schemaName)
        .add("tableNamePrefix", tableNamePrefix)
        .toString();
  }
}
