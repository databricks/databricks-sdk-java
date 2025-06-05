// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Progress information of the Synced Table data synchronization pipeline. */
@Generated
class SyncedTablePipelineProgressPb {
  @JsonProperty("estimated_completion_time_seconds")
  private Double estimatedCompletionTimeSeconds;

  @JsonProperty("latest_version_currently_processing")
  private Long latestVersionCurrentlyProcessing;

  @JsonProperty("sync_progress_completion")
  private Double syncProgressCompletion;

  @JsonProperty("synced_row_count")
  private Long syncedRowCount;

  @JsonProperty("total_row_count")
  private Long totalRowCount;

  public SyncedTablePipelineProgressPb setEstimatedCompletionTimeSeconds(
      Double estimatedCompletionTimeSeconds) {
    this.estimatedCompletionTimeSeconds = estimatedCompletionTimeSeconds;
    return this;
  }

  public Double getEstimatedCompletionTimeSeconds() {
    return estimatedCompletionTimeSeconds;
  }

  public SyncedTablePipelineProgressPb setLatestVersionCurrentlyProcessing(
      Long latestVersionCurrentlyProcessing) {
    this.latestVersionCurrentlyProcessing = latestVersionCurrentlyProcessing;
    return this;
  }

  public Long getLatestVersionCurrentlyProcessing() {
    return latestVersionCurrentlyProcessing;
  }

  public SyncedTablePipelineProgressPb setSyncProgressCompletion(Double syncProgressCompletion) {
    this.syncProgressCompletion = syncProgressCompletion;
    return this;
  }

  public Double getSyncProgressCompletion() {
    return syncProgressCompletion;
  }

  public SyncedTablePipelineProgressPb setSyncedRowCount(Long syncedRowCount) {
    this.syncedRowCount = syncedRowCount;
    return this;
  }

  public Long getSyncedRowCount() {
    return syncedRowCount;
  }

  public SyncedTablePipelineProgressPb setTotalRowCount(Long totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

  public Long getTotalRowCount() {
    return totalRowCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTablePipelineProgressPb that = (SyncedTablePipelineProgressPb) o;
    return Objects.equals(estimatedCompletionTimeSeconds, that.estimatedCompletionTimeSeconds)
        && Objects.equals(latestVersionCurrentlyProcessing, that.latestVersionCurrentlyProcessing)
        && Objects.equals(syncProgressCompletion, that.syncProgressCompletion)
        && Objects.equals(syncedRowCount, that.syncedRowCount)
        && Objects.equals(totalRowCount, that.totalRowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        estimatedCompletionTimeSeconds,
        latestVersionCurrentlyProcessing,
        syncProgressCompletion,
        syncedRowCount,
        totalRowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTablePipelineProgressPb.class)
        .add("estimatedCompletionTimeSeconds", estimatedCompletionTimeSeconds)
        .add("latestVersionCurrentlyProcessing", latestVersionCurrentlyProcessing)
        .add("syncProgressCompletion", syncProgressCompletion)
        .add("syncedRowCount", syncedRowCount)
        .add("totalRowCount", totalRowCount)
        .toString();
  }
}
