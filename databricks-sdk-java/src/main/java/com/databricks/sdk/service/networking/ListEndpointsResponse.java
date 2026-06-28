// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListEndpointsResponse {
  /** */
  @JsonProperty("items")
  private Collection<Endpoint> items;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListEndpointsResponse setItems(Collection<Endpoint> items) {
    this.items = items;
    return this;
  }

  public Collection<Endpoint> getItems() {
    return items;
  }

  public ListEndpointsResponse setNextPageToken(String nextPageToken) {
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
    ListEndpointsResponse that = (ListEndpointsResponse) o;
    return Objects.equals(items, that.items) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListEndpointsResponse.class)
        .add("items", items)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
