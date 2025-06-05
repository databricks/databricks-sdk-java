// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class ResolvedRunJobTaskValuesPb {
  @JsonProperty("job_parameters")
  private Map<String, String> jobParameters;

  @JsonProperty("parameters")
  private Map<String, String> parameters;

  public ResolvedRunJobTaskValuesPb setJobParameters(Map<String, String> jobParameters) {
    this.jobParameters = jobParameters;
    return this;
  }

  public Map<String, String> getJobParameters() {
    return jobParameters;
  }

  public ResolvedRunJobTaskValuesPb setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Map<String, String> getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedRunJobTaskValuesPb that = (ResolvedRunJobTaskValuesPb) o;
    return Objects.equals(jobParameters, that.jobParameters)
        && Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobParameters, parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedRunJobTaskValuesPb.class)
        .add("jobParameters", jobParameters)
        .add("parameters", parameters)
        .toString();
  }
}
