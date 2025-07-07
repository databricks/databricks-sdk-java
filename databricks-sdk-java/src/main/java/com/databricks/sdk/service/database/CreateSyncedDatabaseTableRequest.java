// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateSyncedDatabaseTableRequest {
  /** */
  @JsonProperty("synced_table")
  private SyncedDatabaseTable syncedTable;

  public CreateSyncedDatabaseTableRequest setSyncedTable(SyncedDatabaseTable syncedTable) {
    this.syncedTable = syncedTable;
    return this;
  }

  public SyncedDatabaseTable getSyncedTable() {
    return syncedTable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSyncedDatabaseTableRequest that = (CreateSyncedDatabaseTableRequest) o;
    return Objects.equals(syncedTable, that.syncedTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncedTable);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSyncedDatabaseTableRequest.class)
        .add("syncedTable", syncedTable)
        .toString();
  }
}
