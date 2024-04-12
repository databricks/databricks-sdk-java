// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class MonitorInfo {
  /** The directory to store monitoring assets (e.g. dashboard, metric tables). */
  @JsonProperty("assets_dir")
  private String assetsDir;

  /**
   * Name of the baseline table from which drift metrics are computed from. Columns in the monitored
   * table should also be present in the baseline table.
   */
  @JsonProperty("baseline_table_name")
  private String baselineTableName;

  /**
   * Custom metrics to compute on the monitored table. These can be aggregate metrics, derived
   * metrics (from already computed aggregate metrics), or drift metrics (comparing metrics across
   * time windows).
   */
  @JsonProperty("custom_metrics")
  private Collection<MonitorMetric> customMetrics;

  /**
   * Id of dashboard that visualizes the computed metrics. This can be empty if the monitor is in
   * PENDING state.
   */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /** The data classification config for the monitor. */
  @JsonProperty("data_classification_config")
  private MonitorDataClassificationConfig dataClassificationConfig;

  /**
   * The full name of the drift metrics table. Format:
   * __catalog_name__.__schema_name__.__table_name__.
   */
  @JsonProperty("drift_metrics_table_name")
  private String driftMetricsTableName;

  /** Configuration for monitoring inference logs. */
  @JsonProperty("inference_log")
  private MonitorInferenceLog inferenceLog;

  /** The latest failure message of the monitor (if any). */
  @JsonProperty("latest_monitor_failure_msg")
  private String latestMonitorFailureMsg;

  /** The version of the monitor config (e.g. 1,2,3). If negative, the monitor may be corrupted. */
  @JsonProperty("monitor_version")
  private String monitorVersion;

  /** The notification settings for the monitor. */
  @JsonProperty("notifications")
  private MonitorNotifications notifications;

  /** Schema where output metric tables are created. */
  @JsonProperty("output_schema_name")
  private String outputSchemaName;

  /**
   * The full name of the profile metrics table. Format:
   * __catalog_name__.__schema_name__.__table_name__.
   */
  @JsonProperty("profile_metrics_table_name")
  private String profileMetricsTableName;

  /** The schedule for automatically updating and refreshing metric tables. */
  @JsonProperty("schedule")
  private MonitorCronSchedule schedule;

  /**
   * List of column expressions to slice data with for targeted analysis. The data is grouped by
   * each expression independently, resulting in a separate slice for each predicate and its
   * complements. For high-cardinality columns, only the top 100 unique values by frequency will
   * generate slices.
   */
  @JsonProperty("slicing_exprs")
  private Collection<String> slicingExprs;

  /** Configuration for monitoring snapshot tables. */
  @JsonProperty("snapshot")
  private MonitorSnapshot snapshot;

  /** The status of the monitor. */
  @JsonProperty("status")
  private MonitorInfoStatus status;

  /**
   * The full name of the table to monitor. Format: __catalog_name__.__schema_name__.__table_name__.
   */
  @JsonProperty("table_name")
  private String tableName;

  /** Configuration for monitoring time series tables. */
  @JsonProperty("time_series")
  private MonitorTimeSeries timeSeries;

  public MonitorInfo setAssetsDir(String assetsDir) {
    this.assetsDir = assetsDir;
    return this;
  }

  public String getAssetsDir() {
    return assetsDir;
  }

  public MonitorInfo setBaselineTableName(String baselineTableName) {
    this.baselineTableName = baselineTableName;
    return this;
  }

  public String getBaselineTableName() {
    return baselineTableName;
  }

  public MonitorInfo setCustomMetrics(Collection<MonitorMetric> customMetrics) {
    this.customMetrics = customMetrics;
    return this;
  }

  public Collection<MonitorMetric> getCustomMetrics() {
    return customMetrics;
  }

  public MonitorInfo setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public MonitorInfo setDataClassificationConfig(
      MonitorDataClassificationConfig dataClassificationConfig) {
    this.dataClassificationConfig = dataClassificationConfig;
    return this;
  }

  public MonitorDataClassificationConfig getDataClassificationConfig() {
    return dataClassificationConfig;
  }

  public MonitorInfo setDriftMetricsTableName(String driftMetricsTableName) {
    this.driftMetricsTableName = driftMetricsTableName;
    return this;
  }

  public String getDriftMetricsTableName() {
    return driftMetricsTableName;
  }

  public MonitorInfo setInferenceLog(MonitorInferenceLog inferenceLog) {
    this.inferenceLog = inferenceLog;
    return this;
  }

  public MonitorInferenceLog getInferenceLog() {
    return inferenceLog;
  }

  public MonitorInfo setLatestMonitorFailureMsg(String latestMonitorFailureMsg) {
    this.latestMonitorFailureMsg = latestMonitorFailureMsg;
    return this;
  }

  public String getLatestMonitorFailureMsg() {
    return latestMonitorFailureMsg;
  }

  public MonitorInfo setMonitorVersion(String monitorVersion) {
    this.monitorVersion = monitorVersion;
    return this;
  }

  public String getMonitorVersion() {
    return monitorVersion;
  }

  public MonitorInfo setNotifications(MonitorNotifications notifications) {
    this.notifications = notifications;
    return this;
  }

  public MonitorNotifications getNotifications() {
    return notifications;
  }

  public MonitorInfo setOutputSchemaName(String outputSchemaName) {
    this.outputSchemaName = outputSchemaName;
    return this;
  }

  public String getOutputSchemaName() {
    return outputSchemaName;
  }

  public MonitorInfo setProfileMetricsTableName(String profileMetricsTableName) {
    this.profileMetricsTableName = profileMetricsTableName;
    return this;
  }

  public String getProfileMetricsTableName() {
    return profileMetricsTableName;
  }

  public MonitorInfo setSchedule(MonitorCronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public MonitorCronSchedule getSchedule() {
    return schedule;
  }

  public MonitorInfo setSlicingExprs(Collection<String> slicingExprs) {
    this.slicingExprs = slicingExprs;
    return this;
  }

  public Collection<String> getSlicingExprs() {
    return slicingExprs;
  }

  public MonitorInfo setSnapshot(MonitorSnapshot snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  public MonitorSnapshot getSnapshot() {
    return snapshot;
  }

  public MonitorInfo setStatus(MonitorInfoStatus status) {
    this.status = status;
    return this;
  }

  public MonitorInfoStatus getStatus() {
    return status;
  }

  public MonitorInfo setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  public MonitorInfo setTimeSeries(MonitorTimeSeries timeSeries) {
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
    MonitorInfo that = (MonitorInfo) o;
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
    return new ToStringer(MonitorInfo.class)
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
