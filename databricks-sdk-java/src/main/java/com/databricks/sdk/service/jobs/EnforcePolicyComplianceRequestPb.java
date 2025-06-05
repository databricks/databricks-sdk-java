// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class EnforcePolicyComplianceRequestPb {
  @JsonProperty("job_id")
  private Long jobId;

  @JsonProperty("validate_only")
  private Boolean validateOnly;

  public EnforcePolicyComplianceRequestPb setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public EnforcePolicyComplianceRequestPb setValidateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  public Boolean getValidateOnly() {
    return validateOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnforcePolicyComplianceRequestPb that = (EnforcePolicyComplianceRequestPb) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(validateOnly, that.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, validateOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(EnforcePolicyComplianceRequestPb.class)
        .add("jobId", jobId)
        .add("validateOnly", validateOnly)
        .toString();
  }
}
