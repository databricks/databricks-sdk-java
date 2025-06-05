// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Attributes set during instance pool creation which are related to Azure. */
@Generated
class InstancePoolAzureAttributesPb {
  @JsonProperty("availability")
  private InstancePoolAzureAttributesAvailability availability;

  @JsonProperty("spot_bid_max_price")
  private Double spotBidMaxPrice;

  public InstancePoolAzureAttributesPb setAvailability(
      InstancePoolAzureAttributesAvailability availability) {
    this.availability = availability;
    return this;
  }

  public InstancePoolAzureAttributesAvailability getAvailability() {
    return availability;
  }

  public InstancePoolAzureAttributesPb setSpotBidMaxPrice(Double spotBidMaxPrice) {
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
    InstancePoolAzureAttributesPb that = (InstancePoolAzureAttributesPb) o;
    return Objects.equals(availability, that.availability)
        && Objects.equals(spotBidMaxPrice, that.spotBidMaxPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, spotBidMaxPrice);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolAzureAttributesPb.class)
        .add("availability", availability)
        .add("spotBidMaxPrice", spotBidMaxPrice)
        .toString();
  }
}
