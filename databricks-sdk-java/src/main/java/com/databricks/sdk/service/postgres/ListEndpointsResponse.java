// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListEndpointsResponse {
  /** List of compute endpoints in the branch. */
  @JsonProperty("endpoints")
  private Collection<Endpoint> endpoints;

  /** Token to request the next page of compute endpoints. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListEndpointsResponse setEndpoints(Collection<Endpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public Collection<Endpoint> getEndpoints() {
    return endpoints;
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
    return Objects.equals(endpoints, that.endpoints)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListEndpointsResponse.class)
        .add("endpoints", endpoints)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
