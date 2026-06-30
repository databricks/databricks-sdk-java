// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListExchangesForListingResponse {
  /** */
  @JsonProperty("exchange_listing")
  private Collection<ExchangeListing> exchangeListing;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListExchangesForListingResponse setExchangeListing(
      Collection<ExchangeListing> exchangeListing) {
    this.exchangeListing = exchangeListing;
    return this;
  }

  public Collection<ExchangeListing> getExchangeListing() {
    return exchangeListing;
  }

  public ListExchangesForListingResponse setNextPageToken(String nextPageToken) {
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
    ListExchangesForListingResponse that = (ListExchangesForListingResponse) o;
    return Objects.equals(exchangeListing, that.exchangeListing)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeListing, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExchangesForListingResponse.class)
        .add("exchangeListing", exchangeListing)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
