// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PipelineClusterAutoscale {
  /**
   * The maximum number of workers to which the cluster can scale up when overloaded. `max_workers`
   * must be strictly greater than `min_workers`.
   */
  @JsonProperty("max_workers")
  private Long maxWorkers;

  /**
   * The minimum number of workers the cluster can scale down to when underutilized. It is also the
   * initial number of workers the cluster will have after creation.
   */
  @JsonProperty("min_workers")
  private Long minWorkers;

  /**
   * Databricks Enhanced Autoscaling optimizes cluster utilization by automatically allocating
   * cluster resources based on workload volume, with minimal impact to the data processing latency
   * of your pipelines. Enhanced Autoscaling is available for `updates` clusters only. The legacy
   * autoscaling feature is used for `maintenance` clusters.
   */
  @JsonProperty("mode")
  private PipelineClusterAutoscaleMode mode;

  public PipelineClusterAutoscale setMaxWorkers(Long maxWorkers) {
    this.maxWorkers = maxWorkers;
    return this;
  }

  public Long getMaxWorkers() {
    return maxWorkers;
  }

  public PipelineClusterAutoscale setMinWorkers(Long minWorkers) {
    this.minWorkers = minWorkers;
    return this;
  }

  public Long getMinWorkers() {
    return minWorkers;
  }

  public PipelineClusterAutoscale setMode(PipelineClusterAutoscaleMode mode) {
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
    PipelineClusterAutoscale that = (PipelineClusterAutoscale) o;
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
    return new ToStringer(PipelineClusterAutoscale.class)
        .add("maxWorkers", maxWorkers)
        .add("minWorkers", minWorkers)
        .add("mode", mode)
        .toString();
  }
}
