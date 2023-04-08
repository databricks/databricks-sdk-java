// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FleetSpotOption {
  /** lowest-price | diversified | capacity-optimized */
  @JsonProperty("allocation_strategy")
  private FleetSpotOptionAllocationStrategy allocationStrategy;

  /**
   * The number of Spot pools across which to allocate your target Spot capacity. Valid only when
   * Spot Allocation Strategy is set to lowest-price. EC2 Fleet selects the cheapest Spot pools and
   * evenly allocates your target Spot capacity across the number of Spot pools that you specify.
   */
  @JsonProperty("instance_pools_to_use_count")
  private Long instancePoolsToUseCount;

  /** The maximum amount per hour for Spot Instances that you're willing to pay. */
  @JsonProperty("max_total_price")
  private Float maxTotalPrice;

  public FleetSpotOption setAllocationStrategy(
      FleetSpotOptionAllocationStrategy allocationStrategy) {
    this.allocationStrategy = allocationStrategy;
    return this;
  }

  public FleetSpotOptionAllocationStrategy getAllocationStrategy() {
    return allocationStrategy;
  }

  public FleetSpotOption setInstancePoolsToUseCount(Long instancePoolsToUseCount) {
    this.instancePoolsToUseCount = instancePoolsToUseCount;
    return this;
  }

  public Long getInstancePoolsToUseCount() {
    return instancePoolsToUseCount;
  }

  public FleetSpotOption setMaxTotalPrice(Float maxTotalPrice) {
    this.maxTotalPrice = maxTotalPrice;
    return this;
  }

  public Float getMaxTotalPrice() {
    return maxTotalPrice;
  }
}
