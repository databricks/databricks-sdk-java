// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GetPipelineResponsePb {
  @JsonProperty("cause")
  private String cause;

  @JsonProperty("cluster_id")
  private String clusterId;

  @JsonProperty("creator_user_name")
  private String creatorUserName;

  @JsonProperty("effective_budget_policy_id")
  private String effectiveBudgetPolicyId;

  @JsonProperty("health")
  private GetPipelineResponseHealth health;

  @JsonProperty("last_modified")
  private Long lastModified;

  @JsonProperty("latest_updates")
  private Collection<UpdateStateInfo> latestUpdates;

  @JsonProperty("name")
  private String name;

  @JsonProperty("pipeline_id")
  private String pipelineId;

  @JsonProperty("run_as_user_name")
  private String runAsUserName;

  @JsonProperty("spec")
  private PipelineSpec spec;

  @JsonProperty("state")
  private PipelineState state;

  public GetPipelineResponsePb setCause(String cause) {
    this.cause = cause;
    return this;
  }

  public String getCause() {
    return cause;
  }

  public GetPipelineResponsePb setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public GetPipelineResponsePb setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public GetPipelineResponsePb setEffectiveBudgetPolicyId(String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  public GetPipelineResponsePb setHealth(GetPipelineResponseHealth health) {
    this.health = health;
    return this;
  }

  public GetPipelineResponseHealth getHealth() {
    return health;
  }

  public GetPipelineResponsePb setLastModified(Long lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  public Long getLastModified() {
    return lastModified;
  }

  public GetPipelineResponsePb setLatestUpdates(Collection<UpdateStateInfo> latestUpdates) {
    this.latestUpdates = latestUpdates;
    return this;
  }

  public Collection<UpdateStateInfo> getLatestUpdates() {
    return latestUpdates;
  }

  public GetPipelineResponsePb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetPipelineResponsePb setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public GetPipelineResponsePb setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  public String getRunAsUserName() {
    return runAsUserName;
  }

  public GetPipelineResponsePb setSpec(PipelineSpec spec) {
    this.spec = spec;
    return this;
  }

  public PipelineSpec getSpec() {
    return spec;
  }

  public GetPipelineResponsePb setState(PipelineState state) {
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
    GetPipelineResponsePb that = (GetPipelineResponsePb) o;
    return Objects.equals(cause, that.cause)
        && Objects.equals(clusterId, that.clusterId)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId)
        && Objects.equals(health, that.health)
        && Objects.equals(lastModified, that.lastModified)
        && Objects.equals(latestUpdates, that.latestUpdates)
        && Objects.equals(name, that.name)
        && Objects.equals(pipelineId, that.pipelineId)
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
        health,
        lastModified,
        latestUpdates,
        name,
        pipelineId,
        runAsUserName,
        spec,
        state);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPipelineResponsePb.class)
        .add("cause", cause)
        .add("clusterId", clusterId)
        .add("creatorUserName", creatorUserName)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
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
