// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GenieListEvalRunsResponse {
  /** List of evaluation runs for a space on provided page token and page size */
  @JsonProperty("eval_runs")
  private Collection<GenieEvalRunResponse> evalRuns;

  /** The token to use for retrieving the next page of results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public GenieListEvalRunsResponse setEvalRuns(Collection<GenieEvalRunResponse> evalRuns) {
    this.evalRuns = evalRuns;
    return this;
  }

  public Collection<GenieEvalRunResponse> getEvalRuns() {
    return evalRuns;
  }

  public GenieListEvalRunsResponse setNextPageToken(String nextPageToken) {
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
    GenieListEvalRunsResponse that = (GenieListEvalRunsResponse) o;
    return Objects.equals(evalRuns, that.evalRuns)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evalRuns, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieListEvalRunsResponse.class)
        .add("evalRuns", evalRuns)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
