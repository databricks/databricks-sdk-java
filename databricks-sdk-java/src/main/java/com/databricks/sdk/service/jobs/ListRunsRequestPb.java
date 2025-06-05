// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List job runs */
@Generated
class ListRunsRequestPb {
  @JsonIgnore
  @QueryParam("active_only")
  private Boolean activeOnly;

  @JsonIgnore
  @QueryParam("completed_only")
  private Boolean completedOnly;

  @JsonIgnore
  @QueryParam("expand_tasks")
  private Boolean expandTasks;

  @JsonIgnore
  @QueryParam("job_id")
  private Long jobId;

  @JsonIgnore
  @QueryParam("limit")
  private Long limit;

  @JsonIgnore
  @QueryParam("offset")
  private Long offset;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  @JsonIgnore
  @QueryParam("run_type")
  private RunType runType;

  @JsonIgnore
  @QueryParam("start_time_from")
  private Long startTimeFrom;

  @JsonIgnore
  @QueryParam("start_time_to")
  private Long startTimeTo;

  public ListRunsRequestPb setActiveOnly(Boolean activeOnly) {
    this.activeOnly = activeOnly;
    return this;
  }

  public Boolean getActiveOnly() {
    return activeOnly;
  }

  public ListRunsRequestPb setCompletedOnly(Boolean completedOnly) {
    this.completedOnly = completedOnly;
    return this;
  }

  public Boolean getCompletedOnly() {
    return completedOnly;
  }

  public ListRunsRequestPb setExpandTasks(Boolean expandTasks) {
    this.expandTasks = expandTasks;
    return this;
  }

  public Boolean getExpandTasks() {
    return expandTasks;
  }

  public ListRunsRequestPb setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public ListRunsRequestPb setLimit(Long limit) {
    this.limit = limit;
    return this;
  }

  public Long getLimit() {
    return limit;
  }

  public ListRunsRequestPb setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  public Long getOffset() {
    return offset;
  }

  public ListRunsRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListRunsRequestPb setRunType(RunType runType) {
    this.runType = runType;
    return this;
  }

  public RunType getRunType() {
    return runType;
  }

  public ListRunsRequestPb setStartTimeFrom(Long startTimeFrom) {
    this.startTimeFrom = startTimeFrom;
    return this;
  }

  public Long getStartTimeFrom() {
    return startTimeFrom;
  }

  public ListRunsRequestPb setStartTimeTo(Long startTimeTo) {
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
    ListRunsRequestPb that = (ListRunsRequestPb) o;
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
    return new ToStringer(ListRunsRequestPb.class)
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
