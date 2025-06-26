// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetJobPermissionLevelsRequest {
  /** The job for which to get or manage permissions. */
  @JsonIgnore private String jobId;

  public GetJobPermissionLevelsRequest setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetJobPermissionLevelsRequest that = (GetJobPermissionLevelsRequest) o;
    return Objects.equals(jobId, that.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetJobPermissionLevelsRequest.class).add("jobId", jobId).toString();
  }
}
