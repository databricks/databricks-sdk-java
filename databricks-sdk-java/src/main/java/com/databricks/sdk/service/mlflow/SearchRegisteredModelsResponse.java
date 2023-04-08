// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchRegisteredModelsResponse {
  /** Pagination token to request the next page of models. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Registered Models that match the search criteria. */
  @JsonProperty("registered_models")
  private java.util.List<RegisteredModel> registeredModels;

  public SearchRegisteredModelsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public SearchRegisteredModelsResponse setRegisteredModels(
      java.util.List<RegisteredModel> registeredModels) {
    this.registeredModels = registeredModels;
    return this;
  }

  public java.util.List<RegisteredModel> getRegisteredModels() {
    return registeredModels;
  }
}
