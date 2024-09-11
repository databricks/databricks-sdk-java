// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class QuerySource {
  /** UUID */
  @JsonProperty("alert_id")
  private String alertId;

  /** Client code that triggered the request */
  @JsonProperty("client_call_context")
  private ClientCallContext clientCallContext;

  /** Id associated with a notebook cell */
  @JsonProperty("command_id")
  private String commandId;

  /** Id associated with a notebook run or execution */
  @JsonProperty("command_run_id")
  private String commandRunId;

  /** UUID */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /** UUID for Lakeview Dashboards, separate from DBSQL Dashboards (dashboard_id) */
  @JsonProperty("dashboard_v3_id")
  private String dashboardV3Id;

  /** */
  @JsonProperty("driver_info")
  private QuerySourceDriverInfo driverInfo;

  /** Spark service that received and processed the query */
  @JsonProperty("entry_point")
  private QuerySourceEntryPoint entryPoint;

  /** UUID for Genie space */
  @JsonProperty("genie_space_id")
  private String genieSpaceId;

  /** */
  @JsonProperty("is_cloud_fetch")
  private Boolean isCloudFetch;

  /** */
  @JsonProperty("is_databricks_sql_exec_api")
  private Boolean isDatabricksSqlExecApi;

  /** */
  @JsonProperty("job_id")
  private String jobId;

  /**
   * With background compute, jobs can be managed by different internal teams. When not specified,
   * not a background compute job When specified and the value is not JOBS, it is a background
   * compute job
   */
  @JsonProperty("job_managed_by")
  private QuerySourceJobManager jobManagedBy;

  /** */
  @JsonProperty("notebook_id")
  private String notebookId;

  /** String provided by a customer that'll help them identify the query */
  @JsonProperty("query_tags")
  private String queryTags;

  /** Id associated with a job run or execution */
  @JsonProperty("run_id")
  private String runId;

  /** Id associated with a notebook cell run or execution */
  @JsonProperty("runnable_command_id")
  private String runnableCommandId;

  /** */
  @JsonProperty("scheduled_by")
  private QuerySourceTrigger scheduledBy;

  /** */
  @JsonProperty("serverless_channel_info")
  private ServerlessChannelInfo serverlessChannelInfo;

  /** UUID */
  @JsonProperty("source_query_id")
  private String sourceQueryId;

  public QuerySource setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }

  public QuerySource setClientCallContext(ClientCallContext clientCallContext) {
    this.clientCallContext = clientCallContext;
    return this;
  }

  public ClientCallContext getClientCallContext() {
    return clientCallContext;
  }

  public QuerySource setCommandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

  public String getCommandId() {
    return commandId;
  }

  public QuerySource setCommandRunId(String commandRunId) {
    this.commandRunId = commandRunId;
    return this;
  }

  public String getCommandRunId() {
    return commandRunId;
  }

  public QuerySource setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public QuerySource setDashboardV3Id(String dashboardV3Id) {
    this.dashboardV3Id = dashboardV3Id;
    return this;
  }

  public String getDashboardV3Id() {
    return dashboardV3Id;
  }

  public QuerySource setDriverInfo(QuerySourceDriverInfo driverInfo) {
    this.driverInfo = driverInfo;
    return this;
  }

  public QuerySourceDriverInfo getDriverInfo() {
    return driverInfo;
  }

  public QuerySource setEntryPoint(QuerySourceEntryPoint entryPoint) {
    this.entryPoint = entryPoint;
    return this;
  }

  public QuerySourceEntryPoint getEntryPoint() {
    return entryPoint;
  }

  public QuerySource setGenieSpaceId(String genieSpaceId) {
    this.genieSpaceId = genieSpaceId;
    return this;
  }

  public String getGenieSpaceId() {
    return genieSpaceId;
  }

  public QuerySource setIsCloudFetch(Boolean isCloudFetch) {
    this.isCloudFetch = isCloudFetch;
    return this;
  }

  public Boolean getIsCloudFetch() {
    return isCloudFetch;
  }

  public QuerySource setIsDatabricksSqlExecApi(Boolean isDatabricksSqlExecApi) {
    this.isDatabricksSqlExecApi = isDatabricksSqlExecApi;
    return this;
  }

  public Boolean getIsDatabricksSqlExecApi() {
    return isDatabricksSqlExecApi;
  }

  public QuerySource setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  public QuerySource setJobManagedBy(QuerySourceJobManager jobManagedBy) {
    this.jobManagedBy = jobManagedBy;
    return this;
  }

  public QuerySourceJobManager getJobManagedBy() {
    return jobManagedBy;
  }

  public QuerySource setNotebookId(String notebookId) {
    this.notebookId = notebookId;
    return this;
  }

  public String getNotebookId() {
    return notebookId;
  }

  public QuerySource setQueryTags(String queryTags) {
    this.queryTags = queryTags;
    return this;
  }

  public String getQueryTags() {
    return queryTags;
  }

  public QuerySource setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public QuerySource setRunnableCommandId(String runnableCommandId) {
    this.runnableCommandId = runnableCommandId;
    return this;
  }

  public String getRunnableCommandId() {
    return runnableCommandId;
  }

  public QuerySource setScheduledBy(QuerySourceTrigger scheduledBy) {
    this.scheduledBy = scheduledBy;
    return this;
  }

  public QuerySourceTrigger getScheduledBy() {
    return scheduledBy;
  }

  public QuerySource setServerlessChannelInfo(ServerlessChannelInfo serverlessChannelInfo) {
    this.serverlessChannelInfo = serverlessChannelInfo;
    return this;
  }

  public ServerlessChannelInfo getServerlessChannelInfo() {
    return serverlessChannelInfo;
  }

  public QuerySource setSourceQueryId(String sourceQueryId) {
    this.sourceQueryId = sourceQueryId;
    return this;
  }

  public String getSourceQueryId() {
    return sourceQueryId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuerySource that = (QuerySource) o;
    return Objects.equals(alertId, that.alertId)
        && Objects.equals(clientCallContext, that.clientCallContext)
        && Objects.equals(commandId, that.commandId)
        && Objects.equals(commandRunId, that.commandRunId)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(dashboardV3Id, that.dashboardV3Id)
        && Objects.equals(driverInfo, that.driverInfo)
        && Objects.equals(entryPoint, that.entryPoint)
        && Objects.equals(genieSpaceId, that.genieSpaceId)
        && Objects.equals(isCloudFetch, that.isCloudFetch)
        && Objects.equals(isDatabricksSqlExecApi, that.isDatabricksSqlExecApi)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(jobManagedBy, that.jobManagedBy)
        && Objects.equals(notebookId, that.notebookId)
        && Objects.equals(queryTags, that.queryTags)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runnableCommandId, that.runnableCommandId)
        && Objects.equals(scheduledBy, that.scheduledBy)
        && Objects.equals(serverlessChannelInfo, that.serverlessChannelInfo)
        && Objects.equals(sourceQueryId, that.sourceQueryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alertId,
        clientCallContext,
        commandId,
        commandRunId,
        dashboardId,
        dashboardV3Id,
        driverInfo,
        entryPoint,
        genieSpaceId,
        isCloudFetch,
        isDatabricksSqlExecApi,
        jobId,
        jobManagedBy,
        notebookId,
        queryTags,
        runId,
        runnableCommandId,
        scheduledBy,
        serverlessChannelInfo,
        sourceQueryId);
  }

  @Override
  public String toString() {
    return new ToStringer(QuerySource.class)
        .add("alertId", alertId)
        .add("clientCallContext", clientCallContext)
        .add("commandId", commandId)
        .add("commandRunId", commandRunId)
        .add("dashboardId", dashboardId)
        .add("dashboardV3Id", dashboardV3Id)
        .add("driverInfo", driverInfo)
        .add("entryPoint", entryPoint)
        .add("genieSpaceId", genieSpaceId)
        .add("isCloudFetch", isCloudFetch)
        .add("isDatabricksSqlExecApi", isDatabricksSqlExecApi)
        .add("jobId", jobId)
        .add("jobManagedBy", jobManagedBy)
        .add("notebookId", notebookId)
        .add("queryTags", queryTags)
        .add("runId", runId)
        .add("runnableCommandId", runnableCommandId)
        .add("scheduledBy", scheduledBy)
        .add("serverlessChannelInfo", serverlessChannelInfo)
        .add("sourceQueryId", sourceQueryId)
        .toString();
  }
}
