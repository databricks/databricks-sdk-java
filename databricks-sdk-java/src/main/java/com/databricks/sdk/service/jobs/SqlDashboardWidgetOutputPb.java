// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SqlDashboardWidgetOutputPb {
  @JsonProperty("end_time")
  private Long endTime;

  @JsonProperty("error")
  private SqlOutputError error;

  @JsonProperty("output_link")
  private String outputLink;

  @JsonProperty("start_time")
  private Long startTime;

  @JsonProperty("status")
  private SqlDashboardWidgetOutputStatus status;

  @JsonProperty("widget_id")
  private String widgetId;

  @JsonProperty("widget_title")
  private String widgetTitle;

  public SqlDashboardWidgetOutputPb setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public SqlDashboardWidgetOutputPb setError(SqlOutputError error) {
    this.error = error;
    return this;
  }

  public SqlOutputError getError() {
    return error;
  }

  public SqlDashboardWidgetOutputPb setOutputLink(String outputLink) {
    this.outputLink = outputLink;
    return this;
  }

  public String getOutputLink() {
    return outputLink;
  }

  public SqlDashboardWidgetOutputPb setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public SqlDashboardWidgetOutputPb setStatus(SqlDashboardWidgetOutputStatus status) {
    this.status = status;
    return this;
  }

  public SqlDashboardWidgetOutputStatus getStatus() {
    return status;
  }

  public SqlDashboardWidgetOutputPb setWidgetId(String widgetId) {
    this.widgetId = widgetId;
    return this;
  }

  public String getWidgetId() {
    return widgetId;
  }

  public SqlDashboardWidgetOutputPb setWidgetTitle(String widgetTitle) {
    this.widgetTitle = widgetTitle;
    return this;
  }

  public String getWidgetTitle() {
    return widgetTitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlDashboardWidgetOutputPb that = (SqlDashboardWidgetOutputPb) o;
    return Objects.equals(endTime, that.endTime)
        && Objects.equals(error, that.error)
        && Objects.equals(outputLink, that.outputLink)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(status, that.status)
        && Objects.equals(widgetId, that.widgetId)
        && Objects.equals(widgetTitle, that.widgetTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, error, outputLink, startTime, status, widgetId, widgetTitle);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlDashboardWidgetOutputPb.class)
        .add("endTime", endTime)
        .add("error", error)
        .add("outputLink", outputLink)
        .add("startTime", startTime)
        .add("status", status)
        .add("widgetId", widgetId)
        .add("widgetTitle", widgetTitle)
        .toString();
  }
}
