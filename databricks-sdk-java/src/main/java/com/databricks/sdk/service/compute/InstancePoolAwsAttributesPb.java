// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Attributes set during instance pool creation which are related to Amazon Web Services. */
@Generated
class InstancePoolAwsAttributesPb {
  @JsonProperty("availability")
  private InstancePoolAwsAttributesAvailability availability;

  @JsonProperty("spot_bid_price_percent")
  private Long spotBidPricePercent;

  @JsonProperty("zone_id")
  private String zoneId;

  public InstancePoolAwsAttributesPb setAvailability(
      InstancePoolAwsAttributesAvailability availability) {
    this.availability = availability;
    return this;
  }

  public InstancePoolAwsAttributesAvailability getAvailability() {
    return availability;
  }

  public InstancePoolAwsAttributesPb setSpotBidPricePercent(Long spotBidPricePercent) {
    this.spotBidPricePercent = spotBidPricePercent;
    return this;
  }

  public Long getSpotBidPricePercent() {
    return spotBidPricePercent;
  }

  public InstancePoolAwsAttributesPb setZoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

  public String getZoneId() {
    return zoneId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolAwsAttributesPb that = (InstancePoolAwsAttributesPb) o;
    return Objects.equals(availability, that.availability)
        && Objects.equals(spotBidPricePercent, that.spotBidPricePercent)
        && Objects.equals(zoneId, that.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, spotBidPricePercent, zoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolAwsAttributesPb.class)
        .add("availability", availability)
        .add("spotBidPricePercent", spotBidPricePercent)
        .add("zoneId", zoneId)
        .toString();
  }
}
