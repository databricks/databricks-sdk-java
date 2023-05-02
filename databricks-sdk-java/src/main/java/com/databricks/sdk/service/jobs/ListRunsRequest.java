// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List runs for a job */
@Generated
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

  public ListRunsRequest setActiveOnly(Boolean activeOnly) {
    this.activeOnly = activeOnly;
    return this;
  }

  public Boolean getActiveOnly() {
    return activeOnly;
  }

  public ListRunsRequest setCompletedOnly(Boolean completedOnly) {
    this.completedOnly = completedOnly;
    return this;
  }

  public Boolean getCompletedOnly() {
    return completedOnly;
  }

  public ListRunsRequest setExpandTasks(Boolean expandTasks) {
    this.expandTasks = expandTasks;
    return this;
  }

  public Boolean getExpandTasks() {
    return expandTasks;
  }

  public ListRunsRequest setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public ListRunsRequest setLimit(Long limit) {
    this.limit = limit;
    return this;
  }

  public Long getLimit() {
    return limit;
  }

  public ListRunsRequest setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  public Long getOffset() {
    return offset;
  }

  public ListRunsRequest setRunType(ListRunsRunType runType) {
    this.runType = runType;
    return this;
  }

  public ListRunsRunType getRunType() {
    return runType;
  }

  public ListRunsRequest setStartTimeFrom(Long startTimeFrom) {
    this.startTimeFrom = startTimeFrom;
    return this;
  }

  public Long getStartTimeFrom() {
    return startTimeFrom;
  }

  public ListRunsRequest setStartTimeTo(Long startTimeTo) {
    this.startTimeTo = startTimeTo;
    return this;
  }

  public Long getStartTimeTo() {
    return startTimeTo;
  }

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
