// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateResponse {
  /** The canonical identifier for the newly created job. */
  @JsonProperty("job_id")
  private Long jobId;

  public CreateResponse setJobId(Long jobId) {
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
    CreateResponse that = (CreateResponse) o;
    return Objects.equals(jobId, that.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateResponse.class).add("jobId", jobId).toString();
  }
}
