// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PowerBiTablePb {
  @JsonProperty("catalog")
  private String catalog;

  @JsonProperty("name")
  private String name;

  @JsonProperty("schema")
  private String schema;

  @JsonProperty("storage_mode")
  private StorageMode storageMode;

  public PowerBiTablePb setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public PowerBiTablePb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PowerBiTablePb setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public PowerBiTablePb setStorageMode(StorageMode storageMode) {
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
    PowerBiTablePb that = (PowerBiTablePb) o;
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
    return new ToStringer(PowerBiTablePb.class)
        .add("catalog", catalog)
        .add("name", name)
        .add("schema", schema)
        .add("storageMode", storageMode)
        .toString();
  }
}
