// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class CancelAllRuns {
  /**
   * The canonical identifier of the job to cancel all runs of. This field is
   * required.
   */
  @JsonProperty("job_id")
  private Long jobId;
  
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
    return Objects.equals(jobId, that.jobId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelAllRuns.class)
      .add("jobId", jobId).toString();
  }
}
