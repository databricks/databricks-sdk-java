// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>UpdateInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>cause</code>.</p>
   *
   * @param cause a {@link com.databricks.sdk.service.pipelines.UpdateInfoCause} object
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateInfo} object
   */
  public UpdateInfo setCause(UpdateInfoCause cause) {
    this.cause = cause;
    return this;
  }

  /**
   * <p>Getter for the field <code>cause</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateInfoCause} object
   */
  public UpdateInfoCause getCause() {
    return cause;
  }

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateInfo} object
   */
  public UpdateInfo setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getClusterId() {
    return clusterId;
  }

  /**
   * <p>Setter for the field <code>config</code>.</p>
   *
   * @param config a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateInfo} object
   */
  public UpdateInfo setConfig(PipelineSpec config) {
    this.config = config;
    return this;
  }

  /**
   * <p>Getter for the field <code>config</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec getConfig() {
    return config;
  }

  /**
   * <p>Setter for the field <code>creationTime</code>.</p>
   *
   * @param creationTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateInfo} object
   */
  public UpdateInfo setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>creationTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreationTime() {
    return creationTime;
  }

  /**
   * <p>Setter for the field <code>fullRefresh</code>.</p>
   *
   * @param fullRefresh a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateInfo} object
   */
  public UpdateInfo setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullRefresh</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getFullRefresh() {
    return fullRefresh;
  }

  /**
   * <p>Setter for the field <code>fullRefreshSelection</code>.</p>
   *
   * @param fullRefreshSelection a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateInfo} object
   */
  public UpdateInfo setFullRefreshSelection(Collection<String> fullRefreshSelection) {
    this.fullRefreshSelection = fullRefreshSelection;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullRefreshSelection</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getFullRefreshSelection() {
    return fullRefreshSelection;
  }

  /**
   * <p>Setter for the field <code>pipelineId</code>.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateInfo} object
   */
  public UpdateInfo setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  /**
   * <p>Getter for the field <code>pipelineId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPipelineId() {
    return pipelineId;
  }

  /**
   * <p>Setter for the field <code>refreshSelection</code>.</p>
   *
   * @param refreshSelection a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateInfo} object
   */
  public UpdateInfo setRefreshSelection(Collection<String> refreshSelection) {
    this.refreshSelection = refreshSelection;
    return this;
  }

  /**
   * <p>Getter for the field <code>refreshSelection</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getRefreshSelection() {
    return refreshSelection;
  }

  /**
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link com.databricks.sdk.service.pipelines.UpdateInfoState} object
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateInfo} object
   */
  public UpdateInfo setState(UpdateInfoState state) {
    this.state = state;
    return this;
  }

  /**
   * <p>Getter for the field <code>state</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateInfoState} object
   */
  public UpdateInfoState getState() {
    return state;
  }

  /**
   * <p>Setter for the field <code>updateId</code>.</p>
   *
   * @param updateId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.UpdateInfo} object
   */
  public UpdateInfo setUpdateId(String updateId) {
    this.updateId = updateId;
    return this;
  }

  /**
   * <p>Getter for the field <code>updateId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUpdateId() {
    return updateId;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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
