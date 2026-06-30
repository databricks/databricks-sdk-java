// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListSyncedDatabaseTablesRequest {
  /** Name of the instance to get synced tables for. */
  @JsonIgnore private String instanceName;

  /** Upper bound for items returned. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * Pagination token to go to the next page of synced database tables. Requests first page if
   * absent.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListSyncedDatabaseTablesRequest setInstanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  public String getInstanceName() {
    return instanceName;
  }

  public ListSyncedDatabaseTablesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListSyncedDatabaseTablesRequest setPageToken(String pageToken) {
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
    ListSyncedDatabaseTablesRequest that = (ListSyncedDatabaseTablesRequest) o;
    return Objects.equals(instanceName, that.instanceName)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceName, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSyncedDatabaseTablesRequest.class)
        .add("instanceName", instanceName)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
