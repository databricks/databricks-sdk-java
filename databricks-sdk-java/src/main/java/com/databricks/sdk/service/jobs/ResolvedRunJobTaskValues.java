// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class ResolvedRunJobTaskValues {
  /** */
  @JsonProperty("job_parameters")
  private Map<String, String> jobParameters;

  /** */
  @JsonProperty("parameters")
  private Map<String, String> parameters;

  public ResolvedRunJobTaskValues setJobParameters(Map<String, String> jobParameters) {
    this.jobParameters = jobParameters;
    return this;
  }

  public Map<String, String> getJobParameters() {
    return jobParameters;
  }

  public ResolvedRunJobTaskValues setParameters(Map<String, String> parameters) {
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
    ResolvedRunJobTaskValues that = (ResolvedRunJobTaskValues) o;
    return Objects.equals(jobParameters, that.jobParameters)
        && Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobParameters, parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedRunJobTaskValues.class)
        .add("jobParameters", jobParameters)
        .add("parameters", parameters)
        .toString();
  }
}
