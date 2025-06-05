// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Run output was retrieved successfully. */
@Generated
class RunOutputPb {
  @JsonProperty("clean_rooms_notebook_output")
  private CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput cleanRoomsNotebookOutput;

  @JsonProperty("dashboard_output")
  private DashboardTaskOutput dashboardOutput;

  @JsonProperty("dbt_cloud_output")
  private DbtCloudTaskOutput dbtCloudOutput;

  @JsonProperty("dbt_output")
  private DbtOutput dbtOutput;

  @JsonProperty("error")
  private String error;

  @JsonProperty("error_trace")
  private String errorTrace;

  @JsonProperty("info")
  private String info;

  @JsonProperty("logs")
  private String logs;

  @JsonProperty("logs_truncated")
  private Boolean logsTruncated;

  @JsonProperty("metadata")
  private Run metadata;

  @JsonProperty("notebook_output")
  private NotebookOutput notebookOutput;

  @JsonProperty("run_job_output")
  private RunJobOutput runJobOutput;

  @JsonProperty("sql_output")
  private SqlOutput sqlOutput;

  public RunOutputPb setCleanRoomsNotebookOutput(
      CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput cleanRoomsNotebookOutput) {
    this.cleanRoomsNotebookOutput = cleanRoomsNotebookOutput;
    return this;
  }

  public CleanRoomsNotebookTaskCleanRoomsNotebookTaskOutput getCleanRoomsNotebookOutput() {
    return cleanRoomsNotebookOutput;
  }

  public RunOutputPb setDashboardOutput(DashboardTaskOutput dashboardOutput) {
    this.dashboardOutput = dashboardOutput;
    return this;
  }

  public DashboardTaskOutput getDashboardOutput() {
    return dashboardOutput;
  }

  public RunOutputPb setDbtCloudOutput(DbtCloudTaskOutput dbtCloudOutput) {
    this.dbtCloudOutput = dbtCloudOutput;
    return this;
  }

  public DbtCloudTaskOutput getDbtCloudOutput() {
    return dbtCloudOutput;
  }

  public RunOutputPb setDbtOutput(DbtOutput dbtOutput) {
    this.dbtOutput = dbtOutput;
    return this;
  }

  public DbtOutput getDbtOutput() {
    return dbtOutput;
  }

  public RunOutputPb setError(String error) {
    this.error = error;
    return this;
  }

  public String getError() {
    return error;
  }

  public RunOutputPb setErrorTrace(String errorTrace) {
    this.errorTrace = errorTrace;
    return this;
  }

  public String getErrorTrace() {
    return errorTrace;
  }

  public RunOutputPb setInfo(String info) {
    this.info = info;
    return this;
  }

  public String getInfo() {
    return info;
  }

  public RunOutputPb setLogs(String logs) {
    this.logs = logs;
    return this;
  }

  public String getLogs() {
    return logs;
  }

  public RunOutputPb setLogsTruncated(Boolean logsTruncated) {
    this.logsTruncated = logsTruncated;
    return this;
  }

  public Boolean getLogsTruncated() {
    return logsTruncated;
  }

  public RunOutputPb setMetadata(Run metadata) {
    this.metadata = metadata;
    return this;
  }

  public Run getMetadata() {
    return metadata;
  }

  public RunOutputPb setNotebookOutput(NotebookOutput notebookOutput) {
    this.notebookOutput = notebookOutput;
    return this;
  }

  public NotebookOutput getNotebookOutput() {
    return notebookOutput;
  }

  public RunOutputPb setRunJobOutput(RunJobOutput runJobOutput) {
    this.runJobOutput = runJobOutput;
    return this;
  }

  public RunJobOutput getRunJobOutput() {
    return runJobOutput;
  }

  public RunOutputPb setSqlOutput(SqlOutput sqlOutput) {
    this.sqlOutput = sqlOutput;
    return this;
  }

  public SqlOutput getSqlOutput() {
    return sqlOutput;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunOutputPb that = (RunOutputPb) o;
    return Objects.equals(cleanRoomsNotebookOutput, that.cleanRoomsNotebookOutput)
        && Objects.equals(dashboardOutput, that.dashboardOutput)
        && Objects.equals(dbtCloudOutput, that.dbtCloudOutput)
        && Objects.equals(dbtOutput, that.dbtOutput)
        && Objects.equals(error, that.error)
        && Objects.equals(errorTrace, that.errorTrace)
        && Objects.equals(info, that.info)
        && Objects.equals(logs, that.logs)
        && Objects.equals(logsTruncated, that.logsTruncated)
        && Objects.equals(metadata, that.metadata)
        && Objects.equals(notebookOutput, that.notebookOutput)
        && Objects.equals(runJobOutput, that.runJobOutput)
        && Objects.equals(sqlOutput, that.sqlOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cleanRoomsNotebookOutput,
        dashboardOutput,
        dbtCloudOutput,
        dbtOutput,
        error,
        errorTrace,
        info,
        logs,
        logsTruncated,
        metadata,
        notebookOutput,
        runJobOutput,
        sqlOutput);
  }

  @Override
  public String toString() {
    return new ToStringer(RunOutputPb.class)
        .add("cleanRoomsNotebookOutput", cleanRoomsNotebookOutput)
        .add("dashboardOutput", dashboardOutput)
        .add("dbtCloudOutput", dbtCloudOutput)
        .add("dbtOutput", dbtOutput)
        .add("error", error)
        .add("errorTrace", errorTrace)
        .add("info", info)
        .add("logs", logs)
        .add("logsTruncated", logsTruncated)
        .add("metadata", metadata)
        .add("notebookOutput", notebookOutput)
        .add("runJobOutput", runJobOutput)
        .add("sqlOutput", sqlOutput)
        .toString();
  }
}
