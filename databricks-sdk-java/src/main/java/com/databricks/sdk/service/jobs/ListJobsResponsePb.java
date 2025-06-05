// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** List of jobs was retrieved successfully. */
@Generated
class ListJobsResponsePb {
  @JsonProperty("has_more")
  private Boolean hasMore;

  @JsonProperty("jobs")
  private Collection<BaseJob> jobs;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("prev_page_token")
  private String prevPageToken;

  public ListJobsResponsePb setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public Boolean getHasMore() {
    return hasMore;
  }

  public ListJobsResponsePb setJobs(Collection<BaseJob> jobs) {
    this.jobs = jobs;
    return this;
  }

  public Collection<BaseJob> getJobs() {
    return jobs;
  }

  public ListJobsResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListJobsResponsePb setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  public String getPrevPageToken() {
    return prevPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListJobsResponsePb that = (ListJobsResponsePb) o;
    return Objects.equals(hasMore, that.hasMore)
        && Objects.equals(jobs, that.jobs)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(prevPageToken, that.prevPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, jobs, nextPageToken, prevPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListJobsResponsePb.class)
        .add("hasMore", hasMore)
        .add("jobs", jobs)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .toString();
  }
}
