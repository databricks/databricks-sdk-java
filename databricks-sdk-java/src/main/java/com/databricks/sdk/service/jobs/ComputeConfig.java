// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ComputeConfig {
  /** IDof the GPU pool to use. */
  @JsonProperty("gpu_node_pool_id")
  private String gpuNodePoolId;

  /** GPU type. */
  @JsonProperty("gpu_type")
  private String gpuType;

  /** Number of GPUs. */
  @JsonProperty("num_gpus")
  private Long numGpus;

  public ComputeConfig setGpuNodePoolId(String gpuNodePoolId) {
    this.gpuNodePoolId = gpuNodePoolId;
    return this;
  }

  public String getGpuNodePoolId() {
    return gpuNodePoolId;
  }

  public ComputeConfig setGpuType(String gpuType) {
    this.gpuType = gpuType;
    return this;
  }

  public String getGpuType() {
    return gpuType;
  }

  public ComputeConfig setNumGpus(Long numGpus) {
    this.numGpus = numGpus;
    return this;
  }

  public Long getNumGpus() {
    return numGpus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComputeConfig that = (ComputeConfig) o;
    return Objects.equals(gpuNodePoolId, that.gpuNodePoolId)
        && Objects.equals(gpuType, that.gpuType)
        && Objects.equals(numGpus, that.numGpus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gpuNodePoolId, gpuType, numGpus);
  }

  @Override
  public String toString() {
    return new ToStringer(ComputeConfig.class)
        .add("gpuNodePoolId", gpuNodePoolId)
        .add("gpuType", gpuType)
        .add("numGpus", numGpus)
        .toString();
  }
}
