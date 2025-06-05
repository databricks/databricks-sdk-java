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
class SyncedTableContinuousUpdateStatusPb {
  @JsonProperty("initial_pipeline_sync_progress")
  private SyncedTablePipelineProgress initialPipelineSyncProgress;

  @JsonProperty("last_processed_commit_version")
  private Long lastProcessedCommitVersion;

  @JsonProperty("timestamp")
  private String timestamp;

  public SyncedTableContinuousUpdateStatusPb setInitialPipelineSyncProgress(
      SyncedTablePipelineProgress initialPipelineSyncProgress) {
    this.initialPipelineSyncProgress = initialPipelineSyncProgress;
    return this;
  }

  public SyncedTablePipelineProgress getInitialPipelineSyncProgress() {
    return initialPipelineSyncProgress;
  }

  public SyncedTableContinuousUpdateStatusPb setLastProcessedCommitVersion(
      Long lastProcessedCommitVersion) {
    this.lastProcessedCommitVersion = lastProcessedCommitVersion;
    return this;
  }

  public Long getLastProcessedCommitVersion() {
    return lastProcessedCommitVersion;
  }

  public SyncedTableContinuousUpdateStatusPb setTimestamp(String timestamp) {
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
    SyncedTableContinuousUpdateStatusPb that = (SyncedTableContinuousUpdateStatusPb) o;
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
    return new ToStringer(SyncedTableContinuousUpdateStatusPb.class)
        .add("initialPipelineSyncProgress", initialPipelineSyncProgress)
        .add("lastProcessedCommitVersion", lastProcessedCommitVersion)
        .add("timestamp", timestamp)
        .toString();
  }
}
