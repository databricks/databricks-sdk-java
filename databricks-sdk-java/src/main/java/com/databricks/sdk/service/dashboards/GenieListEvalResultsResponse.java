// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GenieListEvalResultsResponse {
  /** List of evaluation results for the specified run. */
  @JsonProperty("eval_results")
  private Collection<GenieEvalResult> evalResults;

  /** The token to use for retrieving the next page of results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public GenieListEvalResultsResponse setEvalResults(Collection<GenieEvalResult> evalResults) {
    this.evalResults = evalResults;
    return this;
  }

  public Collection<GenieEvalResult> getEvalResults() {
    return evalResults;
  }

  public GenieListEvalResultsResponse setNextPageToken(String nextPageToken) {
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
    GenieListEvalResultsResponse that = (GenieListEvalResultsResponse) o;
    return Objects.equals(evalResults, that.evalResults)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evalResults, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieListEvalResultsResponse.class)
        .add("evalResults", evalResults)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
