// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Format of response retrieved from dbt Cloud, for inclusion in output */
@Generated
class DbtCloudJobRunStepPb {
  @JsonProperty("index")
  private Long index;

  @JsonProperty("logs")
  private String logs;

  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private DbtCloudRunStatus status;

  public DbtCloudJobRunStepPb setIndex(Long index) {
    this.index = index;
    return this;
  }

  public Long getIndex() {
    return index;
  }

  public DbtCloudJobRunStepPb setLogs(String logs) {
    this.logs = logs;
    return this;
  }

  public String getLogs() {
    return logs;
  }

  public DbtCloudJobRunStepPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DbtCloudJobRunStepPb setStatus(DbtCloudRunStatus status) {
    this.status = status;
    return this;
  }

  public DbtCloudRunStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtCloudJobRunStepPb that = (DbtCloudJobRunStepPb) o;
    return Objects.equals(index, that.index)
        && Objects.equals(logs, that.logs)
        && Objects.equals(name, that.name)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, logs, name, status);
  }

  @Override
  public String toString() {
    return new ToStringer(DbtCloudJobRunStepPb.class)
        .add("index", index)
        .add("logs", logs)
        .add("name", name)
        .add("status", status)
        .toString();
  }
}
