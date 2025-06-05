// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Detailed status of a synced table. Shown if the synced table is in the OFFLINE_FAILED or the
 * SYNCED_PIPELINE_FAILED state.
 */
@Generated
public class SyncedTableFailedStatus {
  /**
   * The last source table Delta version that was synced to the synced table. Note that this Delta
   * version may only be partially synced to the synced table. Only populated if the table is still
   * synced and available for serving.
   */
  @JsonProperty("last_processed_commit_version")
  private Long lastProcessedCommitVersion;

  /**
   * The timestamp of the last time any data was synchronized from the source table to the synced
   * table. Only populated if the table is still synced and available for serving.
   */
  @JsonProperty("timestamp")
  private String timestamp;

  public SyncedTableFailedStatus setLastProcessedCommitVersion(Long lastProcessedCommitVersion) {
    this.lastProcessedCommitVersion = lastProcessedCommitVersion;
    return this;
  }

  public Long getLastProcessedCommitVersion() {
    return lastProcessedCommitVersion;
  }

  public SyncedTableFailedStatus setTimestamp(String timestamp) {
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
    SyncedTableFailedStatus that = (SyncedTableFailedStatus) o;
    return Objects.equals(lastProcessedCommitVersion, that.lastProcessedCommitVersion)
        && Objects.equals(timestamp, that.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProcessedCommitVersion, timestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableFailedStatus.class)
        .add("lastProcessedCommitVersion", lastProcessedCommitVersion)
        .add("timestamp", timestamp)
        .toString();
  }
}
