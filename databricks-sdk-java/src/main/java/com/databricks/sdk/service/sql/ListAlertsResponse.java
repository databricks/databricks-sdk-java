// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListAlertsResponse {
  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("results")
  private Collection<ListAlertsResponseAlert> results;

  public ListAlertsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListAlertsResponse setResults(Collection<ListAlertsResponseAlert> results) {
    this.results = results;
    return this;
  }

  public Collection<ListAlertsResponseAlert> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAlertsResponse that = (ListAlertsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAlertsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("results", results)
        .toString();
  }
}
