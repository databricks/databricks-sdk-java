// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for ListIndexes carrying the page of indexes and an optional continuation token. */
@Generated
public class ListIndexesResponse {
  /**
   * The indexes on the endpoint. The field is named {@code indexes} (not the irregular plural
   * {@code indices}) to satisfy core::0132, which derives the response field name from the
   * ListIndexes method. core::0158::response-plural-first-field independently computes the resource
   * plural as {@code indices} and is satisfied via a scoped field exception below.
   */
  @JsonProperty("indexes")
  private Collection<Index> indexes;

  /**
   * A token that can be used to get the next page of results. Empty when there are no more results.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListIndexesResponse setIndexes(Collection<Index> indexes) {
    this.indexes = indexes;
    return this;
  }

  public Collection<Index> getIndexes() {
    return indexes;
  }

  public ListIndexesResponse setNextPageToken(String nextPageToken) {
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
    ListIndexesResponse that = (ListIndexesResponse) o;
    return Objects.equals(indexes, that.indexes)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexes, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListIndexesResponse.class)
        .add("indexes", indexes)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
