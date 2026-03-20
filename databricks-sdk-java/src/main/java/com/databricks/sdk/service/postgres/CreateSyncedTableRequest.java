// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateSyncedTableRequest {
  /** */
  @JsonProperty("synced_table")
  private SyncedTable syncedTable;

  /**
   * The ID to use for the Synced Table. This becomes the final component of the SyncedTable's
   * resource name. ID is required and is the synced table name, containing (catalog, schema, table)
   * tuple. Elements of the tuple are the UC entity names.
   *
   * <p>Example: "{catalog}.{schema}.{table}"
   *
   * <p>synced_table_id represents both of the following:
   *
   * <p>1. An online VIEW virtual table in the Unity Catalog accessible via the Lakehouse
   * Federation. 2. Postgres table named "{table}" in schema "{schema}" in the connected Postgres
   * database
   */
  @JsonIgnore
  @QueryParam("synced_table_id")
  private String syncedTableId;

  public CreateSyncedTableRequest setSyncedTable(SyncedTable syncedTable) {
    this.syncedTable = syncedTable;
    return this;
  }

  public SyncedTable getSyncedTable() {
    return syncedTable;
  }

  public CreateSyncedTableRequest setSyncedTableId(String syncedTableId) {
    this.syncedTableId = syncedTableId;
    return this;
  }

  public String getSyncedTableId() {
    return syncedTableId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSyncedTableRequest that = (CreateSyncedTableRequest) o;
    return Objects.equals(syncedTable, that.syncedTable)
        && Objects.equals(syncedTableId, that.syncedTableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncedTable, syncedTableId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSyncedTableRequest.class)
        .add("syncedTable", syncedTable)
        .add("syncedTableId", syncedTableId)
        .toString();
  }
}
