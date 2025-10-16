// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Data Profiling Configurations. */
@Generated
public class DataProfilingConfig {
  /**
   * Field for specifying the absolute path to a custom directory to store data-monitoring assets.
   * Normally prepopulated to a default user location via UI and Python APIs.
   */
  @JsonProperty("assets_dir")
  private String assetsDir;

  /**
   * Baseline table name. Baseline data is used to compute drift from the data in the monitored
   * `table_name`. The baseline table and the monitored table shall have the same schema.
   */
  @JsonProperty("baseline_table_name")
  private String baselineTableName;

  /** Custom metrics. */
  @JsonProperty("custom_metrics")
  private Collection<DataProfilingCustomMetric> customMetrics;

  /**
   * Id of dashboard that visualizes the computed metrics. This can be empty if the monitor is in
   * PENDING state.
   */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /** Table that stores drift metrics data. Format: `catalog.schema.table_name`. */
  @JsonProperty("drift_metrics_table_name")
  private String driftMetricsTableName;

  /** The warehouse for dashboard creation */
  @JsonProperty("effective_warehouse_id")
  private String effectiveWarehouseId;

  /** `Analysis Configuration` for monitoring inference log tables. */
  @JsonProperty("inference_log")
  private InferenceLogConfig inferenceLog;

  /** The latest error message for a monitor failure. */
  @JsonProperty("latest_monitor_failure_message")
  private String latestMonitorFailureMessage;

  /**
   * Represents the current monitor configuration version in use. The version will be represented in
   * a numeric fashion (1,2,3...). The field has flexibility to take on negative values, which can
   * indicate corrupted monitor_version numbers.
   */
  @JsonProperty("monitor_version")
  private Long monitorVersion;

  /** Unity Catalog table to monitor. Format: `catalog.schema.table_name` */
  @JsonProperty("monitored_table_name")
  private String monitoredTableName;

  /** Field for specifying notification settings. */
  @JsonProperty("notification_settings")
  private NotificationSettings notificationSettings;

  /** ID of the schema where output tables are created. */
  @JsonProperty("output_schema_id")
  private String outputSchemaId;

  /** Table that stores profile metrics data. Format: `catalog.schema.table_name`. */
  @JsonProperty("profile_metrics_table_name")
  private String profileMetricsTableName;

  /** The cron schedule. */
  @JsonProperty("schedule")
  private CronSchedule schedule;

  /** Whether to skip creating a default dashboard summarizing data quality metrics. */
  @JsonProperty("skip_builtin_dashboard")
  private Boolean skipBuiltinDashboard;

  /**
   * List of column expressions to slice data with for targeted analysis. The data is grouped by
   * each expression independently, resulting in a separate slice for each predicate and its
   * complements. For example `slicing_exprs=[“col_1”, “col_2 > 10”]` will generate the following
   * slices: two slices for `col_2 > 10` (True and False), and one slice per unique value in `col1`.
   * For high-cardinality columns, only the top 100 unique values by frequency will generate slices.
   */
  @JsonProperty("slicing_exprs")
  private Collection<String> slicingExprs;

  /** `Analysis Configuration` for monitoring snapshot tables. */
  @JsonProperty("snapshot")
  private SnapshotConfig snapshot;

  /** The data profiling monitor status. */
  @JsonProperty("status")
  private DataProfilingStatus status;

  /** `Analysis Configuration` for monitoring time series tables. */
  @JsonProperty("time_series")
  private TimeSeriesConfig timeSeries;

  /**
   * Optional argument to specify the warehouse for dashboard creation. If not specified, the first
   * running warehouse will be used.
   */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public DataProfilingConfig setAssetsDir(String assetsDir) {
    this.assetsDir = assetsDir;
    return this;
  }

  public String getAssetsDir() {
    return assetsDir;
  }

  public DataProfilingConfig setBaselineTableName(String baselineTableName) {
    this.baselineTableName = baselineTableName;
    return this;
  }

  public String getBaselineTableName() {
    return baselineTableName;
  }

  public DataProfilingConfig setCustomMetrics(Collection<DataProfilingCustomMetric> customMetrics) {
    this.customMetrics = customMetrics;
    return this;
  }

  public Collection<DataProfilingCustomMetric> getCustomMetrics() {
    return customMetrics;
  }

  public DataProfilingConfig setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public DataProfilingConfig setDriftMetricsTableName(String driftMetricsTableName) {
    this.driftMetricsTableName = driftMetricsTableName;
    return this;
  }

  public String getDriftMetricsTableName() {
    return driftMetricsTableName;
  }

  public DataProfilingConfig setEffectiveWarehouseId(String effectiveWarehouseId) {
    this.effectiveWarehouseId = effectiveWarehouseId;
    return this;
  }

  public String getEffectiveWarehouseId() {
    return effectiveWarehouseId;
  }

  public DataProfilingConfig setInferenceLog(InferenceLogConfig inferenceLog) {
    this.inferenceLog = inferenceLog;
    return this;
  }

  public InferenceLogConfig getInferenceLog() {
    return inferenceLog;
  }

