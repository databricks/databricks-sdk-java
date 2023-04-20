// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class LogAnalyticsInfo {
  /** <needs content added> */
  @JsonProperty("log_analytics_primary_key")
  private String logAnalyticsPrimaryKey;

  /** <needs content added> */
  @JsonProperty("log_analytics_workspace_id")
  private String logAnalyticsWorkspaceId;

  public LogAnalyticsInfo setLogAnalyticsPrimaryKey(String logAnalyticsPrimaryKey) {
    this.logAnalyticsPrimaryKey = logAnalyticsPrimaryKey;
    return this;
  }

  public String getLogAnalyticsPrimaryKey() {
    return logAnalyticsPrimaryKey;
  }

  public LogAnalyticsInfo setLogAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
    this.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
    return this;
  }

  public String getLogAnalyticsWorkspaceId() {
    return logAnalyticsWorkspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogAnalyticsInfo that = (LogAnalyticsInfo) o;
    return Objects.equals(logAnalyticsPrimaryKey, that.logAnalyticsPrimaryKey)
        && Objects.equals(logAnalyticsWorkspaceId, that.logAnalyticsWorkspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logAnalyticsPrimaryKey, logAnalyticsWorkspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(LogAnalyticsInfo.class)
        .add("logAnalyticsPrimaryKey", logAnalyticsPrimaryKey)
        .add("logAnalyticsWorkspaceId", logAnalyticsWorkspaceId)
        .toString();
  }
}
