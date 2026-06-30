// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Detailed status of an online table. Shown if the online table is in the ONLINE_TRIGGERED_UPDATE
 * or the ONLINE_NO_PENDING_UPDATE state.
 */
@Generated
public class TriggeredUpdateStatus {
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

  /** Progress of the active data synchronization pipeline. */
  @JsonProperty("triggered_update_progress")
  private PipelineProgress triggeredUpdateProgress;

  public TriggeredUpdateStatus setLastProcessedCommitVersion(Long lastProcessedCommitVersion) {
    this.lastProcessedCommitVersion = lastProcessedCommitVersion;
    return this;
  }

  public Long getLastProcessedCommitVersion() {
    return lastProcessedCommitVersion;
  }

  public TriggeredUpdateStatus setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public TriggeredUpdateStatus setTriggeredUpdateProgress(
      PipelineProgress triggeredUpdateProgress) {
    this.triggeredUpdateProgress = triggeredUpdateProgress;
    return this;
  }

  public PipelineProgress getTriggeredUpdateProgress() {
    return triggeredUpdateProgress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TriggeredUpdateStatus that = (TriggeredUpdateStatus) o;
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
    return new ToStringer(TriggeredUpdateStatus.class)
        .add("lastProcessedCommitVersion", lastProcessedCommitVersion)
        .add("timestamp", timestamp)
        .add("triggeredUpdateProgress", triggeredUpdateProgress)
        .toString();
  }
}
