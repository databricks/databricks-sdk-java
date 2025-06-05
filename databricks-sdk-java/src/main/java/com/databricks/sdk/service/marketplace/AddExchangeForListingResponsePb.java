// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AddExchangeForListingResponsePb {
  @JsonProperty("exchange_for_listing")
  private ExchangeListing exchangeForListing;

  public AddExchangeForListingResponsePb setExchangeForListing(ExchangeListing exchangeForListing) {
    this.exchangeForListing = exchangeForListing;
    return this;
  }

  public ExchangeListing getExchangeForListing() {
    return exchangeForListing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddExchangeForListingResponsePb that = (AddExchangeForListingResponsePb) o;
    return Objects.equals(exchangeForListing, that.exchangeForListing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeForListing);
  }

  @Override
  public String toString() {
    return new ToStringer(AddExchangeForListingResponsePb.class)
        .add("exchangeForListing", exchangeForListing)
        .toString();
  }
}
