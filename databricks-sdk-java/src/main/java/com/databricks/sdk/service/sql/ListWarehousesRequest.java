// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListWarehousesRequest {
  /** The max number of warehouses to return. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous `ListWarehouses` call. Provide this to retrieve the
   * subsequent page; otherwise the first will be retrieved.
   *
   * <p>When paginating, all other parameters provided to `ListWarehouses` must match the call that
   * provided the page token.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Service Principal which will be used to fetch the list of endpoints. If not specified, SQL
   * Gateway will use the user from the session header.
   */
  @JsonIgnore
  @QueryParam("run_as_user_id")
  private Long runAsUserId;

  public ListWarehousesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListWarehousesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListWarehousesRequest setRunAsUserId(Long runAsUserId) {
    this.runAsUserId = runAsUserId;
    return this;
  }

  public Long getRunAsUserId() {
    return runAsUserId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListWarehousesRequest that = (ListWarehousesRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(runAsUserId, that.runAsUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, runAsUserId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWarehousesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("runAsUserId", runAsUserId)
        .toString();
  }
}
