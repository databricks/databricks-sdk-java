// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>GetPipelineResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetPipelineResponse {
  /** An optional message detailing the cause of the pipeline state. */
  @JsonProperty("cause")
  private String cause;

  /** The ID of the cluster that the pipeline is running on. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** The username of the pipeline creator. */
  @JsonProperty("creator_user_name")
  private String creatorUserName;

  /** The health of a pipeline. */
  @JsonProperty("health")
  private GetPipelineResponseHealth health;

  /** The last time the pipeline settings were modified or created. */
  @JsonProperty("last_modified")
  private Long lastModified;

  /** Status of the latest updates for the pipeline. Ordered with the newest update first. */
  @JsonProperty("latest_updates")
  private Collection<UpdateStateInfo> latestUpdates;

  /** A human friendly identifier for the pipeline, taken from the `spec`. */
  @JsonProperty("name")
  private String name;

  /** The ID of the pipeline. */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /** Username of the user that the pipeline will run on behalf of. */
  @JsonProperty("run_as_user_name")
  private String runAsUserName;

  /** The pipeline specification. This field is not returned when called by `ListPipelines`. */
  @JsonProperty("spec")
  private PipelineSpec spec;

  /** The pipeline state. */
  @JsonProperty("state")
  private PipelineState state;

  /**
   * <p>Setter for the field <code>cause</code>.</p>
   *
   * @param cause a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   */
  public GetPipelineResponse setCause(String cause) {
    this.cause = cause;
    return this;
  }

  /**
   * <p>Getter for the field <code>cause</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCause() {
    return cause;
  }

  /**
   * <p>Setter for the field <code>clusterId</code>.</p>
   *
   * @param clusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   */
  public GetPipelineResponse setClusterId(String clusterId) {
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
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   */
  public GetPipelineResponse setCreatorUserName(String creatorUserName) {
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
   * <p>Setter for the field <code>health</code>.</p>
   *
   * @param health a {@link com.databricks.sdk.service.pipelines.GetPipelineResponseHealth} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   */
  public GetPipelineResponse setHealth(GetPipelineResponseHealth health) {
    this.health = health;
    return this;
  }

  /**
   * <p>Getter for the field <code>health</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponseHealth} object
   */
  public GetPipelineResponseHealth getHealth() {
    return health;
  }

  /**
   * <p>Setter for the field <code>lastModified</code>.</p>
   *
   * @param lastModified a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   */
  public GetPipelineResponse setLastModified(Long lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastModified</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLastModified() {
    return lastModified;
  }

  /**
   * <p>Setter for the field <code>latestUpdates</code>.</p>
   *
   * @param latestUpdates a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   */
  public GetPipelineResponse setLatestUpdates(Collection<UpdateStateInfo> latestUpdates) {
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
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   */
  public GetPipelineResponse setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   */
  public GetPipelineResponse setPipelineId(String pipelineId) {
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
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   */
  public GetPipelineResponse setRunAsUserName(String runAsUserName) {
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
   * <p>Setter for the field <code>spec</code>.</p>
   *
   * @param spec a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   */
  public GetPipelineResponse setSpec(PipelineSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * <p>Getter for the field <code>spec</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineSpec} object
   */
  public PipelineSpec getSpec() {
    return spec;
  }

  /**
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link com.databricks.sdk.service.pipelines.PipelineState} object
   * @return a {@link com.databricks.sdk.service.pipelines.GetPipelineResponse} object
   */
  public GetPipelineResponse setState(PipelineState state) {
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
    GetPipelineResponse that = (GetPipelineResponse) o;
    return Objects.equals(cause, that.cause)
        && Objects.equals(clusterId, that.clusterId)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(health, that.health)
        && Objects.equals(lastModified, that.lastModified)
        && Objects.equals(latestUpdates, that.latestUpdates)
        && Objects.equals(name, that.name)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(runAsUserName, that.runAsUserName)
        && Objects.equals(spec, that.spec)
        && Objects.equals(state, that.state);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        cause,
        clusterId,
        creatorUserName,
        health,
        lastModified,
        latestUpdates,
        name,
        pipelineId,
        runAsUserName,
        spec,
        state);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetPipelineResponse.class)
        .add("cause", cause)
        .add("clusterId", clusterId)
        .add("creatorUserName", creatorUserName)
        .add("health", health)
        .add("lastModified", lastModified)
        .add("latestUpdates", latestUpdates)
        .add("name", name)
        .add("pipelineId", pipelineId)
        .add("runAsUserName", runAsUserName)
        .add("spec", spec)
        .add("state", state)
        .toString();
  }
}
