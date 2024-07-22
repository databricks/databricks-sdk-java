// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListVisualizationsForQueryResponse {
  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("results")
  private Collection<Visualization> results;

  public ListVisualizationsForQueryResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListVisualizationsForQueryResponse setResults(Collection<Visualization> results) {
    this.results = results;
    return this;
  }

  public Collection<Visualization> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListVisualizationsForQueryResponse that = (ListVisualizationsForQueryResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ListVisualizationsForQueryResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("results", results)
        .toString();
  }
}
