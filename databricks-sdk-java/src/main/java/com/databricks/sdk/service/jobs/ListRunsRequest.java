// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List job runs */
@Generated
public class ListRunsRequest {
  /**
   * If active_only is `true`, only active runs are included in the results; otherwise, lists both
   * active and completed runs. An active run is a run in the `QUEUED`, `PENDING`, `RUNNING`, or
   * `TERMINATING`. This field cannot be `true` when completed_only is `true`.
   */
  @JsonIgnore
  @QueryParam("active_only")
  private Boolean activeOnly;

  /**
   * If completed_only is `true`, only completed runs are included in the results; otherwise, lists
   * both active and completed runs. This field cannot be `true` when active_only is `true`.
   */
  @JsonIgnore
  @QueryParam("completed_only")
  private Boolean completedOnly;

  /**
   * Whether to include task and cluster details in the response. Note that only the first 100
   * elements will be shown. Use :method:jobs/getrun to paginate through all tasks and clusters.
   */
  @JsonIgnore
  @QueryParam("expand_tasks")
  private Boolean expandTasks;

  /** The job for which to list runs. If omitted, the Jobs service lists runs from all jobs. */
  @JsonIgnore
  @QueryParam("job_id")
  private Long jobId;

  /**
   * The number of runs to return. This value must be greater than 0 and less than 25. The default
   * value is 20. If a request specifies a limit of 0, the service instead uses the maximum limit.
   */
  @JsonIgnore
  @QueryParam("limit")
  private Long limit;

  /**
   * The offset of the first run to return, relative to the most recent run. Deprecated since June
   * 2023. Use `page_token` to iterate through the pages instead.
   */
  @JsonIgnore
  @QueryParam("offset")
  private Long offset;

  /**
   * Use `next_page_token` or `prev_page_token` returned from the previous request to list the next
   * or previous page of runs respectively.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** The type of runs to return. For a description of run types, see :method:jobs/getRun. */
  @JsonIgnore
  @QueryParam("run_type")
  private RunType runType;

  /**
   * Show runs that started _at or after_ this value. The value must be a UTC timestamp in
   * milliseconds. Can be combined with _start_time_to_ to filter by a time range.
   */
  @JsonIgnore
  @QueryParam("start_time_from")
  private Long startTimeFrom;

  /**
   * Show runs that started _at or before_ this value. The value must be a UTC timestamp in
   * milliseconds. Can be combined with _start_time_from_ to filter by a time range.
   */
  @JsonIgnore
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

  public ListRunsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListRunsRequest setRunType(RunType runType) {
    this.runType = runType;
    return this;
  }

  public RunType getRunType() {
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
        && Objects.equals(pageToken, that.pageToken)
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
        pageToken,
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
        .add("pageToken", pageToken)
        .add("runType", runType)
        .add("startTimeFrom", startTimeFrom)
        .add("startTimeTo", startTimeTo)
        .toString();
  }
}
