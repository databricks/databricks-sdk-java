// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List all jobs */
public class List {
  /** Whether to include task and cluster details in the response. */
  @QueryParam("expand_tasks")
  private Boolean expandTasks;

  /**
   * The number of jobs to return. This value must be greater than 0 and less or equal to 25. The
   * default value is 20.
   */
  @QueryParam("limit")
  private Long limit;

  /** A filter on the list based on the exact (case insensitive) job name. */
  @QueryParam("name")
  private String name;

  /** The offset of the first job to return, relative to the most recently created job. */
  @QueryParam("offset")
  private Long offset;

  public List setExpandTasks(Boolean expandTasks) {
    this.expandTasks = expandTasks;
    return this;
  }

  public Boolean getExpandTasks() {
    return expandTasks;
  }

  public List setLimit(Long limit) {
    this.limit = limit;
    return this;
  }

  public Long getLimit() {
    return limit;
  }

  public List setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public List setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  public Long getOffset() {
    return offset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    List that = (List) o;
    return Objects.equals(expandTasks, that.expandTasks)
        && Objects.equals(limit, that.limit)
        && Objects.equals(name, that.name)
        && Objects.equals(offset, that.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expandTasks, limit, name, offset);
  }

  @Override
  public String toString() {
    return new ToStringer(List.class)
        .add("expandTasks", expandTasks)
        .add("limit", limit)
        .add("name", name)
        .add("offset", offset)
        .toString();
  }
}
