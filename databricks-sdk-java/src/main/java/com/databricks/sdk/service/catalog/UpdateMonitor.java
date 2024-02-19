// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class UpdateMonitor {
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
  private Collection<MonitorCustomMetric> customMetrics;

  /** The data classification config for the monitor. */
  @JsonProperty("data_classification_config")
  private MonitorDataClassificationConfig dataClassificationConfig;

  /** Full name of the table. */
  private String fullName;

  /** Configuration for monitoring inference logs. */
  @JsonProperty("inference_log")
  private MonitorInferenceLogProfileType inferenceLog;

  /** The notification settings for the monitor. */
  @JsonProperty("notifications")
  private Collection<MonitorNotificationsConfig> notifications;

  /** Schema where output metric tables are created. */
  @JsonProperty("output_schema_name")
  private String outputSchemaName;

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
  private Object snapshot;

  /** Configuration for monitoring time series tables. */
  @JsonProperty("time_series")
  private MonitorTimeSeriesProfileType timeSeries;

  public UpdateMonitor setBaselineTableName(String baselineTableName) {
    this.baselineTableName = baselineTableName;
    return this;
  }

  public String getBaselineTableName() {
    return baselineTableName;
  }

  public UpdateMonitor setCustomMetrics(Collection<MonitorCustomMetric> customMetrics) {
    this.customMetrics = customMetrics;
    return this;
  }

  public Collection<MonitorCustomMetric> getCustomMetrics() {
    return customMetrics;
  }

  public UpdateMonitor setDataClassificationConfig(
      MonitorDataClassificationConfig dataClassificationConfig) {
    this.dataClassificationConfig = dataClassificationConfig;
    return this;
  }

  public MonitorDataClassificationConfig getDataClassificationConfig() {
    return dataClassificationConfig;
  }

  public UpdateMonitor setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdateMonitor setInferenceLog(MonitorInferenceLogProfileType inferenceLog) {
    this.inferenceLog = inferenceLog;
    return this;
  }

  public MonitorInferenceLogProfileType getInferenceLog() {
    return inferenceLog;
  }

  public UpdateMonitor setNotifications(Collection<MonitorNotificationsConfig> notifications) {
    this.notifications = notifications;
    return this;
  }

  public Collection<MonitorNotificationsConfig> getNotifications() {
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

  public UpdateMonitor setSnapshot(Object snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  public Object getSnapshot() {
    return snapshot;
  }

  public UpdateMonitor setTimeSeries(MonitorTimeSeriesProfileType timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  public MonitorTimeSeriesProfileType getTimeSeries() {
    return timeSeries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateMonitor that = (UpdateMonitor) o;
    return Objects.equals(baselineTableName, that.baselineTableName)
        && Objects.equals(customMetrics, that.customMetrics)
        && Objects.equals(dataClassificationConfig, that.dataClassificationConfig)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(inferenceLog, that.inferenceLog)
        && Objects.equals(notifications, that.notifications)
        && Objects.equals(outputSchemaName, that.outputSchemaName)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(slicingExprs, that.slicingExprs)
        && Objects.equals(snapshot, that.snapshot)
        && Objects.equals(timeSeries, that.timeSeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        baselineTableName,
        customMetrics,
        dataClassificationConfig,
        fullName,
        inferenceLog,
        notifications,
        outputSchemaName,
        schedule,
        slicingExprs,
        snapshot,
        timeSeries);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateMonitor.class)
        .add("baselineTableName", baselineTableName)
        .add("customMetrics", customMetrics)
        .add("dataClassificationConfig", dataClassificationConfig)
        .add("fullName", fullName)
        .add("inferenceLog", inferenceLog)
        .add("notifications", notifications)
        .add("outputSchemaName", outputSchemaName)
        .add("schedule", schedule)
        .add("slicingExprs", slicingExprs)
        .add("snapshot", snapshot)
        .add("timeSeries", timeSeries)
        .toString();
  }
}
