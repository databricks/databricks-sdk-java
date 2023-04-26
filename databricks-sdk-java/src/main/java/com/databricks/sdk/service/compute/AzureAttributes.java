// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>AzureAttributes class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AzureAttributes {
  /**
   * Availability type used for all subsequent nodes past the `first_on_demand` ones. Note: If
   * `first_on_demand` is zero (which only happens on pool clusters), this availability type will be
   * used for the entire cluster.
   */
  @JsonProperty("availability")
  private AzureAvailability availability;

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
  private Float spotBidMaxPrice;

  /**
   * <p>Setter for the field <code>availability</code>.</p>
   *
   * @param availability a {@link com.databricks.sdk.service.compute.AzureAvailability} object
   * @return a {@link com.databricks.sdk.service.compute.AzureAttributes} object
   */
  public AzureAttributes setAvailability(AzureAvailability availability) {
    this.availability = availability;
    return this;
  }

  /**
   * <p>Getter for the field <code>availability</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.AzureAvailability} object
   */
  public AzureAvailability getAvailability() {
    return availability;
  }

  /**
   * <p>Setter for the field <code>firstOnDemand</code>.</p>
   *
   * @param firstOnDemand a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.AzureAttributes} object
   */
  public AzureAttributes setFirstOnDemand(Long firstOnDemand) {
    this.firstOnDemand = firstOnDemand;
    return this;
  }

  /**
   * <p>Getter for the field <code>firstOnDemand</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getFirstOnDemand() {
    return firstOnDemand;
  }

  /**
   * <p>Setter for the field <code>logAnalyticsInfo</code>.</p>
   *
   * @param logAnalyticsInfo a {@link com.databricks.sdk.service.compute.LogAnalyticsInfo} object
   * @return a {@link com.databricks.sdk.service.compute.AzureAttributes} object
   */
  public AzureAttributes setLogAnalyticsInfo(LogAnalyticsInfo logAnalyticsInfo) {
    this.logAnalyticsInfo = logAnalyticsInfo;
    return this;
  }

  /**
   * <p>Getter for the field <code>logAnalyticsInfo</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.LogAnalyticsInfo} object
   */
  public LogAnalyticsInfo getLogAnalyticsInfo() {
    return logAnalyticsInfo;
  }

  /**
   * <p>Setter for the field <code>spotBidMaxPrice</code>.</p>
   *
   * @param spotBidMaxPrice a {@link java.lang.Float} object
   * @return a {@link com.databricks.sdk.service.compute.AzureAttributes} object
   */
  public AzureAttributes setSpotBidMaxPrice(Float spotBidMaxPrice) {
    this.spotBidMaxPrice = spotBidMaxPrice;
    return this;
  }

  /**
   * <p>Getter for the field <code>spotBidMaxPrice</code>.</p>
   *
   * @return a {@link java.lang.Float} object
   */
  public Float getSpotBidMaxPrice() {
    return spotBidMaxPrice;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureAttributes that = (AzureAttributes) o;
    return Objects.equals(availability, that.availability)
        && Objects.equals(firstOnDemand, that.firstOnDemand)
        && Objects.equals(logAnalyticsInfo, that.logAnalyticsInfo)
        && Objects.equals(spotBidMaxPrice, that.spotBidMaxPrice);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(availability, firstOnDemand, logAnalyticsInfo, spotBidMaxPrice);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(AzureAttributes.class)
        .add("availability", availability)
        .add("firstOnDemand", firstOnDemand)
        .add("logAnalyticsInfo", logAnalyticsInfo)
        .add("spotBidMaxPrice", spotBidMaxPrice)
        .toString();
  }
}
