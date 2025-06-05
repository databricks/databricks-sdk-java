// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Run was started successfully. */
@Generated
class RunNowResponsePb {
  @JsonProperty("number_in_job")
  private Long numberInJob;

  @JsonProperty("run_id")
  private Long runId;

  public RunNowResponsePb setNumberInJob(Long numberInJob) {
    this.numberInJob = numberInJob;
    return this;
  }

  public Long getNumberInJob() {
    return numberInJob;
  }

  public RunNowResponsePb setRunId(Long runId) {
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
    RunNowResponsePb that = (RunNowResponsePb) o;
    return Objects.equals(numberInJob, that.numberInJob) && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberInJob, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(RunNowResponsePb.class)
        .add("numberInJob", numberInJob)
        .add("runId", runId)
        .toString();
  }
}
