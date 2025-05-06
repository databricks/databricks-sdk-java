// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListAlertsV2Response {
  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("results")
  private Collection<AlertV2> results;

  public ListAlertsV2Response setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListAlertsV2Response setResults(Collection<AlertV2> results) {
    this.results = results;
    return this;
  }

  public Collection<AlertV2> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAlertsV2Response that = (ListAlertsV2Response) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAlertsV2Response.class)
        .add("nextPageToken", nextPageToken)
        .add("results", results)
        .toString();
  }
}
