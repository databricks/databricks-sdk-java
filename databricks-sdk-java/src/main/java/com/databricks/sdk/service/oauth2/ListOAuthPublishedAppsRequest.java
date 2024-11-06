// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get all the published OAuth apps */
@Generated
public class ListOAuthPublishedAppsRequest {
  /** The max number of OAuth published apps to return in one page. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** A token that can be used to get the next page of results. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListOAuthPublishedAppsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListOAuthPublishedAppsRequest setPageToken(String pageToken) {
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
    ListOAuthPublishedAppsRequest that = (ListOAuthPublishedAppsRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListOAuthPublishedAppsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
