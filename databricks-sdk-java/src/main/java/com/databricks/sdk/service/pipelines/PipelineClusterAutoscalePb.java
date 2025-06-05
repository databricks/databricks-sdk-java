// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PipelineClusterAutoscalePb {
  @JsonProperty("max_workers")
  private Long maxWorkers;

  @JsonProperty("min_workers")
  private Long minWorkers;

  @JsonProperty("mode")
  private PipelineClusterAutoscaleMode mode;

  public PipelineClusterAutoscalePb setMaxWorkers(Long maxWorkers) {
    this.maxWorkers = maxWorkers;
    return this;
  }

  public Long getMaxWorkers() {
    return maxWorkers;
  }

  public PipelineClusterAutoscalePb setMinWorkers(Long minWorkers) {
    this.minWorkers = minWorkers;
    return this;
  }

  public Long getMinWorkers() {
    return minWorkers;
  }

  public PipelineClusterAutoscalePb setMode(PipelineClusterAutoscaleMode mode) {
    this.mode = mode;
    return this;
  }

  public PipelineClusterAutoscaleMode getMode() {
    return mode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineClusterAutoscalePb that = (PipelineClusterAutoscalePb) o;
    return Objects.equals(maxWorkers, that.maxWorkers)
        && Objects.equals(minWorkers, that.minWorkers)
        && Objects.equals(mode, that.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxWorkers, minWorkers, mode);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineClusterAutoscalePb.class)
        .add("maxWorkers", maxWorkers)
        .add("minWorkers", minWorkers)
        .add("mode", mode)
        .toString();
  }
}
