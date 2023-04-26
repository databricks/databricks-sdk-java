// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>PipelineStateInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineStateInfo} object
   */
  public PipelineStateInfo setClusterId(String clusterId) {
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
   * <p>Setter for the field <code>creatorUserName</code>.</p>
   *
   * @param creatorUserName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineStateInfo} object
   */
  public PipelineStateInfo setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  /**
   * <p>Getter for the field <code>creatorUserName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatorUserName() {
    return creatorUserName;
  }

  /**
   * <p>Setter for the field <code>latestUpdates</code>.</p>
   *
   * @param latestUpdates a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineStateInfo} object
   */
  public PipelineStateInfo setLatestUpdates(Collection<UpdateStateInfo> latestUpdates) {
    this.latestUpdates = latestUpdates;
    return this;
  }

  /**
   * <p>Getter for the field <code>latestUpdates</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<UpdateStateInfo> getLatestUpdates() {
    return latestUpdates;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineStateInfo} object
   */
  public PipelineStateInfo setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>pipelineId</code>.</p>
   *
   * @param pipelineId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineStateInfo} object
   */
  public PipelineStateInfo setPipelineId(String pipelineId) {
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
   * <p>Setter for the field <code>runAsUserName</code>.</p>
   *
   * @param runAsUserName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineStateInfo} object
   */
  public PipelineStateInfo setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  /**
   * <p>Getter for the field <code>runAsUserName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunAsUserName() {
    return runAsUserName;
  }

  /**
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link com.databricks.sdk.service.pipelines.PipelineState} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineStateInfo} object
   */
  public PipelineStateInfo setState(PipelineState state) {
    this.state = state;
    return this;
  }

  /**
   * <p>Getter for the field <code>state</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineState} object
   */
  public PipelineState getState() {
    return state;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        clusterId, creatorUserName, latestUpdates, name, pipelineId, runAsUserName, state);
  }

  /** {@inheritDoc} */
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
