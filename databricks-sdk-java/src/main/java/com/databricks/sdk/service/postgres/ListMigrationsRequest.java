// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListMigrationsRequest {
  /**
   * The maximum number of migrations to return. The server default is 100; values above 1000 are
   * capped to 1000.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** A page token from a previous call. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Whether to include soft-deleted migrations in the response. Hard-deleted and already-purged
   * migrations are never returned.
   */
  @JsonIgnore
  @QueryParam("show_deleted")
  private Boolean showDeleted;

  public ListMigrationsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListMigrationsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListMigrationsRequest setShowDeleted(Boolean showDeleted) {
    this.showDeleted = showDeleted;
    return this;
  }

  public Boolean getShowDeleted() {
    return showDeleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListMigrationsRequest that = (ListMigrationsRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(showDeleted, that.showDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, showDeleted);
  }

  @Override
  public String toString() {
    return new ToStringer(ListMigrationsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("showDeleted", showDeleted)
        .toString();
  }
}
