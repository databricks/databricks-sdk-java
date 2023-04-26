// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateResponse {
  /** The canonical identifier for the newly created job. */
  @JsonProperty("job_id")
  private Long jobId;

  /**
   * <p>Setter for the field <code>jobId</code>.</p>
   *
   * @param jobId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.CreateResponse} object
   */
  public CreateResponse setJobId(Long jobId) {
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
    CreateResponse that = (CreateResponse) o;
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
    return new ToStringer(CreateResponse.class).add("jobId", jobId).toString();
  }
}
