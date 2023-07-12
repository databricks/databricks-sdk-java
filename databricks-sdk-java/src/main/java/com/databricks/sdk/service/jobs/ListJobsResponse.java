// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class ListJobsResponse {
  /**
   * If true, additional jobs matching the provided filter are available for
   * listing.
   */
  @JsonProperty("has_more")
  private Boolean hasMore;
  
  /**
   * The list of jobs.
   */
  @JsonProperty("jobs")
  private Collection<BaseJob> jobs;
  
  /**
   * A token that can be used to list the next page of jobs.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;
  
  /**
   * A token that can be used to list the previous page of jobs.
   */
  @JsonProperty("prev_page_token")
  private String prevPageToken;
  
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
  
  public ListJobsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }
  
  public ListJobsResponse setPrevPageToken(String prevPageToken) {
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
    ListJobsResponse that = (ListJobsResponse) o;
    return Objects.equals(hasMore, that.hasMore)
    && Objects.equals(jobs, that.jobs)
    && Objects.equals(nextPageToken, that.nextPageToken)
    && Objects.equals(prevPageToken, that.prevPageToken)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, jobs, nextPageToken, prevPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListJobsResponse.class)
      .add("hasMore", hasMore)
      .add("jobs", jobs)
      .add("nextPageToken", nextPageToken)
      .add("prevPageToken", prevPageToken).toString();
  }
}
