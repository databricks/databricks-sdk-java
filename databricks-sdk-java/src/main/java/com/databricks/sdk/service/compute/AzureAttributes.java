// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Attributes set during cluster creation which are related to Microsoft Azure. */
@Generated
public class AzureAttributes {
  /**
   * Availability type used for all subsequent nodes past the `first_on_demand` ones. Note: If
   * `first_on_demand` is zero, this availability type will be used for the entire cluster.
   */
  @JsonProperty("availability")
  private AzureAvailability availability;

  /**
   * The Azure capacity reservation group resource ID to use for launching VMs. When specified, VMs
   * will be launched using the provided capacity reservation.
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
   * The first `first_on_demand` nodes of the cluster will be placed on on-demand instances. This
   * value should be greater than 0, to make sure the cluster driver node is placed on an on-demand
   * instance. If this value is greater than or equal to the current cluster size, all nodes will be
   * placed on on-demand instances. If this value is less than the current cluster size,
   * `first_on_demand` nodes will be placed on on-demand instances and the remainder will be placed
   * on `availability` instances. Note that this value does not affect cluster size and cannot
   * currently be mutated over the lifetime of a cluster.
   */
  @JsonProperty("first_on_demand")
  private Long firstOnDemand;

  /** Defines values necessary to configure and run Azure Log Analytics agent */
  @JsonProperty("log_analytics_info")
  private LogAnalyticsInfo logAnalyticsInfo;

  /**
   * The max bid price to be used for Azure spot instances. The Max price for the bid cannot be
   * higher than the on-demand price of the instance. If not specified, the default value is -1,
   * which specifies that the instance cannot be evicted on the basis of price, and only on the
   * basis of availability. Further, the value should > 0 or -1.
   */
  @JsonProperty("spot_bid_max_price")
  private Double spotBidMaxPrice;

  public AzureAttributes setAvailability(AzureAvailability availability) {
    this.availability = availability;
    return this;
  }

  public AzureAvailability getAvailability() {
    return availability;
  }

  public AzureAttributes setCapacityReservationGroup(String capacityReservationGroup) {
    this.capacityReservationGroup = capacityReservationGroup;
    return this;
  }

  public String getCapacityReservationGroup() {
    return capacityReservationGroup;
  }

  public AzureAttributes setFirstOnDemand(Long firstOnDemand) {
    this.firstOnDemand = firstOnDemand;
    return this;
  }

  public Long getFirstOnDemand() {
    return firstOnDemand;
  }

  public AzureAttributes setLogAnalyticsInfo(LogAnalyticsInfo logAnalyticsInfo) {
    this.logAnalyticsInfo = logAnalyticsInfo;
    return this;
  }

  public LogAnalyticsInfo getLogAnalyticsInfo() {
    return logAnalyticsInfo;
  }

  public AzureAttributes setSpotBidMaxPrice(Double spotBidMaxPrice) {
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
    AzureAttributes that = (AzureAttributes) o;
    return Objects.equals(availability, that.availability)
        && Objects.equals(capacityReservationGroup, that.capacityReservationGroup)
        && Objects.equals(firstOnDemand, that.firstOnDemand)
        && Objects.equals(logAnalyticsInfo, that.logAnalyticsInfo)
        && Objects.equals(spotBidMaxPrice, that.spotBidMaxPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        availability, capacityReservationGroup, firstOnDemand, logAnalyticsInfo, spotBidMaxPrice);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureAttributes.class)
        .add("availability", availability)
        .add("capacityReservationGroup", capacityReservationGroup)
        .add("firstOnDemand", firstOnDemand)
        .add("logAnalyticsInfo", logAnalyticsInfo)
        .add("spotBidMaxPrice", spotBidMaxPrice)
        .toString();
  }
}
