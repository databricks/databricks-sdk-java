// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListJobComplianceForPolicyResponse {
  /** A list of jobs and their policy compliance statuses. */
  @JsonProperty("jobs")
  private Collection<JobCompliance> jobs;

  /**
   * This field represents the pagination token to retrieve the next page of results. If this field
   * is not in the response, it means no further results for the request.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /**
   * This field represents the pagination token to retrieve the previous page of results. If this
   * field is not in the response, it means no further results for the request.
   */
  @JsonProperty("prev_page_token")
  private String prevPageToken;

  public ListJobComplianceForPolicyResponse setJobs(Collection<JobCompliance> jobs) {
    this.jobs = jobs;
    return this;
  }

  public Collection<JobCompliance> getJobs() {
    return jobs;
  }

  public ListJobComplianceForPolicyResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListJobComplianceForPolicyResponse setPrevPageToken(String prevPageToken) {
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
    ListJobComplianceForPolicyResponse that = (ListJobComplianceForPolicyResponse) o;
    return Objects.equals(jobs, that.jobs)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(prevPageToken, that.prevPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs, nextPageToken, prevPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListJobComplianceForPolicyResponse.class)
        .add("jobs", jobs)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .toString();
  }
}
