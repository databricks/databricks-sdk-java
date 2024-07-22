// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ContextFilter {
  /** Databricks SQL Alert id */
  @JsonProperty("dbsql_alert_id")
  @QueryParam("dbsql_alert_id")
  private String dbsqlAlertId;

  /** Databricks SQL Dashboard id */
  @JsonProperty("dbsql_dashboard_id")
  @QueryParam("dbsql_dashboard_id")
  private String dbsqlDashboardId;

  /** Databricks SQL Query id */
  @JsonProperty("dbsql_query_id")
  @QueryParam("dbsql_query_id")
  private String dbsqlQueryId;

  /** Databricks SQL Query session id */
  @JsonProperty("dbsql_session_id")
  @QueryParam("dbsql_session_id")
  private String dbsqlSessionId;

  /** Databricks Workflows id */
  @JsonProperty("job_id")
  @QueryParam("job_id")
  private String jobId;

  /** Databricks Workflows task run id */
  @JsonProperty("job_run_id")
  @QueryParam("job_run_id")
  private String jobRunId;

  /** Databricks Lakeview Dashboard id */
  @JsonProperty("lakeview_dashboard_id")
  @QueryParam("lakeview_dashboard_id")
  private String lakeviewDashboardId;

  /** Databricks Notebook runnableCommandId */
  @JsonProperty("notebook_cell_run_id")
  @QueryParam("notebook_cell_run_id")
  private String notebookCellRunId;

  /** Databricks Notebook id */
  @JsonProperty("notebook_id")
  @QueryParam("notebook_id")
  private String notebookId;

  /** Databricks Query History statement ids. */
  @JsonProperty("statement_ids")
  @QueryParam("statement_ids")
  private Collection<String> statementIds;

  public ContextFilter setDbsqlAlertId(String dbsqlAlertId) {
    this.dbsqlAlertId = dbsqlAlertId;
    return this;
  }

  public String getDbsqlAlertId() {
    return dbsqlAlertId;
  }

  public ContextFilter setDbsqlDashboardId(String dbsqlDashboardId) {
    this.dbsqlDashboardId = dbsqlDashboardId;
    return this;
  }

  public String getDbsqlDashboardId() {
    return dbsqlDashboardId;
  }

  public ContextFilter setDbsqlQueryId(String dbsqlQueryId) {
    this.dbsqlQueryId = dbsqlQueryId;
    return this;
  }

  public String getDbsqlQueryId() {
    return dbsqlQueryId;
  }

  public ContextFilter setDbsqlSessionId(String dbsqlSessionId) {
    this.dbsqlSessionId = dbsqlSessionId;
    return this;
  }

  public String getDbsqlSessionId() {
    return dbsqlSessionId;
  }

  public ContextFilter setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  public ContextFilter setJobRunId(String jobRunId) {
    this.jobRunId = jobRunId;
    return this;
  }

  public String getJobRunId() {
    return jobRunId;
  }

  public ContextFilter setLakeviewDashboardId(String lakeviewDashboardId) {
    this.lakeviewDashboardId = lakeviewDashboardId;
    return this;
  }

  public String getLakeviewDashboardId() {
    return lakeviewDashboardId;
  }

  public ContextFilter setNotebookCellRunId(String notebookCellRunId) {
    this.notebookCellRunId = notebookCellRunId;
    return this;
  }

  public String getNotebookCellRunId() {
    return notebookCellRunId;
  }

  public ContextFilter setNotebookId(String notebookId) {
    this.notebookId = notebookId;
    return this;
  }

  public String getNotebookId() {
    return notebookId;
  }

  public ContextFilter setStatementIds(Collection<String> statementIds) {
    this.statementIds = statementIds;
    return this;
  }

  public Collection<String> getStatementIds() {
    return statementIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContextFilter that = (ContextFilter) o;
    return Objects.equals(dbsqlAlertId, that.dbsqlAlertId)
        && Objects.equals(dbsqlDashboardId, that.dbsqlDashboardId)
        && Objects.equals(dbsqlQueryId, that.dbsqlQueryId)
        && Objects.equals(dbsqlSessionId, that.dbsqlSessionId)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(jobRunId, that.jobRunId)
        && Objects.equals(lakeviewDashboardId, that.lakeviewDashboardId)
        && Objects.equals(notebookCellRunId, that.notebookCellRunId)
        && Objects.equals(notebookId, that.notebookId)
        && Objects.equals(statementIds, that.statementIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dbsqlAlertId,
        dbsqlDashboardId,
        dbsqlQueryId,
        dbsqlSessionId,
        jobId,
        jobRunId,
        lakeviewDashboardId,
        notebookCellRunId,
        notebookId,
        statementIds);
  }

  @Override
  public String toString() {
    return new ToStringer(ContextFilter.class)
        .add("dbsqlAlertId", dbsqlAlertId)
        .add("dbsqlDashboardId", dbsqlDashboardId)
        .add("dbsqlQueryId", dbsqlQueryId)
        .add("dbsqlSessionId", dbsqlSessionId)
        .add("jobId", jobId)
        .add("jobRunId", jobRunId)
        .add("lakeviewDashboardId", lakeviewDashboardId)
        .add("notebookCellRunId", notebookCellRunId)
        .add("notebookId", notebookId)
        .add("statementIds", statementIds)
        .toString();
  }
}
