// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SearchListingsResponse {
  /** */
  @JsonProperty("listings")
  private Collection<Listing> listings;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public SearchListingsResponse setListings(Collection<Listing> listings) {
    this.listings = listings;
    return this;
  }

  public Collection<Listing> getListings() {
    return listings;
  }

  public SearchListingsResponse setNextPageToken(String nextPageToken) {
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
    SearchListingsResponse that = (SearchListingsResponse) o;
    return Objects.equals(listings, that.listings)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listings, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchListingsResponse.class)
        .add("listings", listings)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
