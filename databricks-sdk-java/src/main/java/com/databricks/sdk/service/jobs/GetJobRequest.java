// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetJobRequest {
  /** Flag that indicates that trigger state should be included in the response. */
  @JsonIgnore
  @QueryParam("include_trigger_state")
  private Boolean includeTriggerState;

  /** The canonical identifier of the job to retrieve information about. This field is required. */
  @JsonIgnore
  @QueryParam("job_id")
  private Long jobId;

  /**
   * Use {@code next_page_token} returned from the previous GetJob response to request the next page
   * of the job's array properties.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public GetJobRequest setIncludeTriggerState(Boolean includeTriggerState) {
    this.includeTriggerState = includeTriggerState;
    return this;
  }

  public Boolean getIncludeTriggerState() {
    return includeTriggerState;
  }

  public GetJobRequest setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public GetJobRequest setPageToken(String pageToken) {
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
    GetJobRequest that = (GetJobRequest) o;
    return Objects.equals(includeTriggerState, that.includeTriggerState)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeTriggerState, jobId, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetJobRequest.class)
        .add("includeTriggerState", includeTriggerState)
        .add("jobId", jobId)
        .add("pageToken", pageToken)
        .toString();
  }
}
