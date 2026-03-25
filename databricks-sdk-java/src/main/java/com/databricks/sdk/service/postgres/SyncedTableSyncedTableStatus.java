// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class SyncedTableSyncedTableStatus {
  /** The state of the synced table. */
  @JsonProperty("detailed_state")
  private SyncedTableState detailedState;

  /** The last source table Delta version that was successfully synced to the synced table. */
  @JsonProperty("last_processed_commit_version")
  private Long lastProcessedCommitVersion;

  /** Summary of the last successful synchronization from source to destination. */
  @JsonProperty("last_sync")
  private SyncedTablePosition lastSync;

  /**
   * The end timestamp of the last time any data was synchronized from the source table to the
   * synced table. This is when the data is available in the synced table.
   */
  @JsonProperty("last_sync_time")
  private Timestamp lastSyncTime;

  /** A text description of the current state of the synced table. */
  @JsonProperty("message")
  private String message;

  /** */
  @JsonProperty("ongoing_sync_progress")
  private SyncedTablePipelineProgress ongoingSyncProgress;

  /** ID of the associated pipeline. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /** The current phase of the data synchronization pipeline. */
  @JsonProperty("provisioning_phase")
  private ProvisioningPhase provisioningPhase;

  /** The provisioning state of the synced table entity in Unity Catalog. */
  @JsonProperty("unity_catalog_provisioning_state")
  private ProvisioningInfoState unityCatalogProvisioningState;

  public SyncedTableSyncedTableStatus setDetailedState(SyncedTableState detailedState) {
    this.detailedState = detailedState;
    return this;
  }

  public SyncedTableState getDetailedState() {
    return detailedState;
  }

  public SyncedTableSyncedTableStatus setLastProcessedCommitVersion(
      Long lastProcessedCommitVersion) {
    this.lastProcessedCommitVersion = lastProcessedCommitVersion;
    return this;
  }

  public Long getLastProcessedCommitVersion() {
    return lastProcessedCommitVersion;
  }

  public SyncedTableSyncedTableStatus setLastSync(SyncedTablePosition lastSync) {
    this.lastSync = lastSync;
    return this;
  }

  public SyncedTablePosition getLastSync() {
    return lastSync;
  }

  public SyncedTableSyncedTableStatus setLastSyncTime(Timestamp lastSyncTime) {
    this.lastSyncTime = lastSyncTime;
    return this;
  }

  public Timestamp getLastSyncTime() {
    return lastSyncTime;
  }

  public SyncedTableSyncedTableStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public SyncedTableSyncedTableStatus setOngoingSyncProgress(
      SyncedTablePipelineProgress ongoingSyncProgress) {
    this.ongoingSyncProgress = ongoingSyncProgress;
    return this;
  }

  public SyncedTablePipelineProgress getOngoingSyncProgress() {
    return ongoingSyncProgress;
  }

  public SyncedTableSyncedTableStatus setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public SyncedTableSyncedTableStatus setProvisioningPhase(ProvisioningPhase provisioningPhase) {
    this.provisioningPhase = provisioningPhase;
    return this;
  }

  public ProvisioningPhase getProvisioningPhase() {
    return provisioningPhase;
  }

  public SyncedTableSyncedTableStatus setUnityCatalogProvisioningState(
      ProvisioningInfoState unityCatalogProvisioningState) {
    this.unityCatalogProvisioningState = unityCatalogProvisioningState;
    return this;
  }

  public ProvisioningInfoState getUnityCatalogProvisioningState() {
    return unityCatalogProvisioningState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTableSyncedTableStatus that = (SyncedTableSyncedTableStatus) o;
    return Objects.equals(detailedState, that.detailedState)
        && Objects.equals(lastProcessedCommitVersion, that.lastProcessedCommitVersion)
        && Objects.equals(lastSync, that.lastSync)
        && Objects.equals(lastSyncTime, that.lastSyncTime)
        && Objects.equals(message, that.message)
        && Objects.equals(ongoingSyncProgress, that.ongoingSyncProgress)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(provisioningPhase, that.provisioningPhase)
        && Objects.equals(unityCatalogProvisioningState, that.unityCatalogProvisioningState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        detailedState,
        lastProcessedCommitVersion,
        lastSync,
        lastSyncTime,
        message,
        ongoingSyncProgress,
        pipelineId,
        provisioningPhase,
        unityCatalogProvisioningState);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableSyncedTableStatus.class)
        .add("detailedState", detailedState)
        .add("lastProcessedCommitVersion", lastProcessedCommitVersion)
        .add("lastSync", lastSync)
        .add("lastSyncTime", lastSyncTime)
        .add("message", message)
        .add("ongoingSyncProgress", ongoingSyncProgress)
        .add("pipelineId", pipelineId)
        .add("provisioningPhase", provisioningPhase)
        .add("unityCatalogProvisioningState", unityCatalogProvisioningState)
        .toString();
  }
}
