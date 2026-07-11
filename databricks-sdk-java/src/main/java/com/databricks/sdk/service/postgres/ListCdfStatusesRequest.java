// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListCdfStatusesRequest {
  /** Maximum number of CdfStatuses to return. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Pagination token returned by a previous ListCdfStatuses call. Empty on the first page. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * The parent CdfConfig to list CdfStatuses for. Format:
   * projects/{project}/branches/{branch}/databases/{database}/cdf-configs/{cdf_config}
   */
  @JsonIgnore private String parent;

  public ListCdfStatusesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListCdfStatusesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListCdfStatusesRequest setParent(String parent) {
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
    ListCdfStatusesRequest that = (ListCdfStatusesRequest) o;
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
    return new ToStringer(ListCdfStatusesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
