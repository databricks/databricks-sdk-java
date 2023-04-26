// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SqlDashboardWidgetOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SqlDashboardWidgetOutput {
  /** Time (in epoch milliseconds) when execution of the SQL widget ends. */
  @JsonProperty("end_time")
  private Long endTime;

  /** The information about the error when execution fails. */
  @JsonProperty("error")
  private SqlOutputError error;

  /** The link to find the output results. */
  @JsonProperty("output_link")
  private String outputLink;

  /** Time (in epoch milliseconds) when execution of the SQL widget starts. */
  @JsonProperty("start_time")
  private Long startTime;

  /** The execution status of the SQL widget. */
  @JsonProperty("status")
  private SqlDashboardWidgetOutputStatus status;

  /** The canonical identifier of the SQL widget. */
  @JsonProperty("widget_id")
  private String widgetId;

  /** The title of the SQL widget. */
  @JsonProperty("widget_title")
  private String widgetTitle;

  /**
   * <p>Setter for the field <code>endTime</code>.</p>
   *
   * @param endTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlDashboardWidgetOutput} object
   */
  public SqlDashboardWidgetOutput setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>endTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getEndTime() {
    return endTime;
  }

  /**
   * <p>Setter for the field <code>error</code>.</p>
   *
   * @param error a {@link com.databricks.sdk.service.jobs.SqlOutputError} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlDashboardWidgetOutput} object
   */
  public SqlDashboardWidgetOutput setError(SqlOutputError error) {
    this.error = error;
    return this;
  }

  /**
   * <p>Getter for the field <code>error</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SqlOutputError} object
   */
  public SqlOutputError getError() {
    return error;
  }

  /**
   * <p>Setter for the field <code>outputLink</code>.</p>
   *
   * @param outputLink a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlDashboardWidgetOutput} object
   */
  public SqlDashboardWidgetOutput setOutputLink(String outputLink) {
    this.outputLink = outputLink;
    return this;
  }

  /**
   * <p>Getter for the field <code>outputLink</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getOutputLink() {
    return outputLink;
  }

  /**
   * <p>Setter for the field <code>startTime</code>.</p>
   *
   * @param startTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlDashboardWidgetOutput} object
   */
  public SqlDashboardWidgetOutput setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>startTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartTime() {
    return startTime;
  }

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.databricks.sdk.service.jobs.SqlDashboardWidgetOutputStatus} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlDashboardWidgetOutput} object
   */
  public SqlDashboardWidgetOutput setStatus(SqlDashboardWidgetOutputStatus status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SqlDashboardWidgetOutputStatus} object
   */
  public SqlDashboardWidgetOutputStatus getStatus() {
    return status;
  }

  /**
   * <p>Setter for the field <code>widgetId</code>.</p>
   *
   * @param widgetId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlDashboardWidgetOutput} object
   */
  public SqlDashboardWidgetOutput setWidgetId(String widgetId) {
    this.widgetId = widgetId;
    return this;
  }

  /**
   * <p>Getter for the field <code>widgetId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWidgetId() {
    return widgetId;
  }

  /**
   * <p>Setter for the field <code>widgetTitle</code>.</p>
   *
   * @param widgetTitle a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlDashboardWidgetOutput} object
   */
  public SqlDashboardWidgetOutput setWidgetTitle(String widgetTitle) {
    this.widgetTitle = widgetTitle;
    return this;
  }

  /**
   * <p>Getter for the field <code>widgetTitle</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWidgetTitle() {
    return widgetTitle;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlDashboardWidgetOutput that = (SqlDashboardWidgetOutput) o;
    return Objects.equals(endTime, that.endTime)
        && Objects.equals(error, that.error)
        && Objects.equals(outputLink, that.outputLink)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(status, that.status)
        && Objects.equals(widgetId, that.widgetId)
        && Objects.equals(widgetTitle, that.widgetTitle);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(endTime, error, outputLink, startTime, status, widgetId, widgetTitle);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SqlDashboardWidgetOutput.class)
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
