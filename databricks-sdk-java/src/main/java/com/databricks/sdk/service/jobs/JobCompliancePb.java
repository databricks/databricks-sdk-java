// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class JobCompliancePb {
  @JsonProperty("is_compliant")
  private Boolean isCompliant;

  @JsonProperty("job_id")
  private Long jobId;

  @JsonProperty("violations")
  private Map<String, String> violations;

  public JobCompliancePb setIsCompliant(Boolean isCompliant) {
    this.isCompliant = isCompliant;
    return this;
  }

  public Boolean getIsCompliant() {
    return isCompliant;
  }

  public JobCompliancePb setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public JobCompliancePb setViolations(Map<String, String> violations) {
    this.violations = violations;
    return this;
  }

  public Map<String, String> getViolations() {
    return violations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobCompliancePb that = (JobCompliancePb) o;
    return Objects.equals(isCompliant, that.isCompliant)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(violations, that.violations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCompliant, jobId, violations);
  }

  @Override
  public String toString() {
    return new ToStringer(JobCompliancePb.class)
        .add("isCompliant", isCompliant)
        .add("jobId", jobId)
        .add("violations", violations)
        .toString();
  }
}
