// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>SearchRunsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SearchRunsResponse {
  /** Token for the next page of runs. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Runs that match the search criteria. */
  @JsonProperty("runs")
  private Collection<Run> runs;

  /**
   * <p>Setter for the field <code>nextPageToken</code>.</p>
   *
   * @param nextPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.SearchRunsResponse} object
   */
  public SearchRunsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>nextPageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * <p>Setter for the field <code>runs</code>.</p>
   *
   * @param runs a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.SearchRunsResponse} object
   */
  public SearchRunsResponse setRuns(Collection<Run> runs) {
    this.runs = runs;
    return this;
  }

  /**
   * <p>Getter for the field <code>runs</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Run> getRuns() {
    return runs;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchRunsResponse that = (SearchRunsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(runs, that.runs);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, runs);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SearchRunsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("runs", runs)
        .toString();
  }
}
