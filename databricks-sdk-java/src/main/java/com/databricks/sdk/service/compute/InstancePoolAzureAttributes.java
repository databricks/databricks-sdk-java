// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Attributes set during instance pool creation which are related to Azure. */
@Generated
public class InstancePoolAzureAttributes {
  /** Availability type used for the spot nodes. */
  @JsonProperty("availability")
  private InstancePoolAzureAttributesAvailability availability;

  /**
   * The Azure capacity reservation group resource ID to use for launching VMs in this pool. When
   * specified, VMs will be launched using the provided capacity reservation.
   *
   * <p>NOTE: Omitting this field will clear any existing configured capacity reservation group on
   * the pool.
   *
   * <p>Capacity reservations can only be specified when the workspace uses injected vnet (i.e.
   * customer defined vnet not managed by databricks). Ensure the databricks-login-prod Enterprise
   * Application is granted the following four permissions: 1.
   * Microsoft.Compute/capacityReservationGroups/read 2.
   * Microsoft.Compute/capacityReservationGroups/deploy/action 3.
   * Microsoft.Compute/capacityReservationGroups/capacityReservations/read 4.
   * Microsoft.Compute/capacityReservationGroups/capacityReservations/deploy/action
   *
   * <p>Format:
   * `/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/capacityReservationGroups/{capacityReservationGroupName}`
   */
  @JsonProperty("capacity_reservation_group")
  private String capacityReservationGroup;

  /**
   * With variable pricing, you have option to set a max price, in US dollars (USD) For example, the
   * value 2 would be a max price of $2.00 USD per hour. If you set the max price to be -1, the VM
   * won't be evicted based on price. The price for the VM will be the current price for spot or the
   * price for a standard VM, which ever is less, as long as there is capacity and quota available.
   */
  @JsonProperty("spot_bid_max_price")
  private Double spotBidMaxPrice;

  public InstancePoolAzureAttributes setAvailability(
      InstancePoolAzureAttributesAvailability availability) {
    this.availability = availability;
    return this;
  }

  public InstancePoolAzureAttributesAvailability getAvailability() {
    return availability;
  }

  public InstancePoolAzureAttributes setCapacityReservationGroup(String capacityReservationGroup) {
    this.capacityReservationGroup = capacityReservationGroup;
    return this;
  }

  public String getCapacityReservationGroup() {
    return capacityReservationGroup;
  }

  public InstancePoolAzureAttributes setSpotBidMaxPrice(Double spotBidMaxPrice) {
    this.spotBidMaxPrice = spotBidMaxPrice;
    return this;
  }

  public Double getSpotBidMaxPrice() {
    return spotBidMaxPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolAzureAttributes that = (InstancePoolAzureAttributes) o;
    return Objects.equals(availability, that.availability)
        && Objects.equals(capacityReservationGroup, that.capacityReservationGroup)
        && Objects.equals(spotBidMaxPrice, that.spotBidMaxPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, capacityReservationGroup, spotBidMaxPrice);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolAzureAttributes.class)
        .add("availability", availability)
        .add("capacityReservationGroup", capacityReservationGroup)
        .add("spotBidMaxPrice", spotBidMaxPrice)
        .toString();
  }
}
