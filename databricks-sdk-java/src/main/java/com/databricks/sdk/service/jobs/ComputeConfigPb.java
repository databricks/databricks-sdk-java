// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ComputeConfigPb {
  @JsonProperty("gpu_node_pool_id")
  private String gpuNodePoolId;

  @JsonProperty("gpu_type")
  private String gpuType;

  @JsonProperty("num_gpus")
  private Long numGpus;

  public ComputeConfigPb setGpuNodePoolId(String gpuNodePoolId) {
    this.gpuNodePoolId = gpuNodePoolId;
    return this;
  }

  public String getGpuNodePoolId() {
    return gpuNodePoolId;
  }

  public ComputeConfigPb setGpuType(String gpuType) {
    this.gpuType = gpuType;
    return this;
  }

  public String getGpuType() {
    return gpuType;
  }

  public ComputeConfigPb setNumGpus(Long numGpus) {
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
    ComputeConfigPb that = (ComputeConfigPb) o;
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
    return new ToStringer(ComputeConfigPb.class)
        .add("gpuNodePoolId", gpuNodePoolId)
        .add("gpuType", gpuType)
        .add("numGpus", numGpus)
        .toString();
  }
}
