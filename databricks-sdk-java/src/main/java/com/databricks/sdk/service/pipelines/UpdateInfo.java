// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class UpdateInfo {
  /** What triggered this update. */
  @JsonProperty("cause")
  private UpdateInfoCause cause;

  /** The ID of the cluster that the update is running on. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /**
   * The pipeline configuration with system defaults applied where unspecified by the user. Not
   * returned by ListUpdates.
   */
  @JsonProperty("config")
  private PipelineSpec config;

  /** The time when this update was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /** If true, this update will reset all tables before running. */
  @JsonProperty("full_refresh")
  private Boolean fullRefresh;

  /**
   * A list of tables to update with fullRefresh. If both refresh_selection and
   * full_refresh_selection are empty, this is a full graph update. Full Refresh on a table means
   * that the states of the table will be reset before the refresh.
   */
  @JsonProperty("full_refresh_selection")
  private Collection<String> fullRefreshSelection;

  /** The ID of the pipeline. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /**
   * A list of tables to update without fullRefresh. If both refresh_selection and
   * full_refresh_selection are empty, this is a full graph update. Full Refresh on a table means
   * that the states of the table will be reset before the refresh.
   */
  @JsonProperty("refresh_selection")
  private Collection<String> refreshSelection;

  /** The update state. */
  @JsonProperty("state")
  private UpdateInfoState state;

  /** The ID of this update. */
  @JsonProperty("update_id")
  private String updateId;

  public UpdateInfo setCause(UpdateInfoCause cause) {
    this.cause = cause;
    return this;
  }

  public UpdateInfoCause getCause() {
    return cause;
  }

  public UpdateInfo setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public UpdateInfo setConfig(PipelineSpec config) {
    this.config = config;
    return this;
  }

  public PipelineSpec getConfig() {
    return config;
  }

  public UpdateInfo setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public UpdateInfo setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  public Boolean getFullRefresh() {
    return fullRefresh;
  }

  public UpdateInfo setFullRefreshSelection(Collection<String> fullRefreshSelection) {
    this.fullRefreshSelection = fullRefreshSelection;
    return this;
  }

  public Collection<String> getFullRefreshSelection() {
    return fullRefreshSelection;
  }

  public UpdateInfo setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public UpdateInfo setRefreshSelection(Collection<String> refreshSelection) {
    this.refreshSelection = refreshSelection;
    return this;
  }

  public Collection<String> getRefreshSelection() {
    return refreshSelection;
  }

  public UpdateInfo setState(UpdateInfoState state) {
    this.state = state;
    return this;
  }

  public UpdateInfoState getState() {
    return state;
  }

  public UpdateInfo setUpdateId(String updateId) {
    this.updateId = updateId;
    return this;
  }

  public String getUpdateId() {
    return updateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateInfo that = (UpdateInfo) o;
    return Objects.equals(cause, that.cause)
        && Objects.equals(clusterId, that.clusterId)
        && Objects.equals(config, that.config)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(fullRefresh, that.fullRefresh)
        && Objects.equals(fullRefreshSelection, that.fullRefreshSelection)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(refreshSelection, that.refreshSelection)
        && Objects.equals(state, that.state)
        && Objects.equals(updateId, that.updateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cause,
        clusterId,
        config,
        creationTime,
        fullRefresh,
        fullRefreshSelection,
        pipelineId,
        refreshSelection,
        state,
        updateId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateInfo.class)
        .add("cause", cause)
        .add("clusterId", clusterId)
        .add("config", config)
        .add("creationTime", creationTime)
        .add("fullRefresh", fullRefresh)
        .add("fullRefreshSelection", fullRefreshSelection)
        .add("pipelineId", pipelineId)
        .add("refreshSelection", refreshSelection)
        .add("state", state)
        .add("updateId", updateId)
        .toString();
  }
}
