// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class DbtCloudTaskOutputPb {
  @JsonProperty("dbt_cloud_job_run_id")
  private Long dbtCloudJobRunId;

  @JsonProperty("dbt_cloud_job_run_output")
  private Collection<DbtCloudJobRunStep> dbtCloudJobRunOutput;

  @JsonProperty("dbt_cloud_job_run_url")
  private String dbtCloudJobRunUrl;

  public DbtCloudTaskOutputPb setDbtCloudJobRunId(Long dbtCloudJobRunId) {
    this.dbtCloudJobRunId = dbtCloudJobRunId;
    return this;
  }

  public Long getDbtCloudJobRunId() {
    return dbtCloudJobRunId;
  }

  public DbtCloudTaskOutputPb setDbtCloudJobRunOutput(
      Collection<DbtCloudJobRunStep> dbtCloudJobRunOutput) {
    this.dbtCloudJobRunOutput = dbtCloudJobRunOutput;
    return this;
  }

  public Collection<DbtCloudJobRunStep> getDbtCloudJobRunOutput() {
    return dbtCloudJobRunOutput;
  }

  public DbtCloudTaskOutputPb setDbtCloudJobRunUrl(String dbtCloudJobRunUrl) {
    this.dbtCloudJobRunUrl = dbtCloudJobRunUrl;
    return this;
  }

  public String getDbtCloudJobRunUrl() {
    return dbtCloudJobRunUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtCloudTaskOutputPb that = (DbtCloudTaskOutputPb) o;
    return Objects.equals(dbtCloudJobRunId, that.dbtCloudJobRunId)
        && Objects.equals(dbtCloudJobRunOutput, that.dbtCloudJobRunOutput)
        && Objects.equals(dbtCloudJobRunUrl, that.dbtCloudJobRunUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbtCloudJobRunId, dbtCloudJobRunOutput, dbtCloudJobRunUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(DbtCloudTaskOutputPb.class)
        .add("dbtCloudJobRunId", dbtCloudJobRunId)
        .add("dbtCloudJobRunOutput", dbtCloudJobRunOutput)
        .add("dbtCloudJobRunUrl", dbtCloudJobRunUrl)
        .toString();
  }
}
