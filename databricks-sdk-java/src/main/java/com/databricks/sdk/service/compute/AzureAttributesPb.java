// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Attributes set during cluster creation which are related to Microsoft Azure. */
@Generated
class AzureAttributesPb {
  @JsonProperty("availability")
  private AzureAvailability availability;

  @JsonProperty("first_on_demand")
  private Long firstOnDemand;

  @JsonProperty("log_analytics_info")
  private LogAnalyticsInfo logAnalyticsInfo;

  @JsonProperty("spot_bid_max_price")
  private Double spotBidMaxPrice;

  public AzureAttributesPb setAvailability(AzureAvailability availability) {
    this.availability = availability;
    return this;
  }

  public AzureAvailability getAvailability() {
    return availability;
  }

  public AzureAttributesPb setFirstOnDemand(Long firstOnDemand) {
    this.firstOnDemand = firstOnDemand;
    return this;
  }

  public Long getFirstOnDemand() {
    return firstOnDemand;
  }

  public AzureAttributesPb setLogAnalyticsInfo(LogAnalyticsInfo logAnalyticsInfo) {
    this.logAnalyticsInfo = logAnalyticsInfo;
    return this;
  }

  public LogAnalyticsInfo getLogAnalyticsInfo() {
    return logAnalyticsInfo;
  }

  public AzureAttributesPb setSpotBidMaxPrice(Double spotBidMaxPrice) {
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
    AzureAttributesPb that = (AzureAttributesPb) o;
    return Objects.equals(availability, that.availability)
        && Objects.equals(firstOnDemand, that.firstOnDemand)
        && Objects.equals(logAnalyticsInfo, that.logAnalyticsInfo)
        && Objects.equals(spotBidMaxPrice, that.spotBidMaxPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, firstOnDemand, logAnalyticsInfo, spotBidMaxPrice);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureAttributesPb.class)
        .add("availability", availability)
        .add("firstOnDemand", firstOnDemand)
        .add("logAnalyticsInfo", logAnalyticsInfo)
        .add("spotBidMaxPrice", spotBidMaxPrice)
        .toString();
  }
}
