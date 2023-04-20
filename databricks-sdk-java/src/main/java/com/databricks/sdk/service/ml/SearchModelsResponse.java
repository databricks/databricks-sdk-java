// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class SearchModelsResponse {
  /** Pagination token to request the next page of models. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Registered Models that match the search criteria. */
  @JsonProperty("registered_models")
  private Collection<Model> registeredModels;

  public SearchModelsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public SearchModelsResponse setRegisteredModels(Collection<Model> registeredModels) {
    this.registeredModels = registeredModels;
    return this;
  }

  public Collection<Model> getRegisteredModels() {
    return registeredModels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchModelsResponse that = (SearchModelsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(registeredModels, that.registeredModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, registeredModels);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchModelsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("registeredModels", registeredModels)
        .toString();
  }
}
