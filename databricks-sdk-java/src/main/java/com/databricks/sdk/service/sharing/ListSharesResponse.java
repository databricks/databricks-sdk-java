// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListSharesResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** An array of data share information objects. */
  @JsonProperty("shares")
  private Collection<ShareInfo> shares;

  public ListSharesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSharesResponse setShares(Collection<ShareInfo> shares) {
    this.shares = shares;
    return this;
  }

  public Collection<ShareInfo> getShares() {
    return shares;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSharesResponse that = (ListSharesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(shares, that.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, shares);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSharesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("shares", shares)
        .toString();
  }
}
