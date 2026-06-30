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

  /** Whether to skip creating a default dashboard summarizing data quality metrics. */
  @JsonProperty("skip_builtin_dashboard")
  private Boolean skipBuiltinDashboard;

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

  public CreateMonitor setLatestMonitorFailureMsg(String latestMonitorFailureMsg) {
    this.latestMonitorFailureMsg = latestMonitorFailureMsg;
    return this;
  }

  public String getLatestMonitorFailureMsg() {
    return latestMonitorFailureMsg;
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
        && Objects.equals(latestMonitorFailureMsg, that.latestMonitorFailureMsg)
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
        latestMonitorFailureMsg,
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
        .add("latestMonitorFailureMsg", latestMonitorFailureMsg)
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
