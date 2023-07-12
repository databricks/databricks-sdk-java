// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListModelsResponse {
  /** Pagination token to request next page of models for the same query. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("registered_models")
  private Collection<Model> registeredModels;

  public ListModelsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListModelsResponse setRegisteredModels(Collection<Model> registeredModels) {
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
    ListModelsResponse that = (ListModelsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(registeredModels, that.registeredModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, registeredModels);
  }

  @Override
  public String toString() {
    return new ToStringer(ListModelsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("registeredModels", registeredModels)
        .toString();
  }
}
