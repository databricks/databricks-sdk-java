// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class PipelineStateInfo {
  /** The unique identifier of the cluster running the pipeline. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** The username of the pipeline creator. */
  @JsonProperty("creator_user_name")
  private String creatorUserName;

  /** Status of the latest updates for the pipeline. Ordered with the newest update first. */
  @JsonProperty("latest_updates")
  private Collection<UpdateStateInfo> latestUpdates;

  /** The user-friendly name of the pipeline. */
  @JsonProperty("name")
  private String name;

  /** The unique identifier of the pipeline. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /**
   * The username that the pipeline runs as. This is a read only value derived from the pipeline
   * owner.
   */
  @JsonProperty("run_as_user_name")
  private String runAsUserName;

  /** The pipeline state. */
  @JsonProperty("state")
  private PipelineState state;

  public PipelineStateInfo setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public PipelineStateInfo setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public PipelineStateInfo setLatestUpdates(Collection<UpdateStateInfo> latestUpdates) {
    this.latestUpdates = latestUpdates;
    return this;
  }

  public Collection<UpdateStateInfo> getLatestUpdates() {
    return latestUpdates;
  }

  public PipelineStateInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PipelineStateInfo setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public PipelineStateInfo setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  public String getRunAsUserName() {
    return runAsUserName;
  }

  public PipelineStateInfo setState(PipelineState state) {
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
    PipelineStateInfo that = (PipelineStateInfo) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(latestUpdates, that.latestUpdates)
        && Objects.equals(name, that.name)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(runAsUserName, that.runAsUserName)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clusterId, creatorUserName, latestUpdates, name, pipelineId, runAsUserName, state);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineStateInfo.class)
        .add("clusterId", clusterId)
        .add("creatorUserName", creatorUserName)
        .add("latestUpdates", latestUpdates)
        .add("name", name)
        .add("pipelineId", pipelineId)
        .add("runAsUserName", runAsUserName)
        .add("state", state)
        .toString();
  }
}
