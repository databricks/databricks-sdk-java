// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SyncedTablePosition {
  /** */
  @JsonProperty("delta_table_sync_info")
  private DeltaTableSyncInfo deltaTableSyncInfo;

  /**
   * The end timestamp of the most recent successful synchronization. This is the time when the data
   * is available in the synced table.
   */
  @JsonProperty("sync_end_timestamp")
  private String syncEndTimestamp;

  /**
   * The starting timestamp of the most recent successful synchronization from the source table to
   * the destination (synced) table. Note this is the starting timestamp of the sync operation, not
   * the end time. E.g., for a batch, this is the time when the sync operation started.
   */
  @JsonProperty("sync_start_timestamp")
  private String syncStartTimestamp;

  public SyncedTablePosition setDeltaTableSyncInfo(DeltaTableSyncInfo deltaTableSyncInfo) {
    this.deltaTableSyncInfo = deltaTableSyncInfo;
    return this;
  }

  public DeltaTableSyncInfo getDeltaTableSyncInfo() {
    return deltaTableSyncInfo;
  }

  public SyncedTablePosition setSyncEndTimestamp(String syncEndTimestamp) {
    this.syncEndTimestamp = syncEndTimestamp;
    return this;
  }

  public String getSyncEndTimestamp() {
    return syncEndTimestamp;
  }

  public SyncedTablePosition setSyncStartTimestamp(String syncStartTimestamp) {
    this.syncStartTimestamp = syncStartTimestamp;
    return this;
  }

  public String getSyncStartTimestamp() {
    return syncStartTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTablePosition that = (SyncedTablePosition) o;
    return Objects.equals(deltaTableSyncInfo, that.deltaTableSyncInfo)
        && Objects.equals(syncEndTimestamp, that.syncEndTimestamp)
        && Objects.equals(syncStartTimestamp, that.syncStartTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaTableSyncInfo, syncEndTimestamp, syncStartTimestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTablePosition.class)
        .add("deltaTableSyncInfo", deltaTableSyncInfo)
        .add("syncEndTimestamp", syncEndTimestamp)
        .add("syncStartTimestamp", syncStartTimestamp)
        .toString();
  }
}
