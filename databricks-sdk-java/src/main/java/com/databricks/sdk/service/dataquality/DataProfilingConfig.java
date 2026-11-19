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
   * The absolute workspace path of the directory where the monitor's assets, such as the dashboard,
   * are stored. The UI and the Python APIs normally prepopulate a default user location.
   */
  @JsonProperty("assets_dir")
  private String assetsDir;

  /**
   * The fully qualified name of a baseline table. Format: `catalog.schema.table_name`. Drift
   * metrics compare the monitored table against the baseline data, so the two tables must have the
   * same schema.
   */
  @JsonProperty("baseline_table_name")
  private String baselineTableName;

  /**
   * Custom metrics to compute in addition to the built-in ones. See [custom metrics].
   *
   * <p>[custom metrics]:
   * https://docs.databricks.com/aws/en/data-governance/unity-catalog/data-quality-monitoring/data-profiling/custom-metrics
   */
  @JsonProperty("custom_metrics")
  private Collection<DataProfilingCustomMetric> customMetrics;

  /**
   * The ID of the dashboard that visualizes the computed metrics. It is empty while the monitor is
   * pending, when the dashboard was skipped with `skip_builtin_dashboard`, or when the caller is in
   * a different workspace from the one where the monitor was created.
   */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /** Table that stores drift metrics data. Format: `catalog.schema.table_name`. */
  @JsonProperty("drift_metrics_table_name")
  private String driftMetricsTableName;

  /** The warehouse for dashboard creation */
  @JsonProperty("effective_warehouse_id")
  private String effectiveWarehouseId;

  /**
   * Profiles an inference log table, which stores the requests and predictions of a model. Metrics
   * are computed per time window and include model quality metrics.
   */
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

  /** The fully qualified name of the monitored table. Format: `catalog.schema.table_name`. */
  @JsonProperty("monitored_table_name")
  private String monitoredTableName;

  /**
   * Who to notify about this monitor's refreshes. Only `on_failure` with `email_addresses` is
   * supported here.
   */
  @JsonProperty("notification_settings")
  private NotificationSettings notificationSettings;

  /**
   * The UUID of the Unity Catalog schema where the profile and drift metrics tables are created.
   */
  @JsonProperty("output_schema_id")
  private String outputSchemaId;

  /** Table that stores profile metrics data. Format: `catalog.schema.table_name`. */
  @JsonProperty("profile_metrics_table_name")
  private String profileMetricsTableName;

  /**
   * The schedule on which the monitor refreshes its metrics. Refreshes can also be triggered on
   * demand through the Refresh resource.
   */
  @JsonProperty("schedule")
  private CronSchedule schedule;

  /** Whether to skip creating a default dashboard summarizing data quality metrics. */
  @JsonProperty("skip_builtin_dashboard")
  private Boolean skipBuiltinDashboard;

  /**
   * List of column expressions to slice data with for targeted analysis. The data is grouped by
   * each expression independently, resulting in a separate slice for each predicate and its
   * complements. For example `slicing_exprs=["col_1", "col_2 > 10"]` will generate the following
   * slices: two slices for `col_2 > 10` (True and False), and one slice per unique value in
   * `col_1`. For high-cardinality columns, only the top 100 unique values by frequency will
   * generate slices.
   */
  @JsonProperty("slicing_exprs")
  private Collection<String> slicingExprs;

  /**
   * Profiles the full contents of the table. Metrics are computed over all rows at each refresh.
   */
  @JsonProperty("snapshot")
  private SnapshotConfig snapshot;

  /**
   * The status of the monitor. `DATA_PROFILING_STATUS_PENDING` means the monitor's assets are being
   * created or updated. `DATA_PROFILING_STATUS_ACTIVE` means the monitor is ready and can be
   * refreshed. `DATA_PROFILING_STATUS_FAILED` and `DATA_PROFILING_STATUS_ERROR` mean the monitor is
   * not operational, and `latest_monitor_failure_message` describes the cause when one was
   * recorded. `DATA_PROFILING_STATUS_DELETE_PENDING` means the monitor is being deleted.
   */
  @JsonProperty("status")
  private DataProfilingStatus status;

  /**
   * Profiles a time series table. Metrics are computed per time window, as defined by
   * `timestamp_column` and `granularities`.
   */
  @JsonProperty("time_series")
  private TimeSeriesConfig timeSeries;

  /**
   * The ID of the SQL warehouse used to create the dashboard. If not specified, the first running
   * warehouse the caller can access is used.
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
