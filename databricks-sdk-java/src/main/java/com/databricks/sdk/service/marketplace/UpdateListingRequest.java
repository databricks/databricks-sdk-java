// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateListingRequest {
  /** */
  private String id;

  /** */
  @JsonProperty("listing")
  private Listing listing;

  public UpdateListingRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateListingRequest setListing(Listing listing) {
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
    UpdateListingRequest that = (UpdateListingRequest) o;
    return Objects.equals(id, that.id) && Objects.equals(listing, that.listing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, listing);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateListingRequest.class)
        .add("id", id)
        .add("listing", listing)
        .toString();
  }
}
