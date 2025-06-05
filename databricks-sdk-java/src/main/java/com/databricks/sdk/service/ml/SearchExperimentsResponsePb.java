// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class SearchExperimentsResponsePb {
  @JsonProperty("experiments")
  private Collection<Experiment> experiments;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public SearchExperimentsResponsePb setExperiments(Collection<Experiment> experiments) {
    this.experiments = experiments;
    return this;
  }

  public Collection<Experiment> getExperiments() {
    return experiments;
  }

  public SearchExperimentsResponsePb setNextPageToken(String nextPageToken) {
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
    SearchExperimentsResponsePb that = (SearchExperimentsResponsePb) o;
    return Objects.equals(experiments, that.experiments)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experiments, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchExperimentsResponsePb.class)
        .add("experiments", experiments)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
