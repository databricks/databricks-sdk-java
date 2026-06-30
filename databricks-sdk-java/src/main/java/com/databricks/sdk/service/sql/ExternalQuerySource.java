// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ExternalQuerySource {
  /** The canonical identifier for this SQL alert */
  @JsonProperty("alert_id")
  private String alertId;

  /** The canonical identifier for this Lakeview dashboard */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /** The canonical identifier for this Genie space */
  @JsonProperty("genie_space_id")
  private String genieSpaceId;

  /** */
  @JsonProperty("job_info")
  private ExternalQuerySourceJobInfo jobInfo;

  /** The canonical identifier for this legacy dashboard */
  @JsonProperty("legacy_dashboard_id")
  private String legacyDashboardId;

  /** The canonical identifier for this notebook */
  @JsonProperty("notebook_id")
  private String notebookId;

  /** The canonical identifier for this SQL query */
  @JsonProperty("sql_query_id")
  private String sqlQueryId;

  public ExternalQuerySource setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }

  public ExternalQuerySource setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public ExternalQuerySource setGenieSpaceId(String genieSpaceId) {
    this.genieSpaceId = genieSpaceId;
    return this;
  }

  public String getGenieSpaceId() {
    return genieSpaceId;
  }

  public ExternalQuerySource setJobInfo(ExternalQuerySourceJobInfo jobInfo) {
    this.jobInfo = jobInfo;
    return this;
  }

  public ExternalQuerySourceJobInfo getJobInfo() {
    return jobInfo;
  }

  public ExternalQuerySource setLegacyDashboardId(String legacyDashboardId) {
    this.legacyDashboardId = legacyDashboardId;
    return this;
  }

  public String getLegacyDashboardId() {
    return legacyDashboardId;
  }

  public ExternalQuerySource setNotebookId(String notebookId) {
    this.notebookId = notebookId;
    return this;
  }

  public String getNotebookId() {
    return notebookId;
  }

  public ExternalQuerySource setSqlQueryId(String sqlQueryId) {
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
    ExternalQuerySource that = (ExternalQuerySource) o;
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
    return new ToStringer(ExternalQuerySource.class)
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
