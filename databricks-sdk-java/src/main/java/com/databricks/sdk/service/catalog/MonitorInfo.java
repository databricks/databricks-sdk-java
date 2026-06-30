// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class MonitorInfo {
  /**
   * [Create:REQ Update:IGN] Field for specifying the absolute path to a custom directory to store
   * data-monitoring assets. Normally prepopulated to a default user location via UI and Python
   * APIs.
   */
  @JsonProperty("assets_dir")
  private String assetsDir;

  /**
   * [Create:OPT Update:OPT] Baseline table name. Baseline data is used to compute drift from the
   * data in the monitored `table_name`. The baseline table and the monitored table shall have the
   * same schema.
   */
  @JsonProperty("baseline_table_name")
  private String baselineTableName;

  /** [Create:OPT Update:OPT] Custom metrics. */
  @JsonProperty("custom_metrics")
  private Collection<MonitorMetric> customMetrics;

  /**
   * [Create:ERR Update:OPT] Id of dashboard that visualizes the computed metrics. This can be empty
   * if the monitor is in PENDING state.
   */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /** [Create:OPT Update:OPT] Data classification related config. */
  @JsonProperty("data_classification_config")
  private MonitorDataClassificationConfig dataClassificationConfig;

  /**
   * [Create:ERR Update:IGN] Table that stores drift metrics data. Format:
   * `catalog.schema.table_name`.
   */
  @JsonProperty("drift_metrics_table_name")
  private String driftMetricsTableName;

  /** */
  @JsonProperty("inference_log")
  private MonitorInferenceLog inferenceLog;

  /** [Create:ERR Update:IGN] The latest error message for a monitor failure. */
  @JsonProperty("latest_monitor_failure_msg")
  private String latestMonitorFailureMsg;

  /**
   * [Create:ERR Update:IGN] Represents the current monitor configuration version in use. The
   * version will be represented in a numeric fashion (1,2,3...). The field has flexibility to take
   * on negative values, which can indicate corrupted monitor_version numbers.
   */
  @JsonProperty("monitor_version")
  private Long monitorVersion;

  /** [Create:OPT Update:OPT] Field for specifying notification settings. */
  @JsonProperty("notifications")
  private MonitorNotifications notifications;

  /**
   * [Create:REQ Update:REQ] Schema where output tables are created. Needs to be in 2-level format
   * {catalog}.{schema}
   */
  @JsonProperty("output_schema_name")
  private String outputSchemaName;

  /**
   * [Create:ERR Update:IGN] Table that stores profile metrics data. Format:
   * `catalog.schema.table_name`.
   */
  @JsonProperty("profile_metrics_table_name")
  private String profileMetricsTableName;

  /** [Create:OPT Update:OPT] The monitor schedule. */
  @JsonProperty("schedule")
  private MonitorCronSchedule schedule;

  /**
   * [Create:OPT Update:OPT] List of column expressions to slice data with for targeted analysis.
   * The data is grouped by each expression independently, resulting in a separate slice for each
   * predicate and its complements. For example `slicing_exprs=[“col_1”, “col_2 > 10”]` will
   * generate the following slices: two slices for `col_2 > 10` (True and False), and one slice per
   * unique value in `col1`. For high-cardinality columns, only the top 100 unique values by
   * frequency will generate slices.
   */
  @JsonProperty("slicing_exprs")
  private Collection<String> slicingExprs;

  /** Configuration for monitoring snapshot tables. */
  @JsonProperty("snapshot")
  private MonitorSnapshot snapshot;

  /** [Create:ERR Update:IGN] The monitor status. */
  @JsonProperty("status")
  private MonitorInfoStatus status;

  /** [Create:ERR Update:IGN] UC table to monitor. Format: `catalog.schema.table_name` */
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

  public MonitorInfo setMonitorVersion(Long monitorVersion) {
    this.monitorVersion = monitorVersion;
    return this;
  }

  public Long getMonitorVersion() {
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
