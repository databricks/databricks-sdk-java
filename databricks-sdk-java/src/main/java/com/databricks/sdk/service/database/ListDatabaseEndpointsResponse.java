// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListDatabaseEndpointsResponse {
  /** List of endpoints. */
  @JsonProperty("database_endpoints")
  private Collection<DatabaseEndpoint> databaseEndpoints;

  /** Pagination token to request the next page of instances. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDatabaseEndpointsResponse setDatabaseEndpoints(
      Collection<DatabaseEndpoint> databaseEndpoints) {
    this.databaseEndpoints = databaseEndpoints;
    return this;
  }

  public Collection<DatabaseEndpoint> getDatabaseEndpoints() {
    return databaseEndpoints;
  }

  public ListDatabaseEndpointsResponse setNextPageToken(String nextPageToken) {
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
    ListDatabaseEndpointsResponse that = (ListDatabaseEndpointsResponse) o;
    return Objects.equals(databaseEndpoints, that.databaseEndpoints)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseEndpoints, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabaseEndpointsResponse.class)
        .add("databaseEndpoints", databaseEndpoints)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
