// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Detailed status of a synced table. Shown if the synced table is in the
 * PROVISIONING_PIPELINE_RESOURCES or the PROVISIONING_INITIAL_SNAPSHOT state.
 */
@Generated
class SyncedTableProvisioningStatusPb {
  @JsonProperty("initial_pipeline_sync_progress")
  private SyncedTablePipelineProgress initialPipelineSyncProgress;

  public SyncedTableProvisioningStatusPb setInitialPipelineSyncProgress(
      SyncedTablePipelineProgress initialPipelineSyncProgress) {
    this.initialPipelineSyncProgress = initialPipelineSyncProgress;
    return this;
  }

  public SyncedTablePipelineProgress getInitialPipelineSyncProgress() {
    return initialPipelineSyncProgress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTableProvisioningStatusPb that = (SyncedTableProvisioningStatusPb) o;
    return Objects.equals(initialPipelineSyncProgress, that.initialPipelineSyncProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialPipelineSyncProgress);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableProvisioningStatusPb.class)
        .add("initialPipelineSyncProgress", initialPipelineSyncProgress)
        .toString();
  }
}
