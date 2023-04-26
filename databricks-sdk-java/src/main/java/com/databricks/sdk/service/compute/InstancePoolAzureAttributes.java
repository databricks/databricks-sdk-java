// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>InstancePoolAzureAttributes class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>availability</code>.</p>
   *
   * @param availability a {@link com.databricks.sdk.service.compute.InstancePoolAzureAttributesAvailability} object
   * @return a {@link com.databricks.sdk.service.compute.InstancePoolAzureAttributes} object
   */
  public InstancePoolAzureAttributes setAvailability(
      InstancePoolAzureAttributesAvailability availability) {
    this.availability = availability;
    return this;
  }

  /**
   * <p>Getter for the field <code>availability</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.InstancePoolAzureAttributesAvailability} object
   */
  public InstancePoolAzureAttributesAvailability getAvailability() {
    return availability;
  }

  /**
   * <p>Setter for the field <code>spotBidMaxPrice</code>.</p>
   *
   * @param spotBidMaxPrice a {@link java.lang.Float} object
   * @return a {@link com.databricks.sdk.service.compute.InstancePoolAzureAttributes} object
   */
  public InstancePoolAzureAttributes setSpotBidMaxPrice(Float spotBidMaxPrice) {
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
    InstancePoolAzureAttributes that = (InstancePoolAzureAttributes) o;
    return Objects.equals(availability, that.availability)
        && Objects.equals(spotBidMaxPrice, that.spotBidMaxPrice);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(availability, spotBidMaxPrice);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(InstancePoolAzureAttributes.class)
        .add("availability", availability)
        .add("spotBidMaxPrice", spotBidMaxPrice)
        .toString();
  }
}
