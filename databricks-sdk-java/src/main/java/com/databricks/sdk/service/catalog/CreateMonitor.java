// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateMonitor {
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

  /** The data classification config for the monitor. */
  @JsonProperty("data_classification_config")
  private MonitorDataClassificationConfig dataClassificationConfig;

  /** Configuration for monitoring inference logs. */
  @JsonProperty("inference_log")
  private MonitorInferenceLog inferenceLog;

  /** The notification settings for the monitor. */
  @JsonProperty("notifications")
  private MonitorNotifications notifications;

  /** Schema where output metric tables are created. */
  @JsonProperty("output_schema_name")
  private String outputSchemaName;

  /** The schedule for automatically updating and refreshing metric tables. */
  @JsonProperty("schedule")
  private MonitorCronSchedule schedule;

  /** Whether to skip creating a default dashboard summarizing data quality metrics. */
  @JsonProperty("skip_builtin_dashboard")
  private Boolean skipBuiltinDashboard;

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

  /** Full name of the table. */
  @JsonIgnore private String tableName;

  /** Configuration for monitoring time series tables. */
  @JsonProperty("time_series")
  private MonitorTimeSeries timeSeries;

  /**
   * Optional argument to specify the warehouse for dashboard creation. If not specified, the first
   * running warehouse will be used.
   */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public CreateMonitor setAssetsDir(String assetsDir) {
    this.assetsDir = assetsDir;
    return this;
  }

  public String getAssetsDir() {
    return assetsDir;
  }

  public CreateMonitor setBaselineTableName(String baselineTableName) {
    this.baselineTableName = baselineTableName;
    return this;
  }

  public String getBaselineTableName() {
    return baselineTableName;
  }

  public CreateMonitor setCustomMetrics(Collection<MonitorMetric> customMetrics) {
    this.customMetrics = customMetrics;
    return this;
  }

  public Collection<MonitorMetric> getCustomMetrics() {
    return customMetrics;
  }

  public CreateMonitor setDataClassificationConfig(
      MonitorDataClassificationConfig dataClassificationConfig) {
    this.dataClassificationConfig = dataClassificationConfig;
    return this;
  }

  public MonitorDataClassificationConfig getDataClassificationConfig() {
    return dataClassificationConfig;
  }

  public CreateMonitor setInferenceLog(MonitorInferenceLog inferenceLog) {
    this.inferenceLog = inferenceLog;
    return this;
  }

  public MonitorInferenceLog getInferenceLog() {
    return inferenceLog;
  }

  public CreateMonitor setNotifications(MonitorNotifications notifications) {
    this.notifications = notifications;
    return this;
  }

  public MonitorNotifications getNotifications() {
    return notifications;
  }

  public CreateMonitor setOutputSchemaName(String outputSchemaName) {
    this.outputSchemaName = outputSchemaName;
    return this;
  }

  public String getOutputSchemaName() {
    return outputSchemaName;
  }

  public CreateMonitor setSchedule(MonitorCronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public MonitorCronSchedule getSchedule() {
    return schedule;
  }

  public CreateMonitor setSkipBuiltinDashboard(Boolean skipBuiltinDashboard) {
    this.skipBuiltinDashboard = skipBuiltinDashboard;
    return this;
  }

  public Boolean getSkipBuiltinDashboard() {
    return skipBuiltinDashboard;
  }

  public CreateMonitor setSlicingExprs(Collection<String> slicingExprs) {
    this.slicingExprs = slicingExprs;
    return this;
  }

  public Collection<String> getSlicingExprs() {
    return slicingExprs;
  }

  public CreateMonitor setSnapshot(MonitorSnapshot snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  public MonitorSnapshot getSnapshot() {
    return snapshot;
  }

  public CreateMonitor setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  public CreateMonitor setTimeSeries(MonitorTimeSeries timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  public MonitorTimeSeries getTimeSeries() {
    return timeSeries;
  }

  public CreateMonitor setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateMonitor that = (CreateMonitor) o;
    return Objects.equals(assetsDir, that.assetsDir)
        && Objects.equals(baselineTableName, that.baselineTableName)
        && Objects.equals(customMetrics, that.customMetrics)
        && Objects.equals(dataClassificationConfig, that.dataClassificationConfig)
        && Objects.equals(inferenceLog, that.inferenceLog)
        && Objects.equals(notifications, that.notifications)
        && Objects.equals(outputSchemaName, that.outputSchemaName)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(skipBuiltinDashboard, that.skipBuiltinDashboard)
        && Objects.equals(slicingExprs, that.slicingExprs)
        && Objects.equals(snapshot, that.snapshot)
        && Objects.equals(tableName, that.tableName)
        && Objects.equals(timeSeries, that.timeSeries)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assetsDir,
        baselineTableName,
        customMetrics,
        dataClassificationConfig,
        inferenceLog,
        notifications,
        outputSchemaName,
        schedule,
        skipBuiltinDashboard,
        slicingExprs,
        snapshot,
        tableName,
        timeSeries,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateMonitor.class)
        .add("assetsDir", assetsDir)
        .add("baselineTableName", baselineTableName)
        .add("customMetrics", customMetrics)
        .add("dataClassificationConfig", dataClassificationConfig)
        .add("inferenceLog", inferenceLog)
        .add("notifications", notifications)
        .add("outputSchemaName", outputSchemaName)
        .add("schedule", schedule)
        .add("skipBuiltinDashboard", skipBuiltinDashboard)
        .add("slicingExprs", slicingExprs)
        .add("snapshot", snapshot)
        .add("tableName", tableName)
        .add("timeSeries", timeSeries)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
