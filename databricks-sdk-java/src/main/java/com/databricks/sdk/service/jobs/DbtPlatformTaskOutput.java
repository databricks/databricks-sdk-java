// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class DbtPlatformTaskOutput {
  /**
   * Id of the job run in dbt platform. Specified as a string for maximum compatibility with
   * clients.
   */
  @JsonProperty("dbt_platform_job_run_id")
  private String dbtPlatformJobRunId;

  /** Steps of the job run as received from dbt platform */
  @JsonProperty("dbt_platform_job_run_output")
  private Collection<DbtPlatformJobRunStep> dbtPlatformJobRunOutput;

  /** Url where full run details can be viewed */
  @JsonProperty("dbt_platform_job_run_url")
  private String dbtPlatformJobRunUrl;

  /**
   * Whether the number of steps in the output has been truncated. If true, the output will contain
   * the first 20 steps of the output.
   */
  @JsonProperty("steps_truncated")
  private Boolean stepsTruncated;

  public DbtPlatformTaskOutput setDbtPlatformJobRunId(String dbtPlatformJobRunId) {
    this.dbtPlatformJobRunId = dbtPlatformJobRunId;
    return this;
  }

  public String getDbtPlatformJobRunId() {
    return dbtPlatformJobRunId;
  }

  public DbtPlatformTaskOutput setDbtPlatformJobRunOutput(
      Collection<DbtPlatformJobRunStep> dbtPlatformJobRunOutput) {
    this.dbtPlatformJobRunOutput = dbtPlatformJobRunOutput;
    return this;
  }

  public Collection<DbtPlatformJobRunStep> getDbtPlatformJobRunOutput() {
    return dbtPlatformJobRunOutput;
  }

  public DbtPlatformTaskOutput setDbtPlatformJobRunUrl(String dbtPlatformJobRunUrl) {
    this.dbtPlatformJobRunUrl = dbtPlatformJobRunUrl;
    return this;
  }

  public String getDbtPlatformJobRunUrl() {
    return dbtPlatformJobRunUrl;
  }

  public DbtPlatformTaskOutput setStepsTruncated(Boolean stepsTruncated) {
    this.stepsTruncated = stepsTruncated;
    return this;
  }

  public Boolean getStepsTruncated() {
    return stepsTruncated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtPlatformTaskOutput that = (DbtPlatformTaskOutput) o;
    return Objects.equals(dbtPlatformJobRunId, that.dbtPlatformJobRunId)
        && Objects.equals(dbtPlatformJobRunOutput, that.dbtPlatformJobRunOutput)
        && Objects.equals(dbtPlatformJobRunUrl, that.dbtPlatformJobRunUrl)
        && Objects.equals(stepsTruncated, that.stepsTruncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dbtPlatformJobRunId, dbtPlatformJobRunOutput, dbtPlatformJobRunUrl, stepsTruncated);
  }

  @Override
  public String toString() {
    return new ToStringer(DbtPlatformTaskOutput.class)
        .add("dbtPlatformJobRunId", dbtPlatformJobRunId)
        .add("dbtPlatformJobRunOutput", dbtPlatformJobRunOutput)
        .add("dbtPlatformJobRunUrl", dbtPlatformJobRunUrl)
        .add("stepsTruncated", stepsTruncated)
        .toString();
  }
}
