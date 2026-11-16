// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListAppDeploymentScanFindingsRequest {
  /** Upper bound for the number of findings returned. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Pagination token to request the next page. Requests the first page if absent. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * The parent deployment whose findings to list, in the form
   * `apps/{app}/deployments/{deployment}`.
   */
  @JsonIgnore private String parent;

  public ListAppDeploymentScanFindingsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListAppDeploymentScanFindingsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListAppDeploymentScanFindingsRequest setParent(String parent) {
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
    ListAppDeploymentScanFindingsRequest that = (ListAppDeploymentScanFindingsRequest) o;
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
    return new ToStringer(ListAppDeploymentScanFindingsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
