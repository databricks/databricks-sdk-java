// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response to list migrations. */
@Generated
public class ListMigrationsResponse {
  /** Migrations visible to the caller. */
  @JsonProperty("migrations")
  private Collection<Migration> migrations;

  /** A token for retrieving the next page. Empty when there are no more results. */
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
