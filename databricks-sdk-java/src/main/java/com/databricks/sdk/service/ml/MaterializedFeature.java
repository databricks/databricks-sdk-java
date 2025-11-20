// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A materialized feature represents a feature that is continuously computed and stored. */
@Generated
public class MaterializedFeature {
  /** The full name of the feature in Unity Catalog. */
  @JsonProperty("feature_name")
  private String featureName;

  /**
   * The timestamp when the pipeline last ran and updated the materialized feature values. If the
   * pipeline has not run yet, this field will be null.
   */
  @JsonProperty("last_materialization_time")
  private String lastMaterializationTime;

  /** Unique identifier for the materialized feature. */
  @JsonProperty("materialized_feature_id")
  private String materializedFeatureId;

  /** */
  @JsonProperty("offline_store_config")
  private OfflineStoreConfig offlineStoreConfig;

  /** */
  @JsonProperty("online_store_config")
  private OnlineStoreConfig onlineStoreConfig;

  /** The schedule state of the materialization pipeline. */
  @JsonProperty("pipeline_schedule_state")
  private MaterializedFeaturePipelineScheduleState pipelineScheduleState;

  /**
   * The fully qualified Unity Catalog path to the table containing the materialized feature (Delta
   * table or Lakebase table). Output only.
   */
  @JsonProperty("table_name")
  private String tableName;

  public MaterializedFeature setFeatureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

  public String getFeatureName() {
    return featureName;
  }

  public MaterializedFeature setLastMaterializationTime(String lastMaterializationTime) {
    this.lastMaterializationTime = lastMaterializationTime;
    return this;
  }

  public String getLastMaterializationTime() {
    return lastMaterializationTime;
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

  public MaterializedFeature setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaterializedFeature that = (MaterializedFeature) o;
    return Objects.equals(featureName, that.featureName)
        && Objects.equals(lastMaterializationTime, that.lastMaterializationTime)
        && Objects.equals(materializedFeatureId, that.materializedFeatureId)
        && Objects.equals(offlineStoreConfig, that.offlineStoreConfig)
        && Objects.equals(onlineStoreConfig, that.onlineStoreConfig)
        && Objects.equals(pipelineScheduleState, that.pipelineScheduleState)
        && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        featureName,
        lastMaterializationTime,
        materializedFeatureId,
        offlineStoreConfig,
        onlineStoreConfig,
        pipelineScheduleState,
        tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializedFeature.class)
        .add("featureName", featureName)
        .add("lastMaterializationTime", lastMaterializationTime)
        .add("materializedFeatureId", materializedFeatureId)
        .add("offlineStoreConfig", offlineStoreConfig)
        .add("onlineStoreConfig", onlineStoreConfig)
        .add("pipelineScheduleState", pipelineScheduleState)
        .add("tableName", tableName)
        .toString();
  }
}
