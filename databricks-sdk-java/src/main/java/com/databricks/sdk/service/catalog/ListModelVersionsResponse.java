// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListModelVersionsResponse {
  /** */
  @JsonProperty("model_versions")
  private Collection<ModelVersionInfo> modelVersions;

  /** Token to retrieve the next page of results */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListModelVersionsResponse setModelVersions(Collection<ModelVersionInfo> modelVersions) {
    this.modelVersions = modelVersions;
    return this;
  }

  public Collection<ModelVersionInfo> getModelVersions() {
    return modelVersions;
  }

  public ListModelVersionsResponse setNextPageToken(String nextPageToken) {
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
    ListModelVersionsResponse that = (ListModelVersionsResponse) o;
    return Objects.equals(modelVersions, that.modelVersions)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelVersions, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListModelVersionsResponse.class)
        .add("modelVersions", modelVersions)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
