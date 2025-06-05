// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ServingEndpointDetailed.ServingEndpointDetailedSerializer.class)
@JsonDeserialize(using = ServingEndpointDetailed.ServingEndpointDetailedDeserializer.class)
public class ServingEndpointDetailed {
  /**
   * The AI Gateway configuration for the serving endpoint. NOTE: External model, provisioned
   * throughput, and pay-per-token endpoints are fully supported; agent endpoints currently only
   * support inference tables.
   */
  private AiGatewayConfig aiGateway;

  /** The budget policy associated with the endpoint. */
  private String budgetPolicyId;

  /** The config that is currently being served by the endpoint. */
  private EndpointCoreConfigOutput config;

  /** The timestamp when the endpoint was created in Unix time. */
  private Long creationTimestamp;

  /** The email of the user who created the serving endpoint. */
  private String creator;

  /** Information required to query DataPlane APIs. */
  private ModelDataPlaneInfo dataPlaneInfo;

  /** Endpoint invocation url if route optimization is enabled for endpoint */
  private String endpointUrl;

  /**
   * System-generated ID of the endpoint. This is used to refer to the endpoint in the Permissions
   * API
   */
  private String id;

  /** The timestamp when the endpoint was last updated by a user in Unix time. */
  private Long lastUpdatedTimestamp;

  /** The name of the serving endpoint. */
  private String name;

  /** The config that the endpoint is attempting to update to. */
  private EndpointPendingConfig pendingConfig;

  /** The permission level of the principal making the request. */
  private ServingEndpointDetailedPermissionLevel permissionLevel;

  /** Boolean representing if route optimization has been enabled for the endpoint */
  private Boolean routeOptimized;

  /** Information corresponding to the state of the serving endpoint. */
  private EndpointState state;

  /** Tags attached to the serving endpoint. */
  private Collection<EndpointTag> tags;

  /** The task type of the serving endpoint. */
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
    return new ToStringer(ServingEndpointDetailed.class)
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

  ServingEndpointDetailedPb toPb() {
    ServingEndpointDetailedPb pb = new ServingEndpointDetailedPb();
    pb.setAiGateway(aiGateway);
    pb.setBudgetPolicyId(budgetPolicyId);
    pb.setConfig(config);
    pb.setCreationTimestamp(creationTimestamp);
    pb.setCreator(creator);
    pb.setDataPlaneInfo(dataPlaneInfo);
    pb.setEndpointUrl(endpointUrl);
    pb.setId(id);
    pb.setLastUpdatedTimestamp(lastUpdatedTimestamp);
    pb.setName(name);
    pb.setPendingConfig(pendingConfig);
    pb.setPermissionLevel(permissionLevel);
    pb.setRouteOptimized(routeOptimized);
    pb.setState(state);
    pb.setTags(tags);
    pb.setTask(task);

    return pb;
  }

  static ServingEndpointDetailed fromPb(ServingEndpointDetailedPb pb) {
    ServingEndpointDetailed model = new ServingEndpointDetailed();
    model.setAiGateway(pb.getAiGateway());
    model.setBudgetPolicyId(pb.getBudgetPolicyId());
    model.setConfig(pb.getConfig());
    model.setCreationTimestamp(pb.getCreationTimestamp());
    model.setCreator(pb.getCreator());
    model.setDataPlaneInfo(pb.getDataPlaneInfo());
    model.setEndpointUrl(pb.getEndpointUrl());
    model.setId(pb.getId());
    model.setLastUpdatedTimestamp(pb.getLastUpdatedTimestamp());
    model.setName(pb.getName());
    model.setPendingConfig(pb.getPendingConfig());
    model.setPermissionLevel(pb.getPermissionLevel());
    model.setRouteOptimized(pb.getRouteOptimized());
    model.setState(pb.getState());
    model.setTags(pb.getTags());
    model.setTask(pb.getTask());

    return model;
  }

  public static class ServingEndpointDetailedSerializer
      extends JsonSerializer<ServingEndpointDetailed> {
    @Override
    public void serialize(
        ServingEndpointDetailed value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServingEndpointDetailedPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServingEndpointDetailedDeserializer
      extends JsonDeserializer<ServingEndpointDetailed> {
    @Override
    public ServingEndpointDetailed deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServingEndpointDetailedPb pb = mapper.readValue(p, ServingEndpointDetailedPb.class);
      return ServingEndpointDetailed.fromPb(pb);
    }
  }
}
