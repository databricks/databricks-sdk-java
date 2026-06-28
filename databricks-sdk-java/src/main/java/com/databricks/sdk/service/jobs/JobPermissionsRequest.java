// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class JobPermissionsRequest {
  /** */
  @JsonProperty("access_control_list")
  private Collection<JobAccessControlRequest> accessControlList;

  /** The job for which to get or manage permissions. */
  @JsonIgnore private String jobId;

  public JobPermissionsRequest setAccessControlList(
      Collection<JobAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<JobAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public JobPermissionsRequest setJobId(String jobId) {
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
    JobPermissionsRequest that = (JobPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(jobId, that.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, jobId);
  }

  @Override
  public String toString() {
    return new ToStringer(JobPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("jobId", jobId)
        .toString();
  }
}
