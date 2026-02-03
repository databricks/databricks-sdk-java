// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListDefaultWarehouseOverridesRequest {
  /**
   * The maximum number of overrides to return. The service may return fewer than this value. If
   * unspecified, at most 100 overrides will be returned. The maximum value is 1000; values above
   * 1000 will be coerced to 1000.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous `ListDefaultWarehouseOverrides` call. Provide this to
   * retrieve the subsequent page.
   *
   * <p>When paginating, all other parameters provided to `ListDefaultWarehouseOverrides` must match
   * the call that provided the page token.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListDefaultWarehouseOverridesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDefaultWarehouseOverridesRequest setPageToken(String pageToken) {
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
    ListDefaultWarehouseOverridesRequest that = (ListDefaultWarehouseOverridesRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDefaultWarehouseOverridesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
