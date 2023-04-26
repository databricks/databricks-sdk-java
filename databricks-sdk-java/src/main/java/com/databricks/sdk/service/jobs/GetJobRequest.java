// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get a single job
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetJobRequest {
  /** The canonical identifier of the job to retrieve information about. This field is required. */
  @QueryParam("job_id")
  private Long jobId;

  /**
   * <p>Setter for the field <code>jobId</code>.</p>
   *
   * @param jobId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.GetJobRequest} object
   */
  public GetJobRequest setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * <p>Getter for the field <code>jobId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getJobId() {
    return jobId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetJobRequest that = (GetJobRequest) o;
    return Objects.equals(jobId, that.jobId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(jobId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetJobRequest.class).add("jobId", jobId).toString();
  }
}
