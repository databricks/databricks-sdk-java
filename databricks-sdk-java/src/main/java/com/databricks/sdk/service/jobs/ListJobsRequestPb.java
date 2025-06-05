// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List jobs */
@Generated
class ListJobsRequestPb {
  @JsonIgnore
  @QueryParam("expand_tasks")
  private Boolean expandTasks;

  @JsonIgnore
  @QueryParam("limit")
  private Long limit;

  @JsonIgnore
  @QueryParam("name")
  private String name;

  @JsonIgnore
  @QueryParam("offset")
  private Long offset;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListJobsRequestPb setExpandTasks(Boolean expandTasks) {
    this.expandTasks = expandTasks;
    return this;
  }

  public Boolean getExpandTasks() {
    return expandTasks;
  }

  public ListJobsRequestPb setLimit(Long limit) {
    this.limit = limit;
    return this;
  }

  public Long getLimit() {
    return limit;
  }

  public ListJobsRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ListJobsRequestPb setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  public Long getOffset() {
    return offset;
  }

  public ListJobsRequestPb setPageToken(String pageToken) {
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
    ListJobsRequestPb that = (ListJobsRequestPb) o;
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
    return new ToStringer(ListJobsRequestPb.class)
        .add("expandTasks", expandTasks)
        .add("limit", limit)
        .add("name", name)
        .add("offset", offset)
        .add("pageToken", pageToken)
        .toString();
  }
}
