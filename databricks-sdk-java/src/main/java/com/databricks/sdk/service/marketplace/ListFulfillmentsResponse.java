// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListFulfillmentsResponse {
  /** */
  @JsonProperty("fulfillments")
  private Collection<ListingFulfillment> fulfillments;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListFulfillmentsResponse setFulfillments(Collection<ListingFulfillment> fulfillments) {
    this.fulfillments = fulfillments;
    return this;
  }

  public Collection<ListingFulfillment> getFulfillments() {
    return fulfillments;
  }

  public ListFulfillmentsResponse setNextPageToken(String nextPageToken) {
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
    ListFulfillmentsResponse that = (ListFulfillmentsResponse) o;
    return Objects.equals(fulfillments, that.fulfillments)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillments, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFulfillmentsResponse.class)
        .add("fulfillments", fulfillments)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
