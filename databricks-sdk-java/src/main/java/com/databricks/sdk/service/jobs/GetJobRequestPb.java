// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a single job */
@Generated
class GetJobRequestPb {
  @JsonIgnore
  @QueryParam("job_id")
  private Long jobId;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public GetJobRequestPb setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public GetJobRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetJobRequestPb that = (GetJobRequestPb) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetJobRequestPb.class)
        .add("jobId", jobId)
        .add("pageToken", pageToken)
        .toString();
  }
}
