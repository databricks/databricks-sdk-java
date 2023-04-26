// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>FleetSpotOption class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>allocationStrategy</code>.</p>
   *
   * @param allocationStrategy a {@link com.databricks.sdk.service.compute.FleetSpotOptionAllocationStrategy} object
   * @return a {@link com.databricks.sdk.service.compute.FleetSpotOption} object
   */
  public FleetSpotOption setAllocationStrategy(
      FleetSpotOptionAllocationStrategy allocationStrategy) {
    this.allocationStrategy = allocationStrategy;
    return this;
  }

  /**
   * <p>Getter for the field <code>allocationStrategy</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.FleetSpotOptionAllocationStrategy} object
   */
  public FleetSpotOptionAllocationStrategy getAllocationStrategy() {
    return allocationStrategy;
  }

  /**
   * <p>Setter for the field <code>instancePoolsToUseCount</code>.</p>
   *
   * @param instancePoolsToUseCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.FleetSpotOption} object
   */
  public FleetSpotOption setInstancePoolsToUseCount(Long instancePoolsToUseCount) {
    this.instancePoolsToUseCount = instancePoolsToUseCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>instancePoolsToUseCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getInstancePoolsToUseCount() {
    return instancePoolsToUseCount;
  }

  /**
   * <p>Setter for the field <code>maxTotalPrice</code>.</p>
   *
   * @param maxTotalPrice a {@link java.lang.Float} object
   * @return a {@link com.databricks.sdk.service.compute.FleetSpotOption} object
   */
  public FleetSpotOption setMaxTotalPrice(Float maxTotalPrice) {
    this.maxTotalPrice = maxTotalPrice;
    return this;
  }

  /**
   * <p>Getter for the field <code>maxTotalPrice</code>.</p>
   *
   * @return a {@link java.lang.Float} object
   */
  public Float getMaxTotalPrice() {
    return maxTotalPrice;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FleetSpotOption that = (FleetSpotOption) o;
    return Objects.equals(allocationStrategy, that.allocationStrategy)
        && Objects.equals(instancePoolsToUseCount, that.instancePoolsToUseCount)
        && Objects.equals(maxTotalPrice, that.maxTotalPrice);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(allocationStrategy, instancePoolsToUseCount, maxTotalPrice);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(FleetSpotOption.class)
        .add("allocationStrategy", allocationStrategy)
        .add("instancePoolsToUseCount", instancePoolsToUseCount)
        .add("maxTotalPrice", maxTotalPrice)
        .toString();
  }
}
