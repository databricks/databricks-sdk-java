// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListResourcesRequest {
  /**
   * The maximum number of resources to return. The service may return fewer than this value. If
   * unspecified, at most 50 resources will be returned. The maximum value is 1000; values above
   * 1000 will be coerced to 1000.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous {@code ListResources} call. Provide this to retrieve the
   * subsequent page.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** The parent deployment. Format: deployments/{deployment_id} */
  @JsonIgnore private String parent;

  public ListResourcesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListResourcesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListResourcesRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListResourcesRequest that = (ListResourcesRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(ListResourcesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
