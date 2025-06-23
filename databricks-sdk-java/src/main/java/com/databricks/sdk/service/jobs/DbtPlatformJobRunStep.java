// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Format of response retrieved from dbt platform, for inclusion in output */
@Generated
public class DbtPlatformJobRunStep {
  /** Orders the steps in the job */
  @JsonProperty("index")
  private Long index;

  /** Output of the step */
  @JsonProperty("logs")
  private String logs;

  /**
   * Whether the logs of this step have been truncated. If true, the logs has been truncated to
   * 10000 characters.
   */
  @JsonProperty("logs_truncated")
  private Boolean logsTruncated;

  /** Name of the step in the job */
  @JsonProperty("name")
  private String name;

  /**
   * Whether the name of the job has been truncated. If true, the name has been truncated to 100
   * characters.
   */
  @JsonProperty("name_truncated")
  private Boolean nameTruncated;

  /** State of the step */
  @JsonProperty("status")
  private DbtPlatformRunStatus status;

  public DbtPlatformJobRunStep setIndex(Long index) {
    this.index = index;
    return this;
  }

  public Long getIndex() {
    return index;
  }

  public DbtPlatformJobRunStep setLogs(String logs) {
    this.logs = logs;
    return this;
  }

  public String getLogs() {
    return logs;
  }

  public DbtPlatformJobRunStep setLogsTruncated(Boolean logsTruncated) {
    this.logsTruncated = logsTruncated;
    return this;
  }

  public Boolean getLogsTruncated() {
    return logsTruncated;
  }

  public DbtPlatformJobRunStep setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DbtPlatformJobRunStep setNameTruncated(Boolean nameTruncated) {
    this.nameTruncated = nameTruncated;
    return this;
  }

  public Boolean getNameTruncated() {
    return nameTruncated;
  }

  public DbtPlatformJobRunStep setStatus(DbtPlatformRunStatus status) {
    this.status = status;
    return this;
  }

  public DbtPlatformRunStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtPlatformJobRunStep that = (DbtPlatformJobRunStep) o;
    return Objects.equals(index, that.index)
        && Objects.equals(logs, that.logs)
        && Objects.equals(logsTruncated, that.logsTruncated)
        && Objects.equals(name, that.name)
        && Objects.equals(nameTruncated, that.nameTruncated)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, logs, logsTruncated, name, nameTruncated, status);
  }

  @Override
  public String toString() {
    return new ToStringer(DbtPlatformJobRunStep.class)
        .add("index", index)
        .add("logs", logs)
        .add("logsTruncated", logsTruncated)
        .add("name", name)
        .add("nameTruncated", nameTruncated)
        .add("status", status)
        .toString();
  }
}
