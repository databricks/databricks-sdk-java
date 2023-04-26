// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RunNowResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RunNowResponse {
  /** A unique identifier for this job run. This is set to the same value as `run_id`. */
  @JsonProperty("number_in_job")
  private Long numberInJob;

  /** The globally unique ID of the newly triggered run. */
  @JsonProperty("run_id")
  private Long runId;

  /**
   * <p>Setter for the field <code>numberInJob</code>.</p>
   *
   * @param numberInJob a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RunNowResponse} object
   */
  public RunNowResponse setNumberInJob(Long numberInJob) {
    this.numberInJob = numberInJob;
    return this;
  }

  /**
   * <p>Getter for the field <code>numberInJob</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getNumberInJob() {
    return numberInJob;
  }

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RunNowResponse} object
   */
  public RunNowResponse setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  /**
   * <p>Getter for the field <code>runId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRunId() {
    return runId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunNowResponse that = (RunNowResponse) o;
    return Objects.equals(numberInJob, that.numberInJob) && Objects.equals(runId, that.runId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(numberInJob, runId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RunNowResponse.class)
        .add("numberInJob", numberInJob)
        .add("runId", runId)
        .toString();
  }
}
