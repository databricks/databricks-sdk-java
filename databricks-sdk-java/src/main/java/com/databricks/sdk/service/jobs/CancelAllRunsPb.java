// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CancelAllRunsPb {
  @JsonProperty("all_queued_runs")
  private Boolean allQueuedRuns;

  @JsonProperty("job_id")
  private Long jobId;

  public CancelAllRunsPb setAllQueuedRuns(Boolean allQueuedRuns) {
    this.allQueuedRuns = allQueuedRuns;
    return this;
  }

  public Boolean getAllQueuedRuns() {
    return allQueuedRuns;
  }

  public CancelAllRunsPb setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CancelAllRunsPb that = (CancelAllRunsPb) o;
    return Objects.equals(allQueuedRuns, that.allQueuedRuns) && Objects.equals(jobId, that.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allQueuedRuns, jobId);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelAllRunsPb.class)
        .add("allQueuedRuns", allQueuedRuns)
        .add("jobId", jobId)
        .toString();
  }
}
