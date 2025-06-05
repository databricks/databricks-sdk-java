// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListProviderSharesResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("shares")
  private Collection<ProviderShare> shares;

  public ListProviderSharesResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListProviderSharesResponsePb setShares(Collection<ProviderShare> shares) {
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
    ListProviderSharesResponsePb that = (ListProviderSharesResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(shares, that.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, shares);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProviderSharesResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("shares", shares)
        .toString();
  }
}
