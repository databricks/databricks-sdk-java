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
public class NewPipelineSpec {
  /**
   * UC catalog for the pipeline to store intermediate files (checkpoints, event logs etc). This
   * needs to be a standard catalog where the user has permissions to create Delta tables.
   */
  @JsonProperty("storage_catalog")
  private String storageCatalog;

  /**
   * UC schema for the pipeline to store intermediate files (checkpoints, event logs etc). This
   * needs to be in the standard catalog where the user has permissions to create Delta tables.
   */
  @JsonProperty("storage_schema")
  private String storageSchema;

  public NewPipelineSpec setStorageCatalog(String storageCatalog) {
    this.storageCatalog = storageCatalog;
    return this;
  }

  public String getStorageCatalog() {
    return storageCatalog;
  }

  public NewPipelineSpec setStorageSchema(String storageSchema) {
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
    NewPipelineSpec that = (NewPipelineSpec) o;
    return Objects.equals(storageCatalog, that.storageCatalog)
        && Objects.equals(storageSchema, that.storageSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageCatalog, storageSchema);
  }

  @Override
  public String toString() {
    return new ToStringer(NewPipelineSpec.class)
        .add("storageCatalog", storageCatalog)
        .add("storageSchema", storageSchema)
        .toString();
  }
}
