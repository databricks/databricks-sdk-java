// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListProviderSharesResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** An array of provider shares. */
  @JsonProperty("shares")
  private Collection<ProviderShare> shares;

  public ListProviderSharesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListProviderSharesResponse setShares(Collection<ProviderShare> shares) {
    this.shares = shares;
    return this;
  }

  public Collection<ProviderShare> getShares() {
    return shares;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProviderSharesResponse that = (ListProviderSharesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(shares, that.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, shares);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProviderSharesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("shares", shares)
        .toString();
  }
}
