// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class BatchGetListingsResponsePb {
  @JsonProperty("listings")
  private Collection<Listing> listings;

  public BatchGetListingsResponsePb setListings(Collection<Listing> listings) {
    this.listings = listings;
    return this;
  }

  public Collection<Listing> getListings() {
    return listings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BatchGetListingsResponsePb that = (BatchGetListingsResponsePb) o;
    return Objects.equals(listings, that.listings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listings);
  }

  @Override
  public String toString() {
    return new ToStringer(BatchGetListingsResponsePb.class).add("listings", listings).toString();
  }
}
