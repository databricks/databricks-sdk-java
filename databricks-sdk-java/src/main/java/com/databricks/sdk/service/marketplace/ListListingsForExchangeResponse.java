// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListListingsForExchangeResponse {
  /** */
  @JsonProperty("exchange_listings")
  private Collection<ExchangeListing> exchangeListings;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListListingsForExchangeResponse setExchangeListings(
      Collection<ExchangeListing> exchangeListings) {
    this.exchangeListings = exchangeListings;
    return this;
  }

  public Collection<ExchangeListing> getExchangeListings() {
    return exchangeListings;
  }

  public ListListingsForExchangeResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListListingsForExchangeResponse that = (ListListingsForExchangeResponse) o;
    return Objects.equals(exchangeListings, that.exchangeListings)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeListings, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListListingsForExchangeResponse.class)
        .add("exchangeListings", exchangeListings)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
