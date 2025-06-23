// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListFeatureTagsRequest {
  /** */
  @JsonIgnore private String featureName;

  /** The maximum number of results to return. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Pagination token to go to the next page based on a previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** */
  @JsonIgnore private String tableName;

  public ListFeatureTagsRequest setFeatureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

  public String getFeatureName() {
    return featureName;
  }

  public ListFeatureTagsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListFeatureTagsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListFeatureTagsRequest setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListFeatureTagsRequest that = (ListFeatureTagsRequest) o;
    return Objects.equals(featureName, that.featureName)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, pageSize, pageToken, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFeatureTagsRequest.class)
        .add("featureName", featureName)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("tableName", tableName)
        .toString();
  }
}
