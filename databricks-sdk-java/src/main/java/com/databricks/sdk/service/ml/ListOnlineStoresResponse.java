// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListOnlineStoresResponse {
  /** Pagination token to request the next page of results for this query. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** List of online stores. */
  @JsonProperty("online_stores")
  private Collection<OnlineStore> onlineStores;

  public ListOnlineStoresResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListOnlineStoresResponse setOnlineStores(Collection<OnlineStore> onlineStores) {
    this.onlineStores = onlineStores;
    return this;
  }

  public Collection<OnlineStore> getOnlineStores() {
    return onlineStores;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListOnlineStoresResponse that = (ListOnlineStoresResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(onlineStores, that.onlineStores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, onlineStores);
  }

  @Override
  public String toString() {
    return new ToStringer(ListOnlineStoresResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("onlineStores", onlineStores)
        .toString();
  }
}
