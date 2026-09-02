// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * ComputeSpec: compute configuration — accelerator type and total accelerator count across all
 * nodes.
 */
@Generated
public class ComputeSpec {
  /**
   * Total number of accelerators across all nodes. Must be a positive multiple of the per-node
   * accelerator count encoded in `accelerator_type`. For example, `GPU_8xH100` with
   * `accelerator_count: 16` allocates 2 nodes (8 GPUs per node).
   */
  @JsonProperty("accelerator_count")
  private Long acceleratorCount;

  /**
   * Hardware accelerator type (for example, `GPU_1xA10` or `GPU_8xH100`). The number of
   * accelerators per node is encoded in the enum value — `GPU_8xH100` means 8 H100 GPUs per node.
   */
  @JsonProperty("accelerator_type")
  private ComputeSpecAcceleratorType acceleratorType;

  /**
   * Optional ID of a pre-provisioned accelerator capacity reservation to run this AI Runtime
   * workload on. When set, the workload is scheduled onto the referenced reserved capacity instead
   * of the on-demand capacity shared among all Databricks customers.
   */
  @JsonProperty("provisioned_capacity_id")
  private String provisionedCapacityId;

  public ComputeSpec setAcceleratorCount(Long acceleratorCount) {
    this.acceleratorCount = acceleratorCount;
    return this;
  }

  public Long getAcceleratorCount() {
    return acceleratorCount;
  }

  public ComputeSpec setAcceleratorType(ComputeSpecAcceleratorType acceleratorType) {
    this.acceleratorType = acceleratorType;
    return this;
  }

  public ComputeSpecAcceleratorType getAcceleratorType() {
    return acceleratorType;
  }

  public ComputeSpec setProvisionedCapacityId(String provisionedCapacityId) {
    this.provisionedCapacityId = provisionedCapacityId;
    return this;
  }

  public String getProvisionedCapacityId() {
    return provisionedCapacityId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComputeSpec that = (ComputeSpec) o;
    return Objects.equals(acceleratorCount, that.acceleratorCount)
        && Objects.equals(acceleratorType, that.acceleratorType)
        && Objects.equals(provisionedCapacityId, that.provisionedCapacityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceleratorCount, acceleratorType, provisionedCapacityId);
  }

  @Override
  public String toString() {
    return new ToStringer(ComputeSpec.class)
        .add("acceleratorCount", acceleratorCount)
        .add("acceleratorType", acceleratorType)
        .add("provisionedCapacityId", provisionedCapacityId)
        .toString();
  }
}
