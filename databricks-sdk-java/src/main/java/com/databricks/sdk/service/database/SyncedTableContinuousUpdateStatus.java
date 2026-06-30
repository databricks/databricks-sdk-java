// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Detailed status of a synced table. Shown if the synced table is in the SYNCED_CONTINUOUS_UPDATE
 * or the SYNCED_UPDATING_PIPELINE_RESOURCES state.
 */
@Generated
public class SyncedTableContinuousUpdateStatus {
  /** Progress of the initial data synchronization. */
  @JsonProperty("initial_pipeline_sync_progress")
  private SyncedTablePipelineProgress initialPipelineSyncProgress;

  /** The last source table Delta version that was successfully synced to the synced table. */
  @JsonProperty("last_processed_commit_version")
  private Long lastProcessedCommitVersion;

  /**
   * The end timestamp of the last time any data was synchronized from the source table to the
   * synced table. This is when the data is available in the synced table.
   */
  @JsonProperty("timestamp")
  private String timestamp;

  public SyncedTableContinuousUpdateStatus setInitialPipelineSyncProgress(
      SyncedTablePipelineProgress initialPipelineSyncProgress) {
    this.initialPipelineSyncProgress = initialPipelineSyncProgress;
    return this;
  }

  public SyncedTablePipelineProgress getInitialPipelineSyncProgress() {
    return initialPipelineSyncProgress;
  }

  public SyncedTableContinuousUpdateStatus setLastProcessedCommitVersion(
      Long lastProcessedCommitVersion) {
    this.lastProcessedCommitVersion = lastProcessedCommitVersion;
    return this;
  }

  public Long getLastProcessedCommitVersion() {
    return lastProcessedCommitVersion;
  }

  public SyncedTableContinuousUpdateStatus setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getTimestamp() {
    return timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTableContinuousUpdateStatus that = (SyncedTableContinuousUpdateStatus) o;
    return Objects.equals(initialPipelineSyncProgress, that.initialPipelineSyncProgress)
        && Objects.equals(lastProcessedCommitVersion, that.lastProcessedCommitVersion)
        && Objects.equals(timestamp, that.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialPipelineSyncProgress, lastProcessedCommitVersion, timestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableContinuousUpdateStatus.class)
        .add("initialPipelineSyncProgress", initialPipelineSyncProgress)
        .add("lastProcessedCommitVersion", lastProcessedCommitVersion)
        .add("timestamp", timestamp)
        .toString();
  }
}
