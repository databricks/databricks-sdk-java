// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AutoScale {
  /**
   * The maximum number of workers to which the cluster can scale up when overloaded. Note that
   * `max_workers` must be strictly greater than `min_workers`.
   */
  @JsonProperty("max_workers")
  private Long maxWorkers;

  /**
   * The minimum number of workers to which the cluster can scale down when underutilized. It is
   * also the initial number of workers the cluster will have after creation.
   */
  @JsonProperty("min_workers")
  private Long minWorkers;

  public AutoScale setMaxWorkers(Long maxWorkers) {
    this.maxWorkers = maxWorkers;
    return this;
  }

  public Long getMaxWorkers() {
    return maxWorkers;
  }

  public AutoScale setMinWorkers(Long minWorkers) {
    this.minWorkers = minWorkers;
    return this;
  }

  public Long getMinWorkers() {
    return minWorkers;
  }
}
