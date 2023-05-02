// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class InstancePoolAzureAttributes {
  /**
   * Shows the Availability type used for the spot nodes.
   *
   * <p>The default value is defined by InstancePoolConf.instancePoolDefaultAzureAvailability
   */
  @JsonProperty("availability")
  private InstancePoolAzureAttributesAvailability availability;

  /**
   * The default value and documentation here should be kept consistent with
   * CommonConf.defaultSpotBidMaxPrice.
   */
  @JsonProperty("spot_bid_max_price")
  private Float spotBidMaxPrice;

  public InstancePoolAzureAttributes setAvailability(
      InstancePoolAzureAttributesAvailability availability) {
    this.availability = availability;
    return this;
  }

  public InstancePoolAzureAttributesAvailability getAvailability() {
    return availability;
  }

  public InstancePoolAzureAttributes setSpotBidMaxPrice(Float spotBidMaxPrice) {
    this.spotBidMaxPrice = spotBidMaxPrice;
    return this;
  }

  public Float getSpotBidMaxPrice() {
    return spotBidMaxPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolAzureAttributes that = (InstancePoolAzureAttributes) o;
    return Objects.equals(availability, that.availability)
        && Objects.equals(spotBidMaxPrice, that.spotBidMaxPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, spotBidMaxPrice);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolAzureAttributes.class)
        .add("availability", availability)
        .add("spotBidMaxPrice", spotBidMaxPrice)
        .toString();
  }
}
