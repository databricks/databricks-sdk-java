// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListQueryObjectsResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("results")
  private Collection<ListQueryObjectsResponseQuery> results;

  public ListQueryObjectsResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListQueryObjectsResponsePb setResults(Collection<ListQueryObjectsResponseQuery> results) {
    this.results = results;
    return this;
  }

  public Collection<ListQueryObjectsResponseQuery> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListQueryObjectsResponsePb that = (ListQueryObjectsResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ListQueryObjectsResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("results", results)
        .toString();
  }
}
