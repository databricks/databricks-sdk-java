// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListDatabaseCatalogsResponse {
  /** */
  @JsonProperty("database_catalogs")
  private Collection<DatabaseCatalog> databaseCatalogs;

  /** Pagination token to request the next page of database catalogs. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDatabaseCatalogsResponse setDatabaseCatalogs(
      Collection<DatabaseCatalog> databaseCatalogs) {
    this.databaseCatalogs = databaseCatalogs;
    return this;
  }

  public Collection<DatabaseCatalog> getDatabaseCatalogs() {
    return databaseCatalogs;
  }

  public ListDatabaseCatalogsResponse setNextPageToken(String nextPageToken) {
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
    ListDatabaseCatalogsResponse that = (ListDatabaseCatalogsResponse) o;
    return Objects.equals(databaseCatalogs, that.databaseCatalogs)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseCatalogs, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabaseCatalogsResponse.class)
        .add("databaseCatalogs", databaseCatalogs)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
