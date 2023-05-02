// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RunNowResponse {
  /** A unique identifier for this job run. This is set to the same value as `run_id`. */
  @JsonProperty("number_in_job")
  private Long numberInJob;

  /** The globally unique ID of the newly triggered run. */
  @JsonProperty("run_id")
  private Long runId;

  public RunNowResponse setNumberInJob(Long numberInJob) {
    this.numberInJob = numberInJob;
    return this;
  }

  public Long getNumberInJob() {
    return numberInJob;
  }

  public RunNowResponse setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunNowResponse that = (RunNowResponse) o;
    return Objects.equals(numberInJob, that.numberInJob) && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberInJob, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(RunNowResponse.class)
        .add("numberInJob", numberInJob)
        .add("runId", runId)
        .toString();
  }
}
