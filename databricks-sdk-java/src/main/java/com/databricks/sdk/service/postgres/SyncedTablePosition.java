// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
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
  @JsonProperty("sync_end_time")
  private Timestamp syncEndTime;

  /**
   * The starting timestamp of the most recent successful synchronization from the source table to
   * the destination (synced) table. Note this is the starting timestamp of the sync operation, not
   * the end time. E.g., for a batch, this is the time when the sync operation started.
   */
  @JsonProperty("sync_start_time")
  private Timestamp syncStartTime;

  public SyncedTablePosition setDeltaTableSyncInfo(DeltaTableSyncInfo deltaTableSyncInfo) {
    this.deltaTableSyncInfo = deltaTableSyncInfo;
    return this;
  }

  public DeltaTableSyncInfo getDeltaTableSyncInfo() {
    return deltaTableSyncInfo;
  }

  public SyncedTablePosition setSyncEndTime(Timestamp syncEndTime) {
    this.syncEndTime = syncEndTime;
    return this;
  }

  public Timestamp getSyncEndTime() {
    return syncEndTime;
  }

  public SyncedTablePosition setSyncStartTime(Timestamp syncStartTime) {
    this.syncStartTime = syncStartTime;
    return this;
  }

  public Timestamp getSyncStartTime() {
    return syncStartTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTablePosition that = (SyncedTablePosition) o;
    return Objects.equals(deltaTableSyncInfo, that.deltaTableSyncInfo)
        && Objects.equals(syncEndTime, that.syncEndTime)
        && Objects.equals(syncStartTime, that.syncStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaTableSyncInfo, syncEndTime, syncStartTime);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTablePosition.class)
        .add("deltaTableSyncInfo", deltaTableSyncInfo)
        .add("syncEndTime", syncEndTime)
        .add("syncStartTime", syncStartTime)
        .toString();
  }
}
