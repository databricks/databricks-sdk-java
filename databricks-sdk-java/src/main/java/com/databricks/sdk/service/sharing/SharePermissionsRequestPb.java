// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get recipient share permissions */
@Generated
class SharePermissionsRequestPb {
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  @JsonIgnore private String name;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public SharePermissionsRequestPb setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public SharePermissionsRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SharePermissionsRequestPb setPageToken(String pageToken) {
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
    SharePermissionsRequestPb that = (SharePermissionsRequestPb) o;
    return Objects.equals(maxResults, that.maxResults)
        && Objects.equals(name, that.name)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, name, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(SharePermissionsRequestPb.class)
        .add("maxResults", maxResults)
        .add("name", name)
        .add("pageToken", pageToken)
        .toString();
  }
}
