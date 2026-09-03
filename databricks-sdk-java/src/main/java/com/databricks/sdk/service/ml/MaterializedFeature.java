// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A materialized feature represents a feature that is continuously computed and stored. */
@Generated
public class MaterializedFeature {
  /** A cron-based schedule trigger for the materialization pipeline. */
  @JsonProperty("cron_schedule_trigger")
  private CronSchedule cronScheduleTrigger;

  /** The full name of the feature in Unity Catalog. */
  @JsonProperty("feature_name")
  private String featureName;

  /**
   * True if this is an online materialized feature. False if it is an offline materialized feature.
   */
  @JsonProperty("is_online")
  private Boolean isOnline;

  /**
   * The timestamp when the pipeline last ran and updated the materialized feature values. If the
   * pipeline has not run yet, this field will be null.
   */
  @JsonProperty("last_materialization_time")
  private String lastMaterializationTime;

  /**
   * Name of the latest backfill operation on this materialized feature. Format:
   * operations/{operation_id}.
   */
  @JsonProperty("latest_backfill_operation")
  private String latestBackfillOperation;

  /** Server-assigned unique identifier for the materialized feature. */
  @JsonProperty("materialized_feature_id")
  private String materializedFeatureId;

  /** Destination for writing feature values to an offline Delta table. */
  @JsonProperty("offline_store_config")
  private OfflineStoreConfig offlineStoreConfig;

  /** Destination for writing feature values to an online Lakebase table. */
  @JsonProperty("online_store_config")
  private OnlineStoreConfig onlineStoreConfig;

  /**
   * The schedule state of the materialization pipeline. Hidden from GraphQL: being deprecated, so
   * not exposed to Catalog Explorer.
   */
  @JsonProperty("pipeline_schedule_state")
  private MaterializedFeaturePipelineScheduleState pipelineScheduleState;

  /**
   * The Structured Streaming trigger mode used for materialization. Real-time mode (RTM) targets
   * sub-second latency for operational workloads; micro-batch mode (MBM) favors cost efficiency for
   * ETL and analytics workloads.
   */
  @JsonProperty("streaming_mode")
  private StreamingMode streamingMode;

  /**
   * The fully qualified Unity Catalog path to the table containing the materialized feature (Delta
   * table or Lakebase table). Output only.
   */
  @JsonProperty("table_name")
  private String tableName;

  /** A trigger that fires when the upstream source table changes. */
  @JsonProperty("table_trigger")
  private TableTrigger tableTrigger;

  public MaterializedFeature setCronScheduleTrigger(CronSchedule cronScheduleTrigger) {
    this.cronScheduleTrigger = cronScheduleTrigger;
    return this;
  }

  public CronSchedule getCronScheduleTrigger() {
    return cronScheduleTrigger;
  }

  public MaterializedFeature setFeatureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

  public String getFeatureName() {
    return featureName;
  }

  public MaterializedFeature setIsOnline(Boolean isOnline) {
    this.isOnline = isOnline;
    return this;
  }

  public Boolean getIsOnline() {
    return isOnline;
  }

  public MaterializedFeature setLastMaterializationTime(String lastMaterializationTime) {
    this.lastMaterializationTime = lastMaterializationTime;
    return this;
  }

  public String getLastMaterializationTime() {
    return lastMaterializationTime;
  }

  public MaterializedFeature setLatestBackfillOperation(String latestBackfillOperation) {
    this.latestBackfillOperation = latestBackfillOperation;
    return this;
  }

  public String getLatestBackfillOperation() {
    return latestBackfillOperation;
  }

  public MaterializedFeature setMaterializedFeatureId(String materializedFeatureId) {
    this.materializedFeatureId = materializedFeatureId;
    return this;
  }

  public String getMaterializedFeatureId() {
    return materializedFeatureId;
  }

  public MaterializedFeature setOfflineStoreConfig(OfflineStoreConfig offlineStoreConfig) {
    this.offlineStoreConfig = offlineStoreConfig;
    return this;
  }

  public OfflineStoreConfig getOfflineStoreConfig() {
    return offlineStoreConfig;
  }

  public MaterializedFeature setOnlineStoreConfig(OnlineStoreConfig onlineStoreConfig) {
    this.onlineStoreConfig = onlineStoreConfig;
    return this;
  }

  public OnlineStoreConfig getOnlineStoreConfig() {
    return onlineStoreConfig;
  }

  public MaterializedFeature setPipelineScheduleState(
      MaterializedFeaturePipelineScheduleState pipelineScheduleState) {
    this.pipelineScheduleState = pipelineScheduleState;
    return this;
  }

  public MaterializedFeaturePipelineScheduleState getPipelineScheduleState() {
    return pipelineScheduleState;
  }

  public MaterializedFeature setStreamingMode(StreamingMode streamingMode) {
    this.streamingMode = streamingMode;
    return this;
  }

  public StreamingMode getStreamingMode() {
    return streamingMode;
  }

  public MaterializedFeature setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  public MaterializedFeature setTableTrigger(TableTrigger tableTrigger) {
    this.tableTrigger = tableTrigger;
    return this;
  }

  public TableTrigger getTableTrigger() {
    return tableTrigger;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaterializedFeature that = (MaterializedFeature) o;
    return Objects.equals(cronScheduleTrigger, that.cronScheduleTrigger)
        && Objects.equals(featureName, that.featureName)
        && Objects.equals(isOnline, that.isOnline)
        && Objects.equals(lastMaterializationTime, that.lastMaterializationTime)
        && Objects.equals(latestBackfillOperation, that.latestBackfillOperation)
        && Objects.equals(materializedFeatureId, that.materializedFeatureId)
        && Objects.equals(offlineStoreConfig, that.offlineStoreConfig)
        && Objects.equals(onlineStoreConfig, that.onlineStoreConfig)
        && Objects.equals(pipelineScheduleState, that.pipelineScheduleState)
        && Objects.equals(streamingMode, that.streamingMode)
        && Objects.equals(tableName, that.tableName)
        && Objects.equals(tableTrigger, that.tableTrigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cronScheduleTrigger,
        featureName,
        isOnline,
        lastMaterializationTime,
        latestBackfillOperation,
        materializedFeatureId,
        offlineStoreConfig,
        onlineStoreConfig,
        pipelineScheduleState,
        streamingMode,
        tableName,
        tableTrigger);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializedFeature.class)
        .add("cronScheduleTrigger", cronScheduleTrigger)
        .add("featureName", featureName)
        .add("isOnline", isOnline)
        .add("lastMaterializationTime", lastMaterializationTime)
        .add("latestBackfillOperation", latestBackfillOperation)
        .add("materializedFeatureId", materializedFeatureId)
        .add("offlineStoreConfig", offlineStoreConfig)
        .add("onlineStoreConfig", onlineStoreConfig)
        .add("pipelineScheduleState", pipelineScheduleState)
        .add("streamingMode", streamingMode)
        .add("tableName", tableName)
        .add("tableTrigger", tableTrigger)
        .toString();
  }
}
