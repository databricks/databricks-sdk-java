// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * List runs for a job
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListRunsRequest {
  /**
   * If active_only is `true`, only active runs are included in the results; otherwise, lists both
   * active and completed runs. An active run is a run in the `PENDING`, `RUNNING`, or
   * `TERMINATING`. This field cannot be `true` when completed_only is `true`.
   */
  @QueryParam("active_only")
  private Boolean activeOnly;

  /**
   * If completed_only is `true`, only completed runs are included in the results; otherwise, lists
   * both active and completed runs. This field cannot be `true` when active_only is `true`.
   */
  @QueryParam("completed_only")
  private Boolean completedOnly;

  /** Whether to include task and cluster details in the response. */
  @QueryParam("expand_tasks")
  private Boolean expandTasks;

  /** The job for which to list runs. If omitted, the Jobs service lists runs from all jobs. */
  @QueryParam("job_id")
  private Long jobId;

  /**
   * The number of runs to return. This value must be greater than 0 and less than 25. The default
   * value is 25. If a request specifies a limit of 0, the service instead uses the maximum limit.
   */
  @QueryParam("limit")
  private Long limit;

  /** The offset of the first run to return, relative to the most recent run. */
  @QueryParam("offset")
  private Long offset;

  /** The type of runs to return. For a description of run types, see :method:jobs/getRun. */
  @QueryParam("run_type")
  private ListRunsRunType runType;

  /**
   * Show runs that started _at or after_ this value. The value must be a UTC timestamp in
   * milliseconds. Can be combined with _start_time_to_ to filter by a time range.
   */
  @QueryParam("start_time_from")
  private Long startTimeFrom;

  /**
   * Show runs that started _at or before_ this value. The value must be a UTC timestamp in
   * milliseconds. Can be combined with _start_time_from_ to filter by a time range.
   */
  @QueryParam("start_time_to")
  private Long startTimeTo;

  /**
   * <p>Setter for the field <code>activeOnly</code>.</p>
   *
   * @param activeOnly a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.ListRunsRequest} object
   */
  public ListRunsRequest setActiveOnly(Boolean activeOnly) {
    this.activeOnly = activeOnly;
    return this;
  }

  /**
   * <p>Getter for the field <code>activeOnly</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getActiveOnly() {
    return activeOnly;
  }

  /**
   * <p>Setter for the field <code>completedOnly</code>.</p>
   *
   * @param completedOnly a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.ListRunsRequest} object
   */
  public ListRunsRequest setCompletedOnly(Boolean completedOnly) {
    this.completedOnly = completedOnly;
    return this;
  }

  /**
   * <p>Getter for the field <code>completedOnly</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getCompletedOnly() {
    return completedOnly;
  }

  /**
   * <p>Setter for the field <code>expandTasks</code>.</p>
   *
   * @param expandTasks a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.ListRunsRequest} object
   */
  public ListRunsRequest setExpandTasks(Boolean expandTasks) {
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
   * <p>Setter for the field <code>jobId</code>.</p>
   *
   * @param jobId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.ListRunsRequest} object
   */
  public ListRunsRequest setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * <p>Getter for the field <code>jobId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getJobId() {
    return jobId;
  }

  /**
   * <p>Setter for the field <code>limit</code>.</p>
   *
   * @param limit a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.ListRunsRequest} object
   */
  public ListRunsRequest setLimit(Long limit) {
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
   * <p>Setter for the field <code>offset</code>.</p>
   *
   * @param offset a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.ListRunsRequest} object
   */
  public ListRunsRequest setOffset(Long offset) {
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

  /**
   * <p>Setter for the field <code>runType</code>.</p>
   *
   * @param runType a {@link com.databricks.sdk.service.jobs.ListRunsRunType} object
   * @return a {@link com.databricks.sdk.service.jobs.ListRunsRequest} object
   */
  public ListRunsRequest setRunType(ListRunsRunType runType) {
    this.runType = runType;
    return this;
  }

  /**
   * <p>Getter for the field <code>runType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.ListRunsRunType} object
   */
  public ListRunsRunType getRunType() {
    return runType;
  }

  /**
   * <p>Setter for the field <code>startTimeFrom</code>.</p>
   *
   * @param startTimeFrom a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.ListRunsRequest} object
   */
  public ListRunsRequest setStartTimeFrom(Long startTimeFrom) {
    this.startTimeFrom = startTimeFrom;
    return this;
  }

  /**
   * <p>Getter for the field <code>startTimeFrom</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartTimeFrom() {
    return startTimeFrom;
  }

  /**
   * <p>Setter for the field <code>startTimeTo</code>.</p>
   *
   * @param startTimeTo a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.ListRunsRequest} object
   */
  public ListRunsRequest setStartTimeTo(Long startTimeTo) {
    this.startTimeTo = startTimeTo;
    return this;
  }

  /**
   * <p>Getter for the field <code>startTimeTo</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartTimeTo() {
    return startTimeTo;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRunsRequest that = (ListRunsRequest) o;
    return Objects.equals(activeOnly, that.activeOnly)
        && Objects.equals(completedOnly, that.completedOnly)
        && Objects.equals(expandTasks, that.expandTasks)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(limit, that.limit)
        && Objects.equals(offset, that.offset)
        && Objects.equals(runType, that.runType)
        && Objects.equals(startTimeFrom, that.startTimeFrom)
        && Objects.equals(startTimeTo, that.startTimeTo);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        activeOnly,
        completedOnly,
        expandTasks,
        jobId,
        limit,
        offset,
        runType,
        startTimeFrom,
        startTimeTo);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListRunsRequest.class)
        .add("activeOnly", activeOnly)
        .add("completedOnly", completedOnly)
        .add("expandTasks", expandTasks)
        .add("jobId", jobId)
        .add("limit", limit)
        .add("offset", offset)
        .add("runType", runType)
        .add("startTimeFrom", startTimeFrom)
        .add("startTimeTo", startTimeTo)
        .toString();
  }
}
