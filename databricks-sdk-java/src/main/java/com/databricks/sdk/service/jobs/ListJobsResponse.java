// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListJobsResponse {
  /** */
  @JsonProperty("has_more")
  private Boolean hasMore;

  /** The list of jobs. */
  @JsonProperty("jobs")
  private Collection<BaseJob> jobs;

  public ListJobsResponse setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public Boolean getHasMore() {
    return hasMore;
  }

  public ListJobsResponse setJobs(Collection<BaseJob> jobs) {
    this.jobs = jobs;
    return this;
  }

  public Collection<BaseJob> getJobs() {
    return jobs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListJobsResponse that = (ListJobsResponse) o;
    return Objects.equals(hasMore, that.hasMore) && Objects.equals(jobs, that.jobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, jobs);
  }

  @Override
  public String toString() {
    return new ToStringer(ListJobsResponse.class)
        .add("hasMore", hasMore)
        .add("jobs", jobs)
        .toString();
  }
}
