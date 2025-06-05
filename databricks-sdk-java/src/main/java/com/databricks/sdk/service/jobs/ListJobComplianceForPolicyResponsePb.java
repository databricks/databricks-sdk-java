// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListJobComplianceForPolicyResponsePb {
  @JsonProperty("jobs")
  private Collection<JobCompliance> jobs;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("prev_page_token")
  private String prevPageToken;

  public ListJobComplianceForPolicyResponsePb setJobs(Collection<JobCompliance> jobs) {
    this.jobs = jobs;
    return this;
  }

  public Collection<JobCompliance> getJobs() {
    return jobs;
  }

  public ListJobComplianceForPolicyResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListJobComplianceForPolicyResponsePb setPrevPageToken(String prevPageToken) {
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
    ListJobComplianceForPolicyResponsePb that = (ListJobComplianceForPolicyResponsePb) o;
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
    return new ToStringer(ListJobComplianceForPolicyResponsePb.class)
        .add("jobs", jobs)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .toString();
  }
}
