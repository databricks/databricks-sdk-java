// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GetListingsResponsePb {
  @JsonProperty("listings")
  private Collection<Listing> listings;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public GetListingsResponsePb setListings(Collection<Listing> listings) {
    this.listings = listings;
    return this;
  }

  public Collection<Listing> getListings() {
    return listings;
  }

  public GetListingsResponsePb setNextPageToken(String nextPageToken) {
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
    GetListingsResponsePb that = (GetListingsResponsePb) o;
    return Objects.equals(listings, that.listings)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listings, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetListingsResponsePb.class)
        .add("listings", listings)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
