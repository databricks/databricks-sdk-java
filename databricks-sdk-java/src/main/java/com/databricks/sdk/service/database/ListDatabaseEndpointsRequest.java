// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListDatabaseEndpointsRequest {
  /** */
  @JsonIgnore private String branchId;

  /** Upper bound for items returned. If specified must be at least 10. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * Pagination token to go to the next page of Database Endpoints. Requests first page if absent.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** */
  @JsonIgnore private String projectId;

  public ListDatabaseEndpointsRequest setBranchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

  public String getBranchId() {
    return branchId;
  }

  public ListDatabaseEndpointsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDatabaseEndpointsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListDatabaseEndpointsRequest setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDatabaseEndpointsRequest that = (ListDatabaseEndpointsRequest) o;
    return Objects.equals(branchId, that.branchId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(projectId, that.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, pageSize, pageToken, projectId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabaseEndpointsRequest.class)
        .add("branchId", branchId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("projectId", projectId)
        .toString();
  }
}
