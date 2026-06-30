// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Detailed status of an online table. Shown if the online table is in the
 * PROVISIONING_PIPELINE_RESOURCES or the PROVISIONING_INITIAL_SNAPSHOT state.
 */
@Generated
public class ProvisioningStatus {
  /**
   * Details about initial data synchronization. Only populated when in the
   * PROVISIONING_INITIAL_SNAPSHOT state.
   */
  @JsonProperty("initial_pipeline_sync_progress")
  private PipelineProgress initialPipelineSyncProgress;

  public ProvisioningStatus setInitialPipelineSyncProgress(
      PipelineProgress initialPipelineSyncProgress) {
    this.initialPipelineSyncProgress = initialPipelineSyncProgress;
    return this;
  }

  public PipelineProgress getInitialPipelineSyncProgress() {
    return initialPipelineSyncProgress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProvisioningStatus that = (ProvisioningStatus) o;
    return Objects.equals(initialPipelineSyncProgress, that.initialPipelineSyncProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialPipelineSyncProgress);
  }

  @Override
  public String toString() {
    return new ToStringer(ProvisioningStatus.class)
        .add("initialPipelineSyncProgress", initialPipelineSyncProgress)
        .toString();
  }
}
