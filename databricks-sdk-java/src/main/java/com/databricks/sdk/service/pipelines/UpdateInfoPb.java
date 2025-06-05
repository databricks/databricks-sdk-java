// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class UpdateInfoPb {
  @JsonProperty("cause")
  private UpdateInfoCause cause;

  @JsonProperty("cluster_id")
  private String clusterId;

  @JsonProperty("config")
  private PipelineSpec config;

  @JsonProperty("creation_time")
  private Long creationTime;

  @JsonProperty("full_refresh")
  private Boolean fullRefresh;

  @JsonProperty("full_refresh_selection")
  private Collection<String> fullRefreshSelection;

  @JsonProperty("pipeline_id")
  private String pipelineId;

  @JsonProperty("refresh_selection")
  private Collection<String> refreshSelection;

  @JsonProperty("state")
  private UpdateInfoState state;

  @JsonProperty("update_id")
  private String updateId;

  @JsonProperty("validate_only")
  private Boolean validateOnly;

  public UpdateInfoPb setCause(UpdateInfoCause cause) {
    this.cause = cause;
    return this;
  }

  public UpdateInfoCause getCause() {
    return cause;
  }

  public UpdateInfoPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public UpdateInfoPb setConfig(PipelineSpec config) {
    this.config = config;
    return this;
  }

  public PipelineSpec getConfig() {
    return config;
  }

  public UpdateInfoPb setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public UpdateInfoPb setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  public Boolean getFullRefresh() {
    return fullRefresh;
  }

  public UpdateInfoPb setFullRefreshSelection(Collection<String> fullRefreshSelection) {
    this.fullRefreshSelection = fullRefreshSelection;
    return this;
  }

  public Collection<String> getFullRefreshSelection() {
    return fullRefreshSelection;
  }

  public UpdateInfoPb setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public UpdateInfoPb setRefreshSelection(Collection<String> refreshSelection) {
    this.refreshSelection = refreshSelection;
    return this;
  }

  public Collection<String> getRefreshSelection() {
    return refreshSelection;
  }

  public UpdateInfoPb setState(UpdateInfoState state) {
    this.state = state;
    return this;
  }

  public UpdateInfoState getState() {
    return state;
  }

  public UpdateInfoPb setUpdateId(String updateId) {
    this.updateId = updateId;
    return this;
  }

  public String getUpdateId() {
    return updateId;
  }

  public UpdateInfoPb setValidateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  public Boolean getValidateOnly() {
    return validateOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateInfoPb that = (UpdateInfoPb) o;
    return Objects.equals(cause, that.cause)
        && Objects.equals(clusterId, that.clusterId)
        && Objects.equals(config, that.config)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(fullRefresh, that.fullRefresh)
        && Objects.equals(fullRefreshSelection, that.fullRefreshSelection)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(refreshSelection, that.refreshSelection)
        && Objects.equals(state, that.state)
        && Objects.equals(updateId, that.updateId)
        && Objects.equals(validateOnly, that.validateOnly);
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
        updateId,
        validateOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateInfoPb.class)
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
        .add("validateOnly", validateOnly)
        .toString();
  }
}
