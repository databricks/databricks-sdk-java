// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Detailed status of an online table. Shown if the online table is in the ONLINE_CONTINUOUS_UPDATE
 * or the ONLINE_UPDATING_PIPELINE_RESOURCES state.
 */
@Generated
public class ContinuousUpdateStatus {
  /** Progress of the initial data synchronization. */
  @JsonProperty("initial_pipeline_sync_progress")
  private PipelineProgress initialPipelineSyncProgress;

  /**
   * The last source table Delta version that was synced to the online table. Note that this Delta
   * version may not be completely synced to the online table yet.
   */
  @JsonProperty("last_processed_commit_version")
  private Long lastProcessedCommitVersion;

  /**
   * The timestamp of the last time any data was synchronized from the source table to the online
   * table.
   */
  @JsonProperty("timestamp")
  private String timestamp;

  public ContinuousUpdateStatus setInitialPipelineSyncProgress(
      PipelineProgress initialPipelineSyncProgress) {
    this.initialPipelineSyncProgress = initialPipelineSyncProgress;
    return this;
  }

  public PipelineProgress getInitialPipelineSyncProgress() {
    return initialPipelineSyncProgress;
  }

  public ContinuousUpdateStatus setLastProcessedCommitVersion(Long lastProcessedCommitVersion) {
    this.lastProcessedCommitVersion = lastProcessedCommitVersion;
    return this;
  }

  public Long getLastProcessedCommitVersion() {
    return lastProcessedCommitVersion;
  }

  public ContinuousUpdateStatus setTimestamp(String timestamp) {
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
    ContinuousUpdateStatus that = (ContinuousUpdateStatus) o;
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
    return new ToStringer(ContinuousUpdateStatus.class)
        .add("initialPipelineSyncProgress", initialPipelineSyncProgress)
        .add("lastProcessedCommitVersion", lastProcessedCommitVersion)
        .add("timestamp", timestamp)
        .toString();
  }
}
