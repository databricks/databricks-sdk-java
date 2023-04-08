// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchExperimentsResponse {
  /** Experiments that match the search criteria */
  @JsonProperty("experiments")
  private java.util.List<Experiment> experiments;

  /**
   * Token that can be used to retrieve the next page of experiments. An empty token means that no
   * more experiments are available for retrieval.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public SearchExperimentsResponse setExperiments(java.util.List<Experiment> experiments) {
    this.experiments = experiments;
    return this;
  }

  public java.util.List<Experiment> getExperiments() {
    return experiments;
  }

  public SearchExperimentsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }
}
