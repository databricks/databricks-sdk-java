// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateListingResponse {
  /** */
  @JsonProperty("listing_id")
  private String listingId;

  public CreateListingResponse setListingId(String listingId) {
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
    CreateListingResponse that = (CreateListingResponse) o;
    return Objects.equals(listingId, that.listingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateListingResponse.class).add("listingId", listingId).toString();
  }
}
