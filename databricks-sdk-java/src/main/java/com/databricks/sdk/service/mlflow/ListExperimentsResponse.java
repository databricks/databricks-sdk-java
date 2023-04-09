// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListExperimentsResponse {
  /** Paginated Experiments beginning with the first item on the requested page. */
  @JsonProperty("experiments")
  private Collection<Experiment> experiments;

  /**
   * Token that can be used to retrieve the next page of experiments. Empty token means no more
   * experiment is available for retrieval.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListExperimentsResponse setExperiments(Collection<Experiment> experiments) {
    this.experiments = experiments;
    return this;
  }

  public Collection<Experiment> getExperiments() {
    return experiments;
  }

  public ListExperimentsResponse setNextPageToken(String nextPageToken) {
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
    ListExperimentsResponse that = (ListExperimentsResponse) o;
    return Objects.equals(experiments, that.experiments)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experiments, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExperimentsResponse.class)
        .add("experiments", experiments)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
