// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListFeaturesResponse {
  /** List of features. */
  @JsonProperty("features")
  private Collection<Feature> features;

  /** Pagination token to request the next page of results for this query. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListFeaturesResponse setFeatures(Collection<Feature> features) {
    this.features = features;
    return this;
  }

  public Collection<Feature> getFeatures() {
    return features;
  }

  public ListFeaturesResponse setNextPageToken(String nextPageToken) {
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
    ListFeaturesResponse that = (ListFeaturesResponse) o;
    return Objects.equals(features, that.features)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(features, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFeaturesResponse.class)
        .add("features", features)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
