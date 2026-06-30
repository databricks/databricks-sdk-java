// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListMaterializedFeaturesRequest {
  /**
   * Filter by feature name. If specified, only materialized features materialized from this feature
   * will be returned.
   */
  @JsonIgnore
  @QueryParam("feature_name")
  private String featureName;

  /**
   * The maximum number of results to return. Defaults to 100 if not specified. Cannot be greater
   * than 1000.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Pagination token to go to the next page based on a previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListMaterializedFeaturesRequest setFeatureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

  public String getFeatureName() {
    return featureName;
  }

  public ListMaterializedFeaturesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListMaterializedFeaturesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListMaterializedFeaturesRequest that = (ListMaterializedFeaturesRequest) o;
    return Objects.equals(featureName, that.featureName)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListMaterializedFeaturesRequest.class)
        .add("featureName", featureName)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
