// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ServingEndpointDetailedPb {
  @JsonProperty("ai_gateway")
  private AiGatewayConfig aiGateway;

  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  @JsonProperty("config")
  private EndpointCoreConfigOutput config;

  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  @JsonProperty("creator")
  private String creator;

  @JsonProperty("data_plane_info")
  private ModelDataPlaneInfo dataPlaneInfo;

  @JsonProperty("endpoint_url")
  private String endpointUrl;

  @JsonProperty("id")
  private String id;

  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  @JsonProperty("name")
  private String name;

  @JsonProperty("pending_config")
  private EndpointPendingConfig pendingConfig;

  @JsonProperty("permission_level")
  private ServingEndpointDetailedPermissionLevel permissionLevel;

  @JsonProperty("route_optimized")
  private Boolean routeOptimized;

  @JsonProperty("state")
  private EndpointState state;

  @JsonProperty("tags")
  private Collection<EndpointTag> tags;

  @JsonProperty("task")
  private String task;

  public ServingEndpointDetailedPb setAiGateway(AiGatewayConfig aiGateway) {
    this.aiGateway = aiGateway;
    return this;
  }

  public AiGatewayConfig getAiGateway() {
    return aiGateway;
  }

  public ServingEndpointDetailedPb setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public ServingEndpointDetailedPb setConfig(EndpointCoreConfigOutput config) {
    this.config = config;
    return this;
  }

  public EndpointCoreConfigOutput getConfig() {
    return config;
  }

  public ServingEndpointDetailedPb setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ServingEndpointDetailedPb setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public ServingEndpointDetailedPb setDataPlaneInfo(ModelDataPlaneInfo dataPlaneInfo) {
    this.dataPlaneInfo = dataPlaneInfo;
    return this;
  }

  public ModelDataPlaneInfo getDataPlaneInfo() {
    return dataPlaneInfo;
  }

  public ServingEndpointDetailedPb setEndpointUrl(String endpointUrl) {
    this.endpointUrl = endpointUrl;
    return this;
  }

  public String getEndpointUrl() {
    return endpointUrl;
  }

  public ServingEndpointDetailedPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ServingEndpointDetailedPb setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public ServingEndpointDetailedPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ServingEndpointDetailedPb setPendingConfig(EndpointPendingConfig pendingConfig) {
    this.pendingConfig = pendingConfig;
    return this;
  }

  public EndpointPendingConfig getPendingConfig() {
    return pendingConfig;
  }

  public ServingEndpointDetailedPb setPermissionLevel(
      ServingEndpointDetailedPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ServingEndpointDetailedPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public ServingEndpointDetailedPb setRouteOptimized(Boolean routeOptimized) {
    this.routeOptimized = routeOptimized;
    return this;
  }

  public Boolean getRouteOptimized() {
    return routeOptimized;
  }

  public ServingEndpointDetailedPb setState(EndpointState state) {
    this.state = state;
    return this;
  }

  public EndpointState getState() {
    return state;
  }

  public ServingEndpointDetailedPb setTags(Collection<EndpointTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<EndpointTag> getTags() {
    return tags;
  }

  public ServingEndpointDetailedPb setTask(String task) {
    this.task = task;
    return this;
  }

  public String getTask() {
    return task;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServingEndpointDetailedPb that = (ServingEndpointDetailedPb) o;
    return Objects.equals(aiGateway, that.aiGateway)
        && Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(config, that.config)
        && Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(creator, that.creator)
        && Objects.equals(dataPlaneInfo, that.dataPlaneInfo)
        && Objects.equals(endpointUrl, that.endpointUrl)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(name, that.name)
        && Objects.equals(pendingConfig, that.pendingConfig)
        && Objects.equals(permissionLevel, that.permissionLevel)
        && Objects.equals(routeOptimized, that.routeOptimized)
        && Objects.equals(state, that.state)
        && Objects.equals(tags, that.tags)
        && Objects.equals(task, that.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aiGateway,
        budgetPolicyId,
        config,
        creationTimestamp,
        creator,
        dataPlaneInfo,
        endpointUrl,
        id,
        lastUpdatedTimestamp,
        name,
        pendingConfig,
        permissionLevel,
        routeOptimized,
        state,
        tags,
        task);
  }

  @Override
  public String toString() {
    return new ToStringer(ServingEndpointDetailedPb.class)
        .add("aiGateway", aiGateway)
        .add("budgetPolicyId", budgetPolicyId)
        .add("config", config)
        .add("creationTimestamp", creationTimestamp)
        .add("creator", creator)
        .add("dataPlaneInfo", dataPlaneInfo)
        .add("endpointUrl", endpointUrl)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("name", name)
        .add("pendingConfig", pendingConfig)
        .add("permissionLevel", permissionLevel)
        .add("routeOptimized", routeOptimized)
        .add("state", state)
        .add("tags", tags)
        .add("task", task)
        .toString();
  }
}
