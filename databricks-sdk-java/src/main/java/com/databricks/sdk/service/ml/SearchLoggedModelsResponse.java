// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SearchLoggedModelsResponse {
  /** Logged models that match the search criteria. */
  @JsonProperty("models")
  private Collection<LoggedModel> models;

  /** The token that can be used to retrieve the next page of logged models. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public SearchLoggedModelsResponse setModels(Collection<LoggedModel> models) {
    this.models = models;
    return this;
  }

  public Collection<LoggedModel> getModels() {
    return models;
  }

  public SearchLoggedModelsResponse setNextPageToken(String nextPageToken) {
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
    SearchLoggedModelsResponse that = (SearchLoggedModelsResponse) o;
    return Objects.equals(models, that.models) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchLoggedModelsResponse.class)
        .add("models", models)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
