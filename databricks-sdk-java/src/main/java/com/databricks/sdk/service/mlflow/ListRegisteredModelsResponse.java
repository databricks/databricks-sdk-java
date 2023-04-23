// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListRegisteredModelsResponse {
  /** Pagination token to request next page of models for the same query. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("registered_models")
  private Collection<RegisteredModel> registeredModels;

  public ListRegisteredModelsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRegisteredModelsResponse setRegisteredModels(
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
    ListRegisteredModelsResponse that = (ListRegisteredModelsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(registeredModels, that.registeredModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, registeredModels);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRegisteredModelsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("registeredModels", registeredModels)
        .toString();
  }
}
