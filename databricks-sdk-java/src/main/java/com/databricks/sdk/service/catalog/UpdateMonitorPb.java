// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class UpdateMonitorPb {
  @JsonProperty("baseline_table_name")
  private String baselineTableName;

  @JsonProperty("custom_metrics")
  private Collection<MonitorMetric> customMetrics;

  @JsonProperty("dashboard_id")
  private String dashboardId;

  @JsonProperty("data_classification_config")
  private MonitorDataClassificationConfig dataClassificationConfig;

  @JsonProperty("inference_log")
  private MonitorInferenceLog inferenceLog;

  @JsonProperty("notifications")
  private MonitorNotifications notifications;

  @JsonProperty("output_schema_name")
  private String outputSchemaName;

  @JsonProperty("schedule")
  private MonitorCronSchedule schedule;

  @JsonProperty("slicing_exprs")
  private Collection<String> slicingExprs;

  @JsonProperty("snapshot")
  private MonitorSnapshot snapshot;

  @JsonIgnore private String tableName;

  @JsonProperty("time_series")
  private MonitorTimeSeries timeSeries;

  public UpdateMonitorPb setBaselineTableName(String baselineTableName) {
    this.baselineTableName = baselineTableName;
    return this;
  }

  public String getBaselineTableName() {
    return baselineTableName;
  }

  public UpdateMonitorPb setCustomMetrics(Collection<MonitorMetric> customMetrics) {
    this.customMetrics = customMetrics;
    return this;
  }

  public Collection<MonitorMetric> getCustomMetrics() {
    return customMetrics;
  }

  public UpdateMonitorPb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public UpdateMonitorPb setDataClassificationConfig(
      MonitorDataClassificationConfig dataClassificationConfig) {
    this.dataClassificationConfig = dataClassificationConfig;
    return this;
  }

  public MonitorDataClassificationConfig getDataClassificationConfig() {
    return dataClassificationConfig;
  }

  public UpdateMonitorPb setInferenceLog(MonitorInferenceLog inferenceLog) {
    this.inferenceLog = inferenceLog;
    return this;
  }

  public MonitorInferenceLog getInferenceLog() {
    return inferenceLog;
  }

  public UpdateMonitorPb setNotifications(MonitorNotifications notifications) {
    this.notifications = notifications;
    return this;
  }

  public MonitorNotifications getNotifications() {
    return notifications;
  }

  public UpdateMonitorPb setOutputSchemaName(String outputSchemaName) {
    this.outputSchemaName = outputSchemaName;
    return this;
  }

  public String getOutputSchemaName() {
    return outputSchemaName;
  }

  public UpdateMonitorPb setSchedule(MonitorCronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public MonitorCronSchedule getSchedule() {
    return schedule;
  }

  public UpdateMonitorPb setSlicingExprs(Collection<String> slicingExprs) {
    this.slicingExprs = slicingExprs;
    return this;
  }

  public Collection<String> getSlicingExprs() {
    return slicingExprs;
  }

  public UpdateMonitorPb setSnapshot(MonitorSnapshot snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  public MonitorSnapshot getSnapshot() {
    return snapshot;
  }

  public UpdateMonitorPb setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  public UpdateMonitorPb setTimeSeries(MonitorTimeSeries timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  public MonitorTimeSeries getTimeSeries() {
    return timeSeries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateMonitorPb that = (UpdateMonitorPb) o;
    return Objects.equals(baselineTableName, that.baselineTableName)
        && Objects.equals(customMetrics, that.customMetrics)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(dataClassificationConfig, that.dataClassificationConfig)
        && Objects.equals(inferenceLog, that.inferenceLog)
        && Objects.equals(notifications, that.notifications)
        && Objects.equals(outputSchemaName, that.outputSchemaName)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(slicingExprs, that.slicingExprs)
        && Objects.equals(snapshot, that.snapshot)
        && Objects.equals(tableName, that.tableName)
        && Objects.equals(timeSeries, that.timeSeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        baselineTableName,
        customMetrics,
        dashboardId,
        dataClassificationConfig,
        inferenceLog,
        notifications,
        outputSchemaName,
        schedule,
        slicingExprs,
        snapshot,
        tableName,
        timeSeries);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateMonitorPb.class)
        .add("baselineTableName", baselineTableName)
        .add("customMetrics", customMetrics)
        .add("dashboardId", dashboardId)
        .add("dataClassificationConfig", dataClassificationConfig)
        .add("inferenceLog", inferenceLog)
        .add("notifications", notifications)
        .add("outputSchemaName", outputSchemaName)
        .add("schedule", schedule)
        .add("slicingExprs", slicingExprs)
        .add("snapshot", snapshot)
        .add("tableName", tableName)
        .add("timeSeries", timeSeries)
        .toString();
  }
}
