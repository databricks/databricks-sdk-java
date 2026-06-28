// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateSyncedDatabaseTableRequest {
  /** Full three-part (catalog, schema, table) name of the table. */
  @JsonIgnore private String name;

  /** Note that updating a synced database table is not yet supported. */
  @JsonProperty("synced_table")
  private SyncedDatabaseTable syncedTable;

  /** The list of fields to update. Setting this field is not yet supported. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateSyncedDatabaseTableRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateSyncedDatabaseTableRequest setSyncedTable(SyncedDatabaseTable syncedTable) {
    this.syncedTable = syncedTable;
    return this;
  }

  public SyncedDatabaseTable getSyncedTable() {
    return syncedTable;
  }

  public UpdateSyncedDatabaseTableRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateSyncedDatabaseTableRequest that = (UpdateSyncedDatabaseTableRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(syncedTable, that.syncedTable)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, syncedTable, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSyncedDatabaseTableRequest.class)
        .add("name", name)
        .add("syncedTable", syncedTable)
        .add("updateMask", updateMask)
        .toString();
  }
}
