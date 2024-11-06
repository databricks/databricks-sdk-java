// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListCatalogsResponse {
  /** An array of catalog information objects. */
  @JsonProperty("catalogs")
  private Collection<CatalogInfo> catalogs;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListCatalogsResponse setCatalogs(Collection<CatalogInfo> catalogs) {
    this.catalogs = catalogs;
    return this;
  }

  public Collection<CatalogInfo> getCatalogs() {
    return catalogs;
  }

  public ListCatalogsResponse setNextPageToken(String nextPageToken) {
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
    ListCatalogsResponse that = (ListCatalogsResponse) o;
    return Objects.equals(catalogs, that.catalogs)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogs, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCatalogsResponse.class)
        .add("catalogs", catalogs)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
