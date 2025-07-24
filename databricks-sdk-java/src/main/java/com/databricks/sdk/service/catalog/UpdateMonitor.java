// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class UpdateMonitor {
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

  /** */
  @JsonProperty("inference_log")
  private MonitorInferenceLog inferenceLog;

  /** [Create:ERR Update:IGN] The latest error message for a monitor failure. */
  @JsonProperty("latest_monitor_failure_msg")
  private String latestMonitorFailureMsg;

  /** [Create:OPT Update:OPT] Field for specifying notification settings. */
  @JsonProperty("notifications")
  private MonitorNotifications notifications;

  /**
   * [Create:REQ Update:REQ] Schema where output tables are created. Needs to be in 2-level format
   * {catalog}.{schema}
   */
  @JsonProperty("output_schema_name")
  private String outputSchemaName;

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

  /**
   * UC table name in format `catalog.schema.table_name`. This field corresponds to the
   * {full_table_name_arg} arg in the endpoint path.
   */
  @JsonIgnore private String tableName;

  /** Configuration for monitoring time series tables. */
  @JsonProperty("time_series")
  private MonitorTimeSeries timeSeries;

  public UpdateMonitor setBaselineTableName(String baselineTableName) {
    this.baselineTableName = baselineTableName;
    return this;
  }

  public String getBaselineTableName() {
    return baselineTableName;
  }

  public UpdateMonitor setCustomMetrics(Collection<MonitorMetric> customMetrics) {
    this.customMetrics = customMetrics;
    return this;
  }

  public Collection<MonitorMetric> getCustomMetrics() {
    return customMetrics;
  }

  public UpdateMonitor setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public UpdateMonitor setDataClassificationConfig(
      MonitorDataClassificationConfig dataClassificationConfig) {
    this.dataClassificationConfig = dataClassificationConfig;
    return this;
  }

  public MonitorDataClassificationConfig getDataClassificationConfig() {
    return dataClassificationConfig;
  }

  public UpdateMonitor setInferenceLog(MonitorInferenceLog inferenceLog) {
    this.inferenceLog = inferenceLog;
    return this;
  }

  public MonitorInferenceLog getInferenceLog() {
    return inferenceLog;
  }

  public UpdateMonitor setLatestMonitorFailureMsg(String latestMonitorFailureMsg) {
    this.latestMonitorFailureMsg = latestMonitorFailureMsg;
    return this;
  }

  public String getLatestMonitorFailureMsg() {
    return latestMonitorFailureMsg;
  }

  public UpdateMonitor setNotifications(MonitorNotifications notifications) {
    this.notifications = notifications;
    return this;
  }

  public MonitorNotifications getNotifications() {
    return notifications;
  }

  public UpdateMonitor setOutputSchemaName(String outputSchemaName) {
    this.outputSchemaName = outputSchemaName;
    return this;
  }

  public String getOutputSchemaName() {
    return outputSchemaName;
  }

  public UpdateMonitor setSchedule(MonitorCronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public MonitorCronSchedule getSchedule() {
    return schedule;
  }

  public UpdateMonitor setSlicingExprs(Collection<String> slicingExprs) {
    this.slicingExprs = slicingExprs;
    return this;
  }

  public Collection<String> getSlicingExprs() {
    return slicingExprs;
  }

  public UpdateMonitor setSnapshot(MonitorSnapshot snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  public MonitorSnapshot getSnapshot() {
    return snapshot;
  }

  public UpdateMonitor setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  public UpdateMonitor setTimeSeries(MonitorTimeSeries timeSeries) {
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
    UpdateMonitor that = (UpdateMonitor) o;
    return Objects.equals(baselineTableName, that.baselineTableName)
        && Objects.equals(customMetrics, that.customMetrics)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(dataClassificationConfig, that.dataClassificationConfig)
        && Objects.equals(inferenceLog, that.inferenceLog)
        && Objects.equals(latestMonitorFailureMsg, that.latestMonitorFailureMsg)
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
        latestMonitorFailureMsg,
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
    return new ToStringer(UpdateMonitor.class)
        .add("baselineTableName", baselineTableName)
        .add("customMetrics", customMetrics)
        .add("dashboardId", dashboardId)
        .add("dataClassificationConfig", dataClassificationConfig)
        .add("inferenceLog", inferenceLog)
        .add("latestMonitorFailureMsg", latestMonitorFailureMsg)
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
