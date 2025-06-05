// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = UpdateMonitor.UpdateMonitorSerializer.class)
@JsonDeserialize(using = UpdateMonitor.UpdateMonitorDeserializer.class)
public class UpdateMonitor {
  /**
   * Name of the baseline table from which drift metrics are computed from. Columns in the monitored
   * table should also be present in the baseline table.
   */
  private String baselineTableName;

  /**
   * Custom metrics to compute on the monitored table. These can be aggregate metrics, derived
   * metrics (from already computed aggregate metrics), or drift metrics (comparing metrics across
   * time windows).
   */
  private Collection<MonitorMetric> customMetrics;

  /**
   * Id of dashboard that visualizes the computed metrics. This can be empty if the monitor is in
   * PENDING state.
   */
  private String dashboardId;

  /** The data classification config for the monitor. */
  private MonitorDataClassificationConfig dataClassificationConfig;

  /** Configuration for monitoring inference logs. */
  private MonitorInferenceLog inferenceLog;

  /** The notification settings for the monitor. */
  private MonitorNotifications notifications;

  /** Schema where output metric tables are created. */
  private String outputSchemaName;

  /** The schedule for automatically updating and refreshing metric tables. */
  private MonitorCronSchedule schedule;

  /**
   * List of column expressions to slice data with for targeted analysis. The data is grouped by
   * each expression independently, resulting in a separate slice for each predicate and its
   * complements. For high-cardinality columns, only the top 100 unique values by frequency will
   * generate slices.
   */
  private Collection<String> slicingExprs;

  /** Configuration for monitoring snapshot tables. */
  private MonitorSnapshot snapshot;

  /** Full name of the table. */
  private String tableName;

  /** Configuration for monitoring time series tables. */
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
    return new ToStringer(UpdateMonitor.class)
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

  UpdateMonitorPb toPb() {
    UpdateMonitorPb pb = new UpdateMonitorPb();
    pb.setBaselineTableName(baselineTableName);
    pb.setCustomMetrics(customMetrics);
    pb.setDashboardId(dashboardId);
    pb.setDataClassificationConfig(dataClassificationConfig);
    pb.setInferenceLog(inferenceLog);
    pb.setNotifications(notifications);
    pb.setOutputSchemaName(outputSchemaName);
    pb.setSchedule(schedule);
    pb.setSlicingExprs(slicingExprs);
    pb.setSnapshot(snapshot);
    pb.setTableName(tableName);
    pb.setTimeSeries(timeSeries);

    return pb;
  }

  static UpdateMonitor fromPb(UpdateMonitorPb pb) {
    UpdateMonitor model = new UpdateMonitor();
    model.setBaselineTableName(pb.getBaselineTableName());
    model.setCustomMetrics(pb.getCustomMetrics());
    model.setDashboardId(pb.getDashboardId());
    model.setDataClassificationConfig(pb.getDataClassificationConfig());
    model.setInferenceLog(pb.getInferenceLog());
    model.setNotifications(pb.getNotifications());
    model.setOutputSchemaName(pb.getOutputSchemaName());
    model.setSchedule(pb.getSchedule());
    model.setSlicingExprs(pb.getSlicingExprs());
    model.setSnapshot(pb.getSnapshot());
    model.setTableName(pb.getTableName());
    model.setTimeSeries(pb.getTimeSeries());

    return model;
  }

  public static class UpdateMonitorSerializer extends JsonSerializer<UpdateMonitor> {
    @Override
    public void serialize(UpdateMonitor value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateMonitorPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateMonitorDeserializer extends JsonDeserializer<UpdateMonitor> {
    @Override
    public UpdateMonitor deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateMonitorPb pb = mapper.readValue(p, UpdateMonitorPb.class);
      return UpdateMonitor.fromPb(pb);
    }
  }
}
