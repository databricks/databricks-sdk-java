// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ServingEndpointDetailed {
  /**
   * The AI Gateway configuration for the serving endpoint. NOTE: External model, provisioned
   * throughput, and pay-per-token endpoints are fully supported; agent endpoints currently only
   * support inference tables.
   */
  @JsonProperty("ai_gateway")
  private AiGatewayConfig aiGateway;

  /** The budget policy associated with the endpoint. */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /** The config that is currently being served by the endpoint. */
  @JsonProperty("config")
  private EndpointCoreConfigOutput config;

  /** The timestamp when the endpoint was created in Unix time. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /** The email of the user who created the serving endpoint. */
  @JsonProperty("creator")
  private String creator;

  /** Information required to query DataPlane APIs. */
  @JsonProperty("data_plane_info")
  private ModelDataPlaneInfo dataPlaneInfo;

  /** Description of the serving model */
  @JsonProperty("description")
  private String description;

  /** Email notification settings. */
  @JsonProperty("email_notifications")
  private EmailNotifications emailNotifications;

  /** Endpoint invocation url if route optimization is enabled for endpoint */
  @JsonProperty("endpoint_url")
  private String endpointUrl;

  /**
   * System-generated ID of the endpoint. This is used to refer to the endpoint in the Permissions
   * API
   */
  @JsonProperty("id")
  private String id;

  /** The timestamp when the endpoint was last updated by a user in Unix time. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** The name of the serving endpoint. */
  @JsonProperty("name")
  private String name;

  /** The config that the endpoint is attempting to update to. */
  @JsonProperty("pending_config")
  private EndpointPendingConfig pendingConfig;

  /** The permission level of the principal making the request. */
  @JsonProperty("permission_level")
  private ServingEndpointDetailedPermissionLevel permissionLevel;

  /** Boolean representing if route optimization has been enabled for the endpoint */
  @JsonProperty("route_optimized")
  private Boolean routeOptimized;

  /** Information corresponding to the state of the serving endpoint. */
  @JsonProperty("state")
  private EndpointState state;

  /** Tags attached to the serving endpoint. */
  @JsonProperty("tags")
  private Collection<EndpointTag> tags;

  /** The task type of the serving endpoint. */
  @JsonProperty("task")
  private String task;

  public ServingEndpointDetailed setAiGateway(AiGatewayConfig aiGateway) {
    this.aiGateway = aiGateway;
    return this;
  }

  public AiGatewayConfig getAiGateway() {
    return aiGateway;
  }

  public ServingEndpointDetailed setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public ServingEndpointDetailed setConfig(EndpointCoreConfigOutput config) {
    this.config = config;
    return this;
  }

  public EndpointCoreConfigOutput getConfig() {
    return config;
  }

  public ServingEndpointDetailed setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ServingEndpointDetailed setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public ServingEndpointDetailed setDataPlaneInfo(ModelDataPlaneInfo dataPlaneInfo) {
    this.dataPlaneInfo = dataPlaneInfo;
    return this;
  }

  public ModelDataPlaneInfo getDataPlaneInfo() {
    return dataPlaneInfo;
  }

  public ServingEndpointDetailed setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ServingEndpointDetailed setEmailNotifications(EmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public EmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public ServingEndpointDetailed setEndpointUrl(String endpointUrl) {
    this.endpointUrl = endpointUrl;
    return this;
  }

  public String getEndpointUrl() {
    return endpointUrl;
  }

  public ServingEndpointDetailed setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ServingEndpointDetailed setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public ServingEndpointDetailed setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ServingEndpointDetailed setPendingConfig(EndpointPendingConfig pendingConfig) {
    this.pendingConfig = pendingConfig;
    return this;
  }

  public EndpointPendingConfig getPendingConfig() {
    return pendingConfig;
  }

  public ServingEndpointDetailed setPermissionLevel(
      ServingEndpointDetailedPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ServingEndpointDetailedPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public ServingEndpointDetailed setRouteOptimized(Boolean routeOptimized) {
    this.routeOptimized = routeOptimized;
    return this;
  }

  public Boolean getRouteOptimized() {
    return routeOptimized;
  }

  public ServingEndpointDetailed setState(EndpointState state) {
    this.state = state;
    return this;
  }

  public EndpointState getState() {
    return state;
  }

  public ServingEndpointDetailed setTags(Collection<EndpointTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<EndpointTag> getTags() {
    return tags;
  }

  public ServingEndpointDetailed setTask(String task) {
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
    ServingEndpointDetailed that = (ServingEndpointDetailed) o;
    return Objects.equals(aiGateway, that.aiGateway)
        && Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(config, that.config)
        && Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(creator, that.creator)
        && Objects.equals(dataPlaneInfo, that.dataPlaneInfo)
        && Objects.equals(description, that.description)
        && Objects.equals(emailNotifications, that.emailNotifications)
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
        description,
        emailNotifications,
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
    return new ToStringer(ServingEndpointDetailed.class)
        .add("aiGateway", aiGateway)
        .add("budgetPolicyId", budgetPolicyId)
        .add("config", config)
        .add("creationTimestamp", creationTimestamp)
        .add("creator", creator)
        .add("dataPlaneInfo", dataPlaneInfo)
        .add("description", description)
        .add("emailNotifications", emailNotifications)
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
