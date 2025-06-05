// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Detailed status of a synced table. Shown if the synced table is in the SYNCED_TRIGGERED_UPDATE or
 * the SYNCED_NO_PENDING_UPDATE state.
 */
@Generated
public class SyncedTableTriggeredUpdateStatus {
  /**
   * The last source table Delta version that was synced to the synced table. Note that this Delta
   * version may not be completely synced to the synced table yet.
   */
  @JsonProperty("last_processed_commit_version")
  private Long lastProcessedCommitVersion;

  /**
   * The timestamp of the last time any data was synchronized from the source table to the synced
   * table.
   */
  @JsonProperty("timestamp")
  private String timestamp;

  /** Progress of the active data synchronization pipeline. */
  @JsonProperty("triggered_update_progress")
  private SyncedTablePipelineProgress triggeredUpdateProgress;

  public SyncedTableTriggeredUpdateStatus setLastProcessedCommitVersion(
      Long lastProcessedCommitVersion) {
    this.lastProcessedCommitVersion = lastProcessedCommitVersion;
    return this;
  }

  public Long getLastProcessedCommitVersion() {
    return lastProcessedCommitVersion;
  }

  public SyncedTableTriggeredUpdateStatus setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public SyncedTableTriggeredUpdateStatus setTriggeredUpdateProgress(
      SyncedTablePipelineProgress triggeredUpdateProgress) {
    this.triggeredUpdateProgress = triggeredUpdateProgress;
    return this;
  }

  public SyncedTablePipelineProgress getTriggeredUpdateProgress() {
    return triggeredUpdateProgress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTableTriggeredUpdateStatus that = (SyncedTableTriggeredUpdateStatus) o;
    return Objects.equals(lastProcessedCommitVersion, that.lastProcessedCommitVersion)
        && Objects.equals(timestamp, that.timestamp)
        && Objects.equals(triggeredUpdateProgress, that.triggeredUpdateProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProcessedCommitVersion, timestamp, triggeredUpdateProgress);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableTriggeredUpdateStatus.class)
        .add("lastProcessedCommitVersion", lastProcessedCommitVersion)
        .add("timestamp", timestamp)
        .add("triggeredUpdateProgress", triggeredUpdateProgress)
        .toString();
  }
}
