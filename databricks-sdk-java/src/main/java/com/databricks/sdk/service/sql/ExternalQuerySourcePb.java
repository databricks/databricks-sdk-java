// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ExternalQuerySourcePb {
  @JsonProperty("alert_id")
  private String alertId;

  @JsonProperty("dashboard_id")
  private String dashboardId;

  @JsonProperty("genie_space_id")
  private String genieSpaceId;

  @JsonProperty("job_info")
  private ExternalQuerySourceJobInfo jobInfo;

  @JsonProperty("legacy_dashboard_id")
  private String legacyDashboardId;

  @JsonProperty("notebook_id")
  private String notebookId;

  @JsonProperty("sql_query_id")
  private String sqlQueryId;

  public ExternalQuerySourcePb setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }

  public ExternalQuerySourcePb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public ExternalQuerySourcePb setGenieSpaceId(String genieSpaceId) {
    this.genieSpaceId = genieSpaceId;
    return this;
  }

  public String getGenieSpaceId() {
    return genieSpaceId;
  }

  public ExternalQuerySourcePb setJobInfo(ExternalQuerySourceJobInfo jobInfo) {
    this.jobInfo = jobInfo;
    return this;
  }

  public ExternalQuerySourceJobInfo getJobInfo() {
    return jobInfo;
  }

  public ExternalQuerySourcePb setLegacyDashboardId(String legacyDashboardId) {
    this.legacyDashboardId = legacyDashboardId;
    return this;
  }

  public String getLegacyDashboardId() {
    return legacyDashboardId;
  }

  public ExternalQuerySourcePb setNotebookId(String notebookId) {
    this.notebookId = notebookId;
    return this;
  }

  public String getNotebookId() {
    return notebookId;
  }

  public ExternalQuerySourcePb setSqlQueryId(String sqlQueryId) {
    this.sqlQueryId = sqlQueryId;
    return this;
  }

  public String getSqlQueryId() {
    return sqlQueryId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalQuerySourcePb that = (ExternalQuerySourcePb) o;
    return Objects.equals(alertId, that.alertId)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(genieSpaceId, that.genieSpaceId)
        && Objects.equals(jobInfo, that.jobInfo)
        && Objects.equals(legacyDashboardId, that.legacyDashboardId)
        && Objects.equals(notebookId, that.notebookId)
        && Objects.equals(sqlQueryId, that.sqlQueryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alertId, dashboardId, genieSpaceId, jobInfo, legacyDashboardId, notebookId, sqlQueryId);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalQuerySourcePb.class)
        .add("alertId", alertId)
        .add("dashboardId", dashboardId)
        .add("genieSpaceId", genieSpaceId)
        .add("jobInfo", jobInfo)
        .add("legacyDashboardId", legacyDashboardId)
        .add("notebookId", notebookId)
        .add("sqlQueryId", sqlQueryId)
        .toString();
  }
}
