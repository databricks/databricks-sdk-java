// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PowerBiTable {
  /** The catalog name in Databricks */
  @JsonProperty("catalog")
  private String catalog;

  /** The table name in Databricks */
  @JsonProperty("name")
  private String name;

  /** The schema name in Databricks */
  @JsonProperty("schema")
  private String schema;

  /** The Power BI storage mode of the table */
  @JsonProperty("storage_mode")
  private StorageMode storageMode;

  public PowerBiTable setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public PowerBiTable setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PowerBiTable setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public PowerBiTable setStorageMode(StorageMode storageMode) {
    this.storageMode = storageMode;
    return this;
  }

  public StorageMode getStorageMode() {
    return storageMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PowerBiTable that = (PowerBiTable) o;
    return Objects.equals(catalog, that.catalog)
        && Objects.equals(name, that.name)
        && Objects.equals(schema, that.schema)
        && Objects.equals(storageMode, that.storageMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, name, schema, storageMode);
  }

  @Override
  public String toString() {
    return new ToStringer(PowerBiTable.class)
        .add("catalog", catalog)
        .add("name", name)
        .add("schema", schema)
        .add("storageMode", storageMode)
        .toString();
  }
}
