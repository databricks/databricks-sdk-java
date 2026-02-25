// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
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

  /** Serverless budget policy ID of this pipeline. */
  @JsonProperty("effective_budget_policy_id")
  private String effectiveBudgetPolicyId;

  /** Publishing mode of the pipeline */
  @JsonProperty("effective_publishing_mode")
  private PublishingMode effectivePublishingMode;

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

  /**
   * The user or service principal that the pipeline runs as, if specified in the request. This
   * field indicates the explicit configuration of `run_as` for the pipeline. To find the value in
   * all cases, explicit or implicit, use `run_as_user_name`.
   */
  @JsonProperty("run_as")
  private RunAs runAs;

  /** Username of the user that the pipeline will run on behalf of. */
  @JsonProperty("run_as_user_name")
  private String runAsUserName;

  /** The pipeline specification. This field is not returned when called by `ListPipelines`. */
  @JsonProperty("spec")
  private PipelineSpec spec;

  /** The pipeline state. */
  @JsonProperty("state")
  private PipelineState state;

  public GetPipelineResponse setCause(String cause) {
    this.cause = cause;
    return this;
  }

  public String getCause() {
    return cause;
  }

  public GetPipelineResponse setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public GetPipelineResponse setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public GetPipelineResponse setEffectiveBudgetPolicyId(String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  public GetPipelineResponse setEffectivePublishingMode(PublishingMode effectivePublishingMode) {
    this.effectivePublishingMode = effectivePublishingMode;
    return this;
  }

  public PublishingMode getEffectivePublishingMode() {
    return effectivePublishingMode;
  }

  public GetPipelineResponse setHealth(GetPipelineResponseHealth health) {
    this.health = health;
    return this;
  }

  public GetPipelineResponseHealth getHealth() {
    return health;
  }

  public GetPipelineResponse setLastModified(Long lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  public Long getLastModified() {
    return lastModified;
  }

  public GetPipelineResponse setLatestUpdates(Collection<UpdateStateInfo> latestUpdates) {
    this.latestUpdates = latestUpdates;
    return this;
  }

  public Collection<UpdateStateInfo> getLatestUpdates() {
    return latestUpdates;
  }

  public GetPipelineResponse setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetPipelineResponse setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public GetPipelineResponse setRunAs(RunAs runAs) {
    this.runAs = runAs;
    return this;
  }

  public RunAs getRunAs() {
    return runAs;
  }

  public GetPipelineResponse setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  public String getRunAsUserName() {
    return runAsUserName;
  }

  public GetPipelineResponse setSpec(PipelineSpec spec) {
    this.spec = spec;
    return this;
  }

  public PipelineSpec getSpec() {
    return spec;
  }

  public GetPipelineResponse setState(PipelineState state) {
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
    GetPipelineResponse that = (GetPipelineResponse) o;
    return Objects.equals(cause, that.cause)
        && Objects.equals(clusterId, that.clusterId)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId)
        && Objects.equals(effectivePublishingMode, that.effectivePublishingMode)
        && Objects.equals(health, that.health)
        && Objects.equals(lastModified, that.lastModified)
        && Objects.equals(latestUpdates, that.latestUpdates)
        && Objects.equals(name, that.name)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(runAs, that.runAs)
        && Objects.equals(runAsUserName, that.runAsUserName)
        && Objects.equals(spec, that.spec)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cause,
        clusterId,
        creatorUserName,
        effectiveBudgetPolicyId,
        effectivePublishingMode,
        health,
        lastModified,
        latestUpdates,
        name,
        pipelineId,
        runAs,
        runAsUserName,
        spec,
        state);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPipelineResponse.class)
        .add("cause", cause)
        .add("clusterId", clusterId)
        .add("creatorUserName", creatorUserName)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
        .add("effectivePublishingMode", effectivePublishingMode)
        .add("health", health)
        .add("lastModified", lastModified)
        .add("latestUpdates", latestUpdates)
        .add("name", name)
        .add("pipelineId", pipelineId)
        .add("runAs", runAs)
        .add("runAsUserName", runAsUserName)
        .add("spec", spec)
        .add("state", state)
        .toString();
  }
}
