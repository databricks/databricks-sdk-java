// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Custom fields that user can set for pipeline while creating SyncedDatabaseTable. Note that other
 * fields of pipeline are still inferred by table def internally
 */
@Generated
class NewPipelineSpecPb {
  @JsonProperty("storage_catalog")
  private String storageCatalog;

  @JsonProperty("storage_schema")
  private String storageSchema;

  public NewPipelineSpecPb setStorageCatalog(String storageCatalog) {
    this.storageCatalog = storageCatalog;
    return this;
  }

  public String getStorageCatalog() {
    return storageCatalog;
  }

  public NewPipelineSpecPb setStorageSchema(String storageSchema) {
    this.storageSchema = storageSchema;
    return this;
  }

  public String getStorageSchema() {
    return storageSchema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NewPipelineSpecPb that = (NewPipelineSpecPb) o;
    return Objects.equals(storageCatalog, that.storageCatalog)
        && Objects.equals(storageSchema, that.storageSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageCatalog, storageSchema);
  }

  @Override
  public String toString() {
    return new ToStringer(NewPipelineSpecPb.class)
        .add("storageCatalog", storageCatalog)
        .add("storageSchema", storageSchema)
        .toString();
  }
}
