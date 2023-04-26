// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List all jobs
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListJobsRequest {
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

  /**
   * <p>Setter for the field <code>expandTasks</code>.</p>
   *
   * @param expandTasks a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.ListJobsRequest} object
   */
  public ListJobsRequest setExpandTasks(Boolean expandTasks) {
    this.expandTasks = expandTasks;
    return this;
  }

  /**
   * <p>Getter for the field <code>expandTasks</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getExpandTasks() {
    return expandTasks;
  }

  /**
   * <p>Setter for the field <code>limit</code>.</p>
   *
   * @param limit a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.ListJobsRequest} object
   */
  public ListJobsRequest setLimit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>Getter for the field <code>limit</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.ListJobsRequest} object
   */
  public ListJobsRequest setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>offset</code>.</p>
   *
   * @param offset a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.ListJobsRequest} object
   */
  public ListJobsRequest setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <p>Getter for the field <code>offset</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getOffset() {
    return offset;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListJobsRequest that = (ListJobsRequest) o;
    return Objects.equals(expandTasks, that.expandTasks)
        && Objects.equals(limit, that.limit)
        && Objects.equals(name, that.name)
        && Objects.equals(offset, that.offset);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(expandTasks, limit, name, offset);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListJobsRequest.class)
        .add("expandTasks", expandTasks)
        .add("limit", limit)
        .add("name", name)
        .add("offset", offset)
        .toString();
  }
}
