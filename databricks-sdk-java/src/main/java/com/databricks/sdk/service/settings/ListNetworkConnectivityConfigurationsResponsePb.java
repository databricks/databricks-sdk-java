// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The network connectivity configuration list was successfully retrieved. */
@Generated
class ListNetworkConnectivityConfigurationsResponsePb {
  @JsonProperty("items")
  private Collection<NetworkConnectivityConfiguration> items;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListNetworkConnectivityConfigurationsResponsePb setItems(
      Collection<NetworkConnectivityConfiguration> items) {
    this.items = items;
    return this;
  }

  public Collection<NetworkConnectivityConfiguration> getItems() {
    return items;
  }

  public ListNetworkConnectivityConfigurationsResponsePb setNextPageToken(String nextPageToken) {
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
    ListNetworkConnectivityConfigurationsResponsePb that =
        (ListNetworkConnectivityConfigurationsResponsePb) o;
    return Objects.equals(items, that.items) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNetworkConnectivityConfigurationsResponsePb.class)
        .add("items", items)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
