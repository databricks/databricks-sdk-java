// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List jobs */
@Generated
public class ListJobsRequest {
  /** Whether to include task and cluster details in the response. */
  @QueryParam("expand_tasks")
  private Boolean expandTasks;

  /**
   * The number of jobs to return. This value must be greater than 0 and less or equal to 100. The
   * default value is 20.
   */
  @QueryParam("limit")
  private Long limit;

  /** A filter on the list based on the exact (case insensitive) job name. */
  @QueryParam("name")
  private String name;

  /**
   * The offset of the first job to return, relative to the most recently created job.
   *
   * <p>Deprecated since June 2023. Use `page_token` to iterate through the pages instead.
   */
  @QueryParam("offset")
  private Long offset;

  /**
   * Use `next_page_token` or `prev_page_token` returned from the previous request to list the next
   * or previous page of jobs respectively.
   */
  @QueryParam("page_token")
  private String pageToken;

  public ListJobsRequest setExpandTasks(Boolean expandTasks) {
    this.expandTasks = expandTasks;
    return this;
  }

  public Boolean getExpandTasks() {
    return expandTasks;
  }

  public ListJobsRequest setLimit(Long limit) {
    this.limit = limit;
    return this;
  }

  public Long getLimit() {
    return limit;
  }

  public ListJobsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ListJobsRequest setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  public Long getOffset() {
    return offset;
  }

  public ListJobsRequest setPageToken(String pageToken) {
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
    ListJobsRequest that = (ListJobsRequest) o;
    return Objects.equals(expandTasks, that.expandTasks)
        && Objects.equals(limit, that.limit)
        && Objects.equals(name, that.name)
        && Objects.equals(offset, that.offset)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expandTasks, limit, name, offset, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListJobsRequest.class)
        .add("expandTasks", expandTasks)
        .add("limit", limit)
        .add("name", name)
        .add("offset", offset)
        .add("pageToken", pageToken)
        .toString();
  }
}
