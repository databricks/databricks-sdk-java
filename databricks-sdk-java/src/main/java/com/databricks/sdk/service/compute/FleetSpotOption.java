// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class FleetSpotOption {
  /**
   * lowest-price | diversified | capacity-optimized
   */
  @JsonProperty("allocation_strategy")
  private FleetSpotOptionAllocationStrategy allocationStrategy;
  
  /**
   * The number of Spot pools across which to allocate your target Spot
   * capacity. Valid only when Spot Allocation Strategy is set to lowest-price.
   * EC2 Fleet selects the cheapest Spot pools and evenly allocates your target
   * Spot capacity across the number of Spot pools that you specify.
   */
  @JsonProperty("instance_pools_to_use_count")
  private Long instancePoolsToUseCount;
  
  /**
   * The maximum amount per hour for Spot Instances that you're willing to pay.
   */
  @JsonProperty("max_total_price")
  private Float maxTotalPrice;
  
  public FleetSpotOption setAllocationStrategy(FleetSpotOptionAllocationStrategy allocationStrategy) {
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
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FleetSpotOption that = (FleetSpotOption) o;
    return Objects.equals(allocationStrategy, that.allocationStrategy)
    && Objects.equals(instancePoolsToUseCount, that.instancePoolsToUseCount)
    && Objects.equals(maxTotalPrice, that.maxTotalPrice)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationStrategy, instancePoolsToUseCount, maxTotalPrice);
  }

  @Override
  public String toString() {
    return new ToStringer(FleetSpotOption.class)
      .add("allocationStrategy", allocationStrategy)
      .add("instancePoolsToUseCount", instancePoolsToUseCount)
      .add("maxTotalPrice", maxTotalPrice).toString();
  }
}
