// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListConnectionsResponse {
  /** An array of connection information objects. */
  @JsonProperty("connections")
  private Collection<ConnectionInfo> connections;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListConnectionsResponse setConnections(Collection<ConnectionInfo> connections) {
    this.connections = connections;
    return this;
  }

  public Collection<ConnectionInfo> getConnections() {
    return connections;
  }

  public ListConnectionsResponse setNextPageToken(String nextPageToken) {
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
    ListConnectionsResponse that = (ListConnectionsResponse) o;
    return Objects.equals(connections, that.connections)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connections, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListConnectionsResponse.class)
        .add("connections", connections)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
