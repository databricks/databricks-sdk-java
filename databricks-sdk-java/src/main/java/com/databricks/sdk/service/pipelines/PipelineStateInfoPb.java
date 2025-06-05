// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class PipelineStateInfoPb {
  @JsonProperty("cluster_id")
  private String clusterId;

  @JsonProperty("creator_user_name")
  private String creatorUserName;

  @JsonProperty("health")
  private PipelineStateInfoHealth health;

  @JsonProperty("latest_updates")
  private Collection<UpdateStateInfo> latestUpdates;

  @JsonProperty("name")
  private String name;

  @JsonProperty("pipeline_id")
  private String pipelineId;

  @JsonProperty("run_as_user_name")
  private String runAsUserName;

  @JsonProperty("state")
  private PipelineState state;

  public PipelineStateInfoPb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public PipelineStateInfoPb setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public PipelineStateInfoPb setHealth(PipelineStateInfoHealth health) {
    this.health = health;
    return this;
  }

  public PipelineStateInfoHealth getHealth() {
    return health;
  }

  public PipelineStateInfoPb setLatestUpdates(Collection<UpdateStateInfo> latestUpdates) {
    this.latestUpdates = latestUpdates;
    return this;
  }

  public Collection<UpdateStateInfo> getLatestUpdates() {
    return latestUpdates;
  }

  public PipelineStateInfoPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PipelineStateInfoPb setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public PipelineStateInfoPb setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  public String getRunAsUserName() {
    return runAsUserName;
  }

  public PipelineStateInfoPb setState(PipelineState state) {
    this.state = state;
    return this;
  }

  public PipelineState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineStateInfoPb that = (PipelineStateInfoPb) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(health, that.health)
        && Objects.equals(latestUpdates, that.latestUpdates)
        && Objects.equals(name, that.name)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(runAsUserName, that.runAsUserName)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clusterId, creatorUserName, health, latestUpdates, name, pipelineId, runAsUserName, state);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineStateInfoPb.class)
        .add("clusterId", clusterId)
        .add("creatorUserName", creatorUserName)
        .add("health", health)
        .add("latestUpdates", latestUpdates)
        .add("name", name)
        .add("pipelineId", pipelineId)
        .add("runAsUserName", runAsUserName)
        .add("state", state)
        .toString();
  }
}
