// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CancelAllRuns {
  /**
   * Optional boolean parameter to cancel all queued runs. If no job_id is provided, all queued runs
   * in the workspace are canceled.
   */
  @JsonProperty("all_queued_runs")
  private Boolean allQueuedRuns;

  /** The canonical identifier of the job to cancel all runs of. */
  @JsonProperty("job_id")
  private Long jobId;

  public CancelAllRuns setAllQueuedRuns(Boolean allQueuedRuns) {
    this.allQueuedRuns = allQueuedRuns;
    return this;
  }

  public Boolean getAllQueuedRuns() {
    return allQueuedRuns;
  }

  public CancelAllRuns setJobId(Long jobId) {
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
    CancelAllRuns that = (CancelAllRuns) o;
    return Objects.equals(allQueuedRuns, that.allQueuedRuns) && Objects.equals(jobId, that.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allQueuedRuns, jobId);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelAllRuns.class)
        .add("allQueuedRuns", allQueuedRuns)
        .add("jobId", jobId)
        .toString();
  }
}
