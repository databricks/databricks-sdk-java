// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateListingResponsePb {
  @JsonProperty("listing")
  private Listing listing;

  public UpdateListingResponsePb setListing(Listing listing) {
    this.listing = listing;
    return this;
  }

  public Listing getListing() {
    return listing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateListingResponsePb that = (UpdateListingResponsePb) o;
    return Objects.equals(listing, that.listing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listing);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateListingResponsePb.class).add("listing", listing).toString();
  }
}
