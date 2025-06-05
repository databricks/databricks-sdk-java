// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AddExchangeForListingRequestPb {
  @JsonProperty("exchange_id")
  private String exchangeId;

  @JsonProperty("listing_id")
  private String listingId;

  public AddExchangeForListingRequestPb setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

  public String getExchangeId() {
    return exchangeId;
  }

  public AddExchangeForListingRequestPb setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddExchangeForListingRequestPb that = (AddExchangeForListingRequestPb) o;
    return Objects.equals(exchangeId, that.exchangeId) && Objects.equals(listingId, that.listingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeId, listingId);
  }

  @Override
  public String toString() {
    return new ToStringer(AddExchangeForListingRequestPb.class)
        .add("exchangeId", exchangeId)
        .add("listingId", listingId)
        .toString();
  }
}
