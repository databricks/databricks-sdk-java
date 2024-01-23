// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListEndpointResponse {
  /** An array of Endpoint objects */
  @JsonProperty("endpoints")
  private Collection<EndpointInfo> endpoints;

  /**
   * A token that can be used to get the next page of results. If not present, there are no more
   * results to show.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListEndpointResponse setEndpoints(Collection<EndpointInfo> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public Collection<EndpointInfo> getEndpoints() {
    return endpoints;
  }

  public ListEndpointResponse setNextPageToken(String nextPageToken) {
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
    ListEndpointResponse that = (ListEndpointResponse) o;
    return Objects.equals(endpoints, that.endpoints)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListEndpointResponse.class)
        .add("endpoints", endpoints)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
