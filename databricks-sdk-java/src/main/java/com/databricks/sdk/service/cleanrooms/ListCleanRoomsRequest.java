// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListCleanRoomsRequest {
  /** Maximum number of clean rooms to return (i.e., the page length). Defaults to 100. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Opaque pagination token to go to next page based on previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListCleanRoomsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListCleanRoomsRequest setPageToken(String pageToken) {
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
    ListCleanRoomsRequest that = (ListCleanRoomsRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
