// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/** A materialized feature represents a feature that is continuously computed and stored. */
@Generated
public class MaterializedFeature {
  /**
   * The ID of the budget policy used to attribute the serverless compute cost of this
   * materialization. If not specified, a default budget policy may be applied.
   */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /** */
  @JsonProperty("cron_schedule")
  private String cronSchedule;

  /** A cron-based schedule trigger for batch materialization. */
  @JsonProperty("cron_schedule_trigger")
  private CronSchedule cronScheduleTrigger;

  /**
   * A trigger that disables automatic materialization, including the initial run at creation. Runs
   * are instead triggered through the `TriggerMaterializationSet` API. Supported only for batch
   * materializations in a materialization set.
   */
  @JsonProperty("external_trigger")
  private ExternalTrigger externalTrigger;

  /** The full name of the feature in Unity Catalog. */
  @JsonProperty("feature_name")
  private String featureName;

  /**
   * True if this is an online materialized feature. False if it is an offline materialized feature.
   */
  @JsonProperty("is_online")
  private Boolean isOnline;

  /**
   * The ID of the job that materializes the feature. This is present for both batch and streaming
   * features.
   */
  @JsonProperty("job_id")
  private Long jobId;

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

  /**
   * The ID of the materialization set containing this materialized feature. Unset for a
   * materialized feature that is not part of a set.
   */
  @JsonProperty("materialization_set_id")
  private String materializationSetId;

  /** Server-assigned unique identifier for the materialized feature. */
  @JsonProperty("materialized_feature_id")
  private String materializedFeatureId;

  /** Notification configuration for the jobs and pipelines that materialize this feature. */
  @JsonProperty("notifications")
  private MaterializationNotifications notifications;

  /**
   * Destination for writing feature values to an offline Delta table. The resulting table is
   * returned as `table_name`.
   */
  @JsonProperty("offline_store_config")
  private OfflineStoreConfig offlineStoreConfig;

  /**
   * Destination for writing feature values to an online Lakebase table. The resulting table is
   * returned as `table_name`.
   */
  @JsonProperty("online_store_config")
  private OnlineStoreConfig onlineStoreConfig;

  /**
   * The ID of the pipeline that materializes this feature. This is only present for streaming
   * features.
   */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /** Deprecated: This legacy pipeline setting does not control batch job scheduling. */
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

  /** A trigger that starts batch materialization when the upstream source table changes. */
  @JsonProperty("table_trigger")
  private TableTrigger tableTrigger;

  /**
   * Custom tags to associate with this materialization. They are applied to the materialization job
   * (for batch features) or pipeline (for streaming features) and forwarded to the underlying
   * compute as cluster tags, so materialization cost can be attributed in the billing system
   * tables. These tags apply only to the materialization compute; they are not applied to the Unity
   * Catalog Feature resource itself, whose tags are managed separately through the Unity Catalog
   * tagging API. A maximum of 25 tags is supported; keys and values are subject to the same
   * limitations as cluster tags.
   */
  @JsonProperty("tags")
  private Map<String, String> tags;

  public MaterializedFeature setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public MaterializedFeature setCronSchedule(String cronSchedule) {
    this.cronSchedule = cronSchedule;
    return this;
  }

  public String getCronSchedule() {
    return cronSchedule;
  }

  public MaterializedFeature setCronScheduleTrigger(CronSchedule cronScheduleTrigger) {
    this.cronScheduleTrigger = cronScheduleTrigger;
    return this;
  }

  public CronSchedule getCronScheduleTrigger() {
    return cronScheduleTrigger;
  }

  public MaterializedFeature setExternalTrigger(ExternalTrigger externalTrigger) {
    this.externalTrigger = externalTrigger;
    return this;
  }

  public ExternalTrigger getExternalTrigger() {
    return externalTrigger;
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

  public MaterializedFeature setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
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

  public MaterializedFeature setMaterializationSetId(String materializationSetId) {
    this.materializationSetId = materializationSetId;
    return this;
  }

  public String getMaterializationSetId() {
    return materializationSetId;
  }

  public MaterializedFeature setMaterializedFeatureId(String materializedFeatureId) {
    this.materializedFeatureId = materializedFeatureId;
    return this;
  }

  public String getMaterializedFeatureId() {
    return materializedFeatureId;
  }

  public MaterializedFeature setNotifications(MaterializationNotifications notifications) {
    this.notifications = notifications;
    return this;
  }

  public MaterializationNotifications getNotifications() {
    return notifications;
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

  public MaterializedFeature setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
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

  public MaterializedFeature setTags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Map<String, String> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaterializedFeature that = (MaterializedFeature) o;
    return Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(cronSchedule, that.cronSchedule)
        && Objects.equals(cronScheduleTrigger, that.cronScheduleTrigger)
        && Objects.equals(externalTrigger, that.externalTrigger)
        && Objects.equals(featureName, that.featureName)
        && Objects.equals(isOnline, that.isOnline)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(lastMaterializationTime, that.lastMaterializationTime)
        && Objects.equals(latestBackfillOperation, that.latestBackfillOperation)
        && Objects.equals(materializationSetId, that.materializationSetId)
        && Objects.equals(materializedFeatureId, that.materializedFeatureId)
        && Objects.equals(notifications, that.notifications)
        && Objects.equals(offlineStoreConfig, that.offlineStoreConfig)
        && Objects.equals(onlineStoreConfig, that.onlineStoreConfig)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(pipelineScheduleState, that.pipelineScheduleState)
        && Objects.equals(streamingMode, that.streamingMode)
        && Objects.equals(tableName, that.tableName)
        && Objects.equals(tableTrigger, that.tableTrigger)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        budgetPolicyId,
        cronSchedule,
        cronScheduleTrigger,
        externalTrigger,
        featureName,
        isOnline,
        jobId,
        lastMaterializationTime,
        latestBackfillOperation,
        materializationSetId,
        materializedFeatureId,
        notifications,
        offlineStoreConfig,
        onlineStoreConfig,
        pipelineId,
        pipelineScheduleState,
        streamingMode,
        tableName,
        tableTrigger,
        tags);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializedFeature.class)
        .add("budgetPolicyId", budgetPolicyId)
        .add("cronSchedule", cronSchedule)
        .add("cronScheduleTrigger", cronScheduleTrigger)
        .add("externalTrigger", externalTrigger)
        .add("featureName", featureName)
        .add("isOnline", isOnline)
        .add("jobId", jobId)
        .add("lastMaterializationTime", lastMaterializationTime)
        .add("latestBackfillOperation", latestBackfillOperation)
        .add("materializationSetId", materializationSetId)
        .add("materializedFeatureId", materializedFeatureId)
        .add("notifications", notifications)
        .add("offlineStoreConfig", offlineStoreConfig)
        .add("onlineStoreConfig", onlineStoreConfig)
        .add("pipelineId", pipelineId)
        .add("pipelineScheduleState", pipelineScheduleState)
        .add("streamingMode", streamingMode)
        .add("tableName", tableName)
        .add("tableTrigger", tableTrigger)
        .add("tags", tags)
        .toString();
  }
}
