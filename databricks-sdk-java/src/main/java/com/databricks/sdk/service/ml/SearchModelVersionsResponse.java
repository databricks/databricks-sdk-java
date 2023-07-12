// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SearchModelVersionsResponse {
  /** Models that match the search criteria */
  @JsonProperty("model_versions")
  private Collection<ModelVersion> modelVersions;

  /** Pagination token to request next page of models for the same search query. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public SearchModelVersionsResponse setModelVersions(Collection<ModelVersion> modelVersions) {
    this.modelVersions = modelVersions;
    return this;
  }

  public Collection<ModelVersion> getModelVersions() {
    return modelVersions;
  }

  public SearchModelVersionsResponse setNextPageToken(String nextPageToken) {
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
    SearchModelVersionsResponse that = (SearchModelVersionsResponse) o;
    return Objects.equals(modelVersions, that.modelVersions)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelVersions, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchModelVersionsResponse.class)
        .add("modelVersions", modelVersions)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
