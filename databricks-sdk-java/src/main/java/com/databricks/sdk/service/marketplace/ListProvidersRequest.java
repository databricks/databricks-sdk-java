// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List providers */
@Generated
public class ListProvidersRequest {
  /** */
  @QueryParam("is_featured")
  private Boolean isFeatured;

  /** */
  @QueryParam("page_size")
  private Long pageSize;

  /** */
  @QueryParam("page_token")
  private String pageToken;

  public ListProvidersRequest setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

  public Boolean getIsFeatured() {
    return isFeatured;
  }

  public ListProvidersRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListProvidersRequest setPageToken(String pageToken) {
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
    ListProvidersRequest that = (ListProvidersRequest) o;
    return Objects.equals(isFeatured, that.isFeatured)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFeatured, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProvidersRequest.class)
        .add("isFeatured", isFeatured)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