  public DataProfilingConfig setLatestMonitorFailureMessage(String latestMonitorFailureMessage) {
    this.latestMonitorFailureMessage = latestMonitorFailureMessage;
    return this;
  }

  public String getLatestMonitorFailureMessage() {
    return latestMonitorFailureMessage;
  }

  public DataProfilingConfig setMonitorVersion(Long monitorVersion) {
    this.monitorVersion = monitorVersion;
    return this;
  }

  public Long getMonitorVersion() {
    return monitorVersion;
  }

  public DataProfilingConfig setMonitoredTableName(String monitoredTableName) {
    this.monitoredTableName = monitoredTableName;
    return this;
  }

  public String getMonitoredTableName() {
    return monitoredTableName;
  }

  public DataProfilingConfig setNotificationSettings(NotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  public NotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public DataProfilingConfig setOutputSchemaId(String outputSchemaId) {
    this.outputSchemaId = outputSchemaId;
    return this;
  }

  public String getOutputSchemaId() {
    return outputSchemaId;
  }

  public DataProfilingConfig setProfileMetricsTableName(String profileMetricsTableName) {
    this.profileMetricsTableName = profileMetricsTableName;
    return this;
  }

  public String getProfileMetricsTableName() {
    return profileMetricsTableName;
  }

  public DataProfilingConfig setSchedule(CronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public CronSchedule getSchedule() {
    return schedule;
  }

  public DataProfilingConfig setSkipBuiltinDashboard(Boolean skipBuiltinDashboard) {
    this.skipBuiltinDashboard = skipBuiltinDashboard;
    return this;
  }

  public Boolean getSkipBuiltinDashboard() {
    return skipBuiltinDashboard;
  }

  public DataProfilingConfig setSlicingExprs(Collection<String> slicingExprs) {
    this.slicingExprs = slicingExprs;
    return this;
  }

  public Collection<String> getSlicingExprs() {
    return slicingExprs;
  }

  public DataProfilingConfig setSnapshot(SnapshotConfig snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  public SnapshotConfig getSnapshot() {
    return snapshot;
  }

  public DataProfilingConfig setStatus(DataProfilingStatus status) {
    this.status = status;
    return this;
  }

  public DataProfilingStatus getStatus() {
    return status;
  }

  public DataProfilingConfig setTimeSeries(TimeSeriesConfig timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  public TimeSeriesConfig getTimeSeries() {
    return timeSeries;
  }

  public DataProfilingConfig setWarehouseId(String warehouseId) {
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
    DataProfilingConfig that = (DataProfilingConfig) o;
    return Objects.equals(assetsDir, that.assetsDir)
        && Objects.equals(baselineTableName, that.baselineTableName)
        && Objects.equals(customMetrics, that.customMetrics)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(driftMetricsTableName, that.driftMetricsTableName)
        && Objects.equals(effectiveWarehouseId, that.effectiveWarehouseId)
        && Objects.equals(inferenceLog, that.inferenceLog)
        && Objects.equals(latestMonitorFailureMessage, that.latestMonitorFailureMessage)
        && Objects.equals(monitorVersion, that.monitorVersion)
        && Objects.equals(monitoredTableName, that.monitoredTableName)
        && Objects.equals(notificationSettings, that.notificationSettings)
        && Objects.equals(outputSchemaId, that.outputSchemaId)
        && Objects.equals(profileMetricsTableName, that.profileMetricsTableName)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(skipBuiltinDashboard, that.skipBuiltinDashboard)
        && Objects.equals(slicingExprs, that.slicingExprs)
        && Objects.equals(snapshot, that.snapshot)
        && Objects.equals(status, that.status)
        && Objects.equals(timeSeries, that.timeSeries)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assetsDir,
        baselineTableName,
        customMetrics,
        dashboardId,
        driftMetricsTableName,
        effectiveWarehouseId,
        inferenceLog,
        latestMonitorFailureMessage,
        monitorVersion,
        monitoredTableName,
        notificationSettings,
        outputSchemaId,
        profileMetricsTableName,
        schedule,
        skipBuiltinDashboard,
        slicingExprs,
        snapshot,
        status,
        timeSeries,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(DataProfilingConfig.class)
        .add("assetsDir", assetsDir)
        .add("baselineTableName", baselineTableName)
        .add("customMetrics", customMetrics)
        .add("dashboardId", dashboardId)
        .add("driftMetricsTableName", driftMetricsTableName)
        .add("effectiveWarehouseId", effectiveWarehouseId)
        .add("inferenceLog", inferenceLog)
        .add("latestMonitorFailureMessage", latestMonitorFailureMessage)
        .add("monitorVersion", monitorVersion)
        .add("monitoredTableName", monitoredTableName)
        .add("notificationSettings", notificationSettings)
        .add("outputSchemaId", outputSchemaId)
        .add("profileMetricsTableName", profileMetricsTableName)
        .add("schedule", schedule)
        .add("skipBuiltinDashboard", skipBuiltinDashboard)
        .add("slicingExprs", slicingExprs)
        .add("snapshot", snapshot)
        .add("status", status)
        .add("timeSeries", timeSeries)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
