// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class MonitorInfoPb {
  @JsonProperty("assets_dir")
  private String assetsDir;

  @JsonProperty("baseline_table_name")
  private String baselineTableName;

  @JsonProperty("custom_metrics")
  private Collection<MonitorMetric> customMetrics;

  @JsonProperty("dashboard_id")
  private String dashboardId;

  @JsonProperty("data_classification_config")
  private MonitorDataClassificationConfig dataClassificationConfig;

  @JsonProperty("drift_metrics_table_name")
  private String driftMetricsTableName;

  @JsonProperty("inference_log")
  private MonitorInferenceLog inferenceLog;

  @JsonProperty("latest_monitor_failure_msg")
  private String latestMonitorFailureMsg;

  @JsonProperty("monitor_version")
  private String monitorVersion;

  @JsonProperty("notifications")
  private MonitorNotifications notifications;

  @JsonProperty("output_schema_name")
  private String outputSchemaName;

  @JsonProperty("profile_metrics_table_name")
  private String profileMetricsTableName;

  @JsonProperty("schedule")
  private MonitorCronSchedule schedule;

  @JsonProperty("slicing_exprs")
  private Collection<String> slicingExprs;

  @JsonProperty("snapshot")
  private MonitorSnapshot snapshot;

  @JsonProperty("status")
  private MonitorInfoStatus status;

  @JsonProperty("table_name")
  private String tableName;

  @JsonProperty("time_series")
  private MonitorTimeSeries timeSeries;

  public MonitorInfoPb setAssetsDir(String assetsDir) {
    this.assetsDir = assetsDir;
    return this;
  }

  public String getAssetsDir() {
    return assetsDir;
  }

  public MonitorInfoPb setBaselineTableName(String baselineTableName) {
    this.baselineTableName = baselineTableName;
    return this;
  }

  public String getBaselineTableName() {
    return baselineTableName;
  }

  public MonitorInfoPb setCustomMetrics(Collection<MonitorMetric> customMetrics) {
    this.customMetrics = customMetrics;
    return this;
  }

  public Collection<MonitorMetric> getCustomMetrics() {
    return customMetrics;
  }

  public MonitorInfoPb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public MonitorInfoPb setDataClassificationConfig(
      MonitorDataClassificationConfig dataClassificationConfig) {
    this.dataClassificationConfig = dataClassificationConfig;
    return this;
  }

  public MonitorDataClassificationConfig getDataClassificationConfig() {
    return dataClassificationConfig;
  }

  public MonitorInfoPb setDriftMetricsTableName(String driftMetricsTableName) {
    this.driftMetricsTableName = driftMetricsTableName;
    return this;
  }

  public String getDriftMetricsTableName() {
    return driftMetricsTableName;
  }

  public MonitorInfoPb setInferenceLog(MonitorInferenceLog inferenceLog) {
    this.inferenceLog = inferenceLog;
    return this;
  }

  public MonitorInferenceLog getInferenceLog() {
    return inferenceLog;
  }

  public MonitorInfoPb setLatestMonitorFailureMsg(String latestMonitorFailureMsg) {
    this.latestMonitorFailureMsg = latestMonitorFailureMsg;
    return this;
  }

  public String getLatestMonitorFailureMsg() {
    return latestMonitorFailureMsg;
  }

  public MonitorInfoPb setMonitorVersion(String monitorVersion) {
    this.monitorVersion = monitorVersion;
    return this;
  }

  public String getMonitorVersion() {
    return monitorVersion;
  }

  public MonitorInfoPb setNotifications(MonitorNotifications notifications) {
    this.notifications = notifications;
    return this;
  }

  public MonitorNotifications getNotifications() {
    return notifications;
  }

  public MonitorInfoPb setOutputSchemaName(String outputSchemaName) {
    this.outputSchemaName = outputSchemaName;
    return this;
  }

  public String getOutputSchemaName() {
    return outputSchemaName;
  }

  public MonitorInfoPb setProfileMetricsTableName(String profileMetricsTableName) {
    this.profileMetricsTableName = profileMetricsTableName;
    return this;
  }

  public String getProfileMetricsTableName() {
    return profileMetricsTableName;
  }

  public MonitorInfoPb setSchedule(MonitorCronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public MonitorCronSchedule getSchedule() {
    return schedule;
  }

  public MonitorInfoPb setSlicingExprs(Collection<String> slicingExprs) {
    this.slicingExprs = slicingExprs;
    return this;
  }

  public Collection<String> getSlicingExprs() {
    return slicingExprs;
  }

  public MonitorInfoPb setSnapshot(MonitorSnapshot snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  public MonitorSnapshot getSnapshot() {
    return snapshot;
  }

  public MonitorInfoPb setStatus(MonitorInfoStatus status) {
    this.status = status;
    return this;
  }

  public MonitorInfoStatus getStatus() {
    return status;
  }

  public MonitorInfoPb setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  public MonitorInfoPb setTimeSeries(MonitorTimeSeries timeSeries) {
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
    MonitorInfoPb that = (MonitorInfoPb) o;
    return Objects.equals(assetsDir, that.assetsDir)
        && Objects.equals(baselineTableName, that.baselineTableName)
        && Objects.equals(customMetrics, that.customMetrics)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(dataClassificationConfig, that.dataClassificationConfig)
        && Objects.equals(driftMetricsTableName, that.driftMetricsTableName)
        && Objects.equals(inferenceLog, that.inferenceLog)
        && Objects.equals(latestMonitorFailureMsg, that.latestMonitorFailureMsg)
        && Objects.equals(monitorVersion, that.monitorVersion)
        && Objects.equals(notifications, that.notifications)
        && Objects.equals(outputSchemaName, that.outputSchemaName)
        && Objects.equals(profileMetricsTableName, that.profileMetricsTableName)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(slicingExprs, that.slicingExprs)
        && Objects.equals(snapshot, that.snapshot)
        && Objects.equals(status, that.status)
        && Objects.equals(tableName, that.tableName)
        && Objects.equals(timeSeries, that.timeSeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assetsDir,
        baselineTableName,
        customMetrics,
        dashboardId,
        dataClassificationConfig,
        driftMetricsTableName,
        inferenceLog,
        latestMonitorFailureMsg,
        monitorVersion,
        notifications,
        outputSchemaName,
        profileMetricsTableName,
        schedule,
        slicingExprs,
        snapshot,
        status,
        tableName,
        timeSeries);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorInfoPb.class)
        .add("assetsDir", assetsDir)
        .add("baselineTableName", baselineTableName)
        .add("customMetrics", customMetrics)
        .add("dashboardId", dashboardId)
        .add("dataClassificationConfig", dataClassificationConfig)
        .add("driftMetricsTableName", driftMetricsTableName)
        .add("inferenceLog", inferenceLog)
        .add("latestMonitorFailureMsg", latestMonitorFailureMsg)
        .add("monitorVersion", monitorVersion)
        .add("notifications", notifications)
        .add("outputSchemaName", outputSchemaName)
        .add("profileMetricsTableName", profileMetricsTableName)
        .add("schedule", schedule)
        .add("slicingExprs", slicingExprs)
        .add("snapshot", snapshot)
        .add("status", status)
        .add("tableName", tableName)
        .add("timeSeries", timeSeries)
        .toString();
  }
}
