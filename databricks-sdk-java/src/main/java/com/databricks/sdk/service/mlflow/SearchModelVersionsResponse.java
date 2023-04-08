// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchModelVersionsResponse {
  /** Models that match the search criteria */
  @JsonProperty("model_versions")
  private java.util.List<ModelVersion> modelVersions;

  /** Pagination token to request next page of models for the same search query. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public SearchModelVersionsResponse setModelVersions(java.util.List<ModelVersion> modelVersions) {
    this.modelVersions = modelVersions;
    return this;
  }

  public java.util.List<ModelVersion> getModelVersions() {
    return modelVersions;
  }

  public SearchModelVersionsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }
}
