// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListDatabasesResponse {
  /** List of databases. */
  @JsonProperty("databases")
  private Collection<Database> databases;

  /** Pagination token to request the next page of databases. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDatabasesResponse setDatabases(Collection<Database> databases) {
    this.databases = databases;
    return this;
  }

  public Collection<Database> getDatabases() {
    return databases;
  }

  public ListDatabasesResponse setNextPageToken(String nextPageToken) {
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
    ListDatabasesResponse that = (ListDatabasesResponse) o;
    return Objects.equals(databases, that.databases)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databases, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabasesResponse.class)
        .add("databases", databases)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
