// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response message for ListFeatureTag. */
@Generated
public class ListFeatureTagsResponse {
  /** */
  @JsonProperty("feature_tags")
  private Collection<FeatureTag> featureTags;

  /** Pagination token to request the next page of results for this query. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListFeatureTagsResponse setFeatureTags(Collection<FeatureTag> featureTags) {
    this.featureTags = featureTags;
    return this;
  }

  public Collection<FeatureTag> getFeatureTags() {
    return featureTags;
  }

  public ListFeatureTagsResponse setNextPageToken(String nextPageToken) {
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
    ListFeatureTagsResponse that = (ListFeatureTagsResponse) o;
    return Objects.equals(featureTags, that.featureTags)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureTags, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFeatureTagsResponse.class)
        .add("featureTags", featureTags)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
