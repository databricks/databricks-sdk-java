// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class SearchExperimentsResponse {
  /** Experiments that match the search criteria */
  @JsonProperty("experiments")
  private Collection<Experiment> experiments;

  /**
   * Token that can be used to retrieve the next page of experiments. An empty token means that no
   * more experiments are available for retrieval.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public SearchExperimentsResponse setExperiments(Collection<Experiment> experiments) {
    this.experiments = experiments;
    return this;
  }

  public Collection<Experiment> getExperiments() {
    return experiments;
  }

  public SearchExperimentsResponse setNextPageToken(String nextPageToken) {
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
    SearchExperimentsResponse that = (SearchExperimentsResponse) o;
    return Objects.equals(experiments, that.experiments)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experiments, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchExperimentsResponse.class)
        .add("experiments", experiments)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
