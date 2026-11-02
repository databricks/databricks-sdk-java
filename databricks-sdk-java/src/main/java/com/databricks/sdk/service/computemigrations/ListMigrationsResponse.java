// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response containing a paginated list of migrations matching the request filters. */
@Generated
public class ListMigrationsResponse {
  /** The migrations matching the request filters. */
  @JsonProperty("migrations")
  private Collection<Migration> migrations;

  /** Token for the next page. Omitted if there are no more results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListMigrationsResponse setMigrations(Collection<Migration> migrations) {
    this.migrations = migrations;
    return this;
  }

  public Collection<Migration> getMigrations() {
    return migrations;
  }

  public ListMigrationsResponse setNextPageToken(String nextPageToken) {
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
    ListMigrationsResponse that = (ListMigrationsResponse) o;
    return Objects.equals(migrations, that.migrations)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migrations, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListMigrationsResponse.class)
        .add("migrations", migrations)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
