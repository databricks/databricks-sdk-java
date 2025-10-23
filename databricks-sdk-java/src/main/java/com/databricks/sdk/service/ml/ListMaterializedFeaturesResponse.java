// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListMaterializedFeaturesResponse {
  /** List of materialized features. */
  @JsonProperty("materialized_features")
  private Collection<MaterializedFeature> materializedFeatures;

  /** Pagination token to request the next page of results for this query. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListMaterializedFeaturesResponse setMaterializedFeatures(
      Collection<MaterializedFeature> materializedFeatures) {
    this.materializedFeatures = materializedFeatures;
    return this;
  }

  public Collection<MaterializedFeature> getMaterializedFeatures() {
    return materializedFeatures;
  }

  public ListMaterializedFeaturesResponse setNextPageToken(String nextPageToken) {
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
    ListMaterializedFeaturesResponse that = (ListMaterializedFeaturesResponse) o;
    return Objects.equals(materializedFeatures, that.materializedFeatures)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materializedFeatures, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListMaterializedFeaturesResponse.class)
        .add("materializedFeatures", materializedFeatures)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
