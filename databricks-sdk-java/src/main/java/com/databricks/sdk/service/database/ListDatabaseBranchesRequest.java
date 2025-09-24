// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListDatabaseBranchesRequest {
  /** Upper bound for items returned. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * Pagination token to go to the next page of Database Branches. Requests first page if absent.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** */
  @JsonIgnore private String projectId;

  public ListDatabaseBranchesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDatabaseBranchesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListDatabaseBranchesRequest setProjectId(String projectId) {
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
    ListDatabaseBranchesRequest that = (ListDatabaseBranchesRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(projectId, that.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, projectId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabaseBranchesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("projectId", projectId)
        .toString();
  }
}
