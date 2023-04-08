// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListJobsResponse {
  /** */
  @JsonProperty("has_more")
  private Boolean hasMore;

  /** The list of jobs. */
  @JsonProperty("jobs")
  private java.util.List<BaseJob> jobs;

  public ListJobsResponse setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public Boolean getHasMore() {
    return hasMore;
  }

  public ListJobsResponse setJobs(java.util.List<BaseJob> jobs) {
    this.jobs = jobs;
    return this;
  }

  public java.util.List<BaseJob> getJobs() {
    return jobs;
  }
}
