// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class JobCompliance {
  /** Whether this job is in compliance with the latest version of its policy. */
  @JsonProperty("is_compliant")
  private Boolean isCompliant;

  /** Canonical unique identifier for a job. */
  @JsonProperty("job_id")
  private Long jobId;

  /**
   * An object containing key-value mappings representing the first 200 policy validation errors.
   * The keys indicate the path where the policy validation error is occurring. An identifier for
   * the job cluster is prepended to the path. The values indicate an error message describing the
   * policy validation error.
   */
  @JsonProperty("violations")
  private Map<String, String> violations;

  public JobCompliance setIsCompliant(Boolean isCompliant) {
    this.isCompliant = isCompliant;
    return this;
  }

  public Boolean getIsCompliant() {
    return isCompliant;
  }

  public JobCompliance setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public JobCompliance setViolations(Map<String, String> violations) {
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
    JobCompliance that = (JobCompliance) o;
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
    return new ToStringer(JobCompliance.class)
        .add("isCompliant", isCompliant)
        .add("jobId", jobId)
        .add("violations", violations)
        .toString();
  }
}
