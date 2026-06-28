// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Progress information of the Synced Table data synchronization pipeline. */
@Generated
public class SyncedTablePipelineProgress {
  /** The estimated time remaining to complete this update in seconds. */
  @JsonProperty("estimated_completion_time_seconds")
  private Double estimatedCompletionTimeSeconds;

  /**
   * The source table Delta version that was last processed by the pipeline. The pipeline may not
   * have completely processed this version yet.
   */
  @JsonProperty("latest_version_currently_processing")
  private Long latestVersionCurrentlyProcessing;

  /** The current phase of the data synchronization pipeline. */
  @JsonProperty("provisioning_phase")
  private ProvisioningPhase provisioningPhase;

  /** The completion ratio of this update. This is a number between 0 and 1. */
  @JsonProperty("sync_progress_completion")
  private Double syncProgressCompletion;

  /** The number of rows that have been synced in this update. */
  @JsonProperty("synced_row_count")
  private Long syncedRowCount;

  /**
   * The total number of rows that need to be synced in this update. This number may be an estimate.
   */
  @JsonProperty("total_row_count")
  private Long totalRowCount;

  public SyncedTablePipelineProgress setEstimatedCompletionTimeSeconds(
      Double estimatedCompletionTimeSeconds) {
    this.estimatedCompletionTimeSeconds = estimatedCompletionTimeSeconds;
    return this;
  }

  public Double getEstimatedCompletionTimeSeconds() {
    return estimatedCompletionTimeSeconds;
  }

  public SyncedTablePipelineProgress setLatestVersionCurrentlyProcessing(
      Long latestVersionCurrentlyProcessing) {
    this.latestVersionCurrentlyProcessing = latestVersionCurrentlyProcessing;
    return this;
  }

  public Long getLatestVersionCurrentlyProcessing() {
    return latestVersionCurrentlyProcessing;
  }

  public SyncedTablePipelineProgress setProvisioningPhase(ProvisioningPhase provisioningPhase) {
    this.provisioningPhase = provisioningPhase;
    return this;
  }

  public ProvisioningPhase getProvisioningPhase() {
    return provisioningPhase;
  }

  public SyncedTablePipelineProgress setSyncProgressCompletion(Double syncProgressCompletion) {
    this.syncProgressCompletion = syncProgressCompletion;
    return this;
  }

  public Double getSyncProgressCompletion() {
    return syncProgressCompletion;
  }

  public SyncedTablePipelineProgress setSyncedRowCount(Long syncedRowCount) {
    this.syncedRowCount = syncedRowCount;
    return this;
  }

  public Long getSyncedRowCount() {
    return syncedRowCount;
  }

  public SyncedTablePipelineProgress setTotalRowCount(Long totalRowCount) {
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
    SyncedTablePipelineProgress that = (SyncedTablePipelineProgress) o;
    return Objects.equals(estimatedCompletionTimeSeconds, that.estimatedCompletionTimeSeconds)
        && Objects.equals(latestVersionCurrentlyProcessing, that.latestVersionCurrentlyProcessing)
        && Objects.equals(provisioningPhase, that.provisioningPhase)
        && Objects.equals(syncProgressCompletion, that.syncProgressCompletion)
        && Objects.equals(syncedRowCount, that.syncedRowCount)
        && Objects.equals(totalRowCount, that.totalRowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        estimatedCompletionTimeSeconds,
        latestVersionCurrentlyProcessing,
        provisioningPhase,
        syncProgressCompletion,
        syncedRowCount,
        totalRowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTablePipelineProgress.class)
        .add("estimatedCompletionTimeSeconds", estimatedCompletionTimeSeconds)
        .add("latestVersionCurrentlyProcessing", latestVersionCurrentlyProcessing)
        .add("provisioningPhase", provisioningPhase)
        .add("syncProgressCompletion", syncProgressCompletion)
        .add("syncedRowCount", syncedRowCount)
        .add("totalRowCount", totalRowCount)
        .toString();
  }
}
