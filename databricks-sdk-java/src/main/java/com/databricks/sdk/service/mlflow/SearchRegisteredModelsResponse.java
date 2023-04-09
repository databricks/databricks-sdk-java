// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class SearchRegisteredModelsResponse {
  /** Pagination token to request the next page of models. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Registered Models that match the search criteria. */
  @JsonProperty("registered_models")
  private Collection<RegisteredModel> registeredModels;

  public SearchRegisteredModelsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public SearchRegisteredModelsResponse setRegisteredModels(
      Collection<RegisteredModel> registeredModels) {
    this.registeredModels = registeredModels;
    return this;
  }

  public Collection<RegisteredModel> getRegisteredModels() {
    return registeredModels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchRegisteredModelsResponse that = (SearchRegisteredModelsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(registeredModels, that.registeredModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, registeredModels);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchRegisteredModelsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("registeredModels", registeredModels)
        .toString();
  }
}
